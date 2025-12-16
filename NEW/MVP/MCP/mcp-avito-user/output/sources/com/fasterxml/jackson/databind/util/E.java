package com.fasterxml.jackson.databind.util;

/* compiled from: TypeKey.java */
/* loaded from: classes4.dex */
public class E {

    /* renamed from: a, reason: collision with root package name */
    public final int f342577a;

    /* renamed from: b, reason: collision with root package name */
    public final Class<?> f342578b;

    /* renamed from: c, reason: collision with root package name */
    public final com.fasterxml.jackson.databind.h f342579c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f342580d;

    public E() {
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (obj.getClass() != getClass()) {
            return false;
        }
        E e12 = (E) obj;
        if (e12.f342580d != this.f342580d) {
            return false;
        }
        Class<?> cls = this.f342578b;
        return cls != null ? e12.f342578b == cls : this.f342579c.equals(e12.f342579c);
    }

    public final int hashCode() {
        return this.f342577a;
    }

    public final String toString() {
        boolean z12 = this.f342580d;
        Class<?> cls = this.f342578b;
        if (cls != null) {
            return "{class: " + cls.getName() + ", typed? " + z12 + "}";
        }
        return "{type: " + this.f342579c + ", typed? " + z12 + "}";
    }

    public E(boolean z12, Class cls) {
        this.f342578b = cls;
        this.f342579c = null;
        this.f342580d = z12;
        this.f342577a = z12 ? cls.getName().hashCode() + 1 : cls.getName().hashCode();
    }

    public E(com.fasterxml.jackson.databind.h hVar, boolean z12) {
        int i12;
        this.f342579c = hVar;
        this.f342578b = null;
        this.f342580d = z12;
        if (z12) {
            i12 = hVar.f341931c - 2;
        } else {
            i12 = hVar.f341931c - 1;
        }
        this.f342577a = i12;
    }
}
