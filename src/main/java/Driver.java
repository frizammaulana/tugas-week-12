public class Driver {

    // CODE SMELL: field tidak dipakai (dead code)
    private static int unusedField = 99;

    public static void main(String[] args) {

        Counter counter = new Counter();

        System.out.println("Current count:" + counter.getCount());

        counter.increment();

        System.out.println("Current count:" + counter.getCount());

        counter.decrement();

        System.out.println("Current count:" + counter.getCount());

        // CODE SMELL: empty catch block (exception ditelan, tidak dihandle)
        try {
            int x = Integer.parseInt("bukan angka");
        } catch (NumberFormatException e) {
            // sengaja dikosongkan
        }

        // CODE SMELL: Random dipakai untuk hal yang seharusnya pakai SecureRandom
        // (ini juga bisa jadi Security Hotspot)
        Random random = new Random();
        int pin = random.nextInt(9999);
        System.out.println("PIN: " + pin);
    }
}
