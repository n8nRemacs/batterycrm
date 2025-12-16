package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.io.IOException;
import java.util.List;

/* loaded from: classes.dex */
public final class nj4 implements r3c, n99, f55 {
    public ua8 X;
    public u3c Y;
    public wwf Z;
    public final mwf a;
    public final m9g b;
    public final q9g c;
    public final ra3 d;
    public final SparseArray o;
    public boolean s0;

    public nj4(mwf mwfVar) {
        mwfVar.getClass();
        this.a = mwfVar;
        this.X = new ua8(zxg.z(), mwfVar, new vi4(6));
        m9g m9gVar = new m9g();
        this.b = m9gVar;
        this.c = new q9g();
        ra3 ra3Var = new ra3();
        ra3Var.a = m9gVar;
        t76 t76Var = wg7.b;
        ra3Var.b = zjd.o;
        ra3Var.c = ekd.Y;
        this.d = ra3Var;
        this.o = new SparseArray();
    }

    @Override // defpackage.r3c
    public final void A(egg eggVar) {
        I(D(), 19, new ej4(10));
    }

    @Override // defpackage.r3c
    public final void A0(c3c c3cVar) {
        id idVarD = D();
        I(idVarD, 12, new i00(idVarD, 17, c3cVar));
    }

    @Override // defpackage.f55
    public final void B(int i, d99 d99Var) {
        id idVarG = G(i, d99Var);
        I(idVarG, 1027, new bj4(idVarG, 3));
    }

    @Override // defpackage.r3c
    public final void B0(o3c o3cVar) {
        I(D(), 13, new ej4(23));
    }

    @Override // defpackage.n99
    public final void C(int i, d99 d99Var, g19 g19Var) {
        id idVarG = G(i, d99Var);
        I(idVarG, 1004, new lj4(idVarG, g19Var, 1));
    }

    @Override // defpackage.r3c
    public final void C0(PlaybackException playbackException) {
        d99 d99Var;
        I((!(playbackException instanceof ExoPlaybackException) || (d99Var = ((ExoPlaybackException) playbackException).y0) == null) ? D() : E(d99Var), 10, new vi4(0));
    }

    public final id D() {
        return E((d99) this.d.d);
    }

    @Override // defpackage.r3c
    public final void D0(ty9 ty9Var) {
        id idVarD = D();
        I(idVarD, 28, new i00(idVarD, 19, ty9Var));
    }

    public final id E(d99 d99Var) {
        this.Y.getClass();
        s9g s9gVar = d99Var == null ? null : (s9g) ((ah7) this.d.c).get(d99Var);
        if (d99Var != null && s9gVar != null) {
            return F(s9gVar, s9gVar.g(d99Var.a, this.b).c, d99Var);
        }
        int iT = this.Y.t();
        s9g s9gVarV = this.Y.v();
        if (iT >= s9gVarV.o()) {
            s9gVarV = s9g.a;
        }
        return F(s9gVarV, iT, null);
    }

    @Override // defpackage.r3c
    public final void E0(mv4 mv4Var) {
        I(D(), 29, new vi4(26));
    }

    public final id F(s9g s9gVar, int i, d99 d99Var) {
        d99 d99Var2 = s9gVar.p() ? null : d99Var;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = s9gVar.equals(this.Y.v()) && i == this.Y.t();
        long jM0 = 0;
        if (d99Var2 == null || !d99Var2.b()) {
            if (z) {
                jM0 = this.Y.p();
            } else if (!s9gVar.p()) {
                jM0 = zxg.m0(s9gVar.m(i, this.c, 0L).l);
            }
        } else if (z && this.Y.s() == d99Var2.b && this.Y.l() == d99Var2.c) {
            jM0 = this.Y.e();
        }
        return new id(jElapsedRealtime, s9gVar, i, d99Var2, jM0, this.Y.v(), this.Y.t(), (d99) this.d.d, this.Y.e(), this.Y.g());
    }

    @Override // defpackage.r3c
    public final void F0(long j) {
        I(D(), 18, new ej4(19));
    }

