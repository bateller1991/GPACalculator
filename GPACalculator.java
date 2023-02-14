import java.util.Scanner;


public class GPACalculator {

        public static void main(String[] args) {
            String[] g = new String[50];
            double[] u = new double[50];
            int count = 0;
            Scanner input = new Scanner(System.in);
            Scanner object = new Scanner(System.in);
            System.out.println("\n\n           GPA Calculator:\n\n");
            System.out.println("    Enter 'x' as Grade in order to EXIT.\n");
            while(true){
                System.out.println("\ngrade #" + (count+1) + ":");
                g[count] = object.nextLine();
                if(g[count].equalsIgnoreCase("x"))
                    break;
                System.out.println("Units for class #" + (count+1) + ": ");
                u[count] = input.nextInt();
                count++;
            }
            int size = count+1;
            double[] gpa = new double[size];
            count = 0;
            int totalUnits = 0;
            for(int i = 0; i < u.length; i++){
                totalUnits += u[i];
            }
            while(g[count] != null && count < g.length){
                if(g[count].equalsIgnoreCase("a")){
                    gpa[count] = 4*(u[count]/totalUnits);
                }
                else if(g[count].equalsIgnoreCase("b")){
                    gpa[count] = 3*(u[count]/totalUnits);
                }
                else if(g[count].equalsIgnoreCase("c")){
                    gpa[count] = 2*(u[count]/totalUnits);
                }
                else if(g[count].equalsIgnoreCase("d")){
                    gpa[count] = (u[count]/totalUnits);
                }
                else{
                    gpa[count] = 0;
                }
                count++;
            }
            double GPA = 0;
            for(int i = 0; i < gpa.length; i++){
                GPA += gpa[i];
            }
            System.out.println("\n\n" + (size-1) + " Classes Entered.\nTotal Units: " + totalUnits + "\nGPA: " + GPA);
        }
    }
