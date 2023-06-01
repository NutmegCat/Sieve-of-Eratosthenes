public class sieveOfEratosthenes {
    public static void main(String[] args) {
        System.out.print("Enter the upper bound: ");
        int upperBound = In.getInt();

        boolean[] isPrime = new boolean[upperBound + 1];
        findPrime(isPrime);

        System.out.println("Prime numbers up to " + upperBound + ":");
        printPrimes(isPrime);
    }

    private static void findPrime(boolean[] isPrime) {
        int n = isPrime.length;

        // Assume all numbers are prime initially
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // Sieve out the non-prime numbers
        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
    }

    private static void printPrimes(boolean[] isPrime) {
        int count = 0;
        for (int i = 2; i < isPrime.length; i++) {
            if (isPrime[i]) {
                System.out.print(i + " ");
                count++;
                if (count % 8 == 0) {
                    System.out.println();
                }
            }
        }
    }
}
