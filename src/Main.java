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
        double mediaEvaluacionUsuario = 1;


        System.out.println("Pelicula: " + nombre);
        System.out.println(fechaDeLanzamiento);
        System.out.println(evaluacion);
        System.out.println(incluidoEnElPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("media de la evaluacion de Matrix" + " " + mediaEvaluacion);

        if (fechaDeLanzamiento >= 2023) {
            System.out.println("Pelicula popular del momento");
        } else {
            System.out.println("Pelicula retro que vale la pena ver");
        }

        /*for (int i = 0; i <= 3; i++) {
        Scanner teclado =  new Scanner(System.in);
            System.out.println("Ingresa la nota que le daria a Matrix");
            double notaMatrix = teclado.nextDouble();
            mediaEvaluacionUsuario = mediaEvaluacionUsuario + notaMatrix;
        }
        System.out.println("la media de la pelicula " + "Matrix calculada por el usuario es " + mediaEvaluacion / 3);*/


        int i = 1;
                while (i <= 3){ //mi bucle podra llegar hasta 3 iteraiones
                    Scanner teclado = new Scanner(System.in); //llamo a mi variable Scanner para poder leer y procesar los valores que ingresen
                    System.out.println("Calificacion de la pelicula"); // imprimo el mensaje como resultado del dato ingresado
                    double calificacionPelicula = teclado.nextDouble(); // lo ingresado en el teclado se guardara aqui
                    mediaEvaluacionUsuario = (mediaEvaluacionUsuario + calificacionPelicula); // se modifica el valor de la variable
                    i = i+1; //contador
                }
                System.out.println("el valor promedio del usuario es: " + mediaEvaluacionUsuario  / 3); // se promedian los resultados
    }
}