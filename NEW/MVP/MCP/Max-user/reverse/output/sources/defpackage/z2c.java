package defpackage;

import com.google.android.exoplayer2.ExoPlaybackException;
import java.util.List;

/* loaded from: classes.dex */
public final class z2c {
    public static final c99 t = new c99(new Object());
    public final r9g a;
    public final c99 b;
    public final long c;
    public final long d;
    public final int e;
    public final ExoPlaybackException f;
    public final boolean g;
    public final mfg h;
    public final ggg i;
    public final List j;
    public final c99 k;
    public final boolean l;
    public final int m;
    public final b3c n;
    public final boolean o;
    public final boolean p;
    public volatile long q;
    public volatile long r;
    public volatile long s;

    public z2c(r9g r9gVar, c99 c99Var, long j, long j2, int i, ExoPlaybackException exoPlaybackException, boolean z, mfg mfgVar, ggg gggVar, List list, c99 c99Var2, boolean z2, int i2, b3c b3cVar, long j3, long j4, long j5, boolean z3, boolean z4) {
        this.a = r9gVar;
        this.b = c99Var;
        this.c = j;
        this.d = j2;
        this.e = i;
        this.f = exoPlaybackException;
        this.g = z;
        this.h = mfgVar;
        this.i = gggVar;
        this.j = list;
        this.k = c99Var2;
        this.l = z2;
        this.m = i2;
        this.n = b3cVar;
        this.q = j3;
        this.r = j4;
        this.s = j5;
        this.o = z3;
        this.p = z4;
    }

    public static z2c h(ggg gggVar) {
        mfg mfgVar = mfg.d;
        zjd zjdVar = zjd.o;
        b3c b3cVar = b3c.d;
        j9g j9gVar = r9g.a;
        c99 c99Var = t;
        return new z2c(j9gVar, c99Var, -9223372036854775807L, 0L, 1, null, false, mfgVar, gggVar, zjdVar, c99Var, false, 0, b3cVar, 0L, 0L, 0L, false, false);
    }

    public final z2c a(c99 c99Var) {
        return new z2c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, c99Var, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final z2c b(c99 c99Var, long j, long j2, long j3, long j4, mfg mfgVar, ggg gggVar, List list) {
        return new z2c(this.a, c99Var, j2, j3, this.e, this.f, this.g, mfgVar, gggVar, list, this.k, this.l, this.m, this.n, this.q, j4, j, this.o, this.p);
    }

    public final z2c c(boolean z) {
        return new z2c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, z, this.p);
    }

    public final z2c d(int i, boolean z) {
        return new z2c(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, z, i, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final z2c e(ExoPlaybackException exoPlaybackException) {
        return new z2c(this.a, this.b, this.c, this.d, this.e, exoPlaybackException, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final z2c f(int i) {
        return new z2c(this.a, this.b, this.c, this.d, i, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }

    public final z2c g(r9g r9gVar) {
        return new z2c(r9gVar, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.q, this.r, this.s, this.o, this.p);
    }
}
