package defpackage;

import android.net.Uri;
import android.os.Looper;
import java.util.Objects;

/* loaded from: classes.dex */
public final class loc extends ck0 {
    public final oe4 h;
    public final xu9 i;
    public final k55 j;
    public final tha k;
    public final int l;
    public final hf6 m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public wgg r;
    public k09 s;

    public loc(k09 k09Var, oe4 oe4Var, xu9 xu9Var, k55 k55Var, tha thaVar, int i, hf6 hf6Var) {
        this.s = k09Var;
        this.h = oe4Var;
        this.i = xu9Var;
        this.j = k55Var;
        this.k = thaVar;
        this.l = i;
        this.m = hf6Var;
    }

    @Override // defpackage.ck0
    public final boolean a(k09 k09Var) {
        a09 a09Var = i().b;
        a09Var.getClass();
        a09 a09Var2 = k09Var.b;
        return a09Var2 != null && a09Var2.a.equals(a09Var.a) && a09Var2.h == a09Var.h && Objects.equals(a09Var2.f, a09Var.f);
    }

    @Override // defpackage.ck0
    public final p29 c(d99 d99Var, ri4 ri4Var, long j) {
        se4 se4VarA = this.h.a();
        wgg wggVar = this.r;
        if (wggVar != null) {
            se4VarA.I(wggVar);
        }
        a09 a09Var = i().b;
        a09Var.getClass();
        Uri uri = a09Var.a;
        hsi.h(this.g);
        lp5 lp5Var = (lp5) this.i.b;
        ka5 ka5Var = new ka5();
        ka5Var.a = lp5Var;
        return new goc(uri, se4VarA, ka5Var, this.j, new d55(this.d.c, 0, d99Var), this.k, b(d99Var), this, ri4Var, a09Var.f, this.l, this.m, zxg.U(a09Var.h), null);
    }

    @Override // defpackage.ck0
    public final synchronized k09 i() {
        return this.s;
    }

    @Override // defpackage.ck0
    public final void k() {
    }

    @Override // defpackage.ck0
    public final void m(wgg wggVar) {
        this.r = wggVar;
        Looper looperMyLooper = Looper.myLooper();
        looperMyLooper.getClass();
        n4c n4cVar = this.g;
        hsi.h(n4cVar);
        k55 k55Var = this.j;
        k55Var.c(looperMyLooper, n4cVar);
        k55Var.prepare();
        u();
    }

    @Override // defpackage.ck0
    public final void o(p29 p29Var) {
        goc gocVar = (goc) p29Var;
        if (gocVar.H0) {
            for (hxd hxdVar : gocVar.E0) {
                hxdVar.h();
                z45 z45Var = hxdVar.h;
                if (z45Var != null) {
                    z45Var.c(hxdVar.e);
                    hxdVar.h = null;
                    hxdVar.g = null;
                }
            }
        }
        gocVar.w0.D(gocVar);
        gocVar.B0.removeCallbacksAndMessages(null);
        gocVar.C0 = null;
        gocVar.Z0 = true;
    }

    @Override // defpackage.ck0
    public final void q() {
        this.j.release();
    }

    @Override // defpackage.ck0
    public final synchronized void t(k09 k09Var) {
        this.s = k09Var;
    }

    public final void u() {
        long j = this.o;
        boolean z = this.p;
        boolean z2 = this.q;
        k09 k09VarI = i();
        s9g y2fVar = new y2f(-9223372036854775807L, -9223372036854775807L, j, j, 0L, 0L, z, false, false, null, k09VarI, z2 ? k09VarI.c : null);
        if (this.n) {
            y2fVar = new ioc(y2fVar);
        }
        n(y2fVar);
    }

    public final void v(long j, i9e i9eVar, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.o;
        }
        boolean zC = i9eVar.c();
        if (!this.n && this.o == j && this.p == zC && this.q == z) {
            return;
        }
        this.o = j;
        this.p = zC;
        this.q = z;
        this.n = false;
        u();
    }
}
