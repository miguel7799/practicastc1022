package bb;

        import java.util.*;
import java.io.*;
public class BB{
	public static void main (String[]args){
		int opc=0;//variable para seleccion de opcion
		int cont=0;//contador para for anidados
		int cont2=0;//contador para for anidados
		int flag1=0;//flag para verificacion gpo1
		int flag2=0;//flag para verificacion gpo2
		String contin="s";//variable para continuar en opcion 1
		String input="S";
		Boolean salir = true;
		Scanner kb = new Scanner(System.in);
		ArrayList<String> gpo1=new ArrayList<String>();//grupo 1
		ArrayList<String> gpo2=new ArrayList<String>();//grupo2
		ArrayList<String> union=new ArrayList<String>();//union
		ArrayList<String> interseccion=new ArrayList<String>();//interseccion
		ArrayList<String> verificacion=new ArrayList<String>();//verificacion
		System.out.println("Bienvenido al super BlackBoard renovado! \n A continuacion te apareceran las opciones disponibles. \n Selecciona la opcion que deseas realizar.");
		while(salir){
		System.out.println("Elige la acción que quieres realizar");
		System.out.println("1) Añadir matriculas al grupo 1");
		System.out.println("2) Añadir matriculas al grupo 2");
		System.out.println("3) Crear un grupo que contenga las matriculas del grupo 1 y 2");
		System.out.println("4) Crear un grupo que contenga las matriculas que se encuentran en ambos grupos");
		System.out.println("5) Generar todas las parejas posibles entre los grupos");
		System.out.println("6) Ordenar de manera ascendente las matriculas de los dos grupos ");
		System.out.println("7) Ingresar matriculas y corroborar su pertenencia parcial o total de ambos grupos");
		System.out.println("8) ");
		System.out.println("9) Salir del Super Blackboard renovado");

		opc=kb.nextInt();

		switch (opc){
			case 1://Opcion 1 de las instrucciones, ingreso de matriculas gpo 1
				for (cont=0;contin.equals("s");cont++){
					System.out.println("matric");
					gpo1.add(kb.next());
                                        System.out.println("Para continuar presiona 's' o para salir presiona cualquier otra letra");
					System.out.println("contin?");
					contin=kb.next();
				}//for
				System.out.println(gpo1.toString());
				contin="s";
				break;

			case 2://opcion 2 de instrucciones, ingreso de matriculas gpo 2
				for (cont=0;contin.equals("s");cont++){
					System.out.println("Ingresa la matricula");
					gpo2.add(kb.next());
                                        System.out.println("Para continuar presiona 's' o para salir presiona cualquier otra letra");
					System.out.println("contin?");
					contin=kb.next();
				}//for
				System.out.println(gpo2.toString());
				contin="s";
				break;
			case 3://opcion 3 de instrucciones, megagrupo
				union.addAll(gpo1);
				union.addAll(gpo2);
				System.out.println(union);
				break;
			case 4://opcion 4 de instrucciones, grupo con matriculas compartidas
				for(cont=0;cont<gpo1.size();cont++){
					for(cont2=0;cont2<gpo2.size();cont2++){
						if((gpo1.get(cont)).equals(gpo2.get(cont2))){
							interseccion.add(gpo1.get(cont));
						}//termina if
					}//termina for

				}//termina for1
				System.out.println(interseccion.toString());
				break;
			case 5://opcion 5 de instrucciones, parejas posibles
				System.out.println("Las parejas posibles son: ");
				for(cont=0;cont<gpo1.size();cont++){
					for(cont2=0;cont2<gpo2.size();cont2++){
						System.out.println((gpo1.get(cont))+" con "+(gpo2.get(cont2)));
					}//termina for1
				}//termina for2
				break;
			case 6://opcion 6 de instrucciones, ordenar por matricula
				Collections.sort(gpo1);
				Collections.sort(gpo2);
				System.out.println(gpo1);
				System.out.println(gpo2);
				break;
			case 7://opcion 7 de instrucciones, verificar pertenencia de matriculas en los grupos
				for (cont=0;contin.equals("s");cont++){
					System.out.println("matric");
					verificacion.add(kb.next());
					System.out.println("contin?");
					contin=kb.next();
				}//termina for
				for(cont=0;cont<verificacion.size();cont++){
					for(cont2=0;cont2<gpo1.size();cont2++){
						if((verificacion.get(cont)).equals(gpo1.get(cont2))){
							System.out.println((verificacion.get(cont)+" pertenece al grupo 1"));
						}//termina if
						else{
							flag1=1;
						}//termina else
					}//termina for2
				}//termina for1
				for(cont=0;cont<verificacion.size();cont++){
					for(cont2=0;cont2<gpo2.size();cont2++){
						if((verificacion.get(cont)).equals(gpo2.get(cont2))){
							System.out.println((verificacion.get(cont)+" pertenece al grupo 2"));
						}//termina if
						else{
							flag2=1;
						}//termina else
					}//termina for2
				}//termina for1
				if(flag1==0){
					System.out.println("Todas las matriculas pertenecen al grupo 1");
				}//termina if
				if(flag2==0){
					System.out.println("Todas las matriculas pertenecen al grupo 2");
				}//termina if
				flag1=0;
				flag2=0;
				//reseteo de banderas
				break;
			case 8://EXTRA, opcion 8 de instrucciones, todos los grupos posibles


			case 9://opcion 9 de instrucciones, salir del super Blackboard
				salir=false;
				System.exit(0);
				break;

		}//switch
	}//while






	}//principal

}//clase
