package defpackage;

/* loaded from: classes2.dex */
public final class edf {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public edf(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = i8;
        this.i = i9;
        this.j = i10;
        this.k = i11;
        this.l = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof edf)) {
            return false;
        }
        edf edfVar = (edf) obj;
        return this.a == edfVar.a && this.b == edfVar.b && this.c == edfVar.c && this.d == edfVar.d && this.e == edfVar.e && this.f == edfVar.f && this.g == edfVar.g && this.h == edfVar.h && this.i == edfVar.i && this.j == edfVar.j && this.k == edfVar.k && this.l == edfVar.l;
    }

    public final int hashCode() {
        return Integer.hashCode(this.l) + xrf.k(this.k, xrf.k(this.j, xrf.k(this.i, xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("StatesBackgroundDisabledColors(card=", this.a, ", contrast=", this.b, ", contrastStatic=");
        hf3.g(sbK, this.c, ", negative=", this.d, ", neutral=");
        hf3.g(sbK, this.e, ", neutralFade=", this.f, ", neutralStatic=");
        hf3.g(sbK, this.g, ", neutralThemed=", this.h, ", overlayStatic=");
        hf3.g(sbK, this.i, ", positive=", this.j, ", secondary=");
        return xc0.i(sbK, this.k, ", themed=", this.l, ")");
    }
}
