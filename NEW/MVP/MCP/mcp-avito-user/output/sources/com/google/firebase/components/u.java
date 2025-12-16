package com.google.firebase.components;

import java.lang.annotation.Annotation;

/* compiled from: Qualified.java */
/* loaded from: classes13.dex */
public final class u<T> {

    /* renamed from: a, reason: collision with root package name */
    public final Class<? extends Annotation> f360786a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<T> f360787b;

    /* compiled from: Qualified.java */
    public @interface a {
    }

    public u(Class<? extends Annotation> cls, Class<T> cls2) {
        this.f360786a = cls;
        this.f360787b = cls2;
    }

    public static <T> u<T> a(Class<T> cls) {
        return new u<>(a.class, cls);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || u.class != obj.getClass()) {
            return false;
        }
        u uVar = (u) obj;
        if (this.f360787b.equals(uVar.f360787b)) {
            return this.f360786a.equals(uVar.f360786a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f360786a.hashCode() + (this.f360787b.hashCode() * 31);
    }

    public final String toString() {
        Class<T> cls = this.f360787b;
        Class<? extends Annotation> cls2 = this.f360786a;
        if (cls2 == a.class) {
            return cls.getName();
        }
        return "@" + cls2.getName() + " " + cls.getName();
    }
}
