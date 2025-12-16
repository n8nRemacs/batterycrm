package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.Member;
import java.lang.reflect.Type;

/* compiled from: AnnotatedConstructor.java */
/* renamed from: com.fasterxml.jackson.databind.introspect.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36467f extends o {
    private static final long serialVersionUID = 1;

    /* renamed from: e, reason: collision with root package name */
    public final Constructor<?> f342035e;

    /* renamed from: f, reason: collision with root package name */
    public final a f342036f;

    /* compiled from: AnnotatedConstructor.java */
    /* renamed from: com.fasterxml.jackson.databind.introspect.f$a */
    public static final class a implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public Class<?> f342037b;

        /* renamed from: c, reason: collision with root package name */
        public Class<?>[] f342038c;

        public a() {
            throw null;
        }
    }

    public C36467f(J j12, Constructor<?> constructor, r rVar, r[] rVarArr) {
        super(j12, rVar, rVarArr);
        if (constructor == null) {
            throw new IllegalArgumentException("Null constructor not allowed");
        }
        this.f342035e = constructor;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final AnnotatedElement b() {
        return this.f342035e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final String d() {
        return this.f342035e.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final Class<?> e() {
        return this.f342035e.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.fasterxml.jackson.databind.util.g.u(C36467f.class, obj)) {
            return false;
        }
        Constructor<?> constructor = ((C36467f) obj).f342035e;
        Constructor<?> constructor2 = this.f342035e;
        return constructor == null ? constructor2 == null : constructor.equals(constructor2);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final com.fasterxml.jackson.databind.h f() {
        return this.f342052b.a(this.f342035e.getDeclaringClass());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Class<?> h() {
        return this.f342035e.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final int hashCode() {
        return this.f342035e.getName().hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Member k() {
        return this.f342035e;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Object l(Object obj) {
        throw new UnsupportedOperationException("Cannot call getValue() on constructor of ".concat(this.f342035e.getDeclaringClass().getName()));
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final AbstractC36463b o(r rVar) {
        return new C36467f(this.f342052b, this.f342035e, rVar, this.f342069d);
    }

    @Override // com.fasterxml.jackson.databind.introspect.o
    public final Object p() {
        return this.f342035e.newInstance(null);
    }

    @Override // com.fasterxml.jackson.databind.introspect.o
    public final Object q(Object[] objArr) {
        return this.f342035e.newInstance(objArr);
    }

    @Override // com.fasterxml.jackson.databind.introspect.o
    public final Object r(Object obj) {
        return this.f342035e.newInstance(obj);
    }

    public Object readResolve() throws NoSuchMethodException, SecurityException {
        a aVar = this.f342036f;
        Class<?> cls = aVar.f342037b;
        try {
            Constructor<?> declaredConstructor = cls.getDeclaredConstructor(aVar.f342038c);
            if (!declaredConstructor.isAccessible()) {
                com.fasterxml.jackson.databind.util.g.e(declaredConstructor, false);
            }
            return new C36467f(null, declaredConstructor, null, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find constructor with " + aVar.f342038c.length + " args from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.o
    public final int t() {
        return this.f342035e.getParameterTypes().length;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final String toString() {
        Constructor<?> constructor = this.f342035e;
        int length = constructor.getParameterTypes().length;
        return String.format("[constructor for %s (%d arg%s), annotations: %s", com.fasterxml.jackson.databind.util.g.A(constructor.getDeclaringClass()), Integer.valueOf(length), length == 1 ? "" : "s", this.f342053c);
    }

    @Override // com.fasterxml.jackson.databind.introspect.o
    public final com.fasterxml.jackson.databind.h u(int i12) {
        Type[] genericParameterTypes = this.f342035e.getGenericParameterTypes();
        if (i12 >= genericParameterTypes.length) {
            return null;
        }
        return this.f342052b.a(genericParameterTypes[i12]);
    }

    @Override // com.fasterxml.jackson.databind.introspect.o
    public final Class<?> v(int i12) {
        Class<?>[] parameterTypes = this.f342035e.getParameterTypes();
        if (i12 >= parameterTypes.length) {
            return null;
        }
        return parameterTypes[i12];
    }

    public Object writeReplace() {
        a aVar = new a();
        Constructor<?> constructor = this.f342035e;
        aVar.f342037b = constructor.getDeclaringClass();
        aVar.f342038c = constructor.getParameterTypes();
        return new C36467f(aVar);
    }

    public C36467f(a aVar) {
        super(null, null, null);
        this.f342035e = null;
        this.f342036f = aVar;
    }
}
