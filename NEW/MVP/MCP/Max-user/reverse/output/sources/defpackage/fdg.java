package defpackage;

/* loaded from: classes2.dex */
public final class fdg {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;

    public fdg(int i, int i2, int i3, int i4, int i5) {
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
        if (!(obj instanceof fdg)) {
            return false;
        }
        fdg fdgVar = (fdg) obj;
        return this.a == fdgVar.a && this.b == fdgVar.b && this.c == fdgVar.c && this.d == fdgVar.d && this.e == fdgVar.e;
    }

    public final int hashCode() {
        return Integer.hashCode(this.e) + xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("TopbarTextDisabledColors(contrast=", this.a, ", contrastStatic=", this.b, ", primary=");
        hf3.g(sbK, this.c, ", secondary=", this.d, ", themed=");
        return ho7.j(sbK, this.e, ")");
    }
}
