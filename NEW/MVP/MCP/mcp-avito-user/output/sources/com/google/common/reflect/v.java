package com.google.common.reflect;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;

/* compiled from: TypeToken.java */
/* loaded from: classes6.dex */
class v extends z {
    @Override // com.google.common.reflect.z
    public final void c(GenericArrayType genericArrayType) {
        a(genericArrayType.getGenericComponentType());
    }

    @Override // com.google.common.reflect.z
    public final void d(ParameterizedType parameterizedType) {
        a(parameterizedType.getActualTypeArguments());
        a(parameterizedType.getOwnerType());
    }

    @Override // com.google.common.reflect.z
    public final void e(TypeVariable<?> typeVariable) {
        throw null;
    }

    @Override // com.google.common.reflect.z
    public final void f(WildcardType wildcardType) {
        a(wildcardType.getLowerBounds());
        a(wildcardType.getUpperBounds());
    }
}
