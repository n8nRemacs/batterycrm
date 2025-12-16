package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import androidx.media3.common.PlaybackException;
import java.util.List;

/* loaded from: classes.dex */
public final class a5c implements u3c {
    public final em5 a;

    public a5c(em5 em5Var) {
        this.a = em5Var;
    }

    @Override // defpackage.u3c
    public final void A(int i, long j, List list) {
        m0();
        this.a.A(i, j, list);
    }

    public final long B() {
        m0();
        return this.a.S0();
    }

    @Override // defpackage.u3c
    public final void C(List list) {
        m0();
        this.a.C(list);
    }

    public final long D() {
        m0();
        return this.a.m0();
    }

    public final k09 E() {
        m0();
        em5 em5Var = this.a;
        s9g s9gVarV = em5Var.v();
        if (s9gVarV.p()) {
            return null;
        }
        return s9gVarV.m(em5Var.t(), (q9g) em5Var.b, 0L).c;
    }

    public final k09 F() {
        if (S(16)) {
            return E();
        }
        return null;
    }

    public final s9g G() {
        if (S(17)) {
            return v();
        }
        if (S(16) && !v().p()) {
            return new z4c(this);
        }
        return s9g.a;
    }

    public final mv4 H() {
        m0();
        em5 em5Var = this.a;
        em5Var.A1();
        return em5Var.p1;
    }

    public final int I() {
        m0();
        this.a.A1();
        return 0;
    }

    public final w19 J() {
        if (!S(18)) {
            return w19.K;
        }
        m0();
        em5 em5Var = this.a;
        em5Var.A1();
        return em5Var.Z0;
    }

    public final c3c K() {
        m0();
        return this.a.Y0();
    }

    public final w19 L() {
        m0();
        em5 em5Var = this.a;
        em5Var.A1();
        return em5Var.a1;
    }

    public final void M() {
        m0();
        this.a.A1();
    }

    public final void N(int i) {
        m0();
        this.a.A1();
    }

    public final boolean O() {
        m0();
        return this.a.x0();
    }

    public final boolean P() {
        if (!S(23)) {
            return false;
        }
        m0();
        this.a.A1();
        return false;
    }

    public final boolean Q() {
        m0();
        return this.a.b1();
    }

    public final boolean R() {
        m0();
        return this.a.z0();
    }

    @Override // defpackage.u3c
    public final boolean S(int i) {
        m0();
        return this.a.S(i);
    }

    public final void T() {
        m0();
        this.a.D0();
    }

    public final void U(int i) {
        m0();
        this.a.j1(i, i + 1);
    }

    public final void V(List list, int i, int i2) {
        m0();
        this.a.l1(list, i, i2);
    }

    public final void W() {
        m0();
        em5 em5Var = this.a;
        em5Var.A1();
        em5Var.G0(11, -em5Var.G0);
    }

    public final void X() {
        m0();
        em5 em5Var = this.a;
        em5Var.A1();
        em5Var.G0(12, em5Var.H0);
    }

    public final void Y(long j) {
        m0();
        this.a.F0(5, j);
    }

    public final void Z(int i) {
        m0();
        this.a.E0(i, -9223372036854775807L, false);
    }

    @Override // defpackage.u3c
    public final float a() {
        m0();
        em5 em5Var = this.a;
        em5Var.A1();
        return em5Var.g1;
    }

    public final void a0() {
        int iE;
        m0();
        em5 em5Var = this.a;
        if (em5Var.v().p() || em5Var.f()) {
            em5Var.v0();
            return;
        }
        if (!em5Var.t0()) {
            if (em5Var.x0() && em5Var.w0()) {
                em5Var.E0(em5Var.t(), -9223372036854775807L, false);
                return;
            } else {
                em5Var.v0();
                return;
            }
        }
        s9g s9gVarV = em5Var.v();
        if (s9gVarV.p()) {
            iE = -1;
        } else {
            int iT = em5Var.t();
            em5Var.A1();
            int i = em5Var.Q0;
            if (i == 1) {
                i = 0;
            }
            em5Var.A1();
            iE = s9gVarV.e(iT, i, em5Var.R0);
        }
        if (iE == -1) {
            em5Var.v0();
        } else if (iE == em5Var.t()) {
            em5Var.E0(em5Var.t(), -9223372036854775807L, true);
        } else {
            em5Var.E0(iE, -9223372036854775807L, false);
        }
    }