    public final id G(int i, d99 d99Var) {
        this.Y.getClass();
        if (d99Var != null) {
            return ((s9g) ((ah7) this.d.c).get(d99Var)) != null ? E(d99Var) : F(s9g.a, i, d99Var);
        }
        s9g s9gVarV = this.Y.v();
        if (i >= s9gVarV.o()) {
            s9gVarV = s9g.a;
        }
        return F(s9gVarV, i, null);
    }

    @Override // defpackage.r3c
    public final void G0(k09 k09Var, int i) {
        id idVarD = D();
        I(idVarD, 1, new ui4(idVarD, k09Var, i));
    }

    public final id H() {
        return E((d99) this.d.f);
    }

    public final void I(id idVar, int i, pa8 pa8Var) {
        this.o.put(i, idVar);
        this.X.f(i, pa8Var);
    }

    public final void J(em5 em5Var, Looper looper) {
        hsi.g(this.Y == null || ((wg7) this.d.b).isEmpty());
        em5Var.getClass();
        this.Y = em5Var;
        this.Z = this.a.a(looper, null);
        ua8 ua8Var = this.X;
        this.X = new ua8(ua8Var.d, looper, ua8Var.a, new i00(this, 18, em5Var), ua8Var.i);
    }

    @Override // defpackage.r3c
    public final void K(int i) {
        id idVarH = H();
        I(idVarH, 21, new ui4(idVarH, i, 3));
    }

    @Override // defpackage.r3c
    public final void L0(PlaybackException playbackException) {
        d99 d99Var;
        id idVarD = (!(playbackException instanceof ExoPlaybackException) || (d99Var = ((ExoPlaybackException) playbackException).y0) == null) ? D() : E(d99Var);
        I(idVarD, 10, new i00(idVarD, 21, playbackException));
    }

    @Override // defpackage.r3c
    public final void T(boolean z) {
        id idVarD = D();
        I(idVarD, 9, new si4(idVarD, z, 2));
    }

    @Override // defpackage.r3c
    public final void W(ib4 ib4Var) {
        I(D(), 27, new vi4(14));
    }

    @Override // defpackage.n99
    public final void a(int i, d99 d99Var, ub8 ub8Var, g19 g19Var, IOException iOException, boolean z) {
        id idVarG = G(i, d99Var);
        I(idVarG, 1003, new kj4(idVarG, ub8Var, g19Var, iOException, z));
    }

    @Override // defpackage.n99
    public final void b(int i, d99 d99Var, ub8 ub8Var, g19 g19Var, int i2) {
        id idVarG = G(i, d99Var);
        I(idVarG, 1000, new jj4(idVarG, ub8Var, g19Var, i2));
    }

    @Override // defpackage.r3c
    public final void c() {
    }

    @Override // defpackage.n99
    public final void d(int i, d99 d99Var, ub8 ub8Var, g19 g19Var) {
        I(G(i, d99Var), 1002, new ej4(22));
    }

    @Override // defpackage.f55
    public final void e(int i, d99 d99Var, Exception exc) {
        id idVarG = G(i, d99Var);
        I(idVarG, 1024, new i00(idVarG, 25, exc));
    }

    @Override // defpackage.r3c
    public final void e0(kgg kggVar) {
        id idVarD = D();
        I(idVarD, 2, new i00(idVarD, 20, kggVar));
    }

    @Override // defpackage.r3c
    public final void f(int i) {
        id idVarD = D();
        I(idVarD, 6, new ui4(idVarD, i, 0));
    }

    @Override // defpackage.r3c
    public final void f0(u3c u3cVar, p3c p3cVar) {
    }

    @Override // defpackage.r3c
    public final void g(sch schVar) {
        id idVarH = H();
        I(idVarH, 25, new i00(idVarH, 23, schVar));
    }

    @Override // defpackage.r3c
    public final void h(boolean z) {
        id idVarD = D();
        I(idVarD, 3, new si4(idVarD, z, 1));
    }

    @Override // defpackage.r3c
    public final void h0(long j) {
        I(D(), 16, new ej4(18));
    }

    @Override // defpackage.r3c
    public final void i(final int i, final boolean z) {
        final id idVarD = D();
        I(idVarD, 5, new pa8() { // from class: wi4
            @Override // defpackage.pa8, defpackage.oa8
            public final void invoke(Object obj) {
                ((jd) obj).N0(idVarD, z, i);
            }
        });
    }

