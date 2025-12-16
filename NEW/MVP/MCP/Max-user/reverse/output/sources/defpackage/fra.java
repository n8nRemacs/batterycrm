package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class fra extends AtomicInteger implements vta, py4 {
    public py4 X;
    public volatile boolean Y;
    public volatile boolean Z;
    public final yee a;
    public final tm6 b;
    public final dra c;
    public final int d;
    public o1f o;
    public volatile boolean s0;
    public int t0;

    public fra(yee yeeVar, tm6 tm6Var, int i) {
        this.a = yeeVar;
        this.b = tm6Var;
        this.d = i;
        this.c = new dra(yeeVar, this, 1);
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        while (!this.Z) {
            if (!this.Y) {
                boolean z = this.s0;
                try {
                    Object objPoll = this.o.poll();
                    boolean z2 = objPoll == null;
                    if (z && z2) {
                        this.Z = true;
                        this.a.b();
                        return;
                    }
                    if (!z2) {
                        try {
                            Object objApply = this.b.apply(objPoll);
                            Objects.requireNonNull(objApply, "The mapper returned a null ObservableSource");
                            lta ltaVar = (lta) objApply;
                            this.Y = true;
                            ltaVar.a(this.c);
                        } catch (Throwable th) {
                            raj.c(th);
                            dispose();
                            this.o.clear();
                            this.a.onError(th);
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    raj.c(th2);
                    dispose();
                    this.o.clear();
                    this.a.onError(th2);
                    return;
                }
            }
            if (decrementAndGet() == 0) {
                return;
            }
        }
        this.o.clear();
    }

    @Override // defpackage.vta
    public final void b() {
        if (this.s0) {
            return;
        }
        this.s0 = true;
        a();
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        if (ty4.i(this.X, py4Var)) {
            this.X = py4Var;
            if (py4Var instanceof osc) {
                osc oscVar = (osc) py4Var;
                int iH = oscVar.h(3);
                if (iH == 1) {
                    this.t0 = iH;
                    this.o = oscVar;
                    this.s0 = true;
                    this.a.c(this);
                    a();
                    return;
                }
                if (iH == 2) {
                    this.t0 = iH;
                    this.o = oscVar;
                    this.a.c(this);
                    return;
                }
            }
            this.o = new r8f(this.d);
            this.a.c(this);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.Z = true;
        dra draVar = this.c;
        draVar.getClass();
        ty4.a(draVar);
        this.X.dispose();
        if (getAndIncrement() == 0) {
            this.o.clear();
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.Z;
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        if (this.s0) {
            return;
        }
        if (this.t0 == 0) {
            this.o.offer(obj);
        }
        a();
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (this.s0) {
            t8j.a(th);
            return;
        }
        this.s0 = true;
        dispose();
        this.a.onError(th);
    }
}
