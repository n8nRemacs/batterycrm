package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class l66 implements q76, py4 {
    public final v2f a;
    public final pm0 b;
    public final Object c;
    public cof d;
    public boolean o;

    public l66(v2f v2fVar, Object obj, pm0 pm0Var) {
        this.a = v2fVar;
        this.b = pm0Var;
        this.c = obj;
    }

    @Override // defpackage.aof
    public final void b() {
        if (this.o) {
            return;
        }
        this.o = true;
        this.d = fof.a;
        this.a.a(this.c);
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (fof.h(this.d, cofVar)) {
            this.d = cofVar;
            this.a.c(this);
            cofVar.g(BuildConfig.MAX_TIME_TO_UPLOAD);
        }
    }

    @Override // defpackage.py4
    public final void dispose() {
        this.d.cancel();
        this.d = fof.a;
    }

    @Override // defpackage.py4
    public final boolean e() {
        return this.d == fof.a;
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        if (this.o) {
            return;
        }
        try {
            this.b.accept(this.c, obj);
        } catch (Throwable th) {
            raj.c(th);
            this.d.cancel();
            onError(th);
        }
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        if (this.o) {
            t8j.a(th);
            return;
        }
        this.o = true;
        this.d = fof.a;
        this.a.onError(th);
    }
}
