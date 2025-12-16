package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class rr8 extends AtomicReference implements py4, v2f, bs8 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ rr8(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    @Override // defpackage.v2f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.a
            switch(r0) {
                case 0: goto La5;
                case 1: goto L8e;
                default: goto L5;
            }
        L5:
            java.lang.Object r0 = r4.b
            fsa r0 = (defpackage.fsa) r0
            java.lang.Object r1 = r0.c
            zl3 r1 = (defpackage.zl3) r1
            r1.c(r4)
            int r1 = r0.get()
            if (r1 != 0) goto L4d
            r1 = 0
            r2 = 1
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L4d
            vta r3 = r0.b
            r3.f(r5)
            java.util.concurrent.atomic.AtomicInteger r5 = r0.d
            int r5 = r5.decrementAndGet()
            if (r5 != 0) goto L2c
            r1 = r2
        L2c:
            java.util.concurrent.atomic.AtomicReference r5 = r0.Y
            java.lang.Object r5 = r5.get()
            r8f r5 = (defpackage.r8f) r5
            if (r1 == 0) goto L46
            if (r5 == 0) goto L3e
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L46
        L3e:
            wy r5 = r0.o
            vta r0 = r0.b
            r5.e(r0)
            goto L8a
        L46:
            int r5 = r0.decrementAndGet()
            if (r5 != 0) goto L87
            goto L8a
        L4d:
            java.util.concurrent.atomic.AtomicReference r1 = r0.Y
            java.lang.Object r2 = r1.get()
            r8f r2 = (defpackage.r8f) r2
            if (r2 == 0) goto L59
        L57:
            r3 = r2
            goto L76
        L59:
            r8f r2 = new r8f
            int r3 = defpackage.i66.a
            r2.<init>(r3)
        L60:
            r3 = 0
            boolean r3 = r1.compareAndSet(r3, r2)
            if (r3 == 0) goto L68
            goto L57
        L68:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L60
            java.lang.Object r1 = r1.get()
            r2 = r1
            r8f r2 = (defpackage.r8f) r2
            goto L57
        L76:
            monitor-enter(r3)
            r3.offer(r5)     // Catch: java.lang.Throwable -> L8b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8b
            java.util.concurrent.atomic.AtomicInteger r5 = r0.d
            r5.decrementAndGet()
            int r5 = r0.getAndIncrement()
            if (r5 == 0) goto L87
            goto L8a
        L87:
            r0.a()
        L8a:
            return
        L8b:
            r5 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L8b
            throw r5
        L8e:
            ty4 r0 = defpackage.ty4.a     // Catch: java.lang.Throwable -> L9d
            r4.lazySet(r0)     // Catch: java.lang.Throwable -> L9d
            java.lang.Object r0 = r4.b     // Catch: java.lang.Throwable -> L9d
            df3 r0 = (defpackage.df3) r0     // Catch: java.lang.Throwable -> L9d
            r0.getClass()     // Catch: java.lang.Throwable -> L9d
            java.text.Collator r5 = (java.text.Collator) r5     // Catch: java.lang.Throwable -> L9d
            goto La4
        L9d:
            r5 = move-exception
            defpackage.raj.c(r5)
            defpackage.t8j.a(r5)
        La4:
            return
        La5:
            java.lang.Object r0 = r4.b
            bs8 r0 = (defpackage.bs8) r0
            java.lang.Object r1 = r4.get()
            ty4 r2 = defpackage.ty4.a
            if (r1 == r2) goto Ld6
            java.lang.Object r1 = r4.getAndSet(r2)
            py4 r1 = (defpackage.py4) r1
            if (r1 == r2) goto Ld6
            if (r5 != 0) goto Lc7
            java.lang.String r5 = "onSuccess called with a null value."
            java.lang.NullPointerException r5 = defpackage.bj5.a(r5)     // Catch: java.lang.Throwable -> Lc5
            r0.onError(r5)     // Catch: java.lang.Throwable -> Lc5
            goto Lca
        Lc5:
            r5 = move-exception
            goto Ld0
        Lc7:
            r0.a(r5)     // Catch: java.lang.Throwable -> Lc5
        Lca:
            if (r1 == 0) goto Ld6
            r1.dispose()
            goto Ld6
        Ld0:
            if (r1 == 0) goto Ld5
            r1.dispose()
        Ld5:
            throw r5
        Ld6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr8.a(java.lang.Object):void");
    }

    @Override // defpackage.bs8
    public void b() {
        py4 py4Var;
        switch (this.a) {
            case 0:
                Object obj = get();
                ty4 ty4Var = ty4.a;
                if (obj == ty4Var || (py4Var = (py4) getAndSet(ty4Var)) == ty4Var) {
                    return;
                }
                try {
                    ((bs8) this.b).b();
                    if (py4Var != null) {
                        return;
                    } else {
                        return;
                    }
                } finally {
                    if (py4Var != null) {
                        py4Var.dispose();
                    }
                }
            default:
                fsa fsaVar = (fsa) this.b;
                AtomicInteger atomicInteger = fsaVar.d;
                ((zl3) fsaVar.c).c(this);
                if (fsaVar.get() == 0) {
                    if (fsaVar.compareAndSet(0, 1)) {
                        boolean z = atomicInteger.decrementAndGet() == 0;
                        r8f r8fVar = (r8f) fsaVar.Y.get();
                        if (z && (r8fVar == null || r8fVar.isEmpty())) {
                            fsaVar.o.e(fsaVar.b);
                            return;
                        } else {
                            if (fsaVar.decrementAndGet() == 0) {
                                return;
                            }
                            fsaVar.a();
                            return;
                        }
                    }
                }
                atomicInteger.decrementAndGet();
                if (fsaVar.getAndIncrement() == 0) {
                    fsaVar.a();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.v2f
    public void c(py4 py4Var) {
        switch (this.a) {
            case 1:
                ty4.h(this, py4Var);
                break;
            default:
                ty4.h(this, py4Var);
                break;
        }
    }

    public boolean d(Throwable th) {
        py4 py4Var;
        if (th == null) {
            th = bj5.a("onError called with a null Throwable.");
        }
        Object obj = get();
        ty4 ty4Var = ty4.a;
        if (obj == ty4Var || (py4Var = (py4) getAndSet(ty4Var)) == ty4Var) {
            return false;
        }
        try {
            ((bs8) this.b).onError(th);
        } finally {
            if (py4Var != null) {
                py4Var.dispose();
            }
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                ty4.a(this);
                break;
            case 1:
                ty4.a(this);
                break;
            default:
                ty4.a(this);
                break;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        switch (this.a) {
            case 1:
                if (get() == ty4.a) {
                }
                break;
        }
        return ty4.c((py4) get());
    }

    @Override // defpackage.v2f
    public void onError(Throwable th) {
        switch (this.a) {
            case 1:
                try {
                    lazySet(ty4.a);
                    ((df3) this.b).getClass();
                    break;
                } catch (Throwable th2) {
                    raj.c(th2);
                    t8j.a(new CompositeException(th, th2));
                    return;
                }
            default:
                fsa fsaVar = (fsa) this.b;
                zl3 zl3Var = (zl3) fsaVar.c;
                zl3Var.c(this);
                if (fsaVar.o.b(th)) {
                    ((py4) fsaVar.Z).dispose();
                    zl3Var.dispose();
                    fsaVar.d.decrementAndGet();
                    if (fsaVar.getAndIncrement() == 0) {
                        fsaVar.a();
                        break;
                    }
                }
                break;
        }
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public String toString() {
        switch (this.a) {
            case 0:
                return rr8.class.getSimpleName() + "{" + super.toString() + "}";
            default:
                return super.toString();
        }
    }

    public rr8(fsa fsaVar) {
        this.a = 2;
        this.b = fsaVar;
    }
}
