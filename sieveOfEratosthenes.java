// Aaron Prince Anu

public class sieveOfEratosthenes { 
    public static void main(String[] args) {
       
        // start boolean
        boolean start = true;

        // while loop
        while (start) {
            System.out.println("\n\nWould you like to start (y/n) ?");
            char startChar = In.getChar();

            if (startChar == 'y') {
                // asks for upper bound
                System.out.print("\nEnter the upper bound: ");
                int upperBound = In.getInt();

                // if less than 0 
                if (upperBound < 0) {
                    System.out.println("\nInvalid value");
                    continue;                    
                } else {
                    ;
                }

                // is it a prime?
                boolean[] isPrime = new boolean[upperBound + 1];
                findPrime(isPrime); // ! connected to boolean

                // output
                System.out.println("\nPrime numbers up to " + upperBound + ":\n");
                printPrimes(isPrime);
            } else {
                System.out.println("\nExiting...\n");
                start = false;
            }
        }
    }

    // finds prime
    public static void findPrime(boolean[] isPrime) {
        int n = isPrime.length;

        // assume all numbers are prime initially
        for (int i = 2; i < n; i++) {
            isPrime[i] = true;
        }

        // sieve out the non-prime numbers
        for (int p = 2; p * p < n; p++) {
            if (isPrime[p]) {
                for (int i = p * p; i < n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
    }

    // prints out prime numbers in an order for 8 lines
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