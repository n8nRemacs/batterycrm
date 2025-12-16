package com.fasterxml.jackson.databind.introspect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.util.Objects;

/* compiled from: MethodGenericTypeResolver.java */
/* loaded from: classes4.dex */
final class B {
    public static ParameterizedType a(Type type) {
        if (type instanceof ParameterizedType) {
            return (ParameterizedType) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return a(upperBounds[0]);
            }
        }
        return null;
    }

    public static TypeVariable<?> b(Type type) {
        if (type instanceof TypeVariable) {
            return (TypeVariable) type;
        }
        if (type instanceof WildcardType) {
            WildcardType wildcardType = (WildcardType) type;
            if (wildcardType.getLowerBounds().length != 0) {
                return null;
            }
            Type[] upperBounds = wildcardType.getUpperBounds();
            if (upperBounds.length == 1) {
                return b(upperBounds[0]);
            }
        }
        return null;
    }

    public static boolean c(C36465d c36465d, com.fasterxml.jackson.databind.h hVar, Type type) {
        if (!hVar.I(c36465d.a(type).f341930b)) {
            return false;
        }
        ParameterizedType parameterizedTypeA = a(type);
        if (parameterizedTypeA == null) {
            return true;
        }
        if (!Objects.equals(hVar.f341930b, parameterizedTypeA.getRawType())) {
            return true;
        }
        Type[] actualTypeArguments = parameterizedTypeA.getActualTypeArguments();
        com.fasterxml.jackson.databind.type.m mVarM = hVar.m();
        if (mVarM.f342471c.length != actualTypeArguments.length) {
            return false;
        }
        for (int i12 = 0; i12 < mVarM.f342471c.length; i12++) {
            if (!c(c36465d, mVarM.d(i12), actualTypeArguments[i12])) {
                return false;
            }
        }
        return true;
    }
}
