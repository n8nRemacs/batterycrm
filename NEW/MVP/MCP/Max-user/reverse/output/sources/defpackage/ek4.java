package defpackage;

import android.content.Context;
import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class ek4 implements dh0, wgg {
    public static final zjd p = wg7.o(4300000L, 3200000L, 2400000L, 1700000L, 860000L);
    public static final zjd q = wg7.o(1500000L, 980000L, 750000L, 520000L, 290000L);
    public static final zjd r = wg7.o(2000000L, 1300000L, 1000000L, 860000L, 610000L);
    public static final zjd s = wg7.o(2500000L, 1700000L, 1200000L, 970000L, 680000L);
    public static final zjd t = wg7.o(4700000L, 2800000L, 2100000L, 1700000L, 980000L);
    public static final zjd u = wg7.o(2700000L, 2000000L, 1600000L, 1300000L, 1000000L);
    public static ek4 v;
    public final Context a;
    public final ah7 b;
    public final ao6 c;
    public final mwf d;
    public final boolean e;
    public final s4f f;
    public int g;
    public long h;
    public long i;
    public long j;
    public long k;
    public long l;
    public long m;
    public int n;
    public String o;

    public ek4(Context context, HashMap map) {
        this.a = context == null ? null : context.getApplicationContext();
        this.b = ah7.a(map);
        this.c = new ao6(4, (byte) 0);
        this.f = new s4f(2000, 1);
        this.d = mwf.a;
        this.e = true;
        if (context == null) {
            this.n = 0;
            this.l = 1000000L;
            return;
        }
        qea qeaVarA = qea.a(context);
        int iB = qeaVarA.b();
        this.n = iB;
        this.l = j(iB);
        qeaVarA.c(new ck4(0, this), if0.a());
    }

    @Override // defpackage.dh0
    public final void a(nj4 nj4Var) {
        this.c.p(nj4Var);
    }

    @Override // defpackage.wgg
    public final void c(se4 se4Var, ze4 ze4Var, boolean z) {
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    @Override // defpackage.wgg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(defpackage.se4 r1, defpackage.ze4 r2, boolean r3, int r4) {
        /*
            r0 = this;
            monitor-enter(r0)
            if (r3 == 0) goto Lf
            int r1 = r2.i     // Catch: java.lang.Throwable -> Ld
            r2 = 8
            r1 = r1 & r2
            if (r1 != r2) goto Lb
            goto Lf
        Lb:
            r1 = 1
            goto L10
        Ld:
            r1 = move-exception
            goto L1c
        Lf:
            r1 = 0
        L10:
            if (r1 != 0) goto L14
            monitor-exit(r0)
            return
        L14:
            long r1 = r0.i     // Catch: java.lang.Throwable -> Ld
            long r3 = (long) r4     // Catch: java.lang.Throwable -> Ld
            long r1 = r1 + r3
            r0.i = r1     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r0)
            return
        L1c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Ld
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek4.d(se4, ze4, boolean, int):void");
    }

    @Override // defpackage.dh0
    public final wgg e() {
        return this;
    }

    @Override // defpackage.dh0
    public final synchronized long f() {
        return this.l;
    }

    @Override // defpackage.dh0
    public final void g(Handler handler, nj4 nj4Var) {
        nj4Var.getClass();
        ao6 ao6Var = this.c;
        ao6Var.getClass();
        ao6Var.p(nj4Var);
        ((CopyOnWriteArrayList) ao6Var.b).add(new ah0(handler, nj4Var));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0013  */
    @Override // defpackage.wgg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void h(defpackage.se4 r12, defpackage.ze4 r13, boolean r14) {
        /*
            r11 = this;
            monitor-enter(r11)
            r12 = 0
            r0 = 1
            if (r14 == 0) goto L13
            int r13 = r13.i     // Catch: java.lang.Throwable -> Lf
            r14 = 8
            r13 = r13 & r14
            if (r13 != r14) goto Ld
            goto L13
        Ld:
            r13 = r0
            goto L14
        Lf:
            r0 = move-exception
            r12 = r0
            goto L8f
        L13:
            r13 = r12
        L14:
            if (r13 != 0) goto L18
            monitor-exit(r11)
            return
        L18:
            int r13 = r11.g     // Catch: java.lang.Throwable -> Lf
            if (r13 <= 0) goto L1d
            r12 = r0
        L1d:
            defpackage.hsi.g(r12)     // Catch: java.lang.Throwable -> Lf
            mwf r12 = r11.d     // Catch: java.lang.Throwable -> Lf
            r12.getClass()     // Catch: java.lang.Throwable -> Lf
            long r12 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Lf
            long r1 = r11.h     // Catch: java.lang.Throwable -> Lf
            long r1 = r12 - r1
            int r4 = (int) r1     // Catch: java.lang.Throwable -> Lf
            long r1 = r11.j     // Catch: java.lang.Throwable -> Lf
            long r5 = (long) r4     // Catch: java.lang.Throwable -> Lf
            long r1 = r1 + r5
            r11.j = r1     // Catch: java.lang.Throwable -> Lf
            long r1 = r11.k     // Catch: java.lang.Throwable -> Lf
            long r5 = r11.i     // Catch: java.lang.Throwable -> Lf
            long r1 = r1 + r5
            r11.k = r1     // Catch: java.lang.Throwable -> Lf
            if (r4 <= 0) goto L88
            float r14 = (float) r5     // Catch: java.lang.Throwable -> Lf
            r1 = 1174011904(0x45fa0000, float:8000.0)
            float r14 = r14 * r1
            float r1 = (float) r4     // Catch: java.lang.Throwable -> Lf
            float r14 = r14 / r1
            s4f r1 = r11.f     // Catch: java.lang.Throwable -> Lf
            double r2 = (double) r5     // Catch: java.lang.Throwable -> Lf
            double r2 = java.lang.Math.sqrt(r2)     // Catch: java.lang.Throwable -> Lf
            int r2 = (int) r2     // Catch: java.lang.Throwable -> Lf
            r1.a(r2, r14)     // Catch: java.lang.Throwable -> Lf
            long r1 = r11.j     // Catch: java.lang.Throwable -> Lf
            r5 = 2000(0x7d0, double:9.88E-321)
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 >= 0) goto L5f
            long r1 = r11.k     // Catch: java.lang.Throwable -> Lf
            r5 = 524288(0x80000, double:2.590327E-318)
            int r14 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r14 < 0) goto L6a
        L5f:
            s4f r14 = r11.f     // Catch: java.lang.Throwable -> Lf
            r1 = 1056964608(0x3f000000, float:0.5)
            float r14 = r14.c(r1)     // Catch: java.lang.Throwable -> Lf
            long r1 = (long) r14     // Catch: java.lang.Throwable -> Lf
            r11.l = r1     // Catch: java.lang.Throwable -> Lf
        L6a:
            long r5 = r11.i     // Catch: java.lang.Throwable -> Lf
            long r7 = r11.l     // Catch: java.lang.Throwable -> Lf
            r1 = 0
            if (r4 != 0) goto L7d
            int r14 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r14 != 0) goto L7d
            long r9 = r11.m     // Catch: java.lang.Throwable -> Lf
            int r14 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r14 != 0) goto L7d
            goto L84
        L7d:
            r11.m = r7     // Catch: java.lang.Throwable -> Lf
            ao6 r3 = r11.c     // Catch: java.lang.Throwable -> Lf
            r3.i(r4, r5, r7)     // Catch: java.lang.Throwable -> Lf
        L84:
            r11.h = r12     // Catch: java.lang.Throwable -> Lf
            r11.i = r1     // Catch: java.lang.Throwable -> Lf
        L88:
            int r12 = r11.g     // Catch: java.lang.Throwable -> Lf
            int r12 = r12 - r0
            r11.g = r12     // Catch: java.lang.Throwable -> Lf
            monitor-exit(r11)
            return
        L8f:
            monitor-exit(r11)     // Catch: java.lang.Throwable -> Lf
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek4.h(se4, ze4, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    @Override // defpackage.wgg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void i(defpackage.se4 r1, defpackage.ze4 r2, boolean r3) {
        /*
            r0 = this;
            monitor-enter(r0)
            r1 = 1
            if (r3 == 0) goto L10
            int r2 = r2.i     // Catch: java.lang.Throwable -> Le
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto Lc
            goto L10
        Lc:
            r2 = r1
            goto L11
        Le:
            r1 = move-exception
            goto L2b
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L15
            monitor-exit(r0)
            return
        L15:
            int r2 = r0.g     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L24
            mwf r2 = r0.d     // Catch: java.lang.Throwable -> Le
            r2.getClass()     // Catch: java.lang.Throwable -> Le
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Le
            r0.h = r2     // Catch: java.lang.Throwable -> Le
        L24:
            int r2 = r0.g     // Catch: java.lang.Throwable -> Le
            int r2 = r2 + r1
            r0.g = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)
            return
        L2b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek4.i(se4, ze4, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:1149:0x1225  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long j(int r18) {
        /*
            Method dump skipped, instructions count: 8770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ek4.j(int):long");
    }
}
