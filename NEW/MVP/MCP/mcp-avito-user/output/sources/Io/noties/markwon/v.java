package io.noties.markwon;

import j.N;

/* compiled from: Prop.java */
/* loaded from: classes8.dex */
public class v<T> {

    /* renamed from: a, reason: collision with root package name */
    public final String f401936a;

    public v(@N String str) {
        this.f401936a = str;
    }

    @N
    public final T a(@N y yVar) {
        T t12 = (T) yVar.b(this);
        if (t12 != null) {
            return t12;
        }
        throw new NullPointerException(this.f401936a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f401936a.equals(((v) obj).f401936a);
    }

    public final int hashCode() {
        return this.f401936a.hashCode();
    }

    public final String toString() {
        return AK.c.s(new StringBuilder("Prop{name='"), this.f401936a, "'}");
    }
}
