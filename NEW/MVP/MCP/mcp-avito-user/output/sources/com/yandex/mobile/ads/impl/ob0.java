package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class ob0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final pb0 f388480a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    private final pb0 f388481b;

    public ob0(@Y61.k pb0 pb0Var, @Y61.k pb0 pb0Var2) {
        this.f388480a = pb0Var;
        this.f388481b = pb0Var2;
    }

    @Y61.k
    public final pb0 a() {
        return this.f388481b;
    }

    @Y61.k
    public final pb0 b() {
        return this.f388480a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ob0)) {
            return false;
        }
        ob0 ob0Var = (ob0) obj;
        return kotlin.jvm.internal.L.f(this.f388480a, ob0Var.f388480a) && kotlin.jvm.internal.L.f(this.f388481b, ob0Var.f388481b);
    }

    public final int hashCode() {
        return this.f388481b.hashCode() + (this.f388480a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("MeasuredSize(width=");
        sbA.append(this.f388480a);
        sbA.append(", height=");
        sbA.append(this.f388481b);
        sbA.append(')');
        return sbA.toString();
    }
}
