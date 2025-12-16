package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class hta extends AtomicInteger implements vta {
    public final vta a;
    public final n42 b;
    public final lta c;
    public final m7c d;
    public long o;

    public hta(vta vtaVar, long j, m7c m7cVar, n42 n42Var, lta ltaVar) {
        this.a = vtaVar;
        this.b = n42Var;
        this.c = ltaVar;
        this.d = m7cVar;
        this.o = j;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.b.e()) {
                this.c.a(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.vta
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        n42 n42Var = this.b;
        n42Var.getClass();
        ty4.d(n42Var, py4Var);
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        this.a.f(obj);
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        long j = this.o;
        if (j != BuildConfig.MAX_TIME_TO_UPLOAD) {
            this.o = j - 1;
        }
        vta vtaVar = this.a;
        if (j == 0) {
            vtaVar.onError(th);
            return;
        }
        try {
            if (this.d.test(th)) {
                a();
            } else {
                vtaVar.onError(th);
            }
        } catch (Throwable th2) {
            raj.c(th2);
            vtaVar.onError(new CompositeException(th, th2));
        }
    }
}
