package defpackage;

/* loaded from: classes.dex */
public final class lu7 extends du7 {
    public final su7 b;
    public final mu7 c;
    public final z73 d;
    public final Object o;

    public lu7(su7 su7Var, mu7 mu7Var, z73 z73Var, Object obj) {
        this.b = su7Var;
        this.c = mu7Var;
        this.d = z73Var;
        this.o = obj;
    }

    @Override // defpackage.du7
    public final boolean c() {
        return false;
    }

    @Override // defpackage.du7
    public final void d(Throwable th) {
        su7.access$continueCompleting(this.b, this.c, this.d, this.o);
    }
}
