package defpackage;

import java.util.NoSuchElementException;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class l76 implements q76, py4 {
    public final v2f a;
    public cof b;
    public boolean c;
    public Object d;

    public l76(v2f v2fVar) {
        this.a = v2fVar;
    }

    @Override // defpackage.aof
    public final void b() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b = fof.a;
        Object obj = this.d;
        this.d = null;
        if (obj == null) {
            obj = null;
        }
        v2f v2fVar = this.a;
        if (obj != null) {
            v2fVar.a(obj);
        } else {
            v2fVar.onError(new NoSuchElementException());
        }
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (fof.h(this.b, cofVar)) {
            this.b = cofVar;
            this.a.c(this);
            cofVar.g(BuildConfig.MAX_TIME_TO_UPLOAD);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.b.cancel();
        this.b = fof.a;
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.b == fof.a;
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        if (this.c) {
            return;
        }
        if (this.d == null) {
            this.d = obj;
            return;
        }
        this.c = true;
        this.b.cancel();
        this.b = fof.a;
        this.a.onError(new IllegalArgumentException("Sequence contains more than one element!"));
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        if (this.c) {
            t8j.a(th);
            return;
        }
        this.c = true;
        this.b = fof.a;
        this.a.onError(th);
    }
}
