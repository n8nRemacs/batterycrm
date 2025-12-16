package defpackage;

/* loaded from: classes2.dex */
public final class ni3 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public ni3(int i, int i2, int i3, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ni3)) {
            return false;
        }
        ni3 ni3Var = (ni3) obj;
        return this.a == ni3Var.a && this.b == ni3Var.b && this.c == ni3Var.c && this.d == ni3Var.d && this.e == ni3Var.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("CommonStatesTextDisabledColors(contrast=", this.a, ", contrastStatic=", this.b, ", negative=");
        hf3.g(sbK, this.c, ", primary=", this.d, ", themed=");
        return ho7.j(sbK, this.e, ")");
    }
}
