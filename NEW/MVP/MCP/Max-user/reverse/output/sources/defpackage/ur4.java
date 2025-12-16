package defpackage;

import android.view.Surface;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.VideoSink$VideoSinkException;
import java.util.ArrayDeque;
import java.util.List;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ur4 implements qch {
    public final f4h a;
    public final n4h b;
    public final ArrayDeque c;
    public Surface d;
    public hf6 e;
    public long f;
    public och g;
    public Executor h;
    public x3h i;

    public ur4(f4h f4hVar, mwf mwfVar) {
        this.a = f4hVar;
        f4hVar.l = mwfVar;
        this.b = new n4h(new h79(this), f4hVar);
        this.c = new ArrayDeque();
        this.e = new hf6(new ff6());
        this.f = -9223372036854775807L;
        this.g = och.a;
        this.h = new es(1);
        this.i = new sr4();
    }

    @Override // defpackage.qch
    public final boolean a() {
        n4h n4hVar = this.b;
        long j = n4hVar.i;
        return j != -9223372036854775807L && n4hVar.h == j;
    }

    @Override // defpackage.qch
    public final Surface b() {
        Surface surface = this.d;
        hsi.h(surface);
        return surface;
    }

    @Override // defpackage.qch
    public final void c() {
        n4h n4hVar = this.b;
        if (n4hVar.g == -9223372036854775807L) {
            n4hVar.g = Long.MIN_VALUE;
            n4hVar.h = Long.MIN_VALUE;
        }
        n4hVar.i = n4hVar.g;
    }

    @Override // defpackage.qch
    public final void d() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qch
    public final boolean e() {
        return true;
    }

    @Override // defpackage.qch
    public final void f(Surface surface, c4f c4fVar) {
        this.d = surface;
        this.a.h(surface);
    }

    @Override // defpackage.qch
    public final boolean g(long j, pch pchVar) {
        this.c.add(pchVar);
        n4h n4hVar = this.b;
        n4hVar.f.e(j);
        n4hVar.g = j;
        n4hVar.i = -9223372036854775807L;
        this.h.execute(new qj4(8, this));
        return true;
    }

    @Override // defpackage.qch
    public final void h() {
        this.a.e();
    }

    @Override // defpackage.qch
    public final void i() {
        this.a.d();
    }

    @Override // defpackage.qch
    public final void j(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qch
    public final void k(int i) {
        m4h m4hVar = this.a.b;
        if (m4hVar.h == i) {
            return;
        }
        m4hVar.h = i;
        m4hVar.d(true);
    }

    @Override // defpackage.qch
    public final void l() {
        this.d = null;
        this.a.h(null);
    }

    @Override // defpackage.qch
    public final void m(ex8 ex8Var) {
        this.g = ex8Var;
        this.h = dx4.a;
    }

    @Override // defpackage.qch
    public final boolean n(hf6 hf6Var) {
        return true;
    }

    @Override // defpackage.qch
    public final void o(boolean z) {
        if (z) {
            f4h f4hVar = this.a;
            m4h m4hVar = f4hVar.b;
            m4hVar.k = 0L;
            m4hVar.n = -1L;
            m4hVar.l = -1L;
            f4hVar.h = -9223372036854775807L;
            f4hVar.f = -9223372036854775807L;
            f4hVar.e = Math.min(f4hVar.e, 1);
            f4hVar.i = -9223372036854775807L;
        }
        n4h n4hVar = this.b;
        i9g i9gVar = n4hVar.d;
        ry ryVar = n4hVar.f;
        ryVar.b = 0;
        ryVar.c = -1;
        ryVar.d = 0;
        n4hVar.g = -9223372036854775807L;
        n4hVar.h = -9223372036854775807L;
        n4hVar.i = -9223372036854775807L;
        i9g i9gVar2 = n4hVar.e;
        if (i9gVar2.h() > 0) {
            hsi.b(i9gVar2.h() > 0);
            while (i9gVar2.h() > 1) {
                i9gVar2.e();
            }
            Object objE = i9gVar2.e();
            objE.getClass();
            n4hVar.k = ((Long) objE).longValue();
        }
        if (i9gVar.h() > 0) {
            hsi.b(i9gVar.h() > 0);
            while (i9gVar.h() > 1) {
                i9gVar.e();
            }
            Object objE2 = i9gVar.e();
            objE2.getClass();
            i9gVar.a(0L, (sch) objE2);
        }
        this.c.clear();
    }

    @Override // defpackage.qch
    public final void p(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.qch
    public final void q(long j, long j2) {
        try {
            this.b.a(j, j2);
        } catch (ExoPlaybackException e) {
            throw new VideoSink$VideoSinkException(e, this.e);
        }
    }

    @Override // defpackage.qch
    public final void r(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.qch
    public final void release() {
    }

    @Override // defpackage.qch
    public final boolean s(boolean z) {
        return this.a.b(z);
    }

    @Override // defpackage.qch
    public final void setPlaybackSpeed(float f) {
        this.a.i(f);
    }

    @Override // defpackage.qch
    public final void t(x3h x3hVar) {
        this.i = x3hVar;
    }

    @Override // defpackage.qch
    public final void u(int i, long j, hf6 hf6Var, List list) {
        hsi.g(list.isEmpty());
        int i2 = hf6Var.u;
        int i3 = hf6Var.v;
        hf6 hf6Var2 = this.e;
        int i4 = hf6Var2.u;
        n4h n4hVar = this.b;
        if (i2 != i4 || i3 != hf6Var2.v) {
            i9g i9gVar = n4hVar.d;
            long j2 = n4hVar.g;
            i9gVar.a(j2 == -9223372036854775807L ? 0L : j2 + 1, new sch(i2, i3));
        }
        float f = hf6Var.y;
        if (f != this.e.y) {
            this.a.g(f);
        }
        this.e = hf6Var;
        if (j != this.f) {
            if (n4hVar.f.d == 0) {
                n4hVar.b.f(i);
                n4hVar.k = j;
            } else {
                i9g i9gVar2 = n4hVar.e;
                long j3 = n4hVar.g;
                i9gVar2.a(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.f = j;
        }
    }

    @Override // defpackage.qch
    public final void v() {
        f4h f4hVar = this.a;
        if (f4hVar.e == 0) {
            f4hVar.e = 1;
        }
    }
}
