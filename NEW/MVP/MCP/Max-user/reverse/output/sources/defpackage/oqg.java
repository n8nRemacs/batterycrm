package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class oqg extends d76 {
    public Throwable X;
    public volatile boolean Z;
    public volatile boolean o;
    public boolean v0;
    public final r8f b = new r8f(8);
    public final AtomicReference c = new AtomicReference(null);
    public final boolean d = true;
    public final AtomicReference Y = new AtomicReference();
    public final AtomicBoolean s0 = new AtomicBoolean();
    public final nqg t0 = new nqg(this);
    public final AtomicLong u0 = new AtomicLong();

    @Override // defpackage.aof
    public final void b() {
        if (this.o || this.Z) {
            return;
        }
        this.o = true;
        Runnable runnable = (Runnable) this.c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        i();
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (this.o || this.Z) {
            cofVar.cancel();
        } else {
            cofVar.g(BuildConfig.MAX_TIME_TO_UPLOAD);
        }
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        bj5.b(obj, "onNext called with a null value.");
        if (this.o || this.Z) {
            return;
        }
        this.b.offer(obj);
        i();
    }

    @Override // defpackage.i66
    public final void g(q76 q76Var) {
        if (this.s0.get() || !this.s0.compareAndSet(false, true)) {
            xd5.a(new IllegalStateException("This processor allows only a single Subscriber"), q76Var);
            return;
        }
        q76Var.d(this.t0);
        this.Y.set(q76Var);
        if (this.Z) {
            this.Y.lazySet(null);
        } else {
            i();
        }
    }

    public final boolean h(boolean z, boolean z2, boolean z3, aof aofVar, r8f r8fVar) {
        if (this.Z) {
            r8fVar.clear();
            this.Y.lazySet(null);
            return true;
        }
        if (!z2) {
            return false;
        }
        if (z && this.X != null) {
            r8fVar.clear();
            this.Y.lazySet(null);
            aofVar.onError(this.X);
            return true;
        }
        if (!z3) {
            return false;
        }
        Throwable th = this.X;
        this.Y.lazySet(null);
        if (th != null) {
            aofVar.onError(th);
            return true;
        }
        aofVar.b();
        return true;
    }

    public final void i() {
        boolean z;
        if (this.t0.getAndIncrement() != 0) {
            return;
        }
        int iAddAndGet = 1;
        aof aofVar = (aof) this.Y.get();
        int iAddAndGet2 = 1;
        while (aofVar == null) {
            iAddAndGet2 = this.t0.addAndGet(-iAddAndGet2);
            if (iAddAndGet2 == 0) {
                return;
            } else {
                aofVar = (aof) this.Y.get();
            }
        }
        if (this.v0) {
            r8f r8fVar = this.b;
            boolean z2 = this.d;
            while (!this.Z) {
                boolean z3 = this.o;
                if (!z2 && z3 && this.X != null) {
                    r8fVar.clear();
                    this.Y.lazySet(null);
                    aofVar.onError(this.X);
                    return;
                }
                aofVar.f(null);
                if (z3) {
                    this.Y.lazySet(null);
                    Throwable th = this.X;
                    if (th != null) {
                        aofVar.onError(th);
                        return;
                    } else {
                        aofVar.b();
                        return;
                    }
                }
                iAddAndGet = this.t0.addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
            this.Y.lazySet(null);
            return;
        }
        r8f r8fVar2 = this.b;
        boolean z4 = !this.d;
        int iAddAndGet3 = 1;
        while (true) {
            long j = this.u0.get();
            long j2 = 0;
            while (j != j2) {
                boolean z5 = this.o;
                Object objPoll = r8fVar2.poll();
                boolean z6 = objPoll == null;
                if (h(z4, z5, z6, aofVar, r8fVar2)) {
                    return;
                }
                if (z6) {
                    break;
                }
                aofVar.f(objPoll);
                j2++;
            }
            if (j == j2) {
                z = z4;
                if (h(z4, this.o, r8fVar2.isEmpty(), aofVar, r8fVar2)) {
                    return;
                }
            } else {
                z = z4;
            }
            if (j2 != 0 && j != BuildConfig.MAX_TIME_TO_UPLOAD) {
                this.u0.addAndGet(-j2);
            }
            iAddAndGet3 = this.t0.addAndGet(-iAddAndGet3);
            if (iAddAndGet3 == 0) {
                return;
            } else {
                z4 = z;
            }
        }
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        bj5.b(th, "onError called with a null Throwable.");
        if (this.o || this.Z) {
            t8j.a(th);
            return;
        }
        this.X = th;
        this.o = true;
        Runnable runnable = (Runnable) this.c.getAndSet(null);
        if (runnable != null) {
            runnable.run();
        }
        i();
    }
}
