package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class v66 extends AtomicInteger implements q76, cof {
    public final tm6 Y;
    public final aof a;
    public final int b;
    public cof s0;
    public volatile boolean t0;
    public final AtomicLong c = new AtomicLong();
    public final zl3 d = new zl3();
    public final wy X = new wy();
    public final AtomicInteger o = new AtomicInteger(1);
    public final AtomicReference Z = new AtomicReference();

    public v66(aof aofVar, lcj lcjVar, int i) {
        this.a = aofVar;
        this.Y = lcjVar;
        this.b = i;
    }

    public final void a() {
        r8f r8fVar = (r8f) this.Z.get();
        if (r8fVar != null) {
            r8fVar.clear();
        }
    }

    @Override // defpackage.aof
    public final void b() {
        this.o.decrementAndGet();
        c();
    }

    public final void c() {
        if (getAndIncrement() == 0) {
            e();
        }
    }

    @Override // defpackage.cof
    public final void cancel() {
        this.t0 = true;
        this.s0.cancel();
        this.d.dispose();
        this.X.c();
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (fof.h(this.s0, cofVar)) {
            this.s0 = cofVar;
            this.a.d(this);
            int i = this.b;
            if (i == Integer.MAX_VALUE) {
                cofVar.g(BuildConfig.MAX_TIME_TO_UPLOAD);
            } else {
                cofVar.g(i);
            }
        }
    }

    public final void e() {
        aof aofVar = this.a;
        AtomicInteger atomicInteger = this.o;
        AtomicReference atomicReference = this.Z;
        int iAddAndGet = 1;
        do {
            long j = this.c.get();
            long j2 = 0;
            while (true) {
                if (j2 == j) {
                    break;
                }
                if (this.t0) {
                    a();
                    return;
                }
                if (((Throwable) this.X.get()) != null) {
                    a();
                    this.X.f(this.a);
                    return;
                }
                boolean z = atomicInteger.get() == 0;
                r8f r8fVar = (r8f) atomicReference.get();
                Object objPoll = r8fVar != null ? r8fVar.poll() : null;
                boolean z2 = objPoll == null;
                if (z && z2) {
                    this.X.f(aofVar);
                    return;
                } else {
                    if (z2) {
                        break;
                    }
                    aofVar.f(objPoll);
                    j2++;
                }
            }
            if (j2 == j) {
                if (this.t0) {
                    a();
                    return;
                }
                if (((Throwable) this.X.get()) != null) {
                    a();
                    this.X.f(aofVar);
                    return;
                }
                boolean z3 = atomicInteger.get() == 0;
                r8f r8fVar2 = (r8f) atomicReference.get();
                boolean z4 = r8fVar2 == null || r8fVar2.isEmpty();
                if (z3 && z4) {
                    this.X.f(aofVar);
                    return;
                }
            }
            if (j2 != 0) {
                nui.c(this.c, j2);
                if (this.b != Integer.MAX_VALUE) {
                    this.s0.g(j2);
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        try {
            Object objApply = this.Y.apply(obj);
            Objects.requireNonNull(objApply, "The mapper returned a null SingleSource");
            m3f m3fVar = (m3f) objApply;
            this.o.getAndIncrement();
            ira iraVar = new ira(this, 1);
            if (this.t0 || !this.d.a(iraVar)) {
                return;
            }
            ((e2f) m3fVar).k(iraVar);
        } catch (Throwable th) {
            raj.c(th);
            this.s0.cancel();
            onError(th);
        }
    }

    @Override // defpackage.cof
    public final void g(long j) {
        if (fof.e(j)) {
            nui.a(this.c, j);
            c();
        }
    }

    public final r8f h() {
        AtomicReference atomicReference = this.Z;
        r8f r8fVar = (r8f) atomicReference.get();
        if (r8fVar != null) {
            return r8fVar;
        }
        r8f r8fVar2 = new r8f(i66.a);
        while (!atomicReference.compareAndSet(null, r8fVar2)) {
            if (atomicReference.get() != null) {
                return (r8f) atomicReference.get();
            }
        }
        return r8fVar2;
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        this.o.decrementAndGet();
        if (this.X.b(th)) {
            this.d.dispose();
            c();
        }
    }
}