    public final void b(int i, List list) {
        m0();
        this.a.M0(i, list);
    }

    public final void b0() {
        int iE;
        m0();
        em5 em5Var = this.a;
        s9g s9gVarV = em5Var.v();
        if (s9gVarV.p()) {
            iE = -1;
        } else {
            int iT = em5Var.t();
            em5Var.A1();
            int i = em5Var.Q0;
            if (i == 1) {
                i = 0;
            }
            em5Var.A1();
            iE = s9gVarV.e(iT, i, em5Var.R0);
        }
        if (iE == -1) {
            em5Var.v0();
        } else if (iE == em5Var.t()) {
            em5Var.E0(em5Var.t(), -9223372036854775807L, true);
        } else {
            em5Var.E0(iE, -9223372036854775807L, false);
        }
    }

    public final void c(List list) {
        m0();
        this.a.M0(Integer.MAX_VALUE, list);
    }

    public final void c0() {
        m0();
        em5 em5Var = this.a;
        if (em5Var.v().p() || em5Var.f()) {
            em5Var.v0();
            return;
        }
        boolean zU0 = em5Var.u0();
        if (em5Var.x0() && !em5Var.y0()) {
            if (zU0) {
                em5Var.H0(7);
                return;
            } else {
                em5Var.v0();
                return;
            }
        }
        if (zU0) {
            long jE = em5Var.e();
            em5Var.A1();
            if (jE <= em5Var.I0) {
                em5Var.H0(7);
                return;
            }
        }
        em5Var.F0(7, 0L);
    }

    public final t3c d() {
        boolean zS = S(16);
        boolean zS2 = S(17);
        return new t3c(null, zS2 ? t() : 0, zS ? E() : null, null, zS2 ? j() : 0, zS ? e() : 0L, zS ? p() : 0L, zS ? s() : -1, zS ? l() : -1);
    }

    public final void d0() {
        m0();
        this.a.H0(6);
    }

    @Override // defpackage.u3c
    public final long e() {
        m0();
        return this.a.e();
    }

    public final void e0(int i, boolean z) {
        m0();
        this.a.A1();
    }

    @Override // defpackage.u3c
    public final boolean f() {
        m0();
        return this.a.f();
    }

    public final void f0(boolean z) {
        m0();
        this.a.A1();
    }

    @Override // defpackage.u3c
    public final long g() {
        m0();
        return this.a.g();
    }

    public final void g0(int i) {
        m0();
        this.a.A1();
    }

    @Override // defpackage.u3c
    public final long getDuration() {
        m0();
        return this.a.getDuration();
    }

    @Override // defpackage.u3c
    public final int getPlaybackState() {
        m0();
        return this.a.getPlaybackState();
    }

    @Override // defpackage.u3c
    public final int getRepeatMode() {
        m0();
        em5 em5Var = this.a;
        em5Var.A1();
        return em5Var.Q0;
    }

    @Override // defpackage.u3c
    public final void h(k09 k09Var, long j) {
        m0();
        this.a.h(k09Var, j);
    }

    public final void h0(int i, int i2) {
        m0();
        this.a.A1();
    }

    @Override // defpackage.u3c
    public final boolean i() {
        m0();
        return this.a.i();
    }

    public final void i0(float f) {
        m0();
        em5 em5Var = this.a;
        em5Var.p1(new c3c(f, em5Var.Y0().b));
    }

    @Override // defpackage.u3c
    public final int j() {
        m0();
        return this.a.j();
    }

