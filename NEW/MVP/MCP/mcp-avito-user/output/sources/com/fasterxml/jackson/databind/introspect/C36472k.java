package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* compiled from: AnnotatedMethod.java */
/* renamed from: com.fasterxml.jackson.databind.introspect.k, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36472k extends o implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public final transient Method f342054e;

    /* renamed from: f, reason: collision with root package name */
    public Class<?>[] f342055f;

    /* renamed from: g, reason: collision with root package name */
    public final a f342056g;

    /* compiled from: AnnotatedMethod.java */
    /* renamed from: com.fasterxml.jackson.databind.introspect.k$a */
    public static final class a implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public Class<?> f342057b;

        /* renamed from: c, reason: collision with root package name */
        public String f342058c;

        /* renamed from: d, reason: collision with root package name */
        public Class<?>[] f342059d;
    }

    public C36472k(J j12, Method method, r rVar, r[] rVarArr) {
        super(j12, rVar, rVarArr);
        if (method == null) {
            throw new IllegalArgumentException("Cannot construct AnnotatedMethod with null Method");
        }
        this.f342054e = method;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final AnnotatedElement b() {
        return this.f342054e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final String d() {
        return this.f342054e.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final Class<?> e() {
        return this.f342054e.getReturnType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.fasterxml.jackson.databind.util.g.u(C36472k.class, obj)) {
            return false;
        }
        Method method = ((C36472k) obj).f342054e;
        Method method2 = this.f342054e;
        return method == null ? method2 == null : method.equals(method2);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final com.fasterxml.jackson.databind.h f() {
        return this.f342052b.a(this.f342054e.getGenericReturnType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Class<?> h() {
        return this.f342054e.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final int hashCode() {
        return this.f342054e.getName().hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final String i() {
        String strI = super.i();
        int length = w().length;
        if (length == 0) {
            return androidx.appcompat.app.r.q(strI, "()");
        }
        if (length != 1) {
            return String.format("%s(%d params)", super.i(), Integer.valueOf(w().length));
        }
        StringBuilder sbZ = androidx.appcompat.app.r.z(strI, "(");
        sbZ.append(v(0).getName());
        sbZ.append(")");
        return sbZ.toString();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Member k() {
        return this.f342054e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Object l(Object obj) {
        try {
            return this.f342054e.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException e12) {
            throw new IllegalArgumentException("Failed to getValue() with method " + i() + ": " + com.fasterxml.jackson.databind.util.g.i(e12), e12);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final AbstractC36463b o(r rVar) {
        return new C36472k(this.f342052b, this.f342054e, rVar, this.f342069d);
    }

    @Override // com.fasterxml.jackson.databind.introspect.o
    public final Object p() {
        return this.f342054e.invoke(null, new Object[0]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.o
    public final Object q(Object[] objArr) {
        return this.f342054e.invoke(null, objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.o
    public final Object r(Object obj) {
        return this.f342054e.invoke(null, obj);
    }

    public Object readResolve() throws NoSuchMethodException, SecurityException {
        a aVar = this.f342056g;
        Class<?> cls = aVar.f342057b;
        try {
            Method declaredMethod = cls.getDeclaredMethod(aVar.f342058c, aVar.f342059d);
            if (!declaredMethod.isAccessible()) {
                com.fasterxml.jackson.databind.util.g.e(declaredMethod, false);
            }
            return new C36472k(null, declaredMethod, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + aVar.f342058c + "' from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.o
    public final int t() {
        return w().length;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final String toString() {
        return "[method " + i() + "]";
    }

    @Override // com.fasterxml.jackson.databind.introspect.o
    public final com.fasterxml.jackson.databind.h u(int i12) {
        Type[] genericParameterTypes = this.f342054e.getGenericParameterTypes();
        if (i12 >= genericParameterTypes.length) {
            return null;
        }
        return this.f342052b.a(genericParameterTypes[i12]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.o
    public final Class<?> v(int i12) {
        Class<?>[] clsArrW = w();
        if (clsArrW.length <= 0) {
            return null;
        }
        return clsArrW[0];
    }

    public final Class<?>[] w() {
        if (this.f342055f == null) {
            this.f342055f = this.f342054e.getParameterTypes();
        }
        return this.f342055f;
    }

    public Object writeReplace() {
        a aVar = new a();
        Method method = this.f342054e;
        aVar.f342057b = method.getDeclaringClass();
        aVar.f342058c = method.getName();
        aVar.f342059d = method.getParameterTypes();
        return new C36472k(aVar);
    }

    public C36472k(a aVar) {
        super(null, null, null);
        this.f342054e = null;
        this.f342056g = aVar;
    }
}
