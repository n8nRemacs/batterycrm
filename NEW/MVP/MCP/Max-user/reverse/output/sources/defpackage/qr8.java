package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class qr8 extends AtomicInteger implements bs8, cof {
    public int X;
    public long Y;
    public final aof a;
    public final or8[] o;
    public final AtomicLong b = new AtomicLong();
    public final n42 d = new n42(2);
    public final AtomicReference c = new AtomicReference(tma.a);

    public qr8(aof aofVar, or8[] or8VarArr) {
        this.a = aofVar;
        this.o = or8VarArr;
    }

    @Override // defpackage.bs8
    public final void a(Object obj) {
        this.c.lazySet(obj);
        d();
    }

    @Override // defpackage.bs8
    public final void b() {
        this.c.lazySet(tma.a);
        d();
    }

    @Override // defpackage.bs8
    public final void c(py4 py4Var) {
        n42 n42Var = this.d;
        n42Var.getClass();
        ty4.d(n42Var, py4Var);
    }

    @Override // defpackage.cof
    public final void cancel() {
        n42 n42Var = this.d;
        n42Var.getClass();
        ty4.a(n42Var);
    }

    public final void d() {
        if (getAndIncrement() != 0) {
            return;
        }
        do {
            n42 n42Var = this.d;
            boolean zE = n42Var.e();
            AtomicReference atomicReference = this.c;
            if (zE) {
                atomicReference.lazySet(null);
                return;
            }
            Object obj = atomicReference.get();
            if (obj != null) {
                tma tmaVar = tma.a;
                aof aofVar = this.a;
                if (obj != tmaVar) {
                    long j = this.Y;
                    if (j != this.b.get()) {
                        this.Y = j + 1;
                        atomicReference.lazySet(null);
                        aofVar.f(obj);
                    }
                } else {
                    atomicReference.lazySet(null);
                }
                if (!n42Var.e()) {
                    int i = this.X;
                    or8[] or8VarArr = this.o;
                    if (i == or8VarArr.length) {
                        aofVar.b();
                        return;
                    } else {
                        this.X = i + 1;
                        or8VarArr[i].e(this);
                    }
                }
            }
        } while (decrementAndGet() != 0);
    }

    @Override // defpackage.cof
    public final void g(long j) {
        if (fof.e(j)) {
            nui.a(this.b, j);
            d();
        }
    }

    @Override // defpackage.bs8
    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