    public final void j0(int i) {
        m0();
        this.a.q1(i);
    }

    @Override // defpackage.u3c
    public final void k() {
        m0();
        this.a.k();
    }

    public final void k0(boolean z) {
        m0();
        em5 em5Var = this.a;
        ua8 ua8Var = em5Var.x0;
        em5Var.A1();
        if (em5Var.R0 != z) {
            em5Var.R0 = z;
            wwf wwfVar = em5Var.w0.Z;
            wwfVar.getClass();
            uwf uwfVarC = wwf.c();
            uwfVarC.a = wwfVar.a.obtainMessage(12, z ? 1 : 0, 0);
            uwfVarC.b();
            ua8Var.c(9, new j21(z, 2));
            em5Var.w1();
            ua8Var.b();
        }
    }

    @Override // defpackage.u3c
    public final int l() {
        m0();
        return this.a.l();
    }

    public final void l0() {
        m0();
        this.a.u1();
    }

    public final wie m() {
        boolean z;
        long jN0;
        long jT0;
        boolean zS = S(16);
        t3c t3cVarD = d();
        int i = 0;
        boolean z2 = zS && f();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long duration = zS ? getDuration() : -9223372036854775807L;
        long jB = zS ? B() : 0L;
        if (zS) {
            m0();
            em5 em5Var = this.a;
            long jS0 = em5Var.S0();
            long duration2 = em5Var.getDuration();
            z = zS;
            if (jS0 == -9223372036854775807L || duration2 == -9223372036854775807L) {
                i = 0;
            } else {
                i = duration2 != 0 ? zxg.i(zxg.Z(jS0, duration2), 0, 100) : 100;
            }
        } else {
            z = zS;
        }
        long jG = z ? g() : 0L;
        if (z) {
            m0();
            jN0 = this.a.n0();
        } else {
            jN0 = -9223372036854775807L;
        }
        long jD = z ? D() : -9223372036854775807L;
        if (z) {
            m0();
            jT0 = this.a.T0();
        } else {
            jT0 = 0;
        }
        return new wie(t3cVarD, z2, jElapsedRealtime, duration, jB, i, jG, jN0, jD, jT0);
    }

    public final void m0() {
        hsi.g(Looper.myLooper() == this.a.E0);
    }

    @Override // defpackage.u3c
    public final PlaybackException n() {
        m0();
        return this.a.n();
    }

    public final void o() {
        m0();
        this.a.A1();
    }

    @Override // defpackage.u3c
    public final long p() {
        m0();
        return this.a.p();
    }

    @Override // defpackage.u3c
    public final void play() {
        m0();
        this.a.play();
    }

    @Override // defpackage.u3c
    public final void prepare() {
        m0();
        this.a.prepare();
    }

    @Override // defpackage.u3c
    public final kgg q() {
        m0();
        return this.a.q();
    }

    public final void r(int i) {
        m0();
        this.a.A1();
    }

    @Override // defpackage.u3c
    public final int s() {
        m0();
        return this.a.s();
    }

    @Override // defpackage.u3c
    public final int t() {
        m0();
        return this.a.t();
    }

    @Override // defpackage.u3c
    public final int u() {
        m0();
        return this.a.u();
    }

    @Override // defpackage.u3c
    public final s9g v() {
        m0();
        return this.a.v();
    }

    public final k20 w() {
        m0();
        em5 em5Var = this.a;
        em5Var.A1();
        return em5Var.f1;
    }

    @Override // defpackage.u3c
    public final void x(k09 k09Var) {
        m0();
        this.a.x(k09Var);
    }

    @Override // defpackage.u3c
    public final boolean y() {
        m0();
        em5 em5Var = this.a;
        em5Var.A1();
        return em5Var.R0;
    }

    public final o3c z() {
        m0();
        em5 em5Var = this.a;
        em5Var.A1();
        return em5Var.Y0;
    }
}
