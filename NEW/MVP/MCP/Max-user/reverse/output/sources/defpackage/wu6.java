package defpackage;

/* loaded from: classes2.dex */
public final class wu6 {
    public final int a;
    public final long b;
    public final long c;
    public final float d;
    public final boolean e;

    public wu6(int i, long j, long j2, float f, int i2) {
        boolean z = (i2 & 32) != 0;
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = f;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wu6)) {
            return false;
        }
        wu6 wu6Var = (wu6) obj;
        return this.a == wu6Var.a && this.b == wu6Var.b && this.c == wu6Var.c && Float.compare(this.d, wu6Var.d) == 0 && Float.compare(0.6f, 0.6f) == 0 && this.e == wu6Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + hf3.b(hf3.b(a9h.a(a9h.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), this.d, 31), 0.6f, 31);
    }

    public final String toString() {
        StringBuilder sbM = u45.m(this.a, this.b, "AnimationConfig(repeatCount=", ", startDelay=");
        az1.r(this.c, ", duration=", ", tiltDegrees=", sbM);
        sbM.append(this.d);
        sbM.append(", shineWidthFraction=0.6, startOnAttach=");
        sbM.append(this.e);
        sbM.append(")");
        return sbM.toString();
    }
}
