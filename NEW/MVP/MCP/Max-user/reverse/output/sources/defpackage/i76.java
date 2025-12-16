package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes.dex */
public final class i76 extends AtomicInteger implements q76, cof {
    public final int X;
    public volatile boolean Y;
    public volatile boolean Z;
    public final aof a;
    public final qm0 b;
    public final q8f c;
    public final AtomicLong d;
    public final int o;
    public Throwable s0;
    public cof t0;
    public Object u0;
    public int v0;

    public i76(aof aofVar, zb8 zb8Var, Object obj, int i) {
        this.a = aofVar;
        this.b = zb8Var;
        this.u0 = obj;
        this.o = i;
        this.X = i - (i >> 2);
        q8f q8fVar = new q8f(i);
        this.c = q8fVar;
        q8fVar.offer(obj);
        this.d = new AtomicLong();
    }

    public final void a() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        aof aofVar = this.a;
        q8f q8fVar = this.c;
        int i = this.X;
        int i2 = this.v0;
        int iAddAndGet = 1;
        do {
            long j = this.d.get();
            long j2 = 0;
            while (j2 != j) {
                if (this.Y) {
                    q8fVar.clear();
                    return;
                }
                boolean z = this.Z;
                if (z && (th = this.s0) != null) {
                    q8fVar.clear();
                    aofVar.onError(th);
                    return;
                }
                Object objPoll = q8fVar.poll();
                boolean z2 = objPoll == null;
                if (z && z2) {
                    aofVar.b();
                    return;
                }
                if (z2) {
                    break;
                }
                aofVar.f(objPoll);
                j2++;
                i2++;
                if (i2 == i) {
                    this.t0.g(i);
                    i2 = 0;
                }
            }
            if (j2 == j && this.Z) {
                Throwable th2 = this.s0;
                if (th2 != null) {
                    q8fVar.clear();
                    aofVar.onError(th2);
                    return;
                } else if (q8fVar.isEmpty()) {
                    aofVar.b();
                    return;
                }
            }
            if (j2 != 0) {
                nui.c(this.d, j2);
            }
            this.v0 = i2;
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
    }

    @Override // defpackage.aof
    public final void b() {
        if (this.Z) {
            return;
        }
        this.Z = true;
        a();
    }

    @Override // defpackage.cof
    public final void cancel() {
        this.Y = true;
        this.t0.cancel();
        if (getAndIncrement() == 0) {
            this.c.clear();
        }
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (fof.h(this.t0, cofVar)) {
            this.t0 = cofVar;
            this.a.d(this);
            cofVar.g(this.o - 1);
        }
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        if (this.Z) {
            return;
        }
        try {
            Object objApply = this.b.apply(this.u0, obj);
            this.u0 = objApply;
            this.c.offer(objApply);
            a();
        } catch (Throwable th) {
            raj.c(th);
            this.t0.cancel();
            onError(th);
        }
    }

    @Override // defpackage.cof
    public final void g(long j) {
        if (fof.e(j)) {
            nui.a(this.d, j);
            a();
        }
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        if (this.Z) {
            t8j.a(th);
            return;
        }
        this.s0 = th;
        this.Z = true;
        a();
    }
}
