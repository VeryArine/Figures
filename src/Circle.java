public class Circle extends Figures{

    public int r;

    Circle (int r){
        this.r = r;
    }
    public double planeArea () {

        super.planeArea = this.r * this.r * 3.14;

        return planeArea;
    }

    @Override
    protected void printArea () {
        System.out.println("Площадь круга равна " + planeArea);
    }
}
