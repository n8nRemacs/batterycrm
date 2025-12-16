package rX0;

import com.fasterxml.jackson.annotation.InterfaceC36431a;
import com.fasterxml.jackson.databind.i;
import com.fasterxml.jackson.databind.m;
import com.fasterxml.jackson.databind.util.i;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: JsonDeserialize.java */
@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD, ElementType.TYPE, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: rX0.c, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC47612c {
    Class<?> as() default Void.class;

    Class<?> builder() default Void.class;

    Class<?> contentAs() default Void.class;

    Class<? extends com.fasterxml.jackson.databind.util.i> contentConverter() default i.a.class;

    Class<? extends com.fasterxml.jackson.databind.i> contentUsing() default i.a.class;

    Class<? extends com.fasterxml.jackson.databind.util.i> converter() default i.a.class;

    Class<?> keyAs() default Void.class;

    Class<? extends m> keyUsing() default m.a.class;

    Class<? extends com.fasterxml.jackson.databind.i> using() default i.a.class;
}
