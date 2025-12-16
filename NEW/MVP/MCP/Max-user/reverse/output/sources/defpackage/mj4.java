package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.util.SparseArray;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.PlaybackException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

/* loaded from: classes.dex */
public final class mj4 implements q3c, m99, e55 {
    public cb6 X;
    public i3 Y;
    public boolean Z;
    public final kwf a;
    public final l9g b;
    public final p9g c;
    public final r30 d;
    public final SparseArray o;

    public mj4(kwf kwfVar) {
        kwfVar.getClass();
        this.a = kwfVar;
        int i = xxg.a;
        Looper looperMyLooper = Looper.myLooper();
        this.X = new cb6(looperMyLooper == null ? Looper.getMainLooper() : looperMyLooper, kwfVar, new vi4(13));
        l9g l9gVar = new l9g();
        this.b = l9gVar;
        this.c = new p9g();
        r30 r30Var = new r30();
        r30Var.b = l9gVar;
        t76 t76Var = wg7.b;
        r30Var.c = zjd.o;
        r30Var.a = ekd.Y;
        this.d = r30Var;
        this.o = new SparseArray();
    }

    @Override // defpackage.q3c
    public final void A(i09 i09Var, int i) {
        K(a(), 1, new vi4(7));
    }

    @Override // defpackage.m99
    public final void B(int i, c99 c99Var, g19 g19Var) {
        K(e(i, c99Var), 1004, new vi4(1));
    }

    @Override // defpackage.m99
    public final void C(int i, c99 c99Var, g19 g19Var) {
        K(e(i, c99Var), 1005, new ej4(0));
    }

    @Override // defpackage.q3c
    public final void D(s3c s3cVar, s3c s3cVar2, int i) {
        if (i == 1) {
            this.Z = false;
        }
        i3 i3Var = this.Y;
        i3Var.getClass();
        r30 r30Var = this.d;
        r30Var.d = r30.j(i3Var, (wg7) r30Var.c, (c99) r30Var.o, (l9g) r30Var.b);
        K(a(), 11, new ej4(2));
    }

    @Override // defpackage.q3c
    public final void E(PlaybackException playbackException) {
        s29 s29Var;
        K((!(playbackException instanceof ExoPlaybackException) || (s29Var = ((ExoPlaybackException) playbackException).Z) == null) ? a() : b(new c99(s29Var)), 10, new vi4(24));
    }

    @Override // defpackage.q3c
    public final void F(mfg mfgVar, vfg vfgVar) {
        K(a(), 2, new ej4(4));
    }

    @Override // defpackage.q3c
    public final void G(n3c n3cVar) {
        K(a(), 13, new vi4(8));
    }

    @Override // defpackage.m99
    public final void H(int i, c99 c99Var, tb8 tb8Var, g19 g19Var) {
        K(e(i, c99Var), 1001, new df3(26));
    }

    @Override // defpackage.m99
    public final void I(int i, c99 c99Var, tb8 tb8Var, g19 g19Var) {
        K(e(i, c99Var), 1000, new ej4(1));
    }

    public final hd J() {
        return b((c99) this.d.X);
    }

    public final void K(hd hdVar, int i, oa8 oa8Var) {
        this.o.put(i, hdVar);
        this.X.j(i, oa8Var);
    }

    public final void L(i3 i3Var, Looper looper) {
        fsi.d(this.Y == null || ((wg7) this.d.c).isEmpty());
        i3Var.getClass();
        this.Y = i3Var;
        this.a.a(looper, null);
        cb6 cb6Var = this.X;
        this.X = new cb6((CopyOnWriteArraySet) cb6Var.d, looper, (kwf) cb6Var.a, new i62(this, i3Var));
    }

    public final hd a() {
        return b((c99) this.d.d);
    }

    public final hd b(c99 c99Var) {
        this.Y.getClass();
        r9g r9gVar = c99Var == null ? null : (r9g) ((ah7) this.d.a).get(c99Var);
        if (c99Var != null && r9gVar != null) {
            return d(r9gVar, r9gVar.g(c99Var.a, this.b).c, c99Var);
        }
        int iT = this.Y.t();
        r9g r9gVarO0 = this.Y.o0();
        if (iT >= r9gVarO0.o()) {
            r9gVarO0 = r9g.a;
        }
        return d(r9gVarO0, iT, null);
    }

    @Override // defpackage.m99
    public final void c(int i, c99 c99Var, tb8 tb8Var, g19 g19Var) {
        K(e(i, c99Var), 1002, new ej4(21));
    }

