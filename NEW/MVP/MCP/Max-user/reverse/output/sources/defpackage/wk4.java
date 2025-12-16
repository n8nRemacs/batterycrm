package defpackage;

import com.google.android.exoplayer2.source.BehindLiveWindowException;

/* loaded from: classes.dex */
public final class wk4 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final long f;
    public final long g;

    public /* synthetic */ wk4(long j, Object obj, Object obj2, Object obj3, long j2, Object obj4, int i) {
        this.a = i;
        this.f = j;
        this.c = obj;
        this.d = obj2;
        this.g = j2;
        this.b = obj3;
        this.e = obj4;
    }

    public wk4 a(long j, xmd xmdVar) throws BehindLiveWindowException {
        long jU;
        long jU2;
        td4 td4VarC = ((xmd) this.c).c();
        td4 td4VarC2 = xmdVar.c();
        if (td4VarC == null) {
            return new wk4(j, xmdVar, (jl0) this.d, (pw0) this.b, this.g, td4VarC, 2);
        }
        if (!td4VarC.A()) {
            return new wk4(j, xmdVar, (jl0) this.d, (pw0) this.b, this.g, td4VarC2, 2);
        }
        long jD = td4VarC.D(j);
        if (jD == 0) {
            return new wk4(j, xmdVar, (jl0) this.d, (pw0) this.b, this.g, td4VarC2, 2);
        }
        long jC = td4VarC.C();
        long jB = td4VarC.b(jC);
        long j2 = jD + jC;
        long j3 = j2 - 1;
        long jF = td4VarC.f(j3, j) + td4VarC.b(j3);
        long jC2 = td4VarC2.C();
        long jB2 = td4VarC2.b(jC2);
        long j4 = this.g;
        if (jF == jB2) {
            jU = j2 - jC2;
        } else {
            if (jF < jB2) {
                throw new BehindLiveWindowException();
            }
            if (jB2 < jB) {
                jU2 = j4 - (td4VarC2.u(jB, j) - jC);
                return new wk4(j, xmdVar, (jl0) this.d, (pw0) this.b, jU2, td4VarC2, 2);
            }
            jU = td4VarC.u(jB2, j) - jC2;
        }
        jU2 = jU + j4;
        return new wk4(j, xmdVar, (jl0) this.d, (pw0) this.b, jU2, td4VarC2, 2);
    }

    public wk4 b(long j, ymd ymdVar) throws androidx.media3.exoplayer.source.BehindLiveWindowException {
        long jU;
        long jU2;
        ud4 ud4VarC = ((ymd) this.c).c();
        ud4 ud4VarC2 = ymdVar.c();
        if (ud4VarC == null) {
            return new wk4(j, ymdVar, (kl0) this.d, (f93) this.b, this.g, ud4VarC, 0);
        }
        if (!ud4VarC.A()) {
            return new wk4(j, ymdVar, (kl0) this.d, (f93) this.b, this.g, ud4VarC2, 0);
        }
        long jD = ud4VarC.D(j);
        if (jD == 0) {
            return new wk4(j, ymdVar, (kl0) this.d, (f93) this.b, this.g, ud4VarC2, 0);
        }
        hsi.h(ud4VarC2);
        long jC = ud4VarC.C();
        long jB = ud4VarC.b(jC);
        long j2 = jD + jC;
        long j3 = j2 - 1;
        long jF = ud4VarC.f(j3, j) + ud4VarC.b(j3);
        long jC2 = ud4VarC2.C();
        long jB2 = ud4VarC2.b(jC2);
        long j4 = this.g;
        if (jF == jB2) {
            jU = j2 - jC2;
        } else {
            if (jF < jB2) {
                throw new androidx.media3.exoplayer.source.BehindLiveWindowException();
            }
            if (jB2 < jB) {
                jU2 = j4 - (ud4VarC2.u(jB, j) - jC);
                return new wk4(j, ymdVar, (kl0) this.d, (f93) this.b, jU2, ud4VarC2, 0);
            }
            jU = ud4VarC.u(jB2, j) - jC2;
        }
        jU2 = jU + j4;
        return new wk4(j, ymdVar, (kl0) this.d, (f93) this.b, jU2, ud4VarC2, 0);
    }

    public wk4 c(long j, ymd ymdVar) throws androidx.media3.exoplayer.source.BehindLiveWindowException {
        long jU;
        long jU2;
        ud4 ud4VarC = ((ymd) this.c).c();
        ud4 ud4VarC2 = ymdVar.c();
        if (ud4VarC == null) {
            return new wk4(j, ymdVar, (kl0) this.d, (f93) this.b, this.g, ud4VarC, 1);
        }
        if (!ud4VarC.A()) {
            return new wk4(j, ymdVar, (kl0) this.d, (f93) this.b, this.g, ud4VarC2, 1);
        }
        long jD = ud4VarC.D(j);
        if (jD == 0) {
            return new wk4(j, ymdVar, (kl0) this.d, (f93) this.b, this.g, ud4VarC2, 1);
        }
        hsi.h(ud4VarC2);
        long jC = ud4VarC.C();
        long jB = ud4VarC.b(jC);
        long j2 = jD + jC;
        long j3 = j2 - 1;
        long jF = ud4VarC.f(j3, j) + ud4VarC.b(j3);
        long jC2 = ud4VarC2.C();
        long jB2 = ud4VarC2.b(jC2);
        long j4 = this.g;
        if (jF == jB2) {
            jU = j2 - jC2;
        } else {
            if (jF < jB2) {
                throw new androidx.media3.exoplayer.source.BehindLiveWindowException();
            }
            if (jB2 < jB) {
                jU2 = j4 - (ud4VarC2.u(jB, j) - jC);
                return new wk4(j, ymdVar, (kl0) this.d, (f93) this.b, jU2, ud4VarC2, 1);
            }
            jU = ud4VarC.u(jB2, j) - jC2;
        }
        jU2 = jU + j4;
        return new wk4(j, ymdVar, (kl0) this.d, (f93) this.b, jU2, ud4VarC2, 1);
    }

    public long d(long j) {
        long jH;
        long j2;
        switch (this.a) {
            case 0:
                ud4 ud4Var = (ud4) this.e;
                hsi.h(ud4Var);
                jH = ud4Var.h(this.f, j);
                j2 = this.g;
                break;
            default:
                ud4 ud4Var2 = (ud4) this.e;
                hsi.h(ud4Var2);
                jH = ud4Var2.h(this.f, j);
                j2 = this.g;
                break;
        }
        return jH + j2;
    }

    public final long e(long j) {
        long jD;
        long jE;
        long jE2;
        switch (this.a) {
            case 0:
                jD = d(j);
                ud4 ud4Var = (ud4) this.e;
                hsi.h(ud4Var);
                jE = ud4Var.E(this.f, j);
                jE2 = jE + jD;
                break;
            case 1:
                jD = d(j);
                ud4 ud4Var2 = (ud4) this.e;
                hsi.h(ud4Var2);
                jE = ud4Var2.E(this.f, j);
                jE2 = jE + jD;
                break;
            default:
                td4 td4Var = (td4) this.e;
                long j2 = this.f;
                jE2 = td4Var.E(j2, j) + td4Var.h(j2, j) + this.g;
                break;
        }
        return jE2 - 1;
    }

    public long f() {
        switch (this.a) {
            case 0:
                ud4 ud4Var = (ud4) this.e;
                hsi.h(ud4Var);
                return ud4Var.D(this.f);
            default:
                ud4 ud4Var2 = (ud4) this.e;
                hsi.h(ud4Var2);
                return ud4Var2.D(this.f);
        }
    }

    public final long g(long j) {
        long jI;
        long jF;
        switch (this.a) {
            case 0:
                jI = i(j);
                ud4 ud4Var = (ud4) this.e;
                hsi.h(ud4Var);
                jF = ud4Var.f(j - this.g, this.f);
                break;
            case 1:
                jI = i(j);
                ud4 ud4Var2 = (ud4) this.e;
                hsi.h(ud4Var2);
                jF = ud4Var2.f(j - this.g, this.f);
                break;
            default:
                jI = i(j);
                jF = ((td4) this.e).f(j - this.g, this.f);
                break;
        }
        return jF + jI;
    }

    public long h(long j) {
        ud4 ud4Var = (ud4) this.e;
        hsi.h(ud4Var);
        return ud4Var.u(j, this.f) + this.g;
    }

    public final long i(long j) {
        switch (this.a) {
            case 0:
                ud4 ud4Var = (ud4) this.e;
                hsi.h(ud4Var);
                return ud4Var.b(j - this.g);
            case 1:
                ud4 ud4Var2 = (ud4) this.e;
                hsi.h(ud4Var2);
                return ud4Var2.b(j - this.g);
            default:
                return ((td4) this.e).b(j - this.g);
        }
    }

    public boolean j(long j, long j2) {
        switch (this.a) {
            case 0:
                ud4 ud4Var = (ud4) this.e;
                hsi.h(ud4Var);
                if (!ud4Var.A() && j2 != -9223372036854775807L && g(j) > j2) {
                }
                break;
            default:
                ud4 ud4Var2 = (ud4) this.e;
                hsi.h(ud4Var2);
                if (!ud4Var2.A() && j2 != -9223372036854775807L && g(j) > j2) {
                }
                break;
        }
        return true;
    }
}
