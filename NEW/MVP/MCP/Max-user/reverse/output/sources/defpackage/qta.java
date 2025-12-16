package defpackage;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class qta extends AtomicLong implements vta, py4, rta {
    public final AtomicReference X;
    public final vta a;
    public final long b;
    public final TimeUnit c;
    public final h0e d;
    public final n42 o;

    public qta(vta vtaVar, long j, h0e h0eVar) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.a = vtaVar;
        this.b = j;
        this.c = timeUnit;
        this.d = h0eVar;
        this.o = new n42(2);
        this.X = new AtomicReference();
    }

    @Override // defpackage.rta
    public final void a(long j) {
        if (compareAndSet(j, BuildConfig.MAX_TIME_TO_UPLOAD)) {
            ty4.a(this.X);
            this.a.onError(new TimeoutException(bj5.c(this.b, this.c)));
            this.d.dispose();
        }
    }

    @Override // defpackage.vta
    public final void b() {
        if (getAndSet(BuildConfig.MAX_TIME_TO_UPLOAD) != BuildConfig.MAX_TIME_TO_UPLOAD) {
            n42 n42Var = this.o;
            n42Var.getClass();
            ty4.a(n42Var);
            this.a.b();
            this.d.dispose();
        }
    }

    @Override // defpackage.vta
    public final void c(py4 py4Var) {
        ty4.h(this.X, py4Var);
    }

    @Override // defpackage.py4
    public final void dispose() {
        ty4.a(this.X);
        this.d.dispose();
    }

    @Override // defpackage.py4
    public final boolean e() {
        return ty4.c((py4) this.X.get());
    }

    @Override // defpackage.vta
    public final void f(Object obj) {
        long j = get();
        if (j != BuildConfig.MAX_TIME_TO_UPLOAD) {
            long j2 = 1 + j;
            if (compareAndSet(j, j2)) {
                n42 n42Var = this.o;
                ((py4) n42Var.get()).dispose();
                this.a.f(obj);
                py4 py4VarC = this.d.c(new n76(j2, this), this.b, this.c);
                n42Var.getClass();
                ty4.d(n42Var, py4VarC);
            }
        }
    }

    @Override // defpackage.vta
    public final void onError(Throwable th) {
        if (getAndSet(BuildConfig.MAX_TIME_TO_UPLOAD) == BuildConfig.MAX_TIME_TO_UPLOAD) {
            t8j.a(th);
            return;
        }
        n42 n42Var = this.o;
        n42Var.getClass();
        ty4.a(n42Var);
        this.a.onError(th);
        this.d.dispose();
    }
}
