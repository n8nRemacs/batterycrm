package defpackage;

/* loaded from: classes2.dex */
public final class af0 {
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
    public final int m;
    public final int n;

    public af0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14) {
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
        this.m = i13;
        this.n = i14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof af0)) {
            return false;
        }
        af0 af0Var = (af0) obj;
        return this.a == af0Var.a && this.b == af0Var.b && this.c == af0Var.c && this.d == af0Var.d && this.e == af0Var.e && this.f == af0Var.f && this.g == af0Var.g && this.h == af0Var.h && this.i == af0Var.i && this.j == af0Var.j && this.k == af0Var.k && this.l == af0Var.l && this.m == af0Var.m && this.n == af0Var.n;
    }

    public final int hashCode() {
        return Integer.hashCode(this.n) + xrf.k(this.m, xrf.k(this.l, xrf.k(this.k, xrf.k(this.j, xrf.k(this.i, xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(-1, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("BackgroundAccentColors(attentionPrimary=", this.a, ", attentionSecondary=", this.b, ", contrast=");
        hf3.g(sbK, this.c, ", contrastSecondary=", this.d, ", contrastStatic=-1, contrastTertiary=");
        hf3.g(sbK, this.e, ", negative=", this.f, ", neutral=");
        hf3.g(sbK, this.g, ", neutralFade=", this.h, ", neutralFadeSecondary=");
        hf3.g(sbK, this.i, ", neutralSecondary=", this.j, ", neutralStatic=");
        hf3.g(sbK, this.k, ", neutralThemed=", this.l, ", positive=");
        return xc0.i(sbK, this.m, ", themed=", this.n, ")");
    }
}
