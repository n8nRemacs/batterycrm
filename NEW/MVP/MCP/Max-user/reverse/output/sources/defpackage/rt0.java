package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class rt0 {
    public final qt0 a;
    public final st0 b;
    public final wt0 c;
    public final xt0 d;
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
    public final int[] o;
    public final int[] p;

    public rt0(qt0 qt0Var, st0 st0Var, wt0 wt0Var, xt0 xt0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int[] iArr, int[] iArr2) {
        this.a = qt0Var;
        this.b = st0Var;
        this.c = wt0Var;
        this.d = xt0Var;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = i5;
        this.j = i6;
        this.k = i7;
        this.l = i8;
        this.m = i9;
        this.n = i10;
        this.o = iArr;
        this.p = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rt0)) {
            return false;
        }
        rt0 rt0Var = (rt0) obj;
        return this.a.equals(rt0Var.a) && this.b.equals(rt0Var.b) && this.c.equals(rt0Var.c) && this.d.equals(rt0Var.d) && this.e == rt0Var.e && this.f == rt0Var.f && this.g == rt0Var.g && this.h == rt0Var.h && this.i == rt0Var.i && this.j == rt0Var.j && this.k == rt0Var.k && this.l == rt0Var.l && this.m == rt0Var.m && this.n == rt0Var.n && this.o.equals(rt0Var.o) && this.p.equals(rt0Var.p);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.p) + ((Arrays.hashCode(this.o) + xrf.k(this.n, xrf.k(this.m, xrf.k(this.l, xrf.k(this.k, xrf.k(this.j, xrf.k(this.i, xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31)) * 31);
    }

    public final String toString() {
        String string = Arrays.toString(this.o);
        String string2 = Arrays.toString(this.p);
        StringBuilder sb = new StringBuilder("BubbleBackgroundColors(botButton=");
        sb.append(this.a);
        sb.append(", focus=");
        sb.append(this.b);
        sb.append(", reaction=");
        sb.append(this.c);
        sb.append(", systemAssetGradient=");
        sb.append(this.d);
        sb.append(", action=");
        hf3.g(sb, this.e, ", actionFade=", this.f, ", actionSecondary=");
        hf3.g(sb, this.g, ", bubbleSimple=", this.h, ", iconItem=");
        hf3.g(sb, this.i, ", iconItemNegative=", this.j, ", mention=");
        hf3.g(sb, this.k, ", mentionPressed=", this.l, ", surfaceSecondary=");
        hf3.g(sb, this.m, ", textFocus=", this.n, ", bubbleGradient=");
        sb.append(string);
        sb.append(", bubbleOldGradient=");
        sb.append(string2);
        sb.append(")");
        return sb.toString();
    }
}
