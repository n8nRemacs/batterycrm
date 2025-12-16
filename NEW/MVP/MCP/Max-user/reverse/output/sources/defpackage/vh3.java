package defpackage;

/* loaded from: classes2.dex */
public final class vh3 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;

    public vh3(int i, int i2, int i3, int i4, int i5, int i6) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh3)) {
            return false;
        }
        vh3 vh3Var = (vh3) obj;
        return this.a == vh3Var.a && this.b == vh3Var.b && this.c == vh3Var.c && this.d == vh3Var.d && this.e == vh3Var.e && this.f == vh3Var.f;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f) + xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(-1, xrf.k(-1, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("CommonIconColors(accent=", this.a, ", accentContrast=", this.b, ", capsule=-1, contrastStatic=-1, negative=");
        hf3.g(sbK, this.c, ", secondary=", this.d, ", themed=");
        return xc0.i(sbK, this.e, ", verificationCapsule=", this.f, ")");
    }
}
