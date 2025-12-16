package defpackage;

/* loaded from: classes2.dex */
public final class qi3 {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;

    public qi3(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qi3)) {
            return false;
        }
        qi3 qi3Var = (qi3) obj;
        return this.a == qi3Var.a && this.b == qi3Var.b && this.c == qi3Var.c && this.d == qi3Var.d && this.e == qi3Var.e && this.f == qi3Var.f && this.g == qi3Var.g && this.h == qi3Var.h;
    }

    public final int hashCode() {
        return Integer.hashCode(this.h) + xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(-520093697, xrf.k(-1, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("CommonTextColors(capsule=", this.a, ", capsuleSecondary=", this.b, ", contrast=");
        hf3.g(sbK, this.c, ", contrastStatic=-1, fileType=-520093697, negative=", this.d, ", primary=");
        hf3.g(sbK, this.e, ", secondary=", this.f, ", tertiary=");
        return xc0.i(sbK, this.g, ", themed=", this.h, ")");
    }
}
