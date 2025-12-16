package defpackage;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes.dex */
public final class dk4 implements ch0, vgg {
    public static final zjd n = wg7.o(5400000L, 3300000L, 2000000L, 1300000L, 760000L);
    public static final zjd o = wg7.o(1700000L, 820000L, 450000L, 180000L, 130000L);
    public static final zjd p = wg7.o(2300000L, 1300000L, 1000000L, 820000L, 570000L);
    public static final zjd q = wg7.o(3400000L, 2000000L, 1400000L, 1000000L, 620000L);
    public static final zjd r = wg7.o(7500000L, 5200000L, 3700000L, 1800000L, 1100000L);
    public static final zjd s = wg7.o(3300000L, 1900000L, 1700000L, 1500000L, 1200000L);
    public static dk4 t;
    public final ah7 a;
    public final bh0 b;
    public final s4f c;
    public final kwf d;
    public final boolean e;
    public int f;
    public long g;
    public long h;
    public int i;
    public long j;
    public long k;
    public long l;
    public long m;

    public dk4(Context context, HashMap map, int i, kwf kwfVar, boolean z) {
        pea peaVar;
        int i2;
        this.a = ah7.a(map);
        bh0 bh0Var = new bh0();
        bh0Var.a = new CopyOnWriteArrayList();
        this.b = bh0Var;
        this.c = new s4f(i, 0);
        this.d = kwfVar;
        this.e = z;
        if (context == null) {
            this.i = 0;
            this.l = b(0);
            return;
        }
        synchronized (pea.class) {
            try {
                if (pea.o == null) {
                    pea.o = new pea(context, 0);
                }
                peaVar = pea.o;
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (peaVar.b) {
            i2 = peaVar.a;
        }
        this.i = i2;
        this.l = b(i2);
        bk4 bk4Var = new bk4(this);
        CopyOnWriteArrayList copyOnWriteArrayList = (CopyOnWriteArrayList) peaVar.d;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            if (weakReference.get() == null) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
        copyOnWriteArrayList.add(new WeakReference(bk4Var));
        ((Handler) peaVar.c).post(new k79(peaVar, 12, bk4Var));
    }

    public final void a(mj4 mj4Var, Handler handler) {
        mj4Var.getClass();
        bh0 bh0Var = this.b;
        bh0Var.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = bh0Var.a;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            zg0 zg0Var = (zg0) it.next();
            if (zg0Var.b == mj4Var) {
                zg0Var.c = true;
                copyOnWriteArrayList.remove(zg0Var);
            }
        }
        copyOnWriteArrayList.add(new zg0(mj4Var, handler));
    }

    public final long b(int i) {
        Integer numValueOf = Integer.valueOf(i);
        ah7 ah7Var = this.a;
        Long l = (Long) ah7Var.get(numValueOf);
        if (l == null) {
            l = (Long) ah7Var.get(0);
        }
        if (l == null) {
            l = 1000000L;
        }
        return l.longValue();
    }

    public final void c(int i, long j, long j2) {
        int i2;
        long j3;
        long j4;
        if (i == 0 && j == 0 && j2 == this.m) {
            return;
        }
        this.m = j2;
        Iterator it = this.b.a.iterator();
        while (it.hasNext()) {
            zg0 zg0Var = (zg0) it.next();
            if (zg0Var.c) {
                i2 = i;
                j3 = j;
                j4 = j2;
            } else {
                i2 = i;
                j3 = j;
                j4 = j2;
                zg0Var.a.post(new o3(zg0Var, i2, j3, j4));
            }
            i = i2;
            j = j3;
            j2 = j4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void d(defpackage.ye4 r3, boolean r4, int r5) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r4 == 0) goto Lf
            int r3 = r3.i     // Catch: java.lang.Throwable -> Ld
            r4 = 8
            r3 = r3 & r4
            if (r3 != r4) goto Lb
            goto Lf
        Lb:
            r3 = 1
            goto L10
        Ld:
            r3 = move-exception
            goto L1c
        Lf:
            r3 = 0
        L10:
            if (r3 != 0) goto L14
            monitor-exit(r2)
            return
        L14:
            long r3 = r2.h     // Catch: java.lang.Throwable -> Ld
            long r0 = (long) r5     // Catch: java.lang.Throwable -> Ld
            long r3 = r3 + r0
            r2.h = r3     // Catch: java.lang.Throwable -> Ld
            monitor-exit(r2)
            return
        L1c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Ld
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk4.d(ye4, boolean, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0014  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0060 A[Catch: all -> 0x007b, TRY_ENTER, TryCatch #1 {all -> 0x007b, blocks: (B:16:0x0019, B:19:0x001e, B:21:0x003e, B:28:0x0069, B:27:0x0060), top: B:42:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void e(defpackage.ye4 r11, boolean r12) throws java.lang.Throwable {
        /*
            r10 = this;
            monitor-enter(r10)
            r0 = 0
            r1 = 1
            if (r12 == 0) goto L14
            int r11 = r11.i     // Catch: java.lang.Throwable -> Lf
            r12 = 8
            r11 = r11 & r12
            if (r11 != r12) goto Ld
            goto L14
        Ld:
            r11 = r1
            goto L15
        Lf:
            r0 = move-exception
            r11 = r0
            r4 = r10
            goto L86
        L14:
            r11 = r0
        L15:
            if (r11 != 0) goto L19
            monitor-exit(r10)
            return
        L19:
            int r11 = r10.f     // Catch: java.lang.Throwable -> L7b
            if (r11 <= 0) goto L1e
            r0 = r1
        L1e:
            defpackage.fsi.d(r0)     // Catch: java.lang.Throwable -> L7b
            kwf r11 = r10.d     // Catch: java.lang.Throwable -> L7b
            r11.getClass()     // Catch: java.lang.Throwable -> L7b
            long r11 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> L7b
            long r2 = r10.g     // Catch: java.lang.Throwable -> L7b
            long r2 = r11 - r2
            int r5 = (int) r2     // Catch: java.lang.Throwable -> L7b
            long r2 = r10.j     // Catch: java.lang.Throwable -> L7b
            long r6 = (long) r5     // Catch: java.lang.Throwable -> L7b
            long r2 = r2 + r6
            r10.j = r2     // Catch: java.lang.Throwable -> L7b
            long r2 = r10.k     // Catch: java.lang.Throwable -> L7b
            long r6 = r10.h     // Catch: java.lang.Throwable -> L7b
            long r2 = r2 + r6
            r10.k = r2     // Catch: java.lang.Throwable -> L7b
            if (r5 <= 0) goto L7e
            float r0 = (float) r6     // Catch: java.lang.Throwable -> L7b
            r2 = 1174011904(0x45fa0000, float:8000.0)
            float r0 = r0 * r2
            float r2 = (float) r5     // Catch: java.lang.Throwable -> L7b
            float r0 = r0 / r2
            s4f r2 = r10.c     // Catch: java.lang.Throwable -> L7b
            double r3 = (double) r6     // Catch: java.lang.Throwable -> L7b
            double r3 = java.lang.Math.sqrt(r3)     // Catch: java.lang.Throwable -> L7b
            int r3 = (int) r3     // Catch: java.lang.Throwable -> L7b
            r2.a(r3, r0)     // Catch: java.lang.Throwable -> L7b
            long r2 = r10.j     // Catch: java.lang.Throwable -> L7b
            r6 = 2000(0x7d0, double:9.88E-321)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L60
            long r2 = r10.k     // Catch: java.lang.Throwable -> Lf
            r6 = 524288(0x80000, double:2.590327E-318)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 < 0) goto L69
        L60:
            s4f r0 = r10.c     // Catch: java.lang.Throwable -> L7b
            float r0 = r0.b()     // Catch: java.lang.Throwable -> L7b
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L7b
            r10.l = r2     // Catch: java.lang.Throwable -> L7b
        L69:
            long r6 = r10.h     // Catch: java.lang.Throwable -> L7b
            long r8 = r10.l     // Catch: java.lang.Throwable -> L7b
            r4 = r10
            r4.c(r5, r6, r8)     // Catch: java.lang.Throwable -> L78
            r4.g = r11     // Catch: java.lang.Throwable -> L78
            r11 = 0
            r4.h = r11     // Catch: java.lang.Throwable -> L78
            goto L7f
        L78:
            r0 = move-exception
        L79:
            r11 = r0
            goto L86
        L7b:
            r0 = move-exception
            r4 = r10
            goto L79
        L7e:
            r4 = r10
        L7f:
            int r11 = r4.f     // Catch: java.lang.Throwable -> L78
            int r11 = r11 - r1
            r4.f = r11     // Catch: java.lang.Throwable -> L78
            monitor-exit(r10)
            return
        L86:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L78
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk4.e(ye4, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void f(defpackage.ye4 r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            r0 = 1
            if (r3 == 0) goto L10
            int r2 = r2.i     // Catch: java.lang.Throwable -> Le
            r3 = 8
            r2 = r2 & r3
            if (r2 != r3) goto Lc
            goto L10
        Lc:
            r2 = r0
            goto L11
        Le:
            r2 = move-exception
            goto L2b
        L10:
            r2 = 0
        L11:
            if (r2 != 0) goto L15
            monitor-exit(r1)
            return
        L15:
            int r2 = r1.f     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L24
            kwf r2 = r1.d     // Catch: java.lang.Throwable -> Le
            r2.getClass()     // Catch: java.lang.Throwable -> Le
            long r2 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Throwable -> Le
            r1.g = r2     // Catch: java.lang.Throwable -> Le
        L24:
            int r2 = r1.f     // Catch: java.lang.Throwable -> Le
            int r2 = r2 + r0
            r1.f = r2     // Catch: java.lang.Throwable -> Le
            monitor-exit(r1)
            return
        L2b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Le
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk4.f(ye4, boolean):void");
    }
}