    public final hd d(r9g r9gVar, int i, c99 c99Var) {
        c99 c99Var2 = r9gVar.p() ? null : c99Var;
        this.a.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean z = r9gVar.equals(this.Y.o0()) && i == this.Y.t();
        long jK = 0;
        if (c99Var2 == null || !c99Var2.a()) {
            if (z) {
                jK = this.Y.p();
            } else if (!r9gVar.p()) {
                jK = xxg.K(r9gVar.m(i, this.c, 0L).w0);
            }
        } else if (z && this.Y.s() == c99Var2.b && this.Y.l() == c99Var2.c) {
            jK = this.Y.e();
        }
        return new hd(jElapsedRealtime, r9gVar, i, c99Var2, jK, this.Y.o0(), this.Y.t(), (c99) this.d.d, this.Y.e(), this.Y.g());
    }

    public final hd e(int i, c99 c99Var) {
        this.Y.getClass();
        r9g r9gVar = r9g.a;
        if (c99Var != null) {
            return ((r9g) ((ah7) this.d.a).get(c99Var)) != null ? b(c99Var) : d(r9gVar, i, c99Var);
        }
        r9g r9gVarO0 = this.Y.o0();
        if (i < r9gVarO0.o()) {
            r9gVar = r9gVarO0;
        }
        return d(r9gVar, i, null);
    }

    @Override // defpackage.q3c
    public final void f(int i) {
        K(a(), 6, new vi4(25));
    }

    @Override // defpackage.m99
    public final void g(int i, c99 c99Var, tb8 tb8Var, g19 g19Var, IOException iOException, boolean z) {
        hd hdVarE = e(i, c99Var);
        K(hdVarE, 1003, new yi4(hdVarE, tb8Var, g19Var, iOException, z));
    }

    @Override // defpackage.q3c
    public final void h(boolean z) {
        K(a(), 3, new ej4(15));
    }

    @Override // defpackage.q3c
    public final void i(int i, boolean z) {
        K(a(), 5, new df3(22));
    }

    @Override // defpackage.q3c
    public final void j(float f) {
        K(J(), 22, new ej4(7));
    }

    @Override // defpackage.q3c
    public final void k(int i) {
        K(a(), 4, new vi4(12));
    }

    @Override // defpackage.q3c
    public final void l(int i, boolean z) {
        K(a(), 30, new ej4(11));
    }

    @Override // defpackage.q3c
    public final void m(boolean z) {
        K(J(), 23, new ej4(17));
    }

    @Override // defpackage.q3c
    public final void n(List list) {
        K(a(), 27, new vi4(21));
    }

    @Override // defpackage.q3c
    public final void o(int i, boolean z) {
        K(a(), -1, new df3(27));
    }

    @Override // defpackage.q3c
    public final void onRepeatModeChanged(int i) {
        K(a(), 8, new vi4(19));
    }

    @Override // defpackage.q3c
    public final void p(int i, int i2) {
        K(J(), 24, new vi4(2));
    }

    @Override // defpackage.q3c
    public final void q(boolean z) {
        K(a(), 7, new ej4(24));
    }

    @Override // defpackage.q3c
    public final void r(kv4 kv4Var) {
        K(a(), 29, new ej4(9));
    }

    @Override // defpackage.q3c
    public final void s() {
        K(a(), -1, new df3(29));
    }

    @Override // defpackage.q3c
    public final void t(v19 v19Var) {
        K(a(), 14, new df3(23));
    }

    @Override // defpackage.q3c
    public final void u(PlaybackException playbackException) {
        s29 s29Var;
        hd hdVarA = (!(playbackException instanceof ExoPlaybackException) || (s29Var = ((ExoPlaybackException) playbackException).Z) == null) ? a() : b(new c99(s29Var));
        K(hdVarA, 10, new i62(hdVarA, playbackException));
    }

    @Override // defpackage.q3c
    public final void v(sy9 sy9Var) {
        K(a(), 28, new ej4(12));
    }

    @Override // defpackage.q3c
    public final void w(mgg mggVar) {
        K(a(), 2, new vi4(3));
    }

    @Override // defpackage.q3c
    public final void x(b3c b3cVar) {
        K(a(), 12, new df3(25));
    }

    @Override // defpackage.q3c
    public final void y(int i) {
        i3 i3Var = this.Y;
        i3Var.getClass();
        r30 r30Var = this.d;
        r30Var.d = r30.j(i3Var, (wg7) r30Var.c, (c99) r30Var.o, (l9g) r30Var.b);
        r30Var.v(i3Var.o0());
        K(a(), 0, new ej4(6));
    }

    @Override // defpackage.q3c
    public final void z(rch rchVar) {
        hd hdVarJ = J();
        K(hdVarJ, 25, new hj4(hdVarJ, rchVar));
    }
}
