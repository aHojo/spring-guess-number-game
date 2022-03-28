package ninja.ahojo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.springframework.beans.factory.annotation.Qualifier;

// @Target, this annotation can be added to fields parameters or methods
@Target({ElementType.FIELD, ElementType.PARAMETER, ElementType.METHOD})
// How long they are to be maintained
@Retention(RetentionPolicy.RUNTIME)
// Spring annotation
@Qualifier
public @interface MaxNumber {

}
