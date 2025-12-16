package defpackage;

import android.os.SystemClock;
import androidx.media3.exoplayer.ExoPlaybackException;
import java.util.List;

/* loaded from: classes.dex */
public final class a3c {
    public static final d99 u = new d99(new Object());
    public final s9g a;
    public final d99 b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final nfg h;
    public final ggg i;
    public final List j;
    public final d99 k;
    public final boolean l;
    public final int m;
    public final int n;
    public final c3c o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;
    public volatile long t;

    public a3c(s9g s9gVar, d99 d99Var, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, nfg nfgVar, ggg gggVar, List list, d99 d99Var2, boolean z2, int i2, int i3, c3c c3cVar, long j3, long j4, long j5, long j6, boolean z3) {
        this.a = s9gVar;
        this.b = d99Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = nfgVar;
        this.i = gggVar;
        this.j = list;
        this.k = d99Var2;
        this.l = z2;
        this.m = i2;
        this.n = i3;
        this.o = c3cVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.t = j6;
        this.p = z3;
    }

    public static a3c k(ggg gggVar) {
        k9g k9gVar = s9g.a;
        nfg nfgVar = nfg.d;
        zjd zjdVar = zjd.o;
        c3c c3cVar = c3c.d;
        d99 d99Var = u;
        return new a3c(k9gVar, d99Var, -9223372036854775807L, 0L, 1, null, false, nfgVar, gggVar, zjdVar, d99Var, false, 1, 0, c3cVar, 0L, 0L, 0L, 0L, false);
    }

    public final a3c a() {
        return new a3c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, l(), SystemClock.elapsedRealtime(), this.p);
    }

    public final a3c b(boolean z) {
        return new a3c(this.a, this.b, this.c, this.d, this.e, this.f, z, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3c c(d99 d99Var) {
        return new a3c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, d99Var, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3c d(d99 d99Var, long j, long j2, long j3, long j4, nfg nfgVar, ggg gggVar, List list) {
        return new a3c(this.a, d99Var, j2, j3, this.e, this.f, this.g, nfgVar, gggVar, list, this.k, this.l, this.m, this.n, this.o, this.q, j4, j, SystemClock.elapsedRealtime(), this.p);
    }

    public final a3c e(int i, int i2, boolean z) {
        return new a3c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, i2, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3c f(ExoPlaybackException exoPlaybackException) {
        return new a3c(this.a, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3c g(c3c c3cVar) {
        return new a3c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, c3cVar, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3c h(int i) {
        return new a3c(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final a3c i(boolean z) {
        return new a3c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, z);
    }

    public final a3c j(s9g s9gVar) {
        return new a3c(s9gVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.q, this.r, this.s, this.t, this.p);
    }

    public final long l() {
        long j;
        long j2;
        if (!m()) {
            return this.s;
        }
        do {
            j = this.t;
            j2 = this.s;
        } while (j != this.t);
        return zxg.U(zxg.m0(j2) + ((long) ((SystemClock.elapsedRealtime() - j) * this.o.a)));
    }

    public final boolean m() {
        return this.e == 3 && this.l && this.n == 0;
    }
}
