package defpackage;

/* loaded from: classes2.dex */
public final class bi3 {
    public final ci3 a;
    public final di3 b;
    public final ei3 c;

    public bi3(ci3 ci3Var, di3 di3Var, ei3 ei3Var) {
        this.a = ci3Var;
        this.b = di3Var;
        this.c = ei3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bi3)) {
            return false;
        }
        bi3 bi3Var = (bi3) obj;
        return fni.a(this.a, bi3Var.a) && fni.a(this.b, bi3Var.b) && fni.a(this.c, bi3Var.c);
    }

    public final int hashCode() {
        return Integer.hashCode(this.c.a) + xrf.k(this.b.a, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "CommonShadowsColors(elevation2=" + this.a + ", topBar=" + this.b + ", writeBar=" + this.c + ")";
    }
}
