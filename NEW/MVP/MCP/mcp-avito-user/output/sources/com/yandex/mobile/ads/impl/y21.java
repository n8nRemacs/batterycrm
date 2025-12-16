package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class y21 {

    /* renamed from: c, reason: collision with root package name */
    public static final y21 f391898c;

    /* renamed from: a, reason: collision with root package name */
    public final long f391899a;

    /* renamed from: b, reason: collision with root package name */
    public final long f391900b;

    static {
        y21 y21Var = new y21(0L, 0L);
        new y21(Long.MAX_VALUE, Long.MAX_VALUE);
        new y21(Long.MAX_VALUE, 0L);
        new y21(0L, Long.MAX_VALUE);
        f391898c = y21Var;
    }

    public y21(long j12, long j13) {
        db.a(j12 >= 0);
        db.a(j13 >= 0);
        this.f391899a = j12;
        this.f391900b = j13;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y21.class != obj.getClass()) {
            return false;
        }
        y21 y21Var = (y21) obj;
        return this.f391899a == y21Var.f391899a && this.f391900b == y21Var.f391900b;
    }

    public final int hashCode() {
        return (((int) this.f391899a) * 31) + ((int) this.f391900b);
    }
}
