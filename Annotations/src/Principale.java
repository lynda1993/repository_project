import java.text.Annotation;

public class Principale {
	public static void main(String [] args)
	{
		//Personne.class.getAnnotations();
		Annotation[] annotations =  Personne.class.getAnnotations();
		 for(Annotation a : annotations)
		 {
			 System.out.println(a);
		 }
		}
}
