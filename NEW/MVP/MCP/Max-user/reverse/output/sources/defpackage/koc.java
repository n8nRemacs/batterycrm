package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class koc extends bk0 {
    public final i09 h;
    public final c09 i;
    public final ne4 j;
    public final xu9 k;
    public final j55 l;
    public final rha m;
    public final int n;
    public boolean o;
    public long p;
    public boolean q;
    public boolean r;
    public vgg s;

    public koc(i09 i09Var, ne4 ne4Var, xu9 xu9Var, j55 j55Var, rha rhaVar) {
        c09 c09Var = i09Var.b;
        c09Var.getClass();
        this.i = c09Var;
        this.h = i09Var;
        this.j = ne4Var;
        this.k = xu9Var;
        this.l = j55Var;
        this.m = rhaVar;
        this.n = 1048576;
        this.o = true;
        this.p = -9223372036854775807L;
    }

    @Override // defpackage.bk0
    public final o29 a(c99 c99Var, qi4 qi4Var, long j) {
        qe4 qe4VarA = this.j.a();
        vgg vggVar = this.s;
        if (vggVar != null) {
            qe4VarA.S(vggVar);
        }
        Uri uri = this.i.a;
        fsi.e(this.g);
        return new foc(uri, qe4VarA, new hc8((om4) this.k.b), this.l, new lk6((CopyOnWriteArrayList) this.d.d, 0, c99Var, 10), this.m, new qr4((CopyOnWriteArrayList) this.c.d, 0, c99Var, 0L), this, qi4Var, this.n);
    }

    @Override // defpackage.bk0
    public final i09 f() {
        return this.h;
    }

    @Override // defpackage.bk0
    public final void g() {
    }

    @Override // defpackage.bk0
    public final void i(vgg vggVar) {
        this.s = vggVar;
        j55 j55Var = this.l;
        j55Var.prepare();
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        m4c m4cVar = this.g;
        fsi.e(m4cVar);
        j55Var.c(looperMyLooper, m4cVar);
        p();
    }

    @Override // defpackage.bk0
    public final void k(o29 o29Var) {
        foc focVar = (foc) o29Var;
        if (focVar.E0) {
            for (gxd gxdVar : focVar.B0) {
                gxdVar.h();
                mc5 mc5Var = gxdVar.h;
                if (mc5Var != null) {
                    mc5Var.E(gxdVar.e);
                    gxdVar.h = null;
                    gxdVar.g = null;
                }
            }
        }
        focVar.t0.N(focVar);
        focVar.y0.removeCallbacksAndMessages(null);
        focVar.z0 = null;
        focVar.U0 = true;
    }

    @Override // defpackage.bk0
    public final void m() {
        this.l.release();
    }

    public final void p() {
        long j = this.p;
        boolean z = this.q;
        boolean z2 = this.r;
        i09 i09Var = this.h;
        r9g x2fVar = new x2f(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, i09Var, z2 ? i09Var.c : null);
        if (this.o) {
            x2fVar = new hoc(x2fVar);
        }
        j(x2fVar);
    }

    public final void q(long j, boolean z, boolean z2) {
        if (j == -9223372036854775807L) {
            j = this.p;
        }
        if (!this.o && this.p == j && this.q == z && this.r == z2) {
            return;
        }
        this.p = j;
        this.q = z;
        this.r = z2;
        this.o = false;
        p();
    }
}
