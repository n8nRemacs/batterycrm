package defpackage;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class hra extends AtomicInteger implements vta, py4 {
    public volatile boolean X;
    public volatile boolean Y;
    public final vta Z;
    public o1f d;
    public py4 o;
    public final tm6 s0;
    public Object u0;
    public volatile int v0;
    public final int c = 1;
    public final wy a = new wy();
    public final int b = 2;
    public final n66 t0 = new n66(this, 1);

    public hra(vta vtaVar, tm6 tm6Var) {
        this.Z = vtaVar;
        this.s0 = tm6Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002d, code lost:
    
        r2.clear();
        r10.u0 = null;
        r3.e(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0035, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            r10 = this;
            int r0 = r10.getAndIncrement()
            if (r0 == 0) goto L8
            goto L9d
        L8:
            vta r0 = r10.Z
            int r1 = r10.c
            o1f r2 = r10.d
            wy r3 = r10.a
            r4 = 1
            r5 = r4
        L12:
            boolean r6 = r10.Y
            r7 = 0
            if (r6 == 0) goto L1e
            r2.clear()
            r10.u0 = r7
            goto L96
        L1e:
            int r6 = r10.v0
            java.lang.Object r8 = r3.get()
            r9 = 2
            if (r8 == 0) goto L36
            if (r1 == r4) goto L2d
            if (r1 != r9) goto L36
            if (r6 != 0) goto L36
        L2d:
            r2.clear()
            r10.u0 = r7
            r3.e(r0)
            return
        L36:
            r8 = 0
            if (r6 != 0) goto L89
            boolean r6 = r10.X
            java.lang.Object r7 = r2.poll()     // Catch: java.lang.Throwable -> L77
            if (r7 != 0) goto L42
            r8 = r4
        L42:
            if (r6 == 0) goto L4a
            if (r8 == 0) goto L4a
            r3.e(r0)
            return
        L4a:
            if (r8 == 0) goto L4d
            goto L96
        L4d:
            tm6 r6 = r10.s0     // Catch: java.lang.Throwable -> L64
            java.lang.Object r6 = r6.apply(r7)     // Catch: java.lang.Throwable -> L64
            java.lang.String r7 = "The mapper returned a null SingleSource"
            java.util.Objects.requireNonNull(r6, r7)     // Catch: java.lang.Throwable -> L64
            m3f r6 = (defpackage.m3f) r6     // Catch: java.lang.Throwable -> L64
            r10.v0 = r4
            n66 r7 = r10.t0
            e2f r6 = (defpackage.e2f) r6
            r6.k(r7)
            goto L96
        L64:
            r1 = move-exception
            defpackage.raj.c(r1)
            py4 r4 = r10.o
            r4.dispose()
            r2.clear()
            r3.b(r1)
            r3.e(r0)
            return
        L77:
            r1 = move-exception
            defpackage.raj.c(r1)
            r10.Y = r4
            py4 r2 = r10.o
            r2.dispose()
            r3.b(r1)
            r3.e(r0)
            return
        L89:
            if (r6 != r9) goto L96
            java.lang.Object r6 = r10.u0
            r10.u0 = r7
            r0.f(r6)
            r10.v0 = r8
            goto L12
        L96:
            int r5 = -r5
            int r5 = r10.addAndGet(r5)
            if (r5 != 0) goto L12
        L9d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hra.a():void");
    }

    @Override // defpackage.vta
    public final void b() {
        this.X = true;
        a();
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.o, py4Var)) {
            this.o = py4Var;
            if (py4Var instanceof osc) {
                osc oscVar = (osc) py4Var;
                int iH = oscVar.h(7);
                if (iH == 1) {
                    this.d = oscVar;
                    this.X = true;
                    this.Z.c(this);
                    a();
                    return;
                }
                if (iH == 2) {
                    this.d = oscVar;
                    this.Z.c(this);
                    return;
                }
            }
            this.d = new r8f(this.b);
            this.Z.c(this);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.Y = true;
        this.o.dispose();
        n66 n66Var = this.t0;
        n66Var.getClass();
        ty4.a(n66Var);
        this.a.c();
        if (getAndIncrement() == 0) {
            this.d.clear();
            this.u0 = null;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.Y;
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (obj != null) {
            this.d.offer(obj);
        }
        a();
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.a.b(th)) {
            if (this.c == 1) {
                n66 n66Var = this.t0;
                n66Var.getClass();
                ty4.a(n66Var);
            }
            this.X = true;
            a();
        }
    }
}
