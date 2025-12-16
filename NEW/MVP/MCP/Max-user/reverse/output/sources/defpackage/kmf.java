package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class kmf extends AtomicInteger implements q76, cof {
    public volatile boolean X;
    public final aof a;
    public final wy b = new wy();
    public final AtomicLong c = new AtomicLong();
    public final AtomicReference d = new AtomicReference();
    public final AtomicBoolean o = new AtomicBoolean();

    public kmf(aof aofVar) {
        this.a = aofVar;
    }

    @Override // defpackage.aof
    public final void b() {
        this.X = true;
        aof aofVar = this.a;
        wy wyVar = this.b;
        if (getAndIncrement() == 0) {
            wyVar.f(aofVar);
        }
    }

    @Override // defpackage.cof
    public final void cancel() {
        if (this.X) {
            return;
        }
        fof.a(this.d);
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (!this.o.compareAndSet(false, true)) {
            cofVar.cancel();
            cancel();
            onError(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
            return;
        }
        this.a.d(this);
        if (fof.d(this.d, cofVar)) {
            long andSet = this.c.getAndSet(0L);
            if (andSet != 0) {
                cofVar.g(andSet);
            }
        }
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        if (get() == 0 && compareAndSet(0, 1)) {
            aof aofVar = this.a;
            aofVar.f(obj);
            if (decrementAndGet() == 0) {
                return;
            }
            this.b.f(aofVar);
        }
    }

    @Override // defpackage.cof
    public final void g(long j) {
        if (j > 0) {
            fof.c(this.d, this.c, j);
        } else {
            cancel();
            onError(new IllegalArgumentException(vb9.e(j, "§3.9 violated: positive request amount required but it was ")));
        }
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        this.X = true;
        aof aofVar = this.a;
        wy wyVar = this.b;
        if (wyVar.b(th) && getAndIncrement() == 0) {
            wyVar.f(aofVar);
        }
    }
}
