package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class o76 extends AtomicReference implements q76, cof, Runnable {
    public mqc X;
    public final aof a;
    public final h0e b;
    public final AtomicReference c = new AtomicReference();
    public final AtomicLong d = new AtomicLong();
    public final boolean o;

    public o76(aof aofVar, h0e h0eVar, mqc mqcVar, boolean z) {
        this.a = aofVar;
        this.b = h0eVar;
        this.X = mqcVar;
        this.o = !z;
    }

    public final void a(long j, cof cofVar) {
        if (this.o || Thread.currentThread() == get()) {
            cofVar.g(j);
        } else {
            this.b.b(new n76(j, cofVar));
        }
    }

    @Override // defpackage.aof
    public final void b() {
        this.a.b();
        this.b.dispose();
    }

    @Override // defpackage.cof
    public final void cancel() {
        fof.a(this.c);
        this.b.dispose();
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (fof.d(this.c, cofVar)) {
            long andSet = this.d.getAndSet(0L);
            if (andSet != 0) {
                a(andSet, cofVar);
            }
        }
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        this.a.f(obj);
    }

    @Override // defpackage.cof
    public final void g(long j) {
        if (fof.e(j)) {
            AtomicReference atomicReference = this.c;
            cof cofVar = (cof) atomicReference.get();
            if (cofVar != null) {
                a(j, cofVar);
                return;
            }
            AtomicLong atomicLong = this.d;
            nui.a(atomicLong, j);
            cof cofVar2 = (cof) atomicReference.get();
            if (cofVar2 != null) {
                long andSet = atomicLong.getAndSet(0L);
                if (andSet != 0) {
                    a(andSet, cofVar2);
                }
            }
        }
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        this.a.onError(th);
        this.b.dispose();
    }

    @Override // java.lang.Runnable
    public final void run() {
        lazySet(Thread.currentThread());
        mqc mqcVar = this.X;
        this.X = null;
        ((i66) mqcVar).e(this);
    }
}
