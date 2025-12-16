package defpackage;

/* loaded from: classes2.dex */
public final class bf0 {
    public final af0 a;
    public final kf0 b;
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

    public bf0(af0 af0Var, kf0 kf0Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12) {
        this.a = af0Var;
        this.b = kf0Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.j = i8;
        this.k = i9;
        this.l = i10;
        this.m = i11;
        this.n = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bf0)) {
            return false;
        }
        bf0 bf0Var = (bf0) obj;
        return this.a.equals(bf0Var.a) && this.b.equals(bf0Var.b) && this.c == bf0Var.c && this.d == bf0Var.d && this.e == bf0Var.e && this.f == bf0Var.f && this.g == bf0Var.g && this.h == bf0Var.h && this.i == bf0Var.i && this.j == bf0Var.j && this.k == bf0Var.k && this.l == bf0Var.l && this.m == bf0Var.m && this.n == bf0Var.n;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + xrf.k(this.n, xrf.k(this.m, xrf.k(this.l, xrf.k(this.k, xrf.k(this.j, xrf.k(this.i, xrf.k(this.h, xrf.k(this.g, xrf.k(-1728053248, xrf.k(this.f, xrf.k(this.e, xrf.k(this.d, xrf.k(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackgroundColors(accent=");
        sb.append(this.a);
        sb.append(", local=");
        sb.append(this.b);
        sb.append(", contrastFloating=");
        hf3.g(sb, this.c, ", contrastFloatingSecondary=", this.d, ", neutralFloating=");
        hf3.g(sb, this.e, ", overlay=", this.f, ", overlaySecondary=-1728053248, overlayStatic=");
        hf3.g(sb, this.g, ", surfaceCard=", this.h, ", surfaceCardSecondary=");
        hf3.g(sb, this.i, ", surfaceFloating=", this.j, ", surfaceGround=");
        hf3.g(sb, this.k, ", surfacePrimary=", this.l, ", surfaceSecondary=");
        return xc0.i(sb, this.m, ", surfaceTertiary=", this.n, ", transparent=0)");
    }
}
