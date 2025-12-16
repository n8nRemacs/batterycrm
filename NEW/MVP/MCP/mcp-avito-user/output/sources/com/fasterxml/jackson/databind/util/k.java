package com.fasterxml.jackson.databind.util;

import java.io.Serializable;
import java.lang.annotation.Annotation;

/* compiled from: EnumValues.java */
/* loaded from: classes4.dex */
public final class k implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Class<Enum<?>> f342618b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.core.l[] f342619c;

    public k(Class<Enum<?>> cls, com.fasterxml.jackson.core.l[] lVarArr) {
        this.f342618b = cls;
        cls.getEnumConstants();
        this.f342619c = lVarArr;
    }

    public static k a(com.fasterxml.jackson.databind.z zVar, Class cls) {
        Annotation[] annotationArr = g.f342596a;
        Class superclass = cls.getSuperclass() != Enum.class ? cls.getSuperclass() : cls;
        Enum<?>[] enumArr = (Enum[]) superclass.getEnumConstants();
        if (enumArr == null) {
            throw new IllegalArgumentException("Cannot determine enum constants for Class ".concat(cls.getName()));
        }
        String[] strArrM = zVar.d().m(superclass, enumArr, new String[enumArr.length]);
        com.fasterxml.jackson.core.l[] lVarArr = new com.fasterxml.jackson.core.l[enumArr.length];
        int length = enumArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            Enum<?> r42 = enumArr[i12];
            String strName = strArrM[i12];
            if (strName == null) {
                strName = r42.name();
            }
            lVarArr[r42.ordinal()] = new com.fasterxml.jackson.core.io.n(strName);
        }
        return new k(cls, lVarArr);
    }
}
