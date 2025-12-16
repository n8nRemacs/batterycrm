package com.fasterxml.jackson.databind;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.util.List;
import qX0.AbstractC47359a;

/* compiled from: JavaType.java */
/* loaded from: classes4.dex */
public abstract class h extends AbstractC47359a implements Serializable, Type {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f341930b;

    /* renamed from: c, reason: collision with root package name */
    public final int f341931c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f341932d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f341933e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f341934f;

    public h(Class<?> cls, int i12, Object obj, Object obj2, boolean z12) {
        this.f341930b = cls;
        this.f341931c = cls.getName().hashCode() + i12;
        this.f341932d = obj;
        this.f341933e = obj2;
        this.f341934f = z12;
    }

    public boolean A() {
        Class<?> cls = this.f341930b;
        if ((cls.getModifiers() & 1536) == 0) {
            return true;
        }
        return cls.isPrimitive();
    }

    public abstract boolean B();

    public final boolean C() {
        Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
        return Enum.class.isAssignableFrom(this.f341930b);
    }

    public final boolean E() {
        return Modifier.isFinal(this.f341930b.getModifiers());
    }

    public final boolean F() {
        return this.f341930b == Object.class;
    }

    public boolean G() {
        return false;
    }

    public final boolean H() {
        Annotation[] annotationArr = com.fasterxml.jackson.databind.util.g.f342596a;
        Class<? super Object> superclass = this.f341930b.getSuperclass();
        return superclass != null && "com.android.tools.r8.RecordTag".equals(superclass.getName());
    }

    public final boolean I(Class<?> cls) {
        Class<?> cls2 = this.f341930b;
        return cls2 == cls || cls.isAssignableFrom(cls2);
    }

    public final boolean J(Class<?> cls) {
        Class<?> cls2 = this.f341930b;
        return cls2 == cls || cls2.isAssignableFrom(cls);
    }

    public abstract h K(Class<?> cls, com.fasterxml.jackson.databind.type.m mVar, h hVar, h[] hVarArr);

    public abstract h L(h hVar);

    public abstract h N(Object obj);

    public abstract h O(i iVar);

    public h P(h hVar) {
        Object obj = hVar.f341933e;
        h hVarR = obj != this.f341933e ? R(obj) : this;
        Object obj2 = this.f341932d;
        Object obj3 = hVar.f341932d;
        return obj3 != obj2 ? hVarR.S(obj3) : hVarR;
    }

    public abstract h Q();

    public abstract h R(Object obj);

    public abstract h S(Object obj);

    public abstract boolean equals(Object obj);

    public abstract h h(int i12);

    public final int hashCode() {
        return this.f341931c;
    }

    public abstract int i();

    public final h k(int i12) {
        h hVarH = h(i12);
        return hVarH == null ? com.fasterxml.jackson.databind.type.n.p() : hVarH;
    }

    public abstract h l(Class<?> cls);

    public abstract com.fasterxml.jackson.databind.type.m m();

    public h n() {
        return null;
    }

    public abstract StringBuilder o(StringBuilder sb2);

    public abstract StringBuilder p(StringBuilder sb2);

    public abstract List<h> q();

    public h r() {
        return null;
    }

    @Override // qX0.AbstractC47359a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public h e() {
        return null;
    }

    public abstract h t();

    public abstract String toString();

    public boolean u() {
        return true;
    }

    public boolean v() {
        return i() > 0;
    }

    public boolean w() {
        return (this.f341933e == null && this.f341932d == null) ? false : true;
    }

    public final boolean x(Class<?> cls) {
        return this.f341930b == cls;
    }

    public boolean y() {
        return Modifier.isAbstract(this.f341930b.getModifiers());
    }

    public boolean z() {
        return false;
    }
}
