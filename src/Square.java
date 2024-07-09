import java.util.ArrayList;
import java.util.Scanner;

public class Square extends Figures{

    public int x;

    ArrayList<String> errors = new ArrayList<>();
    int sides = -1;

    private void inputNumbers (){
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.println("Введите сторону квадрата");
            String side = scanner.next();
            try {
                int x = Integer.parseInt(side);
                sides = x;
            }
            catch (Exception e) {
                System.out.println(e.getMessage());
                errors.add(String.valueOf(side));
            }
        } while (sides == -1);
        System.out.println("Ошибки ввода " +errors);
    }
    private void setX() {
        this.x = sides;
    }


    public double planeArea () {

        inputNumbers();
        setX();
        super.planeArea = (double) this.x * this.x;
        return planeArea;
    }

    @Override
    protected void printArea () {
        System.out.println("Площадь квадрата равна " + planeArea);
    }
}
