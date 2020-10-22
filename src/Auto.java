public class Auto {
    public String merk = "Toyota";
    public int kilometerStand = 23000;
    public int snelheid = 0;

    public static void main(String[] args) {
        Auto auto1 = new Auto();
        auto1.setMerk("Toyota");
        auto1.setKilometerStand(50000);

        auto1.start();
        auto1.geefGas();
        auto1.stop();
        auto1.getKilometerStand();

        System.out.print("\n―――――――――――――――――――――――――\n");

        Auto auto2 = new Auto();
        auto2.setKilometerStand(50000);

        auto2.start();
        auto2.geefGas();
        auto2.stop();
        auto2.getKilometerStand();

        System.out.print("\n―――――――――――――――――――――――――\n");

        Auto auto3 = new Auto();
        auto2.setMerk("Volvo");
        auto2.setKilometerStand(10000);

        auto2.start();
        auto2.geefGas();
        auto2.geefGas();
        auto2.geefGas();
        auto2.stop();
        auto2.getKilometerStand();

    }

    public String getMerk() {
        return merk;
    }

    public String setMerk(String merk) {
        this.merk = merk;
        return merk;
    }

    public void geefGas() {
        snelheid += 20;
        kilometerStand += snelheid;
        System.out.print("\nde " + merk + " rijdt met " + snelheid + " kilometer/uur.\n");
    }

    public void stop() {
        System.out.print("\nde " + merk + " stopt.\n");
    }

    public void start() {
        System.out.print("\nde " + merk + " start.\n");
    }

    public int getKilometerStand() {
        System.out.print("\nde kilometerstand van de " + merk + " is: " + kilometerStand + " kilometer.\n");
        return kilometerStand;
    }

    public int setKilometerStand(int kilometerStand) {
        this.kilometerStand = kilometerStand;
        return kilometerStand;
    }
}
