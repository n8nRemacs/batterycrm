package com.fasterxml.jackson.databind.type;

import java.io.Serializable;
import java.lang.reflect.TypeVariable;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* compiled from: TypeBindings.java */
/* loaded from: classes4.dex */
public class m implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f342467f;

    /* renamed from: g, reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.h[] f342468g;

    /* renamed from: h, reason: collision with root package name */
    public static final m f342469h;
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String[] f342470b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h[] f342471c;

    /* renamed from: d, reason: collision with root package name */
    public final String[] f342472d;

    /* renamed from: e, reason: collision with root package name */
    public final int f342473e;

    /* compiled from: TypeBindings.java */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final Class<?> f342474a;

        /* renamed from: b, reason: collision with root package name */
        public final com.fasterxml.jackson.databind.h[] f342475b;

        /* renamed from: c, reason: collision with root package name */
        public final int f342476c;

        public a(Class<?> cls, com.fasterxml.jackson.databind.h[] hVarArr, int i12) {
            this.f342474a = cls;
            this.f342475b = hVarArr;
            this.f342476c = i12;
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj == null || obj.getClass() != a.class) {
                return false;
            }
            a aVar = (a) obj;
            if (this.f342476c == aVar.f342476c && this.f342474a == aVar.f342474a) {
                com.fasterxml.jackson.databind.h[] hVarArr = this.f342475b;
                int length = hVarArr.length;
                com.fasterxml.jackson.databind.h[] hVarArr2 = aVar.f342475b;
                if (length == hVarArr2.length) {
                    for (int i12 = 0; i12 < length; i12++) {
                        if (!hVarArr[i12].equals(hVarArr2[i12])) {
                            return false;
                        }
                    }
                    return true;
                }
            }
            return false;
        }

        public final int hashCode() {
            return this.f342476c;
        }

        public final String toString() {
            return this.f342474a.getName().concat("<>");
        }
    }

    /* compiled from: TypeBindings.java */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public static final TypeVariable<?>[] f342477a = AbstractList.class.getTypeParameters();

        /* renamed from: b, reason: collision with root package name */
        public static final TypeVariable<?>[] f342478b = Collection.class.getTypeParameters();

        /* renamed from: c, reason: collision with root package name */
        public static final TypeVariable<?>[] f342479c = Iterable.class.getTypeParameters();

        /* renamed from: d, reason: collision with root package name */
        public static final TypeVariable<?>[] f342480d = List.class.getTypeParameters();

        /* renamed from: e, reason: collision with root package name */
        public static final TypeVariable<?>[] f342481e = ArrayList.class.getTypeParameters();

        /* renamed from: f, reason: collision with root package name */
        public static final TypeVariable<?>[] f342482f = Map.class.getTypeParameters();

        /* renamed from: g, reason: collision with root package name */
        public static final TypeVariable<?>[] f342483g = HashMap.class.getTypeParameters();

        /* renamed from: h, reason: collision with root package name */
        public static final TypeVariable<?>[] f342484h = LinkedHashMap.class.getTypeParameters();
    }

    static {
        String[] strArr = new String[0];
        f342467f = strArr;
        com.fasterxml.jackson.databind.h[] hVarArr = new com.fasterxml.jackson.databind.h[0];
        f342468g = hVarArr;
        f342469h = new m(strArr, hVarArr, null);
    }

    public m(String[] strArr, com.fasterxml.jackson.databind.h[] hVarArr, String[] strArr2) {
        strArr = strArr == null ? f342467f : strArr;
        this.f342470b = strArr;
        hVarArr = hVarArr == null ? f342468g : hVarArr;
        this.f342471c = hVarArr;
        if (strArr.length != hVarArr.length) {
            StringBuilder sb2 = new StringBuilder("Mismatching names (");
            sb2.append(strArr.length);
            sb2.append("), types (");
            throw new IllegalArgumentException(AK.c.i(hVarArr.length, ")", sb2));
        }
        int length = hVarArr.length;
        int i12 = 1;
        for (int i13 = 0; i13 < length; i13++) {
            i12 += this.f342471c[i13].f341931c;
        }
        this.f342472d = strArr2;
        this.f342473e = i12;
    }

    public static m a(com.fasterxml.jackson.databind.h hVar, Class cls) {
        TypeVariable<?>[] typeParameters;
        if (cls == Collection.class) {
            typeParameters = b.f342478b;
        } else if (cls == List.class) {
            typeParameters = b.f342480d;
        } else if (cls == ArrayList.class) {
            typeParameters = b.f342481e;
        } else if (cls == AbstractList.class) {
            typeParameters = b.f342477a;
        } else if (cls == Iterable.class) {
            typeParameters = b.f342479c;
        } else {
            TypeVariable<?>[] typeVariableArr = b.f342477a;
            typeParameters = cls.getTypeParameters();
        }
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 1) {
            return new m(new String[]{typeParameters[0].getName()}, new com.fasterxml.jackson.databind.h[]{hVar}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 1 type parameter: class expects " + length);
    }

    public static m b(Class<?> cls, com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.h hVar2) {
        TypeVariable[] typeParameters;
        if (cls == Map.class) {
            typeParameters = b.f342482f;
        } else if (cls == HashMap.class) {
            typeParameters = b.f342483g;
        } else if (cls == LinkedHashMap.class) {
            typeParameters = b.f342484h;
        } else {
            TypeVariable<?>[] typeVariableArr = b.f342477a;
            typeParameters = cls.getTypeParameters();
        }
        int length = typeParameters == null ? 0 : typeParameters.length;
        if (length == 2) {
            return new m(new String[]{typeParameters[0].getName(), typeParameters[1].getName()}, new com.fasterxml.jackson.databind.h[]{hVar, hVar2}, null);
        }
        throw new IllegalArgumentException("Cannot create TypeBindings for class " + cls.getName() + " with 2 type parameters: class expects " + length);
    }

    public static m c(Class<?> cls, com.fasterxml.jackson.databind.h[] hVarArr) {
        String[] strArr;
        if (hVarArr == null) {
            hVarArr = f342468g;
        } else {
            int length = hVarArr.length;
            if (length == 1) {
                return a(hVarArr[0], cls);
            }
            if (length == 2) {
                return b(cls, hVarArr[0], hVarArr[1]);
            }
        }
        TypeVariable<Class<?>>[] typeParameters = cls.getTypeParameters();
        if (typeParameters == null || typeParameters.length == 0) {
            strArr = f342467f;
        } else {
            int length2 = typeParameters.length;
            strArr = new String[length2];
            for (int i12 = 0; i12 < length2; i12++) {
                strArr[i12] = typeParameters[i12].getName();
            }
        }
        if (strArr.length == hVarArr.length) {
            return new m(strArr, hVarArr, null);
        }
        StringBuilder sb2 = new StringBuilder("Cannot create TypeBindings for class ");
        androidx.compose.ui.graphics.colorspace.e.u(cls, sb2, " with ");
        sb2.append(hVarArr.length);
        sb2.append(" type parameter");
        sb2.append(hVarArr.length == 1 ? "" : "s");
        sb2.append(": class expects ");
        sb2.append(strArr.length);
        throw new IllegalArgumentException(sb2.toString());
    }

    public final com.fasterxml.jackson.databind.h d(int i12) {
        if (i12 < 0) {
            return null;
        }
        com.fasterxml.jackson.databind.h[] hVarArr = this.f342471c;
        if (i12 >= hVarArr.length) {
            return null;
        }
        return hVarArr[i12];
    }

    public final List<com.fasterxml.jackson.databind.h> e() {
        com.fasterxml.jackson.databind.h[] hVarArr = this.f342471c;
        return hVarArr.length == 0 ? Collections.emptyList() : Arrays.asList(hVarArr);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.fasterxml.jackson.databind.util.g.u(getClass(), obj)) {
            return false;
        }
        com.fasterxml.jackson.databind.h[] hVarArr = this.f342471c;
        int length = hVarArr.length;
        com.fasterxml.jackson.databind.h[] hVarArr2 = ((m) obj).f342471c;
        if (length != hVarArr2.length) {
            return false;
        }
        for (int i12 = 0; i12 < length; i12++) {
            if (!hVarArr2[i12].equals(hVarArr[i12])) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.f342471c.length == 0;
    }

    public final int hashCode() {
        return this.f342473e;
    }

    public Object readResolve() {
        String[] strArr = this.f342470b;
        return (strArr == null || strArr.length == 0) ? f342469h : this;
    }

    public final String toString() {
        com.fasterxml.jackson.databind.h[] hVarArr = this.f342471c;
        if (hVarArr.length == 0) {
            return "<>";
        }
        StringBuilder sb2 = new StringBuilder("<");
        int length = hVarArr.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (i12 > 0) {
                sb2.append(',');
            }
            com.fasterxml.jackson.databind.h hVar = hVarArr[i12];
            StringBuilder sb3 = new StringBuilder(40);
            hVar.p(sb3);
            sb2.append(sb3.toString());
        }
        sb2.append('>');
        return sb2.toString();
    }
}
