
/**
 * Write a description of class CalendarioBasicoMiguel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CalendarioBasicoMiguel
{
    
    private int dia;
    
    private int mes;
    
    private int año;
  
      public CalendarioBasicoMiguel(){
          dia = 1;
          mes = 1;
          año = 1;
    }

    /**
     * Constructor for objects of class CalendarioBasicoMiguel
     */
    public void FijarFecha(int diaAFijar, int mesAFijar, int añoAFijar)
    {
        dia = diaAFijar;
        mes = mesAFijar;
        año = añoAFijar;
        
    }
    public void AvanzarFecha(){
          if (dia < 30){
              dia = dia + 1;
          }
          else{
            System.out.println("############");
            System.out.println("Este valor no es correcto");
            System.out.println("############");
            
          }
          
          mes = mes;
          año = año;
    
    
    }
    
    
    
    
    
    
    
    
    
    }



