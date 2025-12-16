package defpackage;

/* loaded from: classes2.dex */
public final class zr3 {
    public static final zr3 g = new zr3(false, false, true, false, false, false);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public zr3(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = z5;
        this.f = z6;
    }

    public static zr3 a(zr3 zr3Var, boolean z, int i) {
        boolean z2 = (i & 2) != 0 ? zr3Var.b : true;
        boolean z3 = zr3Var.c;
        boolean z4 = zr3Var.d;
        boolean z5 = zr3Var.e;
        boolean z6 = zr3Var.f;
        zr3Var.getClass();
        return new zr3(z, z2, z3, z4, z5, z6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zr3)) {
            return false;
        }
        zr3 zr3Var = (zr3) obj;
        return this.a == zr3Var.a && this.b == zr3Var.b && this.c == zr3Var.c && this.d == zr3Var.d && this.e == zr3Var.e && this.f == zr3Var.f;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f) + a9h.b(a9h.b(a9h.b(a9h.b(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sbP = ho7.p("Inet(c=", this.a, "|v=", this.b, "|m=");
        az1.t("|r=", "|t=", sbP, this.c, this.d);
        sbP.append(this.e);
        sbP.append("|vpn=");
        sbP.append(this.f);
        sbP.append(")");
        return sbP.toString();
    }
}
