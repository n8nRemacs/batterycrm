package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class pb0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f388755a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final qb0 f388756b;

    public pb0(int i12, @Y61.k qb0 qb0Var) {
        this.f388755a = i12;
        this.f388756b = qb0Var;
    }

    @Y61.k
    public final qb0 a() {
        return this.f388756b;
    }

    public final int b() {
        return this.f388755a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb0)) {
            return false;
        }
        pb0 pb0Var = (pb0) obj;
        return this.f388755a == pb0Var.f388755a && this.f388756b == pb0Var.f388756b;
    }

    public final int hashCode() {
        return this.f388756b.hashCode() + (Integer.hashCode(this.f388755a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("MeasuredSizeSpec(value=");
        sbA.append(this.f388755a);
        sbA.append(", mode=");
        sbA.append(this.f388756b);
        sbA.append(')');
        return sbA.toString();
    }
}
