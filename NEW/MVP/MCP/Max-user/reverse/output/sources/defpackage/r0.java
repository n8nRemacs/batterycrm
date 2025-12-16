package defpackage;

import android.util.Pair;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class r0 implements pe4 {
    public Map a;
    public Object d = null;
    public Throwable e = null;
    public float f = 0.0f;
    public boolean c = false;
    public int b = 1;
    public final ConcurrentLinkedQueue g = new ConcurrentLinkedQueue();

    public void a(Object obj) {
    }

    public final synchronized Throwable b() {
        return this.e;
    }

    public final synchronized float c() {
        return this.f;
    }

    @Override // defpackage.pe4
    public boolean close() {
        synchronized (this) {
            try {
                if (this.c) {
                    return false;
                }
                this.c = true;
                Object obj = this.d;
                this.d = null;
                if (obj != null) {
                    a(obj);
                }
                if (!g()) {
                    h();
                }
                synchronized (this) {
                    this.g.clear();
                }
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.pe4
    public synchronized Object d() {
        return this.d;
    }

    @Override // defpackage.pe4
    public synchronized boolean e() {
        return this.d != null;
    }

    public final synchronized boolean f() {
        return this.c;
    }

    public final synchronized boolean g() {
        return this.b != 1;
    }

    public final void h() {
        boolean z;
        synchronized (this) {
            z = this.b == 3;
        }
        boolean zM = m();
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            ((Executor) pair.second).execute(new q0(this, z, (af4) pair.first, zM));
        }
    }

    public final boolean i(Throwable th, Map map) {
        boolean z;
        synchronized (this) {
            if (this.c) {
                z = false;
            } else {
                z = true;
                if (this.b != 1) {
                    z = false;
                } else {
                    this.b = 3;
                    this.e = th;
                    this.a = map;
                }
            }
        }
        if (z) {
            h();
        }
        return z;
    }

    public final boolean j(float f) {
        boolean z;
        synchronized (this) {
            z = false;
            if (!this.c && this.b == 1 && f >= this.f) {
                this.f = f;
                z = true;
            }
        }
        if (z) {
            Iterator it = this.g.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                ((Executor) pair.second).execute(new yn6(this, (af4) pair.first, false, 1));
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0029 A[DONT_GENERATE, PHI: r1 r3
  0x0029: PHI (r1v2 boolean) = (r1v0 boolean), (r1v3 boolean) binds: [B:27:0x0033, B:21:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x0029: PHI (r3v7 java.lang.Object) = (r3v0 java.lang.Object), (r3v10 java.lang.Object) binds: [B:27:0x0033, B:21:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0019 -> B:32:0x003c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean k(java.lang.Object r3, boolean r4, java.util.Map r5) {
        /*
            r2 = this;
            r2.a = r5
            r5 = 0
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L3e
            boolean r0 = r2.c     // Catch: java.lang.Throwable -> L18
            if (r0 != 0) goto L31
            int r0 = r2.b     // Catch: java.lang.Throwable -> L18
            r1 = 1
            if (r0 == r1) goto Le
            goto L31
        Le:
            if (r4 == 0) goto L1a
            r4 = 2
            r2.b = r4     // Catch: java.lang.Throwable -> L18
            r4 = 1065353216(0x3f800000, float:1.0)
            r2.f = r4     // Catch: java.lang.Throwable -> L18
            goto L1a
        L18:
            r3 = move-exception
            goto L3c
        L1a:
            java.lang.Object r4 = r2.d     // Catch: java.lang.Throwable -> L18
            if (r4 == r3) goto L25
            r2.d = r3     // Catch: java.lang.Throwable -> L22
            r3 = r4
            goto L26
        L22:
            r3 = move-exception
            r5 = r4
            goto L3c
        L25:
            r3 = r5
        L26:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            if (r3 == 0) goto L36
        L29:
            r2.a(r3)
            goto L36
        L2d:
            r4 = move-exception
            r5 = r3
            r3 = r4
            goto L3c
        L31:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L2d
            r1 = 0
            if (r3 == 0) goto L36
            goto L29
        L36:
            if (r1 == 0) goto L3b
            r2.h()
        L3b:
            return r1
        L3c:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L18
            throw r3     // Catch: java.lang.Throwable -> L3e
        L3e:
            r3 = move-exception
            if (r5 == 0) goto L44
            r2.a(r5)
        L44:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0.k(java.lang.Object, boolean, java.util.Map):boolean");
    }

    public final void l(af4 af4Var, Executor executor) {
        boolean z;
        executor.getClass();
        synchronized (this) {
            try {
                if (this.c) {
                    return;
                }
                if (this.b == 1) {
                    this.g.add(Pair.create(af4Var, executor));
                }
                boolean z2 = e() || g() || m();
                if (z2) {
                    synchronized (this) {
                        z = this.b == 3;
                    }
                    executor.execute(new q0(this, z, af4Var, m()));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean m() {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f()     // Catch: java.lang.Throwable -> Lf
            if (r0 == 0) goto L11
            boolean r0 = r1.g()     // Catch: java.lang.Throwable -> Lf
            if (r0 != 0) goto L11
            r0 = 1
            goto L12
        Lf:
            r0 = move-exception
            goto L14
        L11:
            r0 = 0
        L12:
            monitor-exit(r1)
            return r0
        L14:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r0.m():boolean");
    }
}
