package defpackage;

import java.util.NoSuchElementException;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class j76 extends hs4 implements q76 {
    public final boolean c;
    public cof d;
    public boolean o;

    public j76(aof aofVar, boolean z) {
        super(aofVar);
        this.c = z;
    }

    @Override // defpackage.aof
    public final void b() {
        if (this.o) {
            return;
        }
        this.o = true;
        Object obj = this.b;
        this.b = null;
        if (obj == null) {
            obj = null;
        }
        if (obj != null) {
            e(obj);
            return;
        }
        boolean z = this.c;
        aof aofVar = this.a;
        if (z) {
            aofVar.onError(new NoSuchElementException());
        } else {
            aofVar.b();
        }
    }

    @Override // defpackage.cof
    public final void cancel() {
        set(4);
        this.b = null;
        this.d.cancel();
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (fof.h(this.d, cofVar)) {
            this.d = cofVar;
            this.a.d(this);
            cofVar.g(BuildConfig.MAX_TIME_TO_UPLOAD);
        }
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        if (this.o) {
            return;
        }
        if (this.b == null) {
            this.b = obj;
            return;
        }
        this.o = true;
        this.d.cancel();
        this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        if (this.o) {
            t8j.a(th);
        } else {
            this.o = true;
            this.a.onError(th);
        }
    }
}
