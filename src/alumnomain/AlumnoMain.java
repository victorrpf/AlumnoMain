package alumnomain;

import java.util.Scanner;

public class AlumnoMain {

    public static void main(String[] args) {

        Scanner auxiliar = new Scanner(System.in);
        Alumno AlumnoPrimero = new Alumno();
        Alumno AlumnoSegundo = new Alumno();
        
        System.out.println("Introduce los datos del alumno 1:");
        System.out.print("Nombre: ");
        AlumnoPrimero.setnombre(auxiliar.next());
        System.out.print("NIA: ");
        AlumnoPrimero.setNIA(auxiliar.next());
        System.out.print("Ciclo: ");
        AlumnoPrimero.setciclo(auxiliar.next());
        System.out.print("Curso: ");
        AlumnoPrimero.setcurso(auxiliar.next());
        
        System.out.println("Introduce los datos del alumno 2:");
        System.out.print("Nombre: ");
        AlumnoSegundo.setnombre(auxiliar.next());
        System.out.print("NIA: ");
        AlumnoSegundo.setNIA(auxiliar.next());
        System.out.print("Ciclo: ");
        AlumnoSegundo.setciclo(auxiliar.next());
        System.out.print("Curso: ");
        AlumnoSegundo.setcurso(auxiliar.next());
        
        System.out.println("");
        
        System.out.println("Alumno 1: \t" + AlumnoPrimero.toString());
        System.out.println("Alumno 2: \t" + AlumnoSegundo.toString());
    }
    
}

    class Alumno {        
        private String nombre;
        private String NIA;
        private String ciclo;
        private String curso;
        
        public Alumno() {            
        }
        public void setnombre(String nombre){
            this.nombre = nombre;
        }
        public void setNIA(String NIA){
            this.NIA = NIA;
        }
        public void setciclo(String ciclo){
            this.ciclo = ciclo;
        }
        public void setcurso(String curso){
            this. curso = curso;
        }
        @Override
        public String toString() {
            return ("Nombre: " + nombre + "\t NIA:" + NIA + "\t Ciclo:" + ciclo + "\t Curso:" + curso);
        }
    }
