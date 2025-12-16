package defpackage;

import android.media.AudioTrack;
import android.os.Handler;
import android.os.SystemClock;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class l60 {
    public boolean A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public mwf F;
    public final ao6 a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public i60 e;
    public int f;
    public long g;
    public float h;
    public boolean i;
    public long j;
    public int k;
    public long l;
    public long m;
    public Method n;
    public long o;
    public boolean p;
    public long q;
    public long r;
    public long s;
    public long t;
    public int u;
    public int v;
    public long w;
    public long x;
    public long y;
    public long z;

    public l60(ao6 ao6Var) {
        this.a = ao6Var;
        try {
            this.n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.b = new long[10];
        this.C = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.F = mwf.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:79:0x025c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a() {
        /*
            Method dump skipped, instructions count: 910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l60.a():long");
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long b() {
        /*
            r12 = this;
            long r0 = r12.w
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 == 0) goto L16
            long r0 = r12.d()
            long r2 = r12.z
            long r0 = java.lang.Math.min(r2, r0)
            return r0
        L16:
            mwf r0 = r12.F
            r0.getClass()
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r4 = r12.r
            long r4 = r0 - r4
            r6 = 5
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 < 0) goto L7f
            android.media.AudioTrack r4 = r12.c
            r4.getClass()
            int r5 = r4.getPlayState()
            r6 = 1
            if (r5 != r6) goto L36
            goto L7d
        L36:
            int r4 = r4.getPlaybackHeadPosition()
            long r6 = (long) r4
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            int r4 = android.os.Build.VERSION.SDK_INT
            r8 = 29
            if (r4 > r8) goto L61
            r8 = 0
            int r4 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r4 != 0) goto L5f
            long r10 = r12.s
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 <= 0) goto L5f
            r4 = 3
            if (r5 != r4) goto L5f
            long r4 = r12.x
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 != 0) goto L7d
            r12.x = r0
            goto L7d
        L5f:
            r12.x = r2
        L61:
            long r2 = r12.s
            int r4 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r4 <= 0) goto L7b
            boolean r4 = r12.D
            if (r4 == 0) goto L74
            long r4 = r12.E
            long r4 = r4 + r2
            r12.E = r4
            r2 = 0
            r12.D = r2
            goto L7b
        L74:
            long r2 = r12.t
            r4 = 1
            long r2 = r2 + r4
            r12.t = r2
        L7b:
            r12.s = r6
        L7d:
            r12.r = r0
        L7f:
            long r0 = r12.s
            long r2 = r12.E
            long r0 = r0 + r2
            long r2 = r12.t
            r4 = 32
            long r2 = r2 << r4
            long r0 = r0 + r2
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l60.b():long");
    }

    public final long c(long j) {
        long jD;
        if (this.v != 0) {
            jD = zxg.D(this.h, j + this.l);
        } else if (this.w != -9223372036854775807L) {
            jD = zxg.c0(this.f, d());
        } else {
            jD = zxg.c0(this.f, b());
        }
        long jMax = Math.max(0L, jD - this.o);
        if (this.w == -9223372036854775807L) {
            return jMax;
        }
        return Math.min(zxg.c0(this.f, this.z), jMax);
    }

    public final long d() {
        AudioTrack audioTrack = this.c;
        audioTrack.getClass();
        if (audioTrack.getPlayState() == 2) {
            return this.y;
        }
        this.F.getClass();
        return this.y + zxg.p(this.f, zxg.D(this.h, zxg.U(SystemClock.elapsedRealtime()) - this.w));
    }

    public final void e(long j) {
        if (this.A) {
            long j2 = this.j;
            if (j2 == -9223372036854775807L || j < j2) {
                return;
            }
            long jG = zxg.G(this.h, j - j2);
            this.F.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis() - zxg.m0(jG);
            this.j = -9223372036854775807L;
            y6i y6iVar = ((ak4) this.a.b).s;
            if (y6iVar != null) {
                xo8 xo8Var = ((mw8) y6iVar.b).P1;
                Handler handler = (Handler) xo8Var.b;
                if (handler != null) {
                    handler.post(new u50(xo8Var, jCurrentTimeMillis, 0));
                }
            }
        }
    }

    public final void f() {
        this.l = 0L;
        this.v = 0;
        this.u = 0;
        this.m = 0L;
        this.B = -9223372036854775807L;
        this.C = -9223372036854775807L;
        this.i = false;
    }
}