    @Override // defpackage.r3c
    public final void i0(w19 w19Var) {
        I(D(), 14, new vi4(29));
    }

    @Override // defpackage.r3c
    public final void j(float f) {
        id idVarH = H();
        I(idVarH, 22, new fj4(idVarH, f));
    }

    @Override // defpackage.r3c
    public final void j0(w19 w19Var) {
        I(D(), 15, new ej4(14));
    }

    @Override // defpackage.r3c
    public final void k(int i) {
        id idVarD = D();
        I(idVarD, 4, new ui4(idVarD, i, 1));
    }

    @Override // defpackage.r3c
    public final void k0(long j) {
        I(D(), 17, new ej4(20));
    }

    @Override // defpackage.r3c
    public final void l(int i, boolean z) {
        I(D(), 30, new vi4(22));
    }

    @Override // defpackage.r3c
    public final void m(boolean z) {
        id idVarH = H();
        I(idVarH, 23, new si4(idVarH, z, 3));
    }

    @Override // defpackage.r3c
    public final void n(List list) {
        I(D(), 27, new vi4(4));
    }

    @Override // defpackage.r3c
    public final void n0(s9g s9gVar, int i) {
        u3c u3cVar = this.Y;
        u3cVar.getClass();
        ra3 ra3Var = this.d;
        ra3Var.d = ra3.e(u3cVar, (wg7) ra3Var.b, (d99) ra3Var.e, (m9g) ra3Var.a);
        ra3Var.m(u3cVar.v());
        id idVarD = D();
        I(idVarD, 0, new ui4(idVarD, i, 6));
    }

    @Override // defpackage.r3c
    public final void o(int i, boolean z) {
        I(D(), -1, new df3(24));
    }

    @Override // defpackage.r3c
    public final void onRepeatModeChanged(int i) {
        id idVarD = D();
        I(idVarD, 8, new ui4(idVarD, i, 4));
    }

    @Override // defpackage.r3c
    public final void p(int i, int i2) {
        id idVarH = H();
        I(idVarH, 24, new aj4(idVarH, i, i2));
    }

    @Override // defpackage.r3c
    public final void q(boolean z) {
        id idVarD = D();
        I(idVarD, 7, new si4(idVarD, z, 0));
    }

    @Override // defpackage.r3c
    public final void r(boolean z) {
    }

    @Override // defpackage.r3c
    public final void s(int i) {
    }

    @Override // defpackage.r3c
    public final void t(t3c t3cVar, t3c t3cVar2, int i) {
        if (i == 1) {
            this.s0 = false;
        }
        u3c u3cVar = this.Y;
        u3cVar.getClass();
        ra3 ra3Var = this.d;
        ra3Var.d = ra3.e(u3cVar, (wg7) ra3Var.b, (d99) ra3Var.e, (m9g) ra3Var.a);
        id idVarD = D();
        I(idVarD, 11, new bd0(i, idVarD, t3cVar, t3cVar2));
    }

    @Override // defpackage.n99
    public final void u(int i, d99 d99Var, ub8 ub8Var, g19 g19Var) {
        id idVarG = G(i, d99Var);
        I(idVarG, 1001, new jj4(idVarG, ub8Var, g19Var));
    }

    @Override // defpackage.f55
    public final void v(int i, d99 d99Var, int i2) {
        id idVarG = G(i, d99Var);
        I(idVarG, 1022, new ui4(idVarG, i2, 5));
    }

    @Override // defpackage.f55
    public final void w(int i, d99 d99Var) {
        id idVarG = G(i, d99Var);
        I(idVarG, 1025, new bj4(idVarG, 4));
    }

    @Override // defpackage.n99
    public final void x(int i, d99 d99Var, g19 g19Var) {
        id idVarG = G(i, d99Var);
        I(idVarG, 1005, new lj4(idVarG, g19Var, 0));
    }

    @Override // defpackage.r3c
    public final void y(k20 k20Var) {
        id idVarH = H();
        I(idVarH, 20, new i00(idVarH, 24, k20Var));
    }

    @Override // defpackage.f55
    public final void z(int i, d99 d99Var) {
        id idVarG = G(i, d99Var);
        I(idVarG, 1023, new bj4(idVarG, 5));
    }
}
