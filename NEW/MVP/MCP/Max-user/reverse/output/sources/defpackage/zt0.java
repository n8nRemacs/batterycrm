package defpackage;

/* loaded from: classes2.dex */
public final class zt0 {
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

    public zt0(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zt0)) {
            return false;
        }
        zt0 zt0Var = (zt0) obj;
        return this.a == zt0Var.a && this.b == zt0Var.b && this.c == zt0Var.c && this.d == zt0Var.d && this.e == zt0Var.e && this.f == zt0Var.f && this.g == zt0Var.g && this.h == zt0Var.h && this.i == zt0Var.i && this.j == zt0Var.j && this.k == zt0Var.k && this.l == zt0Var.l && this.m == zt0Var.m && this.n == zt0Var.n && this.o == zt0Var.o;
    }

    public final int hashCode() {
        return Integer.hashCode(this.o) + xrf.k(this.n, xrf.k(this.m, xrf.k(this.l, xrf.k(this.k, xrf.k(this.j, xrf.k(this.i, xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("BubbleIconColors(action=", this.a, ", actionSecondary=", this.b, ", alert=");
        hf3.g(sbK, this.c, ", callNegative=", this.d, ", callNeutral=");
        hf3.g(sbK, this.e, ", iconItem=", this.f, ", readStatus=");
        hf3.g(sbK, this.g, ", readStatusCapsule=", this.h, ", reply=");
        hf3.g(sbK, this.i, ", replyForwarded=", this.j, ", verificationAuthor=");
        hf3.g(sbK, this.k, ", verificationBody=", this.l, ", verificationForwardName=");
        hf3.g(sbK, this.m, ", verificationReplyBody=", this.n, ", verificationReplyName=");
        return ho7.j(sbK, this.o, ")");
    }
}
