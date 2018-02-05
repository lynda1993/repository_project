import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * 
 * @author Client
 *
 */
@Repeatable(Modifies.class)
@Retention(RetentionPolicy.RUNTIME)

public @interface Modiffiee {
	String auteur() default "inconnu";

}
