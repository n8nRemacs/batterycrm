package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class j66 extends hs4 implements q76 {
    public boolean X;
    public final pm0 c;
    public final Object d;
    public cof o;

    public j66(aof aofVar, Object obj, pm0 pm0Var) {
        super(aofVar);
        this.c = pm0Var;
        this.d = obj;
    }

    @Override // defpackage.aof
    public final void b() {
        if (this.X) {
            return;
        }
        this.X = true;
        e(this.d);
    }

    @Override // defpackage.cof
    public final void cancel() {
        set(4);
        this.b = null;
        this.o.cancel();
    }

    @Override // defpackage.aof
    public final void d(cof cofVar) {
        if (fof.h(this.o, cofVar)) {
            this.o = cofVar;
            this.a.d(this);
            cofVar.g(BuildConfig.MAX_TIME_TO_UPLOAD);
        }
    }

    @Override // defpackage.aof
    public final void f(Object obj) {
        if (this.X) {
            return;
        }
        try {
            this.c.accept(this.d, obj);
        } catch (Throwable th) {
            raj.c(th);
            this.o.cancel();
            onError(th);
        }
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        if (this.X) {
            t8j.a(th);
        } else {
            this.X = true;
            this.a.onError(th);
        }
    }
}
