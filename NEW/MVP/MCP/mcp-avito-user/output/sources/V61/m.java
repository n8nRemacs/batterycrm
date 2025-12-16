package v61;

import L61.x;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: RequiresNonNull.java */
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@x
@Documented
@Repeatable(a.class)
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes7.dex */
public @interface m {

    /* compiled from: RequiresNonNull.java */
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @x
    @Documented
    @Retention(RetentionPolicy.RUNTIME)
    public @interface a {
    }
}
