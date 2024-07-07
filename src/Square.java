public class Square extends Figures{
    public int x;
    Square (int x){
        this.x = x;
    }

    public double planeArea () {

        super.planeArea = (double) this.x * this.x;

        return planeArea;
    }

    @Override
    protected void printArea () {
        System.out.println("Площадь квадрата равна " + planeArea);
    }
}
