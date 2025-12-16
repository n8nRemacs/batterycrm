package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class j3c implements qch {
    public final int a;
    public wg7 b;
    public hf6 c;
    public int d;
    public long e;
    public long f;
    public och g;
    public Executor h;
    public boolean i;
    public final /* synthetic */ m3c j;

    public j3c(m3c m3cVar, Context context) {
        this.j = m3cVar;
        this.a = zxg.N(context) ? 1 : 5;
        t76 t76Var = wg7.b;
        this.b = zjd.o;
        this.f = -9223372036854775807L;
        this.g = och.a;
        this.h = m3c.z;
    }

    @Override // defpackage.qch
    public final boolean a() {
        if (!this.i) {
            return false;
        }
        m3c m3cVar = this.j;
        return m3cVar.s == 0 && m3cVar.w && m3cVar.e.a();
    }

    @Override // defpackage.qch
    public final Surface b() {
        hsi.g(this.i);
        t4h t4hVar = this.j.n;
        t4hVar.getClass();
        return t4hVar.j(0);
    }

    @Override // defpackage.qch
    public final void c() {
        long j = this.f;
        m3c m3cVar = this.j;
        m3cVar.v = j;
        if (m3cVar.u >= j) {
            m3cVar.e.c();
            m3cVar.w = true;
        }
    }

    @Override // defpackage.qch
    public final void d() {
        if (this.i) {
            m3c m3cVar = this.j;
            long j = m3cVar.u;
            m3c.b(m3cVar, false);
            t4h t4hVar = m3cVar.n;
            t4hVar.getClass();
            t4hVar.d();
            m3cVar.u = j;
        }
    }

    @Override // defpackage.qch
    public final boolean e() {
        return this.i;
    }

    @Override // defpackage.qch
    public final void f(Surface surface, c4f c4fVar) {
        m3c m3cVar = this.j;
        Pair pair = m3cVar.r;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((c4f) m3cVar.r.second).equals(c4fVar)) {
            return;
        }
        m3cVar.r = Pair.create(surface, c4fVar);
        m3cVar.c(surface, c4fVar.a, c4fVar.b);
    }

    @Override // defpackage.qch
    public final boolean g(long j, pch pchVar) {
        hsi.g(this.i);
        m3c m3cVar = this.j;
        int i = m3cVar.x;
        if (i != -1 && i == m3cVar.y) {
            t4h t4hVar = m3cVar.n;
            t4hVar.getClass();
            if (t4hVar.g(0) < this.a) {
                t4h t4hVar2 = m3cVar.n;
                t4hVar2.getClass();
                if (t4hVar2.f(0)) {
                    long j2 = j + this.e;
                    this.f = j2;
                    ((fx8) pchVar).a(j2 * 1000);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.qch
    public final void h() {
        m3c m3cVar = this.j;
        if (m3cVar.d) {
            m3cVar.e.h();
        }
    }

    @Override // defpackage.qch
    public final void i() {
        m3c m3cVar = this.j;
        if (m3cVar.d) {
            m3cVar.e.i();
        }
    }

    @Override // defpackage.qch
    public final void j(long j) {
        this.e = j;
    }

    @Override // defpackage.qch
    public final void k(int i) {
        this.j.e.k(i);
    }

    @Override // defpackage.qch
    public final void l() {
        m3c m3cVar = this.j;
        m3cVar.getClass();
        c4f c4fVar = c4f.c;
        m3cVar.c(null, c4fVar.a, c4fVar.b);
        m3cVar.r = null;
    }

    @Override // defpackage.qch
    public final void m(ex8 ex8Var) {
        this.g = ex8Var;
        this.h = dx4.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0060  */
    @Override // defpackage.qch
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean n(defpackage.hf6 r22) throws androidx.media3.exoplayer.video.VideoSink$VideoSinkException {
        /*
            Method dump skipped, instructions count: 287
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j3c.n(hf6):boolean");
    }

    @Override // defpackage.qch
    public final void o(boolean z) {
        boolean z2 = this.i;
        m3c m3cVar = this.j;
        if (z2) {
            t4h t4hVar = m3cVar.n;
            t4hVar.getClass();
            t4hVar.flush();
        }
        this.f = -9223372036854775807L;
        m3c.b(m3cVar, z);
    }

    @Override // defpackage.qch
    public final void p(List list) {
        if (this.b.equals(list)) {
            return;
        }
        this.b = wg7.j(list);
        hf6 hf6Var = this.c;
        if (hf6Var != null) {
            w(hf6Var);
        }
    }

    @Override // defpackage.qch
    public final void q(long j, long j2) {
        this.j.e.q(j + this.e, j2);
    }

    @Override // defpackage.qch
    public final void r(boolean z) {
        m3c m3cVar = this.j;
        if (m3cVar.d) {
            m3cVar.e.r(z);
        }
    }

    @Override // defpackage.qch
    public final void release() {
        m3c m3cVar = this.j;
        if (m3cVar.t == 2) {
            return;
        }
        wwf wwfVar = m3cVar.m;
        if (wwfVar != null) {
            wwfVar.a.removeCallbacksAndMessages(null);
        }
        t4h t4hVar = m3cVar.n;
        if (t4hVar != null) {
            t4hVar.release();
        }
        m3cVar.r = null;
        m3cVar.t = 2;
    }

    @Override // defpackage.qch
    public final boolean s(boolean z) {
        boolean z2 = false;
        boolean z3 = z && this.i;
        m3c m3cVar = this.j;
        ur4 ur4Var = m3cVar.e;
        if (z3 && m3cVar.s == 0) {
            z2 = true;
        }
        return ur4Var.a.b(z2);
    }

    @Override // defpackage.qch
    public final void setPlaybackSpeed(float f) {
        this.j.e.setPlaybackSpeed(f);
    }

    @Override // defpackage.qch
    public final void t(x3h x3hVar) {
        m3c m3cVar = this.j;
        m3cVar.o = x3hVar;
        m3cVar.e.i = x3hVar;
    }

    @Override // defpackage.qch
    public final void u(int i, long j, hf6 hf6Var, List list) {
        hsi.g(this.i);
        this.b = wg7.j(list);
        this.d = 1;
        this.c = hf6Var;
        m3c m3cVar = this.j;
        m3cVar.v = -9223372036854775807L;
        m3cVar.w = false;
        w(hf6Var);
        long j2 = this.f;
        boolean z = j2 == -9223372036854775807L;
        if (m3cVar.d || z) {
            long j3 = z ? -4611686018427387904L : 1 + j2;
            m3cVar.i.a(j3, new l3c(i, j + this.e, j3));
        }
    }

    @Override // defpackage.qch
    public final void v() {
        m3c m3cVar = this.j;
        ur4 ur4Var = m3cVar.e;
        if (m3cVar.i.h() == 0) {
            ur4Var.v();
            return;
        }
        i9g i9gVar = new i9g(1);
        boolean z = true;
        while (m3cVar.i.h() > 0) {
            l3c l3cVar = (l3c) m3cVar.i.e();
            l3cVar.getClass();
            if (z) {
                int i = l3cVar.b;
                if (i == 0 || i == 1) {
                    l3cVar = new l3c(0, l3cVar.a, l3cVar.c);
                } else {
                    ur4Var.v();
                }
                z = false;
            }
            i9gVar.a(l3cVar.c, l3cVar);
        }
        m3cVar.i = i9gVar;
    }

    public final void w(hf6 hf6Var) {
        ff6 ff6VarA = hf6Var.a();
        gf3 gf3Var = hf6Var.D;
        if (gf3Var == null || !gf3Var.f()) {
            gf3Var = gf3.h;
        }
        ff6VarA.C = gf3Var;
        hf6 hf6Var2 = new hf6(ff6VarA);
        int i = this.d != 1 ? 2 : 1;
        t4h t4hVar = this.j.n;
        t4hVar.getClass();
        t4hVar.l(0, i, hf6Var2, this.b, 0L);
    }
}
