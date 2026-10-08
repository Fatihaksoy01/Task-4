
public class Main {
    public static void main(String[] args) {

        double productCost = 9.99;
        double vatRate = 0.05;

        int units = 10000;

        double vatPerUnit = productCost * vatRate;

        double totalNet = 0;
        double totalVat = 0;
        double totalGross = 0;

        for (int i = 0; i < units; i++) {
            totalNet += productCost;
            totalVat += vatPerUnit;
            totalGross += productCost + vatPerUnit;
        }

        System.out.println("VAT per unit: " + vatPerUnit);
        System.out.println("Total net sales: " + totalNet);
        System.out.println("Total VAT: " + totalVat);
        System.out.println("Total gross sales: " + totalGross);
    }
}
