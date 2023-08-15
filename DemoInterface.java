import java.io.*;
import java.util.Scanner;
import java.util.regex.Pattern; 

public class DemoInterface {
    public static double kim,met,mill;
    public static int opc;
    public static Conv c=new Conv();

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);


        CalD  F=new CalConvD();
        
        try{


       c.menu();

	do {
   	 System.out.println("Por favor digite una opción valida");
   	 while (!s.hasNext("[A-Za-z]*")); {
        	System.out.println("Opción incorrecta");
        	s.next();
    	}
   	 opc = s.nextInt();
	} while (opc <= 0 || opc >6);
	System.out.println("Thank you! Got " + opc);

          switch(opc){
             case 1:{
                do{
                  System.out.println("Digite sus kilometros");
                  kim=s.nextDouble();
                  c.setkm(kim);
                }while(kim<=0);
                System.out.println("Su conversion es: "+F.KMTMLL(kim));
                break;
             }
            case 2:{
                do{
                  System.out.println("Digite sus millas");
                  mill=s.nextDouble();
                  c.setmll(mill);
                }while(mill<=0);
                System.out.println("Su conversion es: "+F.MLLTKM(mill));
                break;

             }
           case 3:{
                do{
                  System.out.println("Digite sus kilometros");
                  kim=s.nextDouble();
                  c.setkm(kim);
                }while(kim<=0);
                System.out.println("Su conversion es: "+F.KMTM(kim));
                break;
             }

           case 4:{
                do{
                  System.out.println("Digite sus metros");
                  met=s.nextDouble();
                  c.setmt(met);
                }while(met<=0);
                System.out.println("Su conversion es: "+F.MTTKM(met));
                break;
             }


           case 5:{
                do{
                  System.out.println("Digite sus metros");
                  met=s.nextDouble();
                  c.setmt(met);
                }while(met<=0);
                System.out.println("Su conversion es: "+F.MTTMLL(met));
                break;
             }

            case 6:{
                do{
                  System.out.println("Digite sus millas");
                  mill=s.nextDouble();
                  c.setmll(mill);
                }while(mill<=0);
                System.out.println("Su conversion es: "+F.MLLTMT(mill));
                break;

        }

     }

        }catch(Exception ex){System.out.println(ex.getMessage());}   
    }
}