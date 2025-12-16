package defpackage;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public final class r76 extends AtomicReference implements cof, Runnable {
    public final aof a;
    public volatile boolean b;

    public r76(aof aofVar) {
        this.a = aofVar;
    }

    @Override // defpackage.cof
    public final void cancel() {
        ty4.a(this);
    }

    @Override // defpackage.cof
    public final void g(long j) {
        if (fof.e(j)) {
            this.b = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        cd5 cd5Var = cd5.a;
        if (get() != ty4.a) {
            if (!this.b) {
                lazySet(cd5Var);
                this.a.onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
            } else {
                this.a.f(0L);
                lazySet(cd5Var);
                this.a.b();
            }
        }
    }
}
