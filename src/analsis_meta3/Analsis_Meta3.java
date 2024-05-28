package analsis_meta3;
import java.util.Scanner;

public class Analsis_Meta3 {

    Formato form = new Formato();
    ListaCursos list = new ListaCursos();
    
    public static void main(String[] args) {
        Analsis_Meta3 an = new Analsis_Meta3();
        int continuar=1;
        
        while(continuar==1){
            an.eligeCurso();
            continuar = an.continuacion();
        }
        
        //Cuando se inscriben los alumnos al sistema se van llenando arrayList con la matricula de los alumnos, por lo que 
        //lo que continuaría del proceso sería que la información guardada en los ArrayList se mande a una base de datos
        //en donde está guardada la info de todos los cursos y de sus estudiantes, esto catualizaría la
        //base de datos con la info de los estudiantes recien inscritos.
        
    }
    
    public void eligeCurso(){
        form.inscribir(form.eligeCurso(), list);
    }
    
    public int continuacion(){
        Scanner entrada = new Scanner(System.in);
        int continuar;
        System.out.println("Desea inscribir otro alumno?\n1... Si\n2... No");
        continuar = entrada.nextInt();
        return continuar;
        
    }
    
}
