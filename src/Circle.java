import java.util.ArrayList;
import java.util.Scanner;

public class Circle extends Figures{

    public int r;

    ArrayList<String> errors = new ArrayList<>();
    int rad = -1;

    private void inputNumbers (){
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Введите радиус");
            String r = scanner.next();
            try {
                int radius  = Integer.parseInt(r);
                rad = radius;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                errors.add(String.valueOf(r));
            }
        } while (rad == -1);
        System.out.println("Ошибки ввода " +errors);
    }
    private void setR() {
        this.r = rad;
    }
    public double planeArea () {

        inputNumbers();
        setR();

        super.planeArea = this.r * this.r * 3.14;

        return planeArea;
    }

    @Override
    protected void printArea () {
        System.out.println("Площадь круга равна " + planeArea);
    }
}
