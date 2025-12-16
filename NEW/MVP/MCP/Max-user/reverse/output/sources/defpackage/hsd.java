package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final /* synthetic */ class hsd implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ isd b;

    public /* synthetic */ hsd(isd isdVar, int i) {
        this.a = i;
        this.b = isdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Executor executor;
        switch (this.a) {
            case 0:
                isd isdVar = this.b;
                AtomicBoolean atomicBoolean = isdVar.q;
                AtomicBoolean atomicBoolean2 = isdVar.r;
                if (isdVar.s.compareAndSet(false, true)) {
                    oq7 oq7Var = isdVar.l.e;
                    n84 n84Var = isdVar.p;
                    oq7Var.getClass();
                    oq7Var.a(new nq7(oq7Var, n84Var));
                }
                do {
                    if (atomicBoolean2.compareAndSet(false, true)) {
                        Object objCall = null;
                        z = false;
                        while (atomicBoolean.compareAndSet(true, false)) {
                            try {
                                try {
                                    objCall = isdVar.o.call();
                                    z = true;
                                } catch (Exception e) {
                                    throw new RuntimeException("Exception while computing database live data.", e);
                                }
                            } finally {
                                atomicBoolean2.set(false);
                            }
                        }
                        if (z) {
                            isdVar.i(objCall);
                        }
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return;
                    }
                } while (atomicBoolean.get());
                return;
            default:
                isd isdVar2 = this.b;
                boolean z2 = isdVar2.c > 0;
                if (isdVar2.q.compareAndSet(false, true) && z2) {
                    lrd lrdVar = isdVar2.l;
                    if (!isdVar2.n ? (executor = lrdVar.b) == null : (executor = lrdVar.c) == null) {
                        executor = null;
                    }
                    executor.execute(isdVar2.t);
                    return;
                }
                return;
        }
    }
}
