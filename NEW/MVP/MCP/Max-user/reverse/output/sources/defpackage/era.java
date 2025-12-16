package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class era extends AtomicInteger implements vta, py4 {
    public final boolean X;
    public o1f Y;
    public py4 Z;
    public final vta a;
    public final tm6 b;
    public final int c;
    public final wy d = new wy();
    public final dra o;
    public volatile boolean s0;
    public volatile boolean t0;
    public volatile boolean u0;
    public int v0;

    public era(vta vtaVar, tm6 tm6Var, int i, boolean z) {
        this.a = vtaVar;
        this.b = tm6Var;
        this.c = i;
        this.X = z;
        this.o = new dra(vtaVar, this, 0);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        vta vtaVar = this.a;
        o1f o1fVar = this.Y;
        wy wyVar = this.d;
        while (true) {
            if (!this.s0) {
                if (this.u0) {
                    o1fVar.clear();
                    return;
                }
                if (!this.X && ((Throwable) wyVar.get()) != null) {
                    o1fVar.clear();
                    this.u0 = true;
                    wyVar.e(vtaVar);
                    return;
                }
                boolean z = this.t0;
                try {
                    Object objPoll = o1fVar.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        this.u0 = true;
                        wyVar.e(vtaVar);
                        return;
                    }
                    if (!z2) {
                        try {
                            Object objApply = this.b.apply(objPoll);
                            Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                            lta ltaVar = (lta) objApply;
                            if (ltaVar instanceof drf) {
                                try {
                                    Object obj = ((drf) ltaVar).get();
                                    if (obj != null && !this.u0) {
                                        vtaVar.f(obj);
                                    }
                                } catch (Throwable th) {
                                    raj.c(th);
                                    wyVar.b(th);
                                }
                            } else {
                                this.s0 = true;
                                ltaVar.a(this.o);
                            }
                        } catch (Throwable th2) {
                            raj.c(th2);
                            this.u0 = true;
                            this.Z.dispose();
                            o1fVar.clear();
                            wyVar.b(th2);
                            wyVar.e(vtaVar);
                            return;
                        }
                    }
                } catch (Throwable th3) {
                    raj.c(th3);
                    this.u0 = true;
                    this.Z.dispose();
                    wyVar.b(th3);
                    wyVar.e(vtaVar);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
    }

    @Override // defpackage.vta
    public final void b() {
        this.t0 = true;
        a();
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.Z, py4Var)) {
            this.Z = py4Var;
            if (py4Var instanceof osc) {
                osc oscVar = (osc) py4Var;
                int iH = oscVar.h(3);
                if (iH == 1) {
                    this.v0 = iH;
                    this.Y = oscVar;
                    this.t0 = true;
                    this.a.c(this);
                    a();
                    return;
                }
                if (iH == 2) {
                    this.v0 = iH;
                    this.Y = oscVar;
                    this.a.c(this);
                    return;
                }
            }
            this.Y = new r8f(this.c);
            this.a.c(this);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.u0 = true;
        this.Z.dispose();
        dra draVar = this.o;
        draVar.getClass();
        ty4.a(draVar);
        this.d.c();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.u0;
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (this.v0 == 0) {
            this.Y.offer(obj);
        }
        a();
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.d.b(th)) {
            this.t0 = true;
            a();
        }
    }
}
