package com.fasterxml.jackson.databind.introspect;

import java.io.Serializable;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Field;
import java.lang.reflect.Member;

/* compiled from: AnnotatedField.java */
/* renamed from: com.fasterxml.jackson.databind.introspect.h, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C36469h extends AbstractC36471j implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: d, reason: collision with root package name */
    public final transient Field f342042d;

    /* renamed from: e, reason: collision with root package name */
    public final a f342043e;

    /* compiled from: AnnotatedField.java */
    /* renamed from: com.fasterxml.jackson.databind.introspect.h$a */
    public static final class a implements Serializable {
        private static final long serialVersionUID = 1;

        /* renamed from: b, reason: collision with root package name */
        public Class<?> f342044b;

        /* renamed from: c, reason: collision with root package name */
        public String f342045c;
    }

    public C36469h(J j12, Field field, r rVar) {
        super(j12, rVar);
        this.f342042d = field;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final AnnotatedElement b() {
        return this.f342042d;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final String d() {
        return this.f342042d.getName();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final Class<?> e() {
        return this.f342042d.getType();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!com.fasterxml.jackson.databind.util.g.u(C36469h.class, obj)) {
            return false;
        }
        Field field = ((C36469h) obj).f342042d;
        Field field2 = this.f342042d;
        return field == null ? field2 == null : field.equals(field2);
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final com.fasterxml.jackson.databind.h f() {
        return this.f342052b.a(this.f342042d.getGenericType());
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Class<?> h() {
        return this.f342042d.getDeclaringClass();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final int hashCode() {
        return this.f342042d.getName().hashCode();
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Member k() {
        return this.f342042d;
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final Object l(Object obj) {
        try {
            return this.f342042d.get(obj);
        } catch (IllegalAccessException e12) {
            throw new IllegalArgumentException("Failed to getValue() for field " + i() + ": " + e12.getMessage(), e12);
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36471j
    public final AbstractC36463b o(r rVar) {
        return new C36469h(this.f342052b, this.f342042d, rVar);
    }

    public Object readResolve() throws NoSuchFieldException {
        a aVar = this.f342043e;
        Class<?> cls = aVar.f342044b;
        try {
            Field declaredField = cls.getDeclaredField(aVar.f342045c);
            if (!declaredField.isAccessible()) {
                com.fasterxml.jackson.databind.util.g.e(declaredField, false);
            }
            return new C36469h(null, declaredField, null);
        } catch (Exception unused) {
            throw new IllegalArgumentException("Could not find method '" + aVar.f342045c + "' from Class '" + cls.getName());
        }
    }

    @Override // com.fasterxml.jackson.databind.introspect.AbstractC36463b
    public final String toString() {
        return "[field " + i() + "]";
    }

    public Object writeReplace() {
        a aVar = new a();
        Field field = this.f342042d;
        aVar.f342044b = field.getDeclaringClass();
        aVar.f342045c = field.getName();
        return new C36469h(aVar);
    }

    public C36469h(a aVar) {
        super(null, null);
        this.f342042d = null;
        this.f342043e = aVar;
    }
}
