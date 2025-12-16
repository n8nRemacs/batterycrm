package defpackage;

import io.reactivex.rxjava3.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class b76 extends AtomicLong implements q76, cof {
    public final aof a;
    public cof b;
    public boolean c;

    public b76(aof aofVar) {
        this.a = aofVar;
    }

    @Override // defpackage.aof
    public final void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.b();
    }

    @Override // defpackage.cof
    public final void cancel() {
        this.b.cancel();
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (fof.h(this.b, cofVar)) {
            this.b = cofVar;
            this.a.d(this);
            cofVar.g(BuildConfig.MAX_TIME_TO_UPLOAD);
        }
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        if (this.c) {
            return;
        }
        if (get() != 0) {
            this.a.f(obj);
            nui.c(this, 1L);
        } else {
            this.b.cancel();
            onError(new MissingBackpressureException("Could not emit value due to lack of requests"));
        }
    }

    @Override // defpackage.cof
    public final void g(long j) {
        if (fof.e(j)) {
            nui.a(this, j);
        }
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        if (this.c) {
            t8j.a(th);
        } else {
            this.c = true;
            this.a.onError(th);
        }
    }
}
