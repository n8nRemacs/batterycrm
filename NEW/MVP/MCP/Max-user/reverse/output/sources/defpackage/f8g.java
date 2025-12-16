package defpackage;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class f8g implements nac {
    public final xnd a;
    public int b;
    public final ConcurrentLinkedQueue c;
    public final Executor d;

    public f8g(Executor executor, xnd xndVar) {
        executor.getClass();
        this.d = executor;
        this.a = xndVar;
        this.c = new ConcurrentLinkedQueue();
        this.b = 0;
    }

    @Override // defpackage.nac
    public final void a(hj0 hj0Var, oac oacVar) {
        boolean z;
        ((mk0) oacVar).c.j(oacVar, "ThrottlingProducer");
        synchronized (this) {
            try {
                int i = this.b;
                z = true;
                if (i >= 5) {
                    this.c.add(Pair.create(hj0Var, oacVar));
                } else {
                    this.b = i + 1;
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z) {
            return;
        }
        ((mk0) oacVar).c.a(oacVar, "ThrottlingProducer", null);
        this.a.a(new e8g(this, hj0Var), oacVar);
    }
}
