package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: JsonAlias.java */
@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.fasterxml.jackson.annotation.e, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public @interface InterfaceC36435e {
    String[] value() default {};
}
