package defpackage;

import io.reactivex.rxjava3.exceptions.CompositeException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class w08 extends AtomicReference implements q76, cof, py4 {
    public final um8 a;
    public final tm8 b;
    public final jn6 c = pdf.d;
    public final z66 d = z66.a;

    public w08(um8 um8Var, tm8 tm8Var) {
        this.a = um8Var;
        this.b = tm8Var;
    }

    @Override // defpackage.aof
    public final void b() {
        Object obj = get();
        fof fofVar = fof.a;
        if (obj != fofVar) {
            lazySet(fofVar);
            try {
                this.c.getClass();
            } catch (Throwable th) {
                raj.c(th);
                t8j.a(th);
            }
        }
    }

    @Override // defpackage.cof
    public final void cancel() {
        fof.a(this);
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (fof.d(this, cofVar)) {
            try {
                this.d.accept(this);
            } catch (Throwable th) {
                raj.c(th);
                cofVar.cancel();
                onError(th);
            }
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
        if (e()) {
            return;
        }
        try {
            this.a.accept(obj);
        } catch (Throwable th) {
            raj.c(th);
            ((cof) get()).cancel();
            onError(th);
        }
    }

    @Override // defpackage.cof
    public final void g(long j) {
        ((cof) get()).g(j);
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        Object obj = get();
        fof fofVar = fof.a;
        if (obj == fofVar) {
            t8j.a(th);
            return;
        }
        lazySet(fofVar);
        try {
            this.b.accept(th);
        } catch (Throwable th2) {
            raj.c(th2);
            t8j.a(new CompositeException(th, th2));
        }
    }
}
