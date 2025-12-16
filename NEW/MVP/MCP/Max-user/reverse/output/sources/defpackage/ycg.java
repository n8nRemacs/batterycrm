package defpackage;

/* loaded from: classes2.dex */
public final class ycg {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;

    public ycg(int i, int i2, int i3, int i4, int i5, int i6, int i7) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycg)) {
            return false;
        }
        ycg ycgVar = (ycg) obj;
        return this.a == ycgVar.a && this.b == ycgVar.b && this.c == ycgVar.c && this.d == ycgVar.d && this.e == ycgVar.e && this.f == ycgVar.f && this.g == ycgVar.g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.g) + xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, xrf.k(-1, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("TopbarIconDefaultColors(contrast=", this.a, ", contrastStatic=-1, neutralFade=", this.b, ", primary=");
        hf3.g(sbK, this.c, ", quaternary=", this.d, ", secondary=");
        hf3.g(sbK, this.e, ", tertiary=", this.f, ", themed=");
        return ho7.j(sbK, this.g, ")");
    }
}
