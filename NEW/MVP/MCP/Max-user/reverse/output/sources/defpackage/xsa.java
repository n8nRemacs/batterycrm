package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class xsa extends vqa {
    public final gta a;
    public final int b;
    public vsa c;

    public xsa(gta gtaVar) {
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        this.a = gtaVar;
        this.b = 1;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        vsa vsaVar;
        boolean z;
        cta ctaVar;
        synchronized (this) {
            try {
                vsaVar = this.c;
                if (vsaVar == null) {
                    vsaVar = new vsa(this);
                    this.c = vsaVar;
                }
                long j = vsaVar.b + 1;
                vsaVar.b = j;
                if (vsaVar.c || j != this.b) {
                    z = false;
                } else {
                    vsaVar.c = true;
                    z = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.a.a(new wsa(vtaVar, this, vsaVar));
        if (z) {
            gta gtaVar = this.a;
            AtomicReference atomicReference = gtaVar.b;
            loop0: while (true) {
                ctaVar = (cta) atomicReference.get();
                if (ctaVar != null && !ctaVar.e()) {
                    break;
                }
                cta ctaVar2 = new cta(gtaVar.c.call(), atomicReference);
                while (!atomicReference.compareAndSet(ctaVar, ctaVar2)) {
                    if (atomicReference.get() != ctaVar) {
                        break;
                    }
                }
                ctaVar = ctaVar2;
                break loop0;
            }
            AtomicBoolean atomicBoolean = ctaVar.d;
            boolean z2 = !atomicBoolean.get() && atomicBoolean.compareAndSet(false, true);
            try {
                vsaVar.accept(ctaVar);
                if (z2) {
                    gtaVar.a.a(ctaVar);
                }
            } catch (Throwable th2) {
                raj.c(th2);
                if (z2) {
                    atomicBoolean.compareAndSet(true, false);
                }
                raj.c(th2);
                throw bj5.d(th2);
            }
        }
    }

    public final void t(vsa vsaVar) {
        synchronized (this) {
            try {
                if (this.c == vsaVar) {
                    vsaVar.getClass();
                    long j = vsaVar.b - 1;
                    vsaVar.b = j;
                    if (j == 0) {
                        this.c = null;
                        this.a.t();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(vsa vsaVar) {
        synchronized (this) {
            try {
                if (vsaVar.b == 0 && vsaVar == this.c) {
                    this.c = null;
                    py4 py4Var = (py4) vsaVar.get();
                    ty4.a(vsaVar);
                    if (py4Var == null) {
                        vsaVar.d = true;
                    } else {
                        this.a.t();
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
