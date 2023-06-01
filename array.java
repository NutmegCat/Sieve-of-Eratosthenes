class array{
    public static void main(String[] args) {
        // ask for upper limit
        System.out.println("\nWhat is your upper limit for prime numbers?");
        System.out.print("   >   ");
        int upperLimit = In.getInt();

        // input upper limit to method
        primeCalculator(upperLimit);
    }

    // upper limit primes
    public static void primeCalculator(int upperLimit) {
        System.out.println(upperLimit);
    }
}