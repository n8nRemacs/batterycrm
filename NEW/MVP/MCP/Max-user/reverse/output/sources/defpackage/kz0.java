package defpackage;

/* loaded from: classes2.dex */
public final class kz0 {
    public final double a;
    public final double b;
    public final double c;
    public final double d;
    public final double e;
    public final double f;
    public final double g;
    public final double h;
    public final double i;
    public final double j;
    public final double k;
    public final double l;
    public final double m;
    public final double n;
    public final double o;
    public final double p;
    public final boolean q;
    public final double r;
    public final double s;
    public final double t;
    public final boolean u;
    public final double v;
    public final double w;
    public final double x;
    public final double y;
    public final double z;

    public kz0(double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z, double d17, double d18, double d19, boolean z2, double d20, double d21, double d22, double d23, double d24) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        this.d = d4;
        this.e = d5;
        this.f = d6;
        this.g = d7;
        this.h = d8;
        this.i = d9;
        this.j = d10;
        this.k = d11;
        this.l = d12;
        this.m = d13;
        this.n = d14;
        this.o = d15;
        this.p = d16;
        this.q = z;
        this.r = d17;
        this.s = d18;
        this.t = d19;
        this.u = z2;
        this.v = d20;
        this.w = d21;
        this.x = d22;
        this.y = d23;
        this.z = d24;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz0)) {
            return false;
        }
        kz0 kz0Var = (kz0) obj;
        return Double.compare(this.a, kz0Var.a) == 0 && Double.compare(this.b, kz0Var.b) == 0 && Double.compare(this.c, kz0Var.c) == 0 && Double.compare(this.d, kz0Var.d) == 0 && Double.compare(this.e, kz0Var.e) == 0 && Double.compare(this.f, kz0Var.f) == 0 && Double.compare(this.g, kz0Var.g) == 0 && Double.compare(this.h, kz0Var.h) == 0 && Double.compare(this.i, kz0Var.i) == 0 && Double.compare(this.j, kz0Var.j) == 0 && Double.compare(this.k, kz0Var.k) == 0 && Double.compare(this.l, kz0Var.l) == 0 && Double.compare(this.m, kz0Var.m) == 0 && Double.compare(this.n, kz0Var.n) == 0 && Double.compare(this.o, kz0Var.o) == 0 && Double.compare(this.p, kz0Var.p) == 0 && this.q == kz0Var.q && Double.compare(this.r, kz0Var.r) == 0 && Double.compare(this.s, kz0Var.s) == 0 && Double.compare(this.t, kz0Var.t) == 0 && this.u == kz0Var.u && Double.compare(this.v, kz0Var.v) == 0 && Double.compare(this.w, kz0Var.w) == 0 && Double.compare(this.x, kz0Var.x) == 0 && Double.compare(this.y, kz0Var.y) == 0 && Double.compare(this.z, kz0Var.z) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.z) + wsf.a(wsf.a(wsf.a(wsf.a(fui.b(wsf.a(wsf.a(wsf.a(fui.b(wsf.a(wsf.a(wsf.a(wsf.a(wsf.a(wsf.a(wsf.a(wsf.a(wsf.a(wsf.a(wsf.a(wsf.a(wsf.a(wsf.a(wsf.a(Double.hashCode(this.a) * 31, this.b), this.c), this.d), this.e), this.f), this.g), this.h), this.i), this.j), this.k), this.l), this.m), this.n), this.o), this.p), this.q), this.r), this.s), this.t), this.u), this.v), this.w), this.x), this.y);
    }

    public final String toString() {
        return "CalcNetworkStatusConfig(redline=" + this.a + ", redlineMargin=" + this.b + ", ratingWeightUp=" + this.c + ", ratingWeightDown=" + this.d + ", goodRtt=" + this.e + ", rttWeightUp=" + this.f + ", rttWeightDown=" + this.g + ", rttStep=" + this.h + ", rttStepWeight=" + this.i + ", fastLossWeight=" + this.j + ", slowLossWeight=" + this.k + ", fastLossValue=" + this.l + ", slowLossValue=" + this.m + ", criticalRtt=" + this.n + ", criticalFastLoss=" + this.o + ", criticalSlowLoss=" + this.p + ", newNetworkRatingModelEnabled=" + this.q + ", goodLoss=" + this.r + ", lossStep=" + this.s + ", lossStepWeight=" + this.t + ", bitrateRatingEnabled=" + this.u + ", bitrateRatingInfluenceFactor=" + this.v + ", estimatedBitrateWeightUp=" + this.w + ", estimatedBitrateWeightDown=" + this.x + ", reportedBitrateWeightUp=" + this.y + ", reportedBitrateWeightDown=" + this.z + ")";
    }
}
