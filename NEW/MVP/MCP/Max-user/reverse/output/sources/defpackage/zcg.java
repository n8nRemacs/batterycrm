package defpackage;

/* loaded from: classes2.dex */
public final class zcg {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public zcg(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zcg)) {
            return false;
        }
        zcg zcgVar = (zcg) obj;
        return this.a == zcgVar.a && this.b == zcgVar.b && this.c == zcgVar.c && this.d == zcgVar.d && this.e == zcgVar.e && this.f == zcgVar.f && this.g == zcgVar.g && this.h == zcgVar.h && this.i == zcgVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(this.i) + xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("TopbarIconDisabledColors(contrast=", this.a, ", contrastStatic=", this.b, ", negative=");
        hf3.g(sbK, this.c, ", neutralFade=", this.d, ", primary=");
        hf3.g(sbK, this.e, ", quaternary=", this.f, ", secondary=");
        hf3.g(sbK, this.g, ", tertiary=", this.h, ", themed=");
        return ho7.j(sbK, this.i, ")");
    }
}
