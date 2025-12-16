package defpackage;

/* loaded from: classes2.dex */
public final class sb7 {
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

    public sb7(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
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
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sb7)) {
            return false;
        }
        sb7 sb7Var = (sb7) obj;
        return this.a == sb7Var.a && this.b == sb7Var.b && this.c == sb7Var.c && this.d == sb7Var.d && this.e == sb7Var.e && this.f == sb7Var.f && this.g == sb7Var.g && this.h == sb7Var.h && this.i == sb7Var.i && this.j == sb7Var.j;
    }

    public final int hashCode() {
        return Integer.hashCode(this.j) + xrf.k(this.i, xrf.k(-1292849417, xrf.k(-1292582917, xrf.k(this.h, xrf.k(this.g, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, xrf.k(this.b, Integer.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sbK = wy1.k("IconLocalCategoryColors(earthStep1=", this.a, ", earthStep2=", this.b, ", earthStrokeStep1=");
        hf3.g(sbK, this.c, ", earthStrokeStep2=", this.d, ", mercuryStep1=");
        hf3.g(sbK, this.e, ", mercuryStep2=", this.f, ", mercuryStrokeStep1=");
        hf3.g(sbK, this.g, ", mercuryStrokeStep2=", this.h, ", venusStep1=-1292582917, venusStep2=-1292849417, venusStrokeStep1=");
        return xc0.i(sbK, this.i, ", venusStrokeStep2=", this.j, ")");
    }
}
