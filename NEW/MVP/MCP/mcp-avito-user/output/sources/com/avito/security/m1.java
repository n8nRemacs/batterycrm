package com.avito.security;

import androidx.compose.foundation.H;
import java.io.Serializable;

/* loaded from: classes5.dex */
public final class m1<A, B> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private final A f338609a;

    /* renamed from: b, reason: collision with root package name */
    private final B f338610b;

    public m1(A a12, B b12) {
        this.f338609a = a12;
        this.f338610b = b12;
    }

    public final A a() {
        return this.f338609a;
    }

    public final B b() {
        return this.f338610b;
    }

    public final A c() {
        return this.f338609a;
    }

    public final B d() {
        return this.f338610b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return y0.a(this.f338609a, m1Var.f338609a) && y0.a(this.f338610b, m1Var.f338610b);
    }

    public int hashCode() {
        A a12 = this.f338609a;
        int iHashCode = (a12 != null ? a12.hashCode() : 0) * 31;
        B b12 = this.f338610b;
        return iHashCode + (b12 != null ? b12.hashCode() : 0);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("(");
        sb2.append(this.f338609a);
        sb2.append(", ");
        return H.n(sb2, this.f338610b, ')');
    }
}
