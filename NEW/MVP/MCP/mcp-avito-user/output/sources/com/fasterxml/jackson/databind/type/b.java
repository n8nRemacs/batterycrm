package com.fasterxml.jackson.databind.type;

import java.io.Serializable;

/* compiled from: ClassKey.java */
/* loaded from: classes4.dex */
public final class b implements Comparable<b>, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f342449b;

    /* renamed from: c, reason: collision with root package name */
    public final Class<?> f342450c;

    /* renamed from: d, reason: collision with root package name */
    public final int f342451d;

    public b() {
        this.f342450c = null;
        this.f342449b = null;
        this.f342451d = 0;
    }

    @Override // java.lang.Comparable
    public final int compareTo(b bVar) {
        return this.f342449b.compareTo(bVar.f342449b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return obj != null && obj.getClass() == b.class && ((b) obj).f342450c == this.f342450c;
    }

    public final int hashCode() {
        return this.f342451d;
    }

    public final String toString() {
        return this.f342449b;
    }

    public b(Class<?> cls) {
        this.f342450c = cls;
        String name = cls.getName();
        this.f342449b = name;
        this.f342451d = name.hashCode();
    }
}
