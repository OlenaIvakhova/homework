public class Main {

    public static void main(String args[]){

        char den = '2';

        switch(den) // swith обязательное слово потом в дужках название
        {
            case '1' :
                System.out.println("Ponedilok");
                break;
            case '2' :
                System.out.println("Vivtorok");
                break;
            case '3' :
                System.out.println("Sereda");
                break;
            case '4' :
                System.out.println("Chetverg");
                break;
            case '5' :
                System.out.println("Pyatnitsa");
                break;
            case '6' :
                System.out.println("Subota");
                break;
            case '7' :
                System.out.println("Nedilya");
                break;

        }
        System.out.println("Den tuznya" + den);
    }
}