package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes8.dex */
public final class hj1 {

    /* renamed from: a, reason: collision with root package name */
    private final int f386151a;

    /* renamed from: b, reason: collision with root package name */
    private final int f386152b;

    public hj1(int i12, int i13) {
        this.f386151a = i12;
        this.f386152b = i13;
    }

    public final int a() {
        return this.f386152b;
    }

    public final int b() {
        return this.f386151a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hj1)) {
            return false;
        }
        hj1 hj1Var = (hj1) obj;
        return this.f386151a == hj1Var.f386151a && this.f386152b == hj1Var.f386152b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f386152b) + (Integer.hashCode(this.f386151a) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sbA = Cif.a("ViewSize(width=");
        sbA.append(this.f386151a);
        sbA.append(", height=");
        return androidx.appcompat.app.r.t(sbA, this.f386152b, ')');
    }

    public hj1(@Y61.k View view) {
        this(view.getWidth(), view.getHeight());
    }
}
