package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class si9 extends pj0 {
    public final si9 A0;
    public final String B0;
    public final String C0;
    public final String D0;
    public final boolean E0;
    public final int F0;
    public final int G0;
    public final long H0;
    public final long I0;
    public final si9 J0;
    public final long K0;
    public final int L0;
    public final long M0;
    public final List N0;
    public final xl9 O0;
    public final long P0;
    public final ss4 Q0;
    public final rs4 R0;
    public final int S0;
    public final int T0;
    public final long X;
    public final String Y;
    public final long Z;
    public final long b;
    public final long c;
    public final long d;
    public final long o;
    public final xi9 s0;
    public final jm9 t0;
    public final long u0;
    public final String v0;
    public final String w0;
    public final jdc x0;
    public final int y0;
    public final long z0;

    public si9(long j, long j2, long j3, long j4, long j5, long j6, long j7, String str, xi9 xi9Var, jm9 jm9Var, long j8, String str2, String str3, jdc jdcVar, int i, long j9, si9 si9Var, String str4, String str5, String str6, int i2, boolean z, int i3, int i4, int i5, long j10, long j11, si9 si9Var2, long j12, int i6, long j13, List list, xl9 xl9Var, ss4 ss4Var, long j14) {
        super(j);
        this.b = j2;
        this.c = j4;
        this.d = j5;
        this.o = j6;
        this.X = j7;
        this.Y = str;
        this.Z = j3;
        this.s0 = xi9Var;
        this.t0 = jm9Var;
        this.u0 = j8;
        this.v0 = str2;
        this.w0 = str3;
        this.y0 = i;
        this.z0 = j9;
        this.A0 = si9Var;
        this.x0 = jdcVar;
        this.B0 = str4;
        this.C0 = str5;
        this.D0 = str6;
        this.S0 = i2;
        this.E0 = z;
        this.F0 = i3;
        this.G0 = i4;
        this.T0 = i5;
        this.H0 = j10;
        this.I0 = j11;
        this.J0 = si9Var2;
        this.K0 = j12;
        this.L0 = i6;
        this.M0 = j13;
        this.N0 = list;
        this.O0 = xl9Var;
        this.P0 = j14;
        this.Q0 = ss4Var;
        this.R0 = ss4Var != null ? rs4.DELAYED : rs4.REGULAR;
    }

    public final boolean A() {
        return t() && this.x0.r(s10.o) != null;
    }

    public final boolean B() {
        return t() && this.x0.r(s10.Z) != null;
    }

    public final boolean C() {
        return t() && this.x0.r(s10.u0) != null;
    }

    public final boolean D() {
        return t() && this.x0.r(s10.b) != null;
    }

    public final boolean E() {
        return t() && this.x0.r(s10.t0) != null;
    }

    public final boolean F() {
        return t() && this.x0.r(s10.w0) != null;
    }

    public final boolean G() {
        return t() && this.x0.r(s10.c) != null;
    }

    public final boolean H() {
        return t() && this.x0.r(s10.v0) != null;
    }

    public final boolean I() {
        return t() && this.x0.r(s10.Y) != null;
    }

    public final boolean J() {
        return t() && this.x0.r(s10.X) != null;
    }

    public final boolean K() {
        if (w() && this.A0.K()) {
            return true;
        }
        if (!t()) {
            return false;
        }
        int i = 0;
        while (true) {
            jdc jdcVar = this.x0;
            if (i >= jdcVar.p()) {
                return true;
            }
            if (jdcVar.o(i).a != s10.a) {
                return false;
            }
            i++;
        }
    }

    public final boolean L() {
        return t() && this.x0.r(s10.d) != null;
    }

    public final boolean M() {
        return t() && this.x0.r(s10.x0) != null;
    }

    public final boolean N(long j) {
        if (B()) {
            return !(i().d == 5 || i().a()) || this.o == j;
        }
        return false;
    }

    public final ri9 O() {
        ri9 ri9Var = new ri9();
        ri9Var.a = this.a;
        ri9Var.b = this.b;
        ri9Var.c = this.c;
        ri9Var.d = this.d;
        ri9Var.e = this.o;
        ri9Var.f = this.X;
        ri9Var.g = this.Y;
        ri9Var.h = this.Z;
        ri9Var.i = this.s0;
        ri9Var.j = this.t0;
        ri9Var.k = this.u0;
        ri9Var.l = this.v0;
        ri9Var.m = this.w0;
        ri9Var.n = this.x0;
        ri9Var.o = this.y0;
        ri9Var.p = this.z0;
        ri9Var.q = this.A0;
        ri9Var.r = this.B0;
        ri9Var.s = this.C0;
        ri9Var.t = this.D0;
        ri9Var.H = this.S0;
        ri9Var.u = this.E0;
        ri9Var.w = this.G0;
        ri9Var.v = this.F0;
        ri9Var.I = this.T0;
        ri9Var.x = this.H0;
        ri9Var.y = this.I0;
        ri9Var.z = this.J0;
        ri9Var.A = this.K0;
        ri9Var.B = this.L0;
        ri9Var.C = this.M0;
        ri9Var.D = this.N0;
        ri9Var.E = this.O0;
        ri9Var.G = this.P0;
        ri9Var.F = this.Q0;
        return ri9Var;
    }

    public final String c() {
        if (w()) {
            si9 si9Var = this.A0;
            if (si9Var.K()) {
                return si9Var.c();
            }
        }
        if (!K()) {
            return null;
        }
        int i = 0;
        while (true) {
            jdc jdcVar = this.x0;
            if (i >= jdcVar.p()) {
                return null;
            }
            w10 w10VarO = jdcVar.o(i);
            boolean z = w10VarO.a == s10.a;
            String str = w10VarO.A;
            if (z && str != null) {
                return str;
            }
            i++;
        }
    }

    public final w10 d(s10 s10Var) {
        Object obj = null;
        if (!t()) {
            return null;
        }
        List list = (List) this.x0.b;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                try {
                    if (((w10) next).a == s10Var) {
                        obj = next;
                        break;
                    }
                } catch (Throwable th) {
                    throw new RuntimeException(th);
                }
            }
        }
        return (w10) obj;
    }

    public final int e() {
        jdc jdcVar = this.x0;
        if (jdcVar != null) {
            return jdcVar.p();
        }
        return 0;
    }

    public final List g() {
        jdc jdcVar = this.x0;
        if (jdcVar != null) {
            return (List) jdcVar.b;
        }
        return null;
    }

    public final w00 h() {
        if (A()) {
            return this.x0.r(s10.o).e;
        }
        return null;
    }

    public final z00 i() {
        if (B()) {
            return this.x0.r(s10.Z).i;
        }
        return null;
    }

    public final a10 j() {
        if (C()) {
            return this.x0.r(s10.u0).k;
        }
        return null;
    }

    public final d10 k() {
        if (D()) {
            return this.x0.r(s10.b).c;
        }
        return null;
    }

    public final f10 l() {
        if (E()) {
            return this.x0.r(s10.t0).j;
        }
        return null;
    }

    public final long m() {
        long j = this.d;
        long j2 = this.c;
        return j > j2 ? j : j2;
    }

    public final o10 n() {
        if (I()) {
            return this.x0.r(s10.Y).g;
        }
        return null;
    }

    public final r10 o() {
        if (J()) {
            return this.x0.r(s10.X).f;
        }
        return null;
    }

    public final long p() {
        return this.b == 0 ? this.u0 : this.c;
    }

    public final v10 q() {
        if (L()) {
            return this.x0.r(s10.d).d;
        }
        return null;
    }

    public final q2i r() {
        if (M()) {
            return this.x0.r(s10.x0).n;
        }
        return null;
    }

    public final boolean s(s10 s10Var) {
        if (t()) {
            int i = 0;
            while (true) {
                jdc jdcVar = this.x0;
                if (i >= jdcVar.p()) {
                    break;
                }
                if (jdcVar.o(i).a == s10Var) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public final boolean t() {
        jdc jdcVar = this.x0;
        return jdcVar != null && jdcVar.p() > 0;
    }

    @Override // defpackage.pj0
    public final String toString() {
        boolean zA = wqi.a();
        jm9 jm9Var = this.t0;
        long j = this.c;
        long j2 = this.b;
        if (!zA) {
            StringBuilder sb = new StringBuilder();
            sb.append(si9.class.getSimpleName());
            sb.append("{serverId='");
            sb.append(j2);
            az1.r(j, ",time=", ",status=", sb);
            sb.append(jm9Var);
            sb.append("}");
            return sb.toString();
        }
        StringBuilder sbL = az1.l(j2, "MessageDb{serverId='", "', text='");
        sbL.append(this.Y);
        sbL.append("', delayedAttrs =");
        sbL.append(this.Q0);
        sbL.append(", time=");
        sbL.append(d8j.a(Long.valueOf(j)));
        sbL.append(", timeLocal=");
        sbL.append(d8j.a(Long.valueOf(this.u0)));
        sbL.append(", updateTime=");
        sbL.append(d8j.a(Long.valueOf(this.d)));
        sbL.append(", sender=");
        sbL.append(this.o);
        sbL.append(", cid='");
        sbL.append(this.X);
        sbL.append("', chatId=");
        sbL.append(this.Z);
        sbL.append(", deliveryStatus=");
        sbL.append(this.s0);
        sbL.append(", status=");
        sbL.append(jm9Var);
        sbL.append(", error=");
        sbL.append(this.v0);
        sbL.append(", localizedMessageError=");
        sbL.append(this.w0);
        sbL.append(", attaches count=");
        jdc jdcVar = this.x0;
        sbL.append(jdcVar != null ? jdcVar.p() : 0);
        sbL.append(", elements count=");
        sbL.append(zdi.a(this.N0));
        sbL.append(", reactions=");
        xl9 xl9Var = this.O0;
        sbL.append(xl9Var != null ? xl9Var.toString() : "null");
        sbL.append("} ");
        sbL.append(super.toString());
        return sbL.toString();
    }

    public final boolean u() {
        return this.Q0 != null;
    }

    public final boolean v() {
        return this.A0 != null && this.y0 == 2;
    }

    public final boolean w() {
        if (this.A0 == null) {
            return false;
        }
        int i = this.y0;
        return i == 2 || i == 1;
    }

    public final boolean x(long j) {
        List<cj9> list = this.N0;
        if (list != null && !list.isEmpty()) {
            for (cj9 cj9Var : list) {
                if (cj9Var.c == bj9.a && cj9Var.a == j) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean y() {
        return this.A0 != null && this.y0 == 1;
    }

    public final boolean z() {
        return s(s10.d) && q() != null && q().b == 2;
    }
}
