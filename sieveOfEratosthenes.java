public class sieveOfEratosthenes {
    public static void main(String[] args) {
       
        // asks for upper bound
        System.out.print("Enter the upper bound: ");
        int upperBound = In.getInt();

        // is it a prime?
        boolean[] isPrime = new boolean[upperBound + 1];
        findPrime(isPrime); // ! connected to boolean

        // output
        System.out.println("\nPrime numbers up to " + upperBound + ":\n");
        printPrimes(isPrime);
    }

    // finds prime
    public static void findPrime(boolean[] isPrime) {
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

    /*prints out prime numbers in an order for 8 lines*/
    public static void printPrimes(boolean[] isPrime) {
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