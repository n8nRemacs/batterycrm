package defpackage;

import io.reactivex.rxjava3.exceptions.QueueOverflowException;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class s66 extends AtomicReference implements q76, py4 {
    public volatile o1f X;
    public long Y;
    public int Z;
    public final long a;
    public final t66 b;
    public final int c;
    public final int d;
    public volatile boolean o;

    public s66(t66 t66Var, int i, long j) {
        this.a = j;
        this.b = t66Var;
        this.d = i;
        this.c = i >> 2;
    }

    public final void a(long j) {
        if (this.Z != 1) {
            long j2 = this.Y + j;
            if (j2 < this.c) {
                this.Y = j2;
            } else {
                this.Y = 0L;
                ((cof) get()).g(j2);
            }
        }
    }

    @Override // defpackage.aof
    public final void b() {
        this.o = true;
        this.b.c();
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (fof.d(this, cofVar)) {
            if (cofVar instanceof qsc) {
                qsc qscVar = (qsc) cofVar;
                int iH = qscVar.h(7);
                if (iH == 1) {
                    this.Z = iH;
                    this.X = qscVar;
                    this.o = true;
                    this.b.c();
                    return;
                }
                if (iH == 2) {
                    this.Z = iH;
                    this.X = qscVar;
                }
            }
            cofVar.g(this.d);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        fof.a(this);
    }

    @Override // defpackage.py4
    public final boolean e() {
        return get() == fof.a;
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        if (this.Z == 2) {
            this.b.c();
            return;
        }
        t66 t66Var = this.b;
        if (t66Var.get() == 0 && t66Var.compareAndSet(0, 1)) {
            long j = t66Var.t0.get();
            o1f q8fVar = this.X;
            if (j == 0 || !(q8fVar == null || q8fVar.isEmpty())) {
                if (q8fVar == null) {
                    q8fVar = new q8f(t66Var.d);
                    this.X = q8fVar;
                }
                if (!q8fVar.offer(obj)) {
                    t66Var.onError(new QueueOverflowException());
                }
            } else {
                t66Var.a.f(obj);
                if (j != BuildConfig.MAX_TIME_TO_UPLOAD) {
                    t66Var.t0.decrementAndGet();
                }
                a(1L);
            }
            if (t66Var.decrementAndGet() == 0) {
                return;
            }
        } else {
            o1f q8fVar2 = this.X;
            if (q8fVar2 == null) {
                q8fVar2 = new q8f(t66Var.d);
                this.X = q8fVar2;
            }
            if (!q8fVar2.offer(obj)) {
                t66Var.onError(new QueueOverflowException());
                return;
            } else if (t66Var.getAndIncrement() != 0) {
                return;
            }
        }
        t66Var.e();
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        lazySet(fof.a);
        t66 t66Var = this.b;
        if (t66Var.Y.b(th)) {
            this.o = true;
            t66Var.u0.cancel();
            for (s66 s66Var : (s66[]) t66Var.s0.getAndSet(t66.B0)) {
                s66Var.getClass();
                fof.a(s66Var);
            }
            t66Var.c();
        }
    }
}
