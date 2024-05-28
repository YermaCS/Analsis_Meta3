package analsis_meta3;
import java.util.Scanner;

public class Formato {
    
    private Scanner entrada = new Scanner(System.in);
    public Formato(){
        
    }
    //comentario de prueba 
    public int eligeCurso(){
        int x;
        imprimirOpciones();
        x=entrada.nextInt();
        return x;
    }   
    
    public void imprimirOpciones(){
        System.out.println("1... curso A\n2... curso B\n3... curso C"); 
    }
    
    public void inscribir(int curso, ListaCursos list){
        int matri;
        System.out.println("Escribe tu matricula");
        matri = entrada.nextInt();
        
        list.inscribir(curso, matri);
    }
    
}
