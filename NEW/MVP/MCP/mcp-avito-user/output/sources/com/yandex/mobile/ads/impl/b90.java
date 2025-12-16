package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class b90 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    private final Integer f383819a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    private final Integer f383820b;

    public b90(@Y61.l Integer num, @Y61.l Integer num2) {
        this.f383819a = num;
        this.f383820b = num2;
    }

    @Y61.l
    public final Integer a() {
        return this.f383820b;
    }

    @Y61.l
    public final Integer b() {
        return this.f383819a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b90)) {
            return false;
        }
        b90 b90Var = (b90) obj;
        return kotlin.jvm.internal.L.f(this.f383819a, b90Var.f383819a) && kotlin.jvm.internal.L.f(this.f383820b, b90Var.f383820b);
    }

    public final int hashCode() {
        Integer num = this.f383819a;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f383820b;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("LayoutParamsSize(width=");
        sbA.append(this.f383819a);
        sbA.append(", height=");
        return com.akita.compose.component.accordion.s.j(sbA, this.f383820b, ')');
    }
}
