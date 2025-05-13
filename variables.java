public class variables {
    public static void main(String[] args) {
        int numero1=10;
        double numero2; //puede requerir colocar D o d al final del numero
        numero2=3.14D;
        float numero3; //requiere letra F o f al final del numero 
        numero3=3.1415F;
        Long numero4; // puede requerir L o l al final del nuero
        numero4=458734L;
        byte numero5=126;
        short numero6=128;
        char caracter1= 'A', caracter2=65;
        boolean opcion=true;
         System.out.println(numero1);
         System.out.println(numero2);
         System.out.println(numero3);
         System.out.println(numero4);
         System.out.println(numero5);
         System.out.println(numero6);
         System.out.println(caracter1);
         System.out.println(caracter2);
         System.out.println(opcion);
               
        String mensaje,mensaje2;
        mensaje="esto es un mensaje";
        
        mensaje2="""
        este
        es
        un
        mensaje
        multilinea
        """;

        System.out.println(mensaje);
        System.out.println(mensaje2);
        System.out.println(mensaje+' '+numero1);
        System.out.println(mensaje.toUpperCase());
        String numero1_string=Integer.toString(numero1);
        System.out.println(mensaje.concat(numero1_string));
        //variable general
        var variable1=15;
        var variable2='F';
        var variable3=2.8750F;
        var PI=3.14159;
        PI=3.1416;
        System.out.println(variable1);
        System.out.println(variable2);
        System.out.println(variable3);
        System.out.println(PI);
 
    }
}