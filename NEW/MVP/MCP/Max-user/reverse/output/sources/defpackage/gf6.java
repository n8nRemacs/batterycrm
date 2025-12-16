package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class gf6 implements lw0 {
    public static final gf6 Q0 = new gf6(new ef6());
    public static final os5 R0 = new os5(13);
    public final int A0;
    public final int B0;
    public final float C0;
    public final int D0;
    public final float E0;
    public final byte[] F0;
    public final int G0;
    public final ff3 H0;
    public final int I0;
    public final int J0;
    public final int K0;
    public final int L0;
    public final int M0;
    public final int N0;
    public final int O0;
    public int P0;
    public final int X;
    public final int Y;
    public final int Z;
    public final String a;
    public final String b;
    public final String c;
    public final int d;
    public final int o;
    public final String s0;
    public final sy9 t0;
    public final String u0;
    public final String v0;
    public final int w0;
    public final List x0;
    public final x45 y0;
    public final long z0;

    public gf6(ef6 ef6Var) {
        this.a = ef6Var.a;
        this.b = ef6Var.b;
        this.c = xxg.C(ef6Var.c);
        this.d = ef6Var.d;
        this.o = ef6Var.e;
        int i = ef6Var.f;
        this.X = i;
        int i2 = ef6Var.g;
        this.Y = i2;
        this.Z = i2 != -1 ? i2 : i;
        this.s0 = ef6Var.h;
        this.t0 = ef6Var.i;
        this.u0 = ef6Var.j;
        this.v0 = ef6Var.k;
        this.w0 = ef6Var.l;
        List list = ef6Var.m;
        this.x0 = list == null ? Collections.EMPTY_LIST : list;
        x45 x45Var = ef6Var.n;
        this.y0 = x45Var;
        this.z0 = ef6Var.o;
        this.A0 = ef6Var.p;
        this.B0 = ef6Var.q;
        this.C0 = ef6Var.r;
        int i3 = ef6Var.s;
        this.D0 = i3 == -1 ? 0 : i3;
        float f = ef6Var.t;
        this.E0 = f == -1.0f ? 1.0f : f;
        this.F0 = ef6Var.u;
        this.G0 = ef6Var.v;
        this.H0 = ef6Var.w;
        this.I0 = ef6Var.x;
        this.J0 = ef6Var.y;
        this.K0 = ef6Var.z;
        int i4 = ef6Var.A;
        this.L0 = i4 == -1 ? 0 : i4;
        int i5 = ef6Var.B;
        this.M0 = i5 != -1 ? i5 : 0;
        this.N0 = ef6Var.C;
        int i6 = ef6Var.D;
        if (i6 != 0 || x45Var == null) {
            this.O0 = i6;
        } else {
            this.O0 = 1;
        }
    }

    public final ef6 a() {
        ef6 ef6Var = new ef6();
        ef6Var.a = this.a;
        ef6Var.b = this.b;
        ef6Var.c = this.c;
        ef6Var.d = this.d;
        ef6Var.e = this.o;
        ef6Var.f = this.X;
        ef6Var.g = this.Y;
        ef6Var.h = this.s0;
        ef6Var.i = this.t0;
        ef6Var.j = this.u0;
        ef6Var.k = this.v0;
        ef6Var.l = this.w0;
        ef6Var.m = this.x0;
        ef6Var.n = this.y0;
        ef6Var.o = this.z0;
        ef6Var.p = this.A0;
        ef6Var.q = this.B0;
        ef6Var.r = this.C0;
        ef6Var.s = this.D0;
        ef6Var.t = this.E0;
        ef6Var.u = this.F0;
        ef6Var.v = this.G0;
        ef6Var.w = this.H0;
        ef6Var.x = this.I0;
        ef6Var.y = this.J0;
        ef6Var.z = this.K0;
        ef6Var.A = this.L0;
        ef6Var.B = this.M0;
        ef6Var.C = this.N0;
        ef6Var.D = this.O0;
        return ef6Var;
    }

    public final boolean b(gf6 gf6Var) {
        List list = this.x0;
        if (list.size() != gf6Var.x0.size()) {
            return false;
        }
        for (int i = 0; i < list.size(); i++) {
            if (!Arrays.equals((byte[]) list.get(i), (byte[]) gf6Var.x0.get(i))) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0052  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.gf6 c(defpackage.gf6 r22) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gf6.c(gf6):gf6");
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj != null && gf6.class == obj.getClass()) {
            gf6 gf6Var = (gf6) obj;
            int i2 = this.P0;
            if ((i2 == 0 || (i = gf6Var.P0) == 0 || i2 == i) && this.d == gf6Var.d && this.o == gf6Var.o && this.X == gf6Var.X && this.Y == gf6Var.Y && this.w0 == gf6Var.w0 && this.z0 == gf6Var.z0 && this.A0 == gf6Var.A0 && this.B0 == gf6Var.B0 && this.D0 == gf6Var.D0 && this.G0 == gf6Var.G0 && this.I0 == gf6Var.I0 && this.J0 == gf6Var.J0 && this.K0 == gf6Var.K0 && this.L0 == gf6Var.L0 && this.M0 == gf6Var.M0 && this.N0 == gf6Var.N0 && this.O0 == gf6Var.O0 && Float.compare(this.C0, gf6Var.C0) == 0 && Float.compare(this.E0, gf6Var.E0) == 0 && xxg.a(this.a, gf6Var.a) && xxg.a(this.b, gf6Var.b) && xxg.a(this.s0, gf6Var.s0) && xxg.a(this.u0, gf6Var.u0) && xxg.a(this.v0, gf6Var.v0) && xxg.a(this.c, gf6Var.c) && Arrays.equals(this.F0, gf6Var.F0) && xxg.a(this.t0, gf6Var.t0) && xxg.a(this.H0, gf6Var.H0) && xxg.a(this.y0, gf6Var.y0) && b(gf6Var)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.P0 == 0) {
            String str = this.a;
            int iHashCode = (527 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.b;
            int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.c;
            int iHashCode3 = (((((((((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + this.d) * 31) + this.o) * 31) + this.X) * 31) + this.Y) * 31;
            String str4 = this.s0;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            sy9 sy9Var = this.t0;
            int iHashCode5 = (iHashCode4 + (sy9Var == null ? 0 : Arrays.hashCode(sy9Var.a))) * 31;
            String str5 = this.u0;
            int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.v0;
            this.P0 = ((((((((((((((((Float.floatToIntBits(this.E0) + ((((Float.floatToIntBits(this.C0) + ((((((((((iHashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.w0) * 31) + ((int) this.z0)) * 31) + this.A0) * 31) + this.B0) * 31)) * 31) + this.D0) * 31)) * 31) + this.G0) * 31) + this.I0) * 31) + this.J0) * 31) + this.K0) * 31) + this.L0) * 31) + this.M0) * 31) + this.N0) * 31) + this.O0;
        }
        return this.P0;
    }

    public final String toString() {
        String str = this.a;
        int iF = u45.f(104, str);
        String str2 = this.b;
        int iF2 = u45.f(iF, str2);
        String str3 = this.u0;
        int iF3 = u45.f(iF2, str3);
        String str4 = this.v0;
        int iF4 = u45.f(iF3, str4);
        String str5 = this.s0;
        int iF5 = u45.f(iF4, str5);
        String str6 = this.c;
        StringBuilder sb = new StringBuilder(u45.f(iF5, str6));
        sb.append("Format(");
        sb.append(str);
        sb.append(", ");
        sb.append(str2);
        ho7.r(sb, ", ", str3, ", ", str4);
        sb.append(", ");
        sb.append(str5);
        sb.append(", ");
        sb.append(this.Z);
        sb.append(", ");
        sb.append(str6);
        sb.append(", [");
        sb.append(this.A0);
        sb.append(", ");
        sb.append(this.B0);
        sb.append(", ");
        sb.append(this.C0);
        sb.append("], [");
        sb.append(this.I0);
        sb.append(", ");
        sb.append(this.J0);
        sb.append("])");
        return sb.toString();
    }
}
