import java.util.Scanner;

public class CheckPoint {

    public String checkQuarter(Point point){
        int x = point.getX();
        int y = point.getY();
        String whichQuarter;
        if(x >= 0 && y >= 0){
            whichQuarter = "I";
        } else if(x <= 0 && y >= 0){
            whichQuarter = "II";
        } else if(x <= 0 && y <= 0){
            whichQuarter = "III";
        } else {
            whichQuarter = "IV";
        }
        return whichQuarter;
    }

    public Point getUserInput(){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj X");
        int x = in.nextInt();
        in.nextLine();
        System.out.println("Podaj Y");
        int y = in.nextInt();
        in.close();
        return new Point(x,y);
    }

    public String getInfo(Point point){
        return "Punkt (" + point.getX() + ", " + point.getY() + ") leży w " + checkQuarter(point) + " ćwiartce układu współrzędnych.";
    }



}
