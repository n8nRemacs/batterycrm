package com.yandex.mobile.ads.impl;

/* loaded from: classes8.dex */
public final class z21 {

    /* renamed from: c, reason: collision with root package name */
    public static final z21 f392158c = new z21(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f392159a;

    /* renamed from: b, reason: collision with root package name */
    public final long f392160b;

    public z21(long j12, long j13) {
        this.f392159a = j12;
        this.f392160b = j13;
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || z21.class != obj.getClass()) {
            return false;
        }
        z21 z21Var = (z21) obj;
        return this.f392159a == z21Var.f392159a && this.f392160b == z21Var.f392160b;
    }

    public final int hashCode() {
        return (((int) this.f392159a) * 31) + ((int) this.f392160b);
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("[timeUs=");
        sbA.append(this.f392159a);
        sbA.append(", position=");
        return AK.c.j(this.f392160b, "]", sbA);
    }
}
