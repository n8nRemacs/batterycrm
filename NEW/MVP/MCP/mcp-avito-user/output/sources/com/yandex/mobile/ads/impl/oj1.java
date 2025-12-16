package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class oj1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    private final String f388561a;

    /* renamed from: b, reason: collision with root package name */
    private final int f388562b;

    public oj1(int i12, @Y61.k String str) {
        this.f388561a = str;
        this.f388562b = i12;
    }

    @Y61.k
    public final String a() {
        return this.f388561a;
    }

    public final int b() {
        return this.f388562b;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oj1)) {
            return false;
        }
        oj1 oj1Var = (oj1) obj;
        return kotlin.jvm.internal.L.f(this.f388561a, oj1Var.f388561a) && this.f388562b == oj1Var.f388562b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f388562b) + (this.f388561a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("ViewSizeKey(adUnitId=");
        sbA.append(this.f388561a);
        sbA.append(", screenOrientation=");
        return androidx.appcompat.app.r.t(sbA, this.f388562b, ')');
    }
}
