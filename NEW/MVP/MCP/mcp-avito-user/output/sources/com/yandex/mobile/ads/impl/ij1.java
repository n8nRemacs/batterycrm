package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class ij1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f386500a;

    /* renamed from: b, reason: collision with root package name */
    private final int f386501b;

    public ij1(int i12, int i13) {
        this.f386500a = i12;
        this.f386501b = i13;
    }

    public final int a() {
        return this.f386501b;
    }

    public final int b() {
        return this.f386500a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij1)) {
            return false;
        }
        ij1 ij1Var = (ij1) obj;
        return this.f386500a == ij1Var.f386500a && this.f386501b == ij1Var.f386501b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f386501b) + (Integer.hashCode(this.f386500a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("ViewSize(width=");
        sbA.append(this.f386500a);
        sbA.append(", height=");
        return androidx.appcompat.app.r.t(sbA, this.f386501b, ')');
    }
}
