package defpackage;

/* loaded from: classes2.dex */
public final class jg3 {
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
    public final int o;
    public final int p;
    public final int q;

    public jg3(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
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
        this.o = i15;
        this.p = i16;
        this.q = i17;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jg3)) {
            return false;
        }
        jg3 jg3Var = (jg3) obj;
        return this.a == jg3Var.a && this.b == jg3Var.b && this.c == jg3Var.c && this.d == jg3Var.d && this.e == jg3Var.e && this.f == jg3Var.f && this.g == jg3Var.g && this.h == jg3Var.h && this.i == jg3Var.i && this.j == jg3Var.j && this.k == jg3Var.k && this.l == jg3Var.l && this.m == jg3Var.m && this.n == jg3Var.n && this.o == jg3Var.o && this.p == jg3Var.p && this.q == jg3Var.q;
    }

    public final int hashCode() {
        return Integer.hashCode(this.q) + xrf.k(this.p, xrf.k(this.o, xrf.k(this.n, xrf.k(this.m, xrf.k(this.l, xrf.k(this.k, xrf.k(this.j, xrf.k(this.i, xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("CommonBackgroundChatBackgroundColors(additionalStep1=", this.a, ", additionalStep2=", this.b, ", additionalStep3=");
        hf3.g(sbK, this.c, ", additionalStep4=", this.d, ", additionalStep5=");
        hf3.g(sbK, this.e, ", additionalStep6=", this.f, ", backgroundStep1=");
        hf3.g(sbK, this.g, ", backgroundStep2=", this.h, ", patternColor=");
        hf3.g(sbK, this.i, ", patternGradientStep1=", this.j, ", patternGradientStep2=");
        hf3.g(sbK, this.k, ", patternStep1=", this.l, ", patternStep2=");
        hf3.g(sbK, this.m, ", patternStep3=", this.n, ", patternStep4=");
        hf3.g(sbK, this.o, ", patternStep5=", this.p, ", patternStep6=");
        return ho7.j(sbK, this.q, ")");
    }
}
