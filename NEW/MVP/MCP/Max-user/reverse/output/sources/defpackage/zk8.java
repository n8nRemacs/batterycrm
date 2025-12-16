package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class zk8 implements w84, jf9 {
    public kf9 X;
    public long Y;
    public final lk6 a;
    public final lk6 b;
    public final nyg c;
    public final if9 d;
    public final brf o;

    public zk8(nyg nygVar, if9 if9Var, brf brfVar) {
        new WeakHashMap();
        this.c = nygVar;
        this.a = new lk6(new t9f(this, nygVar));
        this.b = new lk6(new t9f(this, nygVar));
        this.d = if9Var;
        this.o = brfVar;
        kf9 kf9Var = (kf9) brfVar.get();
        l5j.e(kf9Var, "mMemoryCacheParamsSupplier returned null");
        this.X = kf9Var;
        this.Y = SystemClock.uptimeMillis();
    }

    public static void j(v84 v84Var) {
        x6i x6iVar;
        if (v84Var == null || (x6iVar = v84Var.e) == null) {
            return;
        }
        x6iVar.q(v84Var.a, false);
    }

    public static void k(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                j((v84) it.next());
            }
        }
    }

    @Override // defpackage.qf9
    public final void a(pf9 pf9Var) {
        ArrayList arrayListO;
        double dX = this.d.x(pf9Var);
        synchronized (this) {
            arrayListO = o(Integer.MAX_VALUE, Math.max(0, ((int) ((1.0d - dX) * this.b.J())) - f()));
            g(arrayListO);
        }
        h(arrayListO);
        k(arrayListO);
        l();
        i();
    }

    @Override // defpackage.jf9
    public final vc3 c(ty0 ty0Var, vc3 vc3Var) {
        return e(ty0Var, vc3Var, null);
    }

    @Override // defpackage.jf9
    public final int d(o7c o7cVar) {
        ArrayList arrayListX;
        ArrayList arrayListX2;
        synchronized (this) {
            arrayListX = this.a.X(o7cVar);
            arrayListX2 = this.b.X(o7cVar);
            g(arrayListX2);
        }
        h(arrayListX2);
        k(arrayListX);
        l();
        i();
        return arrayListX2.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.qk4 e(defpackage.ty0 r8, defpackage.vc3 r9, defpackage.x6i r10) {
        /*
            r7 = this;
            r9.getClass()
            r7.l()
            monitor-enter(r7)
            lk6 r0 = r7.a     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r0 = r0.V(r8)     // Catch: java.lang.Throwable -> L2a
            v84 r0 = (defpackage.v84) r0     // Catch: java.lang.Throwable -> L2a
            lk6 r1 = r7.b     // Catch: java.lang.Throwable -> L2a
            java.lang.Object r1 = r1.V(r8)     // Catch: java.lang.Throwable -> L2a
            v84 r1 = (defpackage.v84) r1     // Catch: java.lang.Throwable -> L2a
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L2f
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L2a
            boolean r4 = r1.d     // Catch: java.lang.Throwable -> L2c
            r4 = r4 ^ r2
            defpackage.l5j.f(r4)     // Catch: java.lang.Throwable -> L2c
            r1.d = r2     // Catch: java.lang.Throwable -> L2c
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2a
            vc3 r1 = r7.n(r1)     // Catch: java.lang.Throwable -> L2a
            goto L30
        L2a:
            r8 = move-exception
            goto L88
        L2c:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2c
            throw r8     // Catch: java.lang.Throwable -> L2a
        L2f:
            r1 = r3
        L30:
            java.lang.Object r4 = r9.Z()     // Catch: java.lang.Throwable -> L2a
            nyg r5 = r7.c     // Catch: java.lang.Throwable -> L2a
            int r4 = r5.l(r4)     // Catch: java.lang.Throwable -> L2a
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L2a
            kf9 r5 = r7.X     // Catch: java.lang.Throwable -> L63
            int r5 = r5.d     // Catch: java.lang.Throwable -> L63
            if (r4 > r5) goto L68
            monitor-enter(r7)     // Catch: java.lang.Throwable -> L63
            lk6 r5 = r7.b     // Catch: java.lang.Throwable -> L65
            int r5 = r5.C()     // Catch: java.lang.Throwable -> L65
            lk6 r6 = r7.a     // Catch: java.lang.Throwable -> L65
            int r6 = r6.C()     // Catch: java.lang.Throwable -> L65
            int r5 = r5 - r6
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L63
            kf9 r6 = r7.X     // Catch: java.lang.Throwable -> L63
            int r6 = r6.b     // Catch: java.lang.Throwable -> L63
            int r6 = r6 - r2
            if (r5 > r6) goto L68
            int r5 = r7.f()     // Catch: java.lang.Throwable -> L63
            kf9 r6 = r7.X     // Catch: java.lang.Throwable -> L63
            int r6 = r6.a     // Catch: java.lang.Throwable -> L63
            int r6 = r6 - r4
            if (r5 > r6) goto L68
            goto L69
        L63:
            r8 = move-exception
            goto L86
        L65:
            r8 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L65
            throw r8     // Catch: java.lang.Throwable -> L63
        L68:
            r2 = 0
        L69:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2a
            if (r2 == 0) goto L7b
            v84 r2 = new v84     // Catch: java.lang.Throwable -> L2a
            r3 = -1
            r2.<init>(r8, r9, r10, r3)     // Catch: java.lang.Throwable -> L2a
            lk6 r9 = r7.b     // Catch: java.lang.Throwable -> L2a
            r9.U(r8, r2)     // Catch: java.lang.Throwable -> L2a
            qk4 r3 = r7.m(r2)     // Catch: java.lang.Throwable -> L2a
        L7b:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2a
            defpackage.vc3.P(r1)
            j(r0)
            r7.i()
            return r3
        L86:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L63
            throw r8     // Catch: java.lang.Throwable -> L2a
        L88:
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L2a
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zk8.e(ty0, vc3, x6i):qk4");
    }

    public final synchronized int f() {
        return this.b.J() - this.a.J();
    }

    public final synchronized void g(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                v84 v84Var = (v84) it.next();
                synchronized (this) {
                    v84Var.getClass();
                    l5j.f(!v84Var.d);
                    v84Var.d = true;
                }
            }
        }
    }

    @Override // defpackage.jf9
    public final vc3 get(Object obj) {
        v84 v84Var;
        Object obj2;
        qk4 qk4VarM;
        obj.getClass();
        synchronized (this) {
            try {
                v84Var = (v84) this.a.V(obj);
                lk6 lk6Var = this.b;
                synchronized (lk6Var) {
                    obj2 = ((LinkedHashMap) lk6Var.d).get(obj);
                }
                v84 v84Var2 = (v84) obj2;
                qk4VarM = v84Var2 != null ? m(v84Var2) : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        j(v84Var);
        l();
        i();
        return qk4VarM;
    }

    @Override // defpackage.jf9
    public final synchronized int getSizeInBytes() {
        return this.b.J();
    }

    public final void h(ArrayList arrayList) {
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                vc3.P(n((v84) it.next()));
            }
        }
    }

    public final void i() {
        int i;
        int iC;
        synchronized (this) {
            this.X.getClass();
            i = this.X.b;
            synchronized (this) {
                iC = this.b.C() - this.a.C();
            }
            h(arrayListO);
            k(arrayListO);
        }
        int iMin = Math.min(Integer.MAX_VALUE, i - iC);
        kf9 kf9Var = this.X;
        ArrayList arrayListO = o(iMin, Math.min(kf9Var.c, kf9Var.a - f()));
        g(arrayListO);
        h(arrayListO);
        k(arrayListO);
    }

    public final synchronized void l() {
        if (this.Y + this.X.e > SystemClock.uptimeMillis()) {
            return;
        }
        this.Y = SystemClock.uptimeMillis();
        kf9 kf9Var = (kf9) this.o.get();
        l5j.e(kf9Var, "mMemoryCacheParamsSupplier returned null");
        this.X = kf9Var;
    }

    public final synchronized qk4 m(v84 v84Var) {
        synchronized (this) {
            l5j.f(!v84Var.d);
            v84Var.c++;
        }
        return vc3.k0(v84Var.b.Z(), new h79(this, v84Var, false, 23), vc3.X);
        return vc3.k0(v84Var.b.Z(), new h79(this, v84Var, false, 23), vc3.X);
    }

    public final synchronized vc3 n(v84 v84Var) {
        v84Var.getClass();
        return (v84Var.d && v84Var.c == 0) ? v84Var.b : null;
    }

    public final synchronized ArrayList o(int i, int i2) {
        Object next;
        int iMax = Math.max(i, 0);
        int iMax2 = Math.max(i2, 0);
        if (this.a.C() <= iMax && this.a.J() <= iMax2) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        while (true) {
            if (this.a.C() <= iMax && this.a.J() <= iMax2) {
                return arrayList;
            }
            lk6 lk6Var = this.a;
            synchronized (lk6Var) {
                next = ((LinkedHashMap) lk6Var.d).isEmpty() ? null : ((LinkedHashMap) lk6Var.d).keySet().iterator().next();
            }
            if (next == null) {
                throw new IllegalStateException(String.format("key is null, but exclusiveEntries count: %d, size: %d", Integer.valueOf(this.a.C()), Integer.valueOf(this.a.J())));
            }
            this.a.V(next);
            arrayList.add((v84) this.b.V(next));
        }
    }
}
