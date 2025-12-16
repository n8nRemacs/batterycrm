package defpackage;

import java.io.Serializable;
import java.util.List;

/* loaded from: classes2.dex */
public final class fh9 implements Serializable, xg8 {
    public final ss4 A0;
    public final ul9 B0;
    public final long X;
    public final String Y;
    public final sz Z;
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final km9 o;
    public final rk9 s0;
    public final sm9 t0;
    public final im9 u0;
    public final long v0;
    public final int w0;
    public final long x0;
    public final kf2 y0;
    public final List z0;

    public fh9(long j, long j2, long j3, long j4, km9 km9Var, long j5, String str, sz szVar, rk9 rk9Var, sm9 sm9Var, im9 im9Var, long j6, int i, long j7, kf2 kf2Var, List list, ss4 ss4Var, ul9 ul9Var) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.o = km9Var;
        this.X = j5;
        this.Y = str;
        this.Z = szVar;
        this.s0 = rk9Var;
        this.t0 = sm9Var;
        this.u0 = im9Var;
        this.v0 = j6;
        this.w0 = i;
        this.x0 = j7;
        this.y0 = kf2Var;
        this.z0 = list;
        this.A0 = ss4Var;
        this.B0 = ul9Var;
    }

    @Override // defpackage.xg8
    public final String a(boolean z, boolean z2) {
        String str = this.Y;
        if (str == null) {
            str = null;
        } else if (!z2) {
            str = "***";
        }
        String strA = d8j.a(Long.valueOf(this.b));
        String strB = eri.b(this.z0, z, z2);
        StringBuilder sbN = ho7.n("Message{id=", this.a, ", text=", str);
        sbN.append(", delayedAttrs=");
        sbN.append(this.A0);
        sbN.append(", time=");
        sbN.append(strA);
        sbN.append(", status=");
        sbN.append(this.o);
        sbN.append(", sender=");
        sbN.append(this.d);
        az1.r(this.X, ", cid=", ", attaches=", sbN);
        sbN.append(this.Z);
        sbN.append(", type=");
        sbN.append(this.t0);
        sbN.append(", elements=");
        return ho7.l(sbN, strB, "}");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fh9)) {
            return false;
        }
        fh9 fh9Var = (fh9) obj;
        return this.a == fh9Var.a && this.b == fh9Var.b && this.c == fh9Var.c && this.d == fh9Var.d && this.o == fh9Var.o && this.X == fh9Var.X && fni.a(this.Y, fh9Var.Y) && fni.a(this.Z, fh9Var.Z) && fni.a(this.s0, fh9Var.s0) && this.t0 == fh9Var.t0 && fni.a(this.u0, fh9Var.u0) && this.v0 == fh9Var.v0 && this.w0 == fh9Var.w0 && this.x0 == fh9Var.x0 && fni.a(this.y0, fh9Var.y0) && fni.a(this.z0, fh9Var.z0) && fni.a(this.A0, fh9Var.A0) && fni.a(this.B0, fh9Var.B0);
    }

    public final int hashCode() {
        int iA = a9h.a(a9h.a(a9h.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        km9 km9Var = this.o;
        int iA2 = a9h.a((iA + (km9Var == null ? 0 : km9Var.hashCode())) * 31, 31, this.X);
        String str = this.Y;
        int iHashCode = (this.Z.hashCode() + ((iA2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        rk9 rk9Var = this.s0;
        int iHashCode2 = (this.t0.hashCode() + ((iHashCode + (rk9Var == null ? 0 : rk9Var.hashCode())) * 31)) * 31;
        im9 im9Var = this.u0;
        int iA3 = a9h.a(xrf.k(this.w0, a9h.a((iHashCode2 + (im9Var == null ? 0 : im9Var.hashCode())) * 31, 31, this.v0), 31), 31, this.x0);
        kf2 kf2Var = this.y0;
        int iL = xrf.l(this.z0, (iA3 + (kf2Var == null ? 0 : kf2Var.hashCode())) * 31, 31);
        ss4 ss4Var = this.A0;
        int iHashCode3 = (iL + (ss4Var == null ? 0 : ss4Var.hashCode())) * 31;
        ul9 ul9Var = this.B0;
        return iHashCode3 + (ul9Var != null ? ul9Var.hashCode() : 0);
    }

    public final String toString() {
        return a(false, false);
    }
}
