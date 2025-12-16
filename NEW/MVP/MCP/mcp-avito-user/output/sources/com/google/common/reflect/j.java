package com.google.common.reflect;

import com.google.common.base.H;
import com.google.common.base.O;
import com.google.common.collect.AbstractC37431x0;
import com.google.common.collect.C37423v2;
import com.google.common.collect.W1;
import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: Parameter.java */
@InterfaceC37524c
/* loaded from: classes6.dex */
public final class j implements AnnotatedElement {
    public final boolean equals(@I41.a Object obj) {
        if (!(obj instanceof j)) {
            return false;
        }
        ((j) obj).getClass();
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    @I41.a
    public final <A extends Annotation> A getAnnotation(Class<A> cls) {
        cls.getClass();
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getAnnotations() {
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A[] getAnnotationsByType(Class<A> cls) {
        return (A[]) getDeclaredAnnotationsByType(cls);
    }

    @Override // java.lang.reflect.AnnotatedElement
    @I41.a
    public final <A extends Annotation> A getDeclaredAnnotation(Class<A> cls) {
        cls.getClass();
        Iterable iterableB = AbstractC37431x0.a(null).b();
        iterableB.getClass();
        Iterator it = AbstractC37431x0.a(W1.c(iterableB, O.g(cls))).b().iterator();
        return (A) (it.hasNext() ? H.d(it.next()) : H.a()).f();
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final Annotation[] getDeclaredAnnotations() {
        throw null;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final <A extends Annotation> A[] getDeclaredAnnotationsByType(Class<A> cls) {
        Iterable iterableB = AbstractC37431x0.a(null).b();
        iterableB.getClass();
        cls.getClass();
        Iterable iterableB2 = AbstractC37431x0.a(W1.c(iterableB, O.g(cls))).b();
        return (A[]) ((Annotation[]) (iterableB2 instanceof Collection ? (Collection) iterableB2 : C37423v2.b(iterableB2.iterator())).toArray((Object[]) Array.newInstance((Class<?>) cls, 0)));
    }

    public final int hashCode() {
        return 0;
    }

    @Override // java.lang.reflect.AnnotatedElement
    public final boolean isAnnotationPresent(Class<? extends Annotation> cls) {
        cls.getClass();
        throw null;
    }

    public final String toString() {
        return "null arg0";
    }
}
