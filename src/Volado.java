import java.util.Random;
import java.util.Scanner;

public class Volado {
    public void volado()
    {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int n=2;
        int azar=0;
        int lanzamientos;
        int aguila=1;
        int sol=2;
        int [] volados= new int[3];
        volados[aguila]=0;
        volados[sol]=0;
        System.out.print("numero de volados: ");
        lanzamientos = sc.nextInt();
        sc.close();

        for (int i=0;i<lanzamientos;i++) {
            azar=rand.nextInt(n)+1;
            if(azar==aguila){
                volados[aguila] +=1;
            }else if(azar==sol){
                volados[sol] +=1;
            }
        }

        System.out.println("cayo aguila: "+volados[aguila]+" veces" );
        System.out.println("cayo sol: "+volados[sol]+" veces" );

    } }


