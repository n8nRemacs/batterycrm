package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class fsa extends AtomicInteger implements vta, py4 {
    public final Object X;
    public final AtomicReference Y;
    public Object Z;
    public final /* synthetic */ int a;
    public final vta b;
    public final Object c;
    public final AtomicInteger d;
    public final wy o;
    public volatile boolean s0;

    public fsa(vta vtaVar, tm6 tm6Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = vtaVar;
                this.X = tm6Var;
                this.c = new zl3();
                this.o = new wy();
                this.d = new AtomicInteger(1);
                this.Y = new AtomicReference();
                break;
            default:
                this.b = vtaVar;
                this.X = tm6Var;
                this.c = new zl3();
                this.o = new wy();
                this.d = new AtomicInteger(1);
                this.Y = new AtomicReference();
                break;
        }
    }

    public void a() {
        switch (this.a) {
            case 0:
                vta vtaVar = this.b;
                AtomicInteger atomicInteger = this.d;
                AtomicReference atomicReference = this.Y;
                int iAddAndGet = 1;
                while (!this.s0) {
                    if (((Throwable) this.o.get()) == null) {
                        boolean z = atomicInteger.get() == 0;
                        r8f r8fVar = (r8f) atomicReference.get();
                        Object objPoll = r8fVar != null ? r8fVar.poll() : null;
                        boolean z2 = objPoll == null;
                        if (z && z2) {
                            this.o.e(vtaVar);
                            break;
                        } else if (z2) {
                            iAddAndGet = addAndGet(-iAddAndGet);
                            if (iAddAndGet == 0) {
                                break;
                            }
                        } else {
                            vtaVar.f(objPoll);
                        }
                    } else {
                        r8f r8fVar2 = (r8f) this.Y.get();
                        if (r8fVar2 != null) {
                            r8fVar2.clear();
                        }
                        this.o.e(vtaVar);
                        break;
                    }
                }
                r8f r8fVar3 = (r8f) this.Y.get();
                if (r8fVar3 != null) {
                    r8fVar3.clear();
                    break;
                }
                break;
            default:
                vta vtaVar2 = this.b;
                AtomicInteger atomicInteger2 = this.d;
                AtomicReference atomicReference2 = this.Y;
                int iAddAndGet2 = 1;
                while (!this.s0) {
                    if (((Throwable) this.o.get()) == null) {
                        boolean z3 = atomicInteger2.get() == 0;
                        r8f r8fVar4 = (r8f) atomicReference2.get();
                        Object objPoll2 = r8fVar4 != null ? r8fVar4.poll() : null;
                        boolean z4 = objPoll2 == null;
                        if (z3 && z4) {
                            this.o.e(this.b);
                            break;
                        } else if (z4) {
                            iAddAndGet2 = addAndGet(-iAddAndGet2);
                            if (iAddAndGet2 == 0) {
                                break;
                            }
                        } else {
                            vtaVar2.f(objPoll2);
                        }
                    } else {
                        r8f r8fVar5 = (r8f) this.Y.get();
                        if (r8fVar5 != null) {
                            r8fVar5.clear();
                        }
                        this.o.e(vtaVar2);
                        break;
                    }
                }
                r8f r8fVar6 = (r8f) this.Y.get();
                if (r8fVar6 != null) {
                    r8fVar6.clear();
                    break;
                }
                break;
        }
    }

    @Override // defpackage.vta
    public final void b() {
        switch (this.a) {
            case 0:
                this.d.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                    break;
                }
                break;
            case 1:
                this.d.decrementAndGet();
                if (getAndIncrement() == 0) {
                    a();
                    break;
                }
                break;
            default:
                ty4.a((n66) this.X);
                if (getAndIncrement() == 0) {
                    this.o.e(this.b);
                    break;
                }
                break;
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        switch (this.a) {
            case 0:
                if (ty4.i((py4) this.Z, py4Var)) {
                    this.Z = py4Var;
                    this.b.c(this);
                    break;
                }
                break;
            case 1:
                if (ty4.i((py4) this.Z, py4Var)) {
                    this.Z = py4Var;
                    this.b.c(this);
                    break;
                }
                break;
            default:
                ty4.d(this.Y, py4Var);
                break;
        }
    }

    public void d() {
        if (this.d.getAndIncrement() == 0) {
            while (!e()) {
                if (!this.s0) {
                    this.s0 = true;
                    ((lta) this.Z).a(this);
                }
                if (this.d.decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        switch (this.a) {
            case 0:
                this.s0 = true;
                ((py4) this.Z).dispose();
                ((zl3) this.c).dispose();
                this.o.c();
                break;
            case 1:
                this.s0 = true;
                ((py4) this.Z).dispose();
                ((zl3) this.c).dispose();
                this.o.c();
                break;
            default:
                ty4.a(this.Y);
                ty4.a((n66) this.X);
                break;
        }
    }

    @Override // defpackage.py4
    public final boolean e() {
        switch (this.a) {
            case 0:
                return this.s0;
            case 1:
                return this.s0;
            default:
                return ty4.c((py4) this.Y.get());
        }
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        switch (this.a) {
            case 0:
                try {
                    Object objApply = ((tm6) this.X).apply(obj);
                    Objects.requireNonNull(objApply, "The mapper returned a null MaybeSource");
                    or8 or8Var = (or8) objApply;
                    this.d.getAndIncrement();
                    rr8 rr8Var = new rr8(this);
                    if (!this.s0 && ((zl3) this.c).a(rr8Var)) {
                        or8Var.e(rr8Var);
                        break;
                    }
                } catch (Throwable th) {
                    raj.c(th);
                    ((py4) this.Z).dispose();
                    onError(th);
                    return;
                }
                break;
            case 1:
                try {
                    Object objApply2 = ((tm6) this.X).apply(obj);
                    Objects.requireNonNull(objApply2, "The mapper returned a null SingleSource");
                    m3f m3fVar = (m3f) objApply2;
                    this.d.getAndIncrement();
                    ira iraVar = new ira(this, 2);
                    if (!this.s0 && ((zl3) this.c).a(iraVar)) {
                        ((e2f) m3fVar).k(iraVar);
                        break;
                    }
                } catch (Throwable th2) {
                    raj.c(th2);
                    ((py4) this.Z).dispose();
                    onError(th2);
                    return;
                }
                break;
            default:
                vta vtaVar = this.b;
                wy wyVar = this.o;
                if (get() == 0 && compareAndSet(0, 1)) {
                    vtaVar.f(obj);
                    if (decrementAndGet() != 0) {
                        wyVar.e(vtaVar);
                        break;
                    }
                }
                break;
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        switch (this.a) {
            case 0:
                this.d.decrementAndGet();
                if (this.o.b(th)) {
                    ((zl3) this.c).dispose();
                    if (getAndIncrement() == 0) {
                        a();
                        break;
                    }
                }
                break;
            case 1:
                this.d.decrementAndGet();
                if (this.o.b(th)) {
                    ((zl3) this.c).dispose();
                    if (getAndIncrement() == 0) {
                        a();
                        break;
                    }
                }
                break;
            default:
                ty4.d(this.Y, null);
                this.s0 = false;
                ((bfe) this.c).f(th);
                break;
        }
    }

    public fsa(vta vtaVar, bfe bfeVar, lta ltaVar) {
        this.a = 2;
        this.b = vtaVar;
        this.c = bfeVar;
        this.Z = ltaVar;
        this.d = new AtomicInteger();
        this.o = new wy();
        this.X = new n66(this);
        this.Y = new AtomicReference();
    }
}
