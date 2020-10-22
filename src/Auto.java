public class Auto {
    String merk = "Toyota";
    int kilometerStand = 23000;
    int snelheid = 0;

    public static void main(String[] args) {
        Auto auto1 = new Auto();

        auto1.start();
        auto1.geefGas();
        auto1.stop();
        System.out.print("\nde kilometerstand van de " + auto1.merk + " is: " + auto1.kilometerStand + " kilometer.\n");

        System.out.print("\n―――――――――――――――――――――――――\n");

        Auto auto2 = new Auto();
        auto2.setKilometerStand(50000);

        auto2.start();
        auto2.geefGas();
        auto2.stop();
        System.out.print("\nde kilometerstand van de " + auto2.merk + " is: " + auto2.kilometerStand + " kilometer.\n");

        System.out.print("\n―――――――――――――――――――――――――\n");

        Auto auto3 = new Auto();
        auto3.setMerk("Volvo");
        auto3.setKilometerStand(10000);

        auto3.start();
        auto3.geefGas();
        auto3.geefGas();
        auto3.geefGas();
        auto3.stop();
        System.out.print("\nde kilometerstand van de " + auto3.merk + " is: " + auto3.kilometerStand + " kilometer.\n");

    }

//    public String getMerk() {
//        return merk;
//    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void geefGas() {
        snelheid += 20;
        kilometerStand += 20;
        System.out.print("\nde " + merk + " rijdt met " + snelheid + " kilometer/uur.\n");
    }

    public void stop() {
        System.out.print("\nde " + merk + " stopt.\n");
    }

    public void start() {
        System.out.print("\nde " + merk + " start.\n");
    }

//    public int getKilometerStand() {
//        return kilometerStand;
//    }

    public void setKilometerStand(int kilometerStand) {
        this.kilometerStand = kilometerStand;
    }
}
