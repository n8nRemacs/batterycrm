package defpackage;

/* loaded from: classes.dex */
public final class rsa extends xl0 implements vta, Runnable {
    public Throwable X;
    public volatile boolean Y;
    public volatile boolean Z;
    public final vta a;
    public final h0e b;
    public final int c;
    public o1f d;
    public py4 o;
    public int s0;
    public boolean t0;

    public rsa(vta vtaVar, h0e h0eVar, int i) {
        this.a = vtaVar;
        this.b = h0eVar;
        this.c = i;
    }

    @Override // defpackage.vta
    public final void b() {
        if (this.Y) {
            return;
        }
        this.Y = true;
        if (getAndIncrement() == 0) {
            this.b.b(this);
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.o, py4Var)) {
            this.o = py4Var;
            if (py4Var instanceof osc) {
                osc oscVar = (osc) py4Var;
                int iH = oscVar.h(7);
                if (iH == 1) {
                    this.s0 = iH;
                    this.d = oscVar;
                    this.Y = true;
                    this.a.c(this);
                    if (getAndIncrement() == 0) {
                        this.b.b(this);
                        return;
                    }
                    return;
                }
                if (iH == 2) {
                    this.s0 = iH;
                    this.d = oscVar;
                    this.a.c(this);
                    return;
                }
            }
            this.d = new r8f(this.c);
            this.a.c(this);
        }
    }

    @Override // defpackage.o1f
    public final void clear() {
        this.d.clear();
    }

    public final boolean d(boolean z, boolean z2, vta vtaVar) {
        if (this.Z) {
            this.d.clear();
            return true;
        }
        if (!z) {
            return false;
        }
        Throwable th = this.X;
        if (th != null) {
            this.Z = true;
            this.d.clear();
            vtaVar.onError(th);
            this.b.dispose();
            return true;
        }
        if (!z2) {
            return false;
        }
        this.Z = true;
        vtaVar.b();
        this.b.dispose();
        return true;
    }

    @Override // defpackage.py4
    public final void dispose() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        this.o.dispose();
        this.b.dispose();
        if (this.t0 || getAndIncrement() != 0) {
            return;
        }
        this.d.clear();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.Z;
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (this.Y) {
            return;
        }
        if (this.s0 != 2) {
            this.d.offer(obj);
        }
        if (getAndIncrement() == 0) {
            this.b.b(this);
        }
    }

    @Override // defpackage.psc
    public final int h(int i) {
        this.t0 = true;
        return 2;
    }

    @Override // defpackage.o1f
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.Y) {
            t8j.a(th);
            return;
        }
        this.X = th;
        this.Y = true;
        if (getAndIncrement() == 0) {
            this.b.b(this);
        }
    }

    @Override // defpackage.o1f
    public final Object poll() {
        return this.d.poll();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x0070, code lost:
    
        r3 = addAndGet(-r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0075, code lost:
    
        if (r3 != 0) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:?, code lost:
    
        return;
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            boolean r0 = r7.t0
            r1 = 1
            if (r0 == 0) goto L4a
            r0 = r1
        L6:
            boolean r2 = r7.Z
            if (r2 == 0) goto Lc
            goto L77
        Lc:
            boolean r2 = r7.Y
            java.lang.Throwable r3 = r7.X
            if (r2 == 0) goto L23
            if (r3 == 0) goto L23
            r7.Z = r1
            vta r0 = r7.a
            java.lang.Throwable r1 = r7.X
            r0.onError(r1)
            h0e r0 = r7.b
            r0.dispose()
            return
        L23:
            vta r3 = r7.a
            r4 = 0
            r3.f(r4)
            if (r2 == 0) goto L42
            r7.Z = r1
            java.lang.Throwable r0 = r7.X
            if (r0 == 0) goto L37
            vta r1 = r7.a
            r1.onError(r0)
            goto L3c
        L37:
            vta r0 = r7.a
            r0.b()
        L3c:
            h0e r0 = r7.b
            r0.dispose()
            return
        L42:
            int r0 = -r0
            int r0 = r7.addAndGet(r0)
            if (r0 != 0) goto L6
            goto L77
        L4a:
            o1f r0 = r7.d
            vta r2 = r7.a
            r3 = r1
        L4f:
            boolean r4 = r7.Y
            boolean r5 = r0.isEmpty()
            boolean r4 = r7.d(r4, r5, r2)
            if (r4 == 0) goto L5c
            goto L77
        L5c:
            boolean r4 = r7.Y
            java.lang.Object r5 = r0.poll()     // Catch: java.lang.Throwable -> L7c
            if (r5 != 0) goto L66
            r6 = r1
            goto L67
        L66:
            r6 = 0
        L67:
            boolean r4 = r7.d(r4, r6, r2)
            if (r4 == 0) goto L6e
            goto L77
        L6e:
            if (r6 == 0) goto L78
            int r3 = -r3
            int r3 = r7.addAndGet(r3)
            if (r3 != 0) goto L4f
        L77:
            return
        L78:
            r2.f(r5)
            goto L5c
        L7c:
            r3 = move-exception
            defpackage.raj.c(r3)
            r7.Z = r1
            py4 r1 = r7.o
            r1.dispose()
            r0.clear()
            r2.onError(r3)
            h0e r0 = r7.b
            r0.dispose()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rsa.run():void");
    }
}
