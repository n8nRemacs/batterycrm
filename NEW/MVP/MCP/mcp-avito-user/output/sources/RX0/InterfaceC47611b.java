package rX0;

import com.fasterxml.jackson.annotation.InterfaceC36431a;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ser.t;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: JsonAppend.java */
@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: rX0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public @interface InterfaceC47611b {

    /* compiled from: JsonAppend.java */
    /* renamed from: rX0.b$a */
    public @interface a {
        JsonInclude.Include include() default JsonInclude.Include.f340955c;

        String propName() default "";

        String propNamespace() default "";

        boolean required() default false;

        String value();
    }

    /* compiled from: JsonAppend.java */
    /* renamed from: rX0.b$b, reason: collision with other inner class name */
    public @interface InterfaceC12381b {
        JsonInclude.Include include() default JsonInclude.Include.f340955c;

        String name() default "";

        String namespace() default "";

        boolean required() default false;

        Class<?> type() default Object.class;

        Class<? extends t> value();
    }

    a[] attrs() default {};

    boolean prepend() default false;

    InterfaceC12381b[] props() default {};
}
