package defpackage;

import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class lsa implements q76, py4 {
    public final vta a;
    public cof b;

    public lsa(vta vtaVar) {
        this.a = vtaVar;
    }

    @Override // defpackage.aof
    public final void b() {
        this.a.b();
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
        this.a.f(obj);
    }

    @Override // defpackage.aof
    public final void onError(Throwable th) {
        this.a.onError(th);
    }
}
