package defpackage;

/* loaded from: classes2.dex */
public final class bu0 {
    public final cu0 a;
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

    public bu0(cu0 cu0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.a = cu0Var;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
        this.k = i10;
        this.l = i11;
        this.m = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bu0)) {
            return false;
        }
        bu0 bu0Var = (bu0) obj;
        return this.a.equals(bu0Var.a) && this.b == bu0Var.b && this.c == bu0Var.c && this.d == bu0Var.d && this.e == bu0Var.e && this.f == bu0Var.f && this.g == bu0Var.g && this.h == bu0Var.h && this.i == bu0Var.i && this.j == bu0Var.j && this.k == bu0Var.k && this.l == bu0Var.l && this.m == bu0Var.m;
    }

    public final int hashCode() {
        return Integer.hashCode(this.m) + xrf.k(this.l, xrf.k(this.k, xrf.k(this.j, xrf.k(this.i, xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, this.a.hashCode() * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BubbleTextColors(reaction=");
        sb.append(this.a);
        sb.append(", action=");
        sb.append(this.b);
        sb.append(", actionFade=");
        hf3.g(sb, this.c, ", author=", this.d, ", body=");
        hf3.g(sb, this.e, ", bodySecondary=", this.f, ", forwardLabel=");
        hf3.g(sb, this.g, ", forwardName=", this.h, ", link=");
        hf3.g(sb, this.i, ", linkUnderline=", this.j, ", replyBody=");
        hf3.g(sb, this.k, ", replyName=", this.l, ", time=");
        return ho7.j(sb, this.m, ")");
    }
}
