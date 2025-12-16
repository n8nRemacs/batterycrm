package com.google.common.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Member;

/* compiled from: Invokable.java */
@InterfaceC37524c
/* renamed from: com.google.common.reflect.f, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC37527f<T, R> implements AnnotatedElement, Member {

    /* compiled from: Invokable.java */
    /* renamed from: com.google.common.reflect.f$a */
    public static class a<T> extends AbstractC37527f<T, T> {
    }

    /* compiled from: Invokable.java */
    /* renamed from: com.google.common.reflect.f$b */
    public static class b<T> extends AbstractC37527f<T, Object> {
    }

    static {
        try {
            Class.forName("java.lang.reflect.AnnotatedType");
        } catch (ClassNotFoundException unused) {
        }
    }

    public w<T> a() {
        throw null;
    }

    public final boolean equals(@I41.a Object obj) {
        if ((obj instanceof AbstractC37527f) && a().equals(((AbstractC37527f) obj).a())) {
            throw null;
        }
        return false;
    }

    @Override // java.lang.reflect.AnnotatedElement
    @I41.a
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        throw null;
    }

    @Override // java.lang.reflect.Member
    public final Class<? super T> getDeclaringClass() {
        throw null;
    }

    @Override // java.lang.reflect.Member
    public final int getModifiers() {
        throw null;
    }

    @Override // java.lang.reflect.Member
    public final String getName() {
        throw null;
    }

    public final int hashCode() {
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        throw null;
    }

    @Override // java.lang.reflect.Member
    public final boolean isSynthetic() {
        throw null;
    }

    public String toString() {
        throw null;
    }
}
