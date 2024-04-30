import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersion Java");


        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;

        boolean incluidoEnElPlanBasico = true;
        String nombre = "Matrix";
        String sinopsis = """
                La mejor pelicula del fin del milenio bla bla bla
                """;

        System.out.println("Pelicula: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacionUsuario = 0;
        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("media de la evaluacion de Matrix" + " " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023){
            System.out.println("pelicula popular en el momento");
        } else {
            System.out.println("pelicula retro que vale la pena ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("ingresa la evaluacion que le darias a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("la media de la pelicula Matrix calculada por el usuario es: " + mediaEvaluacionUsuario / 3);
    }

}