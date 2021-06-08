package excepciones;

import java.util.Scanner;

public class Excepciones {
    
    
    public double resultado;
    
    public void sosciable(int N){
        int Aux=0, i=0, S=0, j=0;
        Aux=N;
	for (j=1;j<=10;j++){
		S=0;
		for (i=1;i<Aux;i++){
			if (Aux%i==0){
				S=S+i;	
				
			}
		}							
		Aux=S;
	}//fin del for
        
        if (Aux==N){
		System.out.println("El número es sociable ");
	}else{
		System.out.println("El número no es sociable ");
	}//fin del if
        
       
    }//fin sociable 
    
    public void divicion(double Num1, double Num2){
        Excepciones obj1= new Excepciones ();
        
        obj1.setResultado(Num1/Num2);
        System.out.println("la respuesta es: " + obj1.getResultado());
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Excepciones obj= new Excepciones ();
        int op, Aux, Ax = 0;
        String resp;
        double Num1, Num2;
        System.out.println("que desea hacer");
        System.out.println("1.- Dividir dos números");
        System.out.println("2.- Determinar si es número sociable");
        
        
        try{
            do{
            System.out.println("Digite el número de la opción a elegegir");
            op= sc.nextInt();
            do{
               
               if(op!=1 && op!=2){
                   System.out.println("Por favor digite 1 o 2");
                   op= sc.nextInt();
               }
            }while(op!=1 && op!=2);

            switch (op){
                case 1:
                    System.out.println("Digite sus dos números: ");
                    System.out.print("1.- ");
                    Num1=sc.nextDouble();
                    
                    do{
                    System.out.print("2.- ");
                    Num2=sc.nextDouble();
                    if(Num2<=0){
                        System.out.println("Porfavor escriba un numero mayor a 0");
                    }
                    }while(Num2<=0);
                    
                    obj.divicion(Num1, Num2);
                    
                    break;
                case 2:
                    System.out.println("Digite su número: ");
                                       
                    do{
                    System.out.print(".- ");
                    Num1=sc.nextDouble();
                    if(Num1<=0){
                        System.out.println("Porfavor escriba un numero mayor a 0");
                    }
                    }while(Num1<=0);
                    
                    Aux=(int)Num1;
                    
                    System.out.println("el número a evaluar es: " + Aux);
                    
                    obj.sosciable(Aux);

                    break;
            }//fin del switch
            
            System.out.println("¿Desea repetir alguna opción?:");
            System.out.println("Digite  1 para SI o 2 para NO");
            resp=sc.next();			
            if (!resp.equalsIgnoreCase("1") && !resp.equalsIgnoreCase("2")) {
		do {
        		System.out.println("Escriba porfavor 1 o 2");
			resp=sc.next();
			if (resp.equals("1") || resp.equals("2")) {
				Ax=1;
			}
                }while(Ax==0); 
            }
            Ax=0;
            }while(resp.equalsIgnoreCase("1"));
            
        }catch(java.util.InputMismatchException e){
            System.out.println("Digite un NÚMERO para la proxima vez");  
        }
        catch(Exception e){}    
    }
    
    public double getResultado(){
        return resultado;
    }
    public void setResultado(double resultado){
        this.resultado = resultado;
    }
    
}
