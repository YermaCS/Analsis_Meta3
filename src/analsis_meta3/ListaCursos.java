package analsis_meta3;

import java.util.ArrayList;

public class ListaCursos {
    
    ArrayList inscritosA = new ArrayList<>();
    ArrayList inscritosB = new ArrayList<>();
    ArrayList inscritosC = new ArrayList<>();
    
    public ListaCursos(){
        
    }
    
    public void inscribir(int curso, int matricula){
        String grupo=" ";
        
        switch(curso){
            case 1:
                grupo = "a";
                inscritosA.add(matricula);
            break;
            case 2:
                grupo = "b";
                inscritosB.add(matricula);
            break;
            case 3:
                grupo = "c";
                inscritosB.add(matricula);
            break;
        }
        
        System.out.println("Alumno "+matricula+" ha sido inscrito en curso "+grupo+"");
    }
    
    
    
}
