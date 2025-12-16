package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes.dex */
public final class f76 extends AtomicInteger implements q76 {
    public long X;
    public final aof a;
    public final dof b;
    public final mqc c;
    public final rm0 d;
    public int o;

    public f76(aof aofVar, rm0 rm0Var, dof dofVar, mqc mqcVar) {
        this.a = aofVar;
        this.b = dofVar;
        this.c = mqcVar;
        this.d = rm0Var;
    }

    public final void a() {
        if (getAndIncrement() == 0) {
            int iAddAndGet = 1;
            while (!this.b.X) {
                long j = this.X;
                if (j != 0) {
                    this.X = 0L;
                    this.b.e(j);
                }
                ((i66) this.c).e(this);
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            }
        }
    }

    @Override // defpackage.aof
    public final void b() {
        this.a.b();
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        this.b.h(cofVar);
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        this.X++;
        this.a.f(obj);
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        aof aofVar = this.a;
        try {
            rm0 rm0Var = this.d;
            int i = this.o + 1;
            this.o = i;
            if (rm0Var.test(Integer.valueOf(i), th)) {
                a();
            } else {
                aofVar.onError(th);
            }
        } catch (Throwable th2) {
            raj.c(th2);
            aofVar.onError(new CompositeException(th, th2));
        }
    }
}
