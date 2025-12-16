package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class xt0 {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;

    public xt0(int i, int i2, int i3, int[] iArr) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xt0)) {
            return false;
        }
        xt0 xt0Var = (xt0) obj;
        return this.a.equals(xt0Var.a) && this.b == xt0Var.b && this.c == xt0Var.c && this.d == xt0Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + xrf.k(this.c, xrf.k(this.b, Arrays.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return xc0.i(utb.m(this.b, "BubbleBackgroundSystemAssetGradientColors(gradient=", Arrays.toString(this.a), ", strokeStep1=", ", strokeStep2="), this.c, ", strokeStep3=", this.d, ")");
    }
}
