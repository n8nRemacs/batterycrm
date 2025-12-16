package defpackage;

import java.util.Set;

/* loaded from: classes.dex */
public final class bu3 {
    public static final bu3 i = new bu3(1, false, false, false, false, -1, -1, rd5.a);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final long f;
    public final long g;
    public final Set h;

    public bu3(int i2, boolean z, boolean z2, boolean z3, boolean z4, long j, long j2, Set set) {
        this.a = i2;
        this.b = z;
        this.c = z2;
        this.d = z3;
        this.e = z4;
        this.f = j;
        this.g = j2;
        this.h = set;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !bu3.class.equals(obj.getClass())) {
            return false;
        }
        bu3 bu3Var = (bu3) obj;
        if (this.b == bu3Var.b && this.c == bu3Var.c && this.d == bu3Var.d && this.e == bu3Var.e && this.f == bu3Var.f && this.g == bu3Var.g && this.a == bu3Var.a) {
            return fni.a(this.h, bu3Var.h);
        }
        return false;
    }

    public final int hashCode() {
        int iV = ((((((((az1.v(this.a) * 31) + (this.b ? 1 : 0)) * 31) + (this.c ? 1 : 0)) * 31) + (this.d ? 1 : 0)) * 31) + (this.e ? 1 : 0)) * 31;
        long j = this.f;
        int i2 = (iV + ((int) (j ^ (j >>> 32)))) * 31;
        long j2 = this.g;
        return this.h.hashCode() + ((i2 + ((int) (j2 ^ (j2 >>> 32)))) * 31);
    }
}
