package com.google.common.reflect;

import com.google.common.reflect.p;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* compiled from: TypeResolver.java */
/* loaded from: classes6.dex */
class o extends z {
    @Override // com.google.common.reflect.z
    public final void b(Class<?> cls) {
        throw new IllegalArgumentException("No type mapping from " + cls + " to null");
    }

    @Override // com.google.common.reflect.z
    public final void c(GenericArrayType genericArrayType) {
        com.google.common.base.C c12 = B.f360429a;
        throw null;
    }

    @Override // com.google.common.reflect.z
    public final void d(ParameterizedType parameterizedType) {
        try {
            parameterizedType.getOwnerType();
            throw null;
        } catch (ClassCastException unused) {
            throw new IllegalArgumentException("null is not a ParameterizedType");
        }
    }

    @Override // com.google.common.reflect.z
    public final void e(TypeVariable<?> typeVariable) {
        new p.c(typeVariable);
        throw null;
    }

    @Override // com.google.common.reflect.z
    public final void f(WildcardType wildcardType) {
    }
}
