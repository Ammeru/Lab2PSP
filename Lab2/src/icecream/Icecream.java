package icecream;

public class Icecream {
    private String name;
    private boolean chocolate;
    public int chocoNumber = 0;
    private double tallow;
    public double tallowSum = 0;

    public Icecream() {}
    public Icecream(String name, boolean chocolate, double tallow) {
        this.name = name;
        this.chocolate = chocolate;
        this.tallow = tallow;
    }

    public Icecream(String name, double tallow) {
        this.name = name;
        this.tallow = tallow;
    }

    public int ChocoMath(Icecream[] arr, int n) {
        for(int i = 0; i < n; i++){
            if(arr[i].chocolate){
                chocoNumber++;
            }
        }
        return chocoNumber;
    }

    public double TallowMath(Icecream[] arr, int n) {
        for(int i = 0; i < n; i++){
            tallowSum = tallowSum + arr[i].tallow;
        }
        tallowSum = tallowSum / n;
        return tallowSum;
    }
}
