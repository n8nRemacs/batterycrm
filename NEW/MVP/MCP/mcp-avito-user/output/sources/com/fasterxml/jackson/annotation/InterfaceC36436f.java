package com.fasterxml.jackson.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: JsonAnyGetter.java */
@InterfaceC36431a
@Target({ElementType.ANNOTATION_TYPE, ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: com.fasterxml.jackson.annotation.f, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public @interface InterfaceC36436f {
    boolean enabled() default true;
}
