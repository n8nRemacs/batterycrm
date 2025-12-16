package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class e76 extends AtomicInteger implements q76, cof {
    public final mqc a;
    public final AtomicReference b = new AtomicReference();
    public final AtomicLong c = new AtomicLong();
    public h76 d;

    public e76(mqc mqcVar) {
        this.a = mqcVar;
    }

    @Override // defpackage.aof
    public final void b() {
        this.d.cancel();
        this.d.Z.b();
    }

    @Override // defpackage.cof
    public final void cancel() {
        fof.a(this.b);
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (fof.d(this.b, cofVar)) {
            long andSet = this.c.getAndSet(0L);
            if (andSet != 0) {
                cofVar.g(andSet);
            }
        }
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        if (getAndIncrement() == 0) {
            while (this.b.get() != fof.a) {
                ((i66) this.a).e(this.d);
                if (decrementAndGet() == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.cof
    public final void g(long j) {
        fof.c(this.b, this.c, j);
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        this.d.cancel();
        this.d.Z.onError(th);
    }
}
