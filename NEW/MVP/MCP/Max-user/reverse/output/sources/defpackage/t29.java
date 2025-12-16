package defpackage;

/* loaded from: classes.dex */
public final class t29 {
    public final c99 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;

    public t29(c99 c99Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5 = true;
        fsi.b(!z4 || z2);
        fsi.b(!z3 || z2);
        if (z && (z2 || z3 || z4)) {
            z5 = false;
        }
        fsi.b(z5);
        this.a = c99Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
    }

    public final t29 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new t29(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final t29 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new t29(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && t29.class == obj.getClass()) {
            t29 t29Var = (t29) obj;
            if (this.b == t29Var.b && this.c == t29Var.c && this.d == t29Var.d && this.e == t29Var.e && this.f == t29Var.f && this.g == t29Var.g && this.h == t29Var.h && this.i == t29Var.i && xxg.a(this.a, t29Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0);
    }
}
