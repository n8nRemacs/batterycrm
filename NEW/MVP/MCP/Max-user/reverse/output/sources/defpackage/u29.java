package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public final class u29 {
    public final d99 a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;

    public u29(d99 d99Var, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        boolean z6 = true;
        hsi.b(!z5 || z3);
        hsi.b(!z4 || z3);
        if (z2 && (z3 || z4 || z5)) {
            z6 = false;
        }
        hsi.b(z6);
        this.a = d99Var;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = j4;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = z5;
    }

    public final u29 a(long j) {
        if (j == this.c) {
            return this;
        }
        return new u29(this.a, this.b, j, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final u29 b(long j) {
        if (j == this.b) {
            return this;
        }
        return new u29(this.a, j, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u29.class == obj.getClass()) {
            u29 u29Var = (u29) obj;
            if (this.b == u29Var.b && this.c == u29Var.c && this.d == u29Var.d && this.e == u29Var.e && this.f == u29Var.f && this.g == u29Var.g && this.h == u29Var.h && this.i == u29Var.i && this.j == u29Var.j && Objects.equals(this.a, u29Var.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + ((int) this.c)) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0)) * 31) + (this.h ? 1 : 0)) * 31) + (this.i ? 1 : 0)) * 31) + (this.j ? 1 : 0);
    }
}
