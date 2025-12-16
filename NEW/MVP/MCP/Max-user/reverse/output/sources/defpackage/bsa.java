package defpackage;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class bsa extends AtomicInteger implements py4, vta {
    public static final asa[] y0 = new asa[0];
    public static final asa[] z0 = new asa[0];
    public volatile boolean X;
    public final wy Y = new wy();
    public volatile boolean Z;
    public final vta a;
    public final tm6 b;
    public final int c;
    public final int d;
    public volatile m1f o;
    public final AtomicReference s0;
    public py4 t0;
    public long u0;
    public int v0;
    public final ArrayDeque w0;
    public int x0;

    public bsa(vta vtaVar, tm6 tm6Var, int i, int i2) {
        this.a = vtaVar;
        this.b = tm6Var;
        this.c = i;
        this.d = i2;
        if (i != Integer.MAX_VALUE) {
            this.w0 = new ArrayDeque(i);
        }
        this.s0 = new AtomicReference(y0);
    }

    public final boolean a() {
        if (this.Z) {
            return true;
        }
        if (((Throwable) this.Y.get()) == null) {
            return false;
        }
        d();
        this.Y.e(this.a);
        return true;
    }

    @Override // defpackage.vta
    public final void b() {
        if (this.X) {
            return;
        }
        this.X = true;
        g();
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.t0, py4Var)) {
            this.t0 = py4Var;
            this.a.c(this);
        }
    }

    public final boolean d() {
        this.t0.dispose();
        AtomicReference atomicReference = this.s0;
        asa[] asaVarArr = z0;
        asa[] asaVarArr2 = (asa[]) atomicReference.getAndSet(asaVarArr);
        if (asaVarArr2 == asaVarArr) {
            return false;
        }
        for (asa asaVar : asaVarArr2) {
            asaVar.getClass();
            ty4.a(asaVar);
        }
        return true;
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.Z = true;
        if (d()) {
            this.Y.c();
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.Z;
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (this.X) {
            return;
        }
        try {
            Object objApply = this.b.apply(obj);
            Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
            lta ltaVar = (lta) objApply;
            if (this.c != Integer.MAX_VALUE) {
                synchronized (this) {
                    try {
                        int i = this.x0;
                        if (i == this.c) {
                            this.w0.offer(ltaVar);
                            return;
                        }
                        this.x0 = i + 1;
                    } finally {
                    }
                }
            }
            j(ltaVar);
        } catch (Throwable th) {
            raj.c(th);
            this.t0.dispose();
            onError(th);
        }
    }

    public final void g() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00c7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c6 A[PHI: r4
  0x00c6: PHI (r4v6 int) = (r4v4 int), (r4v7 int) binds: [B:57:0x00ac, B:66:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bsa.h():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void i(asa asaVar) {
        asa[] asaVarArr;
        while (true) {
            AtomicReference atomicReference = this.s0;
            asa[] asaVarArr2 = (asa[]) atomicReference.get();
            int length = asaVarArr2.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    i = -1;
                    break;
                } else if (asaVarArr2[i] == asaVar) {
                    break;
                } else {
                    i++;
                }
            }
            if (i < 0) {
                return;
            }
            if (length == 1) {
                asaVarArr = y0;
            } else {
                asa[] asaVarArr3 = new asa[length - 1];
                System.arraycopy(asaVarArr2, 0, asaVarArr3, 0, i);
                System.arraycopy(asaVarArr2, i + 1, asaVarArr3, i, (length - i) - 1);
                asaVarArr = asaVarArr3;
            }
            while (!atomicReference.compareAndSet(asaVarArr2, asaVarArr)) {
                if (atomicReference.get() != asaVarArr2) {
                    break;
                }
            }
            return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(lta ltaVar) {
        boolean z;
        do {
            z = false;
            if (!(ltaVar instanceof drf)) {
                this.u0++;
                asa asaVar = new asa(this);
                AtomicReference atomicReference = this.s0;
                while (true) {
                    asa[] asaVarArr = (asa[]) atomicReference.get();
                    if (asaVarArr == z0) {
                        ty4.a(asaVar);
                        return;
                    }
                    int length = asaVarArr.length;
                    asa[] asaVarArr2 = new asa[length + 1];
                    System.arraycopy(asaVarArr, 0, asaVarArr2, 0, length);
                    asaVarArr2[length] = asaVar;
                    while (!atomicReference.compareAndSet(asaVarArr, asaVarArr2)) {
                        if (atomicReference.get() != asaVarArr) {
                            break;
                        }
                    }
                    ltaVar.a(asaVar);
                    return;
                }
            }
            try {
                Object obj = ((drf) ltaVar).get();
                if (obj != null) {
                    if (get() == 0 && compareAndSet(0, 1)) {
                        this.a.f(obj);
                        if (decrementAndGet() != 0) {
                        }
                    } else {
                        m1f r8fVar = this.o;
                        if (r8fVar == null) {
                            r8fVar = this.c == Integer.MAX_VALUE ? new r8f(this.d) : new q8f(this.c);
                            this.o = r8fVar;
                        }
                        r8fVar.offer(obj);
                        if (getAndIncrement() != 0) {
                            return;
                        }
                    }
                    h();
                }
            } catch (Throwable th) {
                raj.c(th);
                this.Y.b(th);
                g();
            }
            if (this.c == Integer.MAX_VALUE) {
                return;
            }
            synchronized (this) {
                try {
                    ltaVar = (lta) this.w0.poll();
                    if (ltaVar == null) {
                        this.x0--;
                        z = true;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (!z);
        g();
    }

    public final void k(int i) {
        while (true) {
            int i2 = i - 1;
            if (i == 0) {
                return;
            }
            synchronized (this) {
                try {
                    lta ltaVar = (lta) this.w0.poll();
                    if (ltaVar == null) {
                        this.x0--;
                    } else {
                        j(ltaVar);
                    }
                } finally {
                }
            }
            i = i2;
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.X) {
            t8j.a(th);
        } else if (this.Y.b(th)) {
            this.X = true;
            g();
        }
    }
}
