
/**
 * Write a description of class organizadorNotas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class organizadorNotas
{
    int notaEstudiante;
    int cantEstudiantes;
    
    public organizadorNotas(int cantEstudiantes){
       cantEstudiantes = 0;
    }
    public int añadirNota(int notaEstudiante){
       
       return notaEstudiante;
    }
    public int promNotas(int notaEstudiante){
        notaEstudiante=notaEstudiante+notaEstudiante;
        notaEstudiante=notaEstudiante/cantEstudiantes;
        return notaEstudiante;
      
    }
    public int promedioAprobados(int notaEstudiante){
        
        if(notaEstudiante>=51){
              notaEstudiante=notaEstudiante+notaEstudiante;
             
                
                }
        return notaEstudiante;
    }
    public int cantReprobados(int notaEstudiante){
        return notaEstudiante;
    }
    public int cantAprobados(int notaEstudiante){
        return notaEstudiante;
    }
    public int notaAlta(int notaEstudiante){
        
         return notaEstudiante;
    }
}
