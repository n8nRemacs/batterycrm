package defpackage;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class tg3 {
    public final int[] a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;

    public tg3(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        this.a = iArr;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = i4;
        this.f = i5;
        this.g = i6;
        this.h = i7;
        this.i = i8;
        this.j = i9;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tg3)) {
            return false;
        }
        tg3 tg3Var = (tg3) obj;
        return this.a.equals(tg3Var.a) && this.b == tg3Var.b && this.c == tg3Var.c && this.d == tg3Var.d && this.e == tg3Var.e && this.f == tg3Var.f && this.g == tg3Var.g && this.h == tg3Var.h && this.i == tg3Var.i && this.j == tg3Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + xrf.k(this.i, xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Arrays.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbM = utb.m(this.b, "CommonBackgroundSystemBubbleGradientColors(gradient=", Arrays.toString(this.a), ", qRBackground=", ", qRStep1=");
        hf3.g(sbM, this.c, ", qRStep2=", this.d, ", qRStep3=");
        hf3.g(sbM, this.e, ", qRStep4=", this.f, ", strokeFadeStep1=");
        hf3.g(sbM, this.g, ", strokeFadeStep2=", this.h, ", strokeStep1=");
        return xc0.i(sbM, this.i, ", strokeStep2=", this.j, ")");
    }
}
