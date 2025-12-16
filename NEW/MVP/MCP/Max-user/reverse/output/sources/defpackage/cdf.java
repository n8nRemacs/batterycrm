package defpackage;

/* loaded from: classes2.dex */
public final class cdf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;

    public cdf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
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
        if (!(obj instanceof cdf)) {
            return false;
        }
        cdf cdfVar = (cdf) obj;
        return this.a == cdfVar.a && this.b == cdfVar.b && this.c == cdfVar.c && this.d == cdfVar.d && this.e == cdfVar.e && this.f == cdfVar.f && this.g == cdfVar.g && this.h == cdfVar.h && this.i == cdfVar.i;
    }

    public final int hashCode() {
        return Integer.hashCode(1308622847) + xrf.k(this.i, xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("StatesBackgroundActiveColors(card=", this.a, ", contrastStatic=", this.b, ", negative=");
        hf3.g(sbK, this.c, ", neutral=", this.d, ", neutralFade=");
        hf3.g(sbK, this.e, ", neutralThemed=", this.f, ", overlayStatic=");
        hf3.g(sbK, this.g, ", themed=", this.h, ", transparent=");
        return ho7.j(sbK, this.i, ", transparentSecondaryStatic=1308622847)");
    }
}
