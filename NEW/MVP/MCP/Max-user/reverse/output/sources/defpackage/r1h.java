package defpackage;

/* loaded from: classes.dex */
public final class r1h implements uqa {
    public s12 a;
    public boolean b;

    @Override // defpackage.uqa
    public final void a(Object obj) {
        z5j.f("SourceStreamRequirementObserver can be updated from main thread only", jei.c());
        boolean zEquals = Boolean.TRUE.equals((Boolean) obj);
        if (this.b == zEquals) {
            return;
        }
        this.b = zEquals;
        s12 s12Var = this.a;
        if (s12Var == null) {
            gri.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
        } else if (zEquals) {
            s12Var.o();
        } else {
            s12Var.a();
        }
    }

    public final void b() {
        z5j.f("SourceStreamRequirementObserver can be closed from main thread only", jei.c());
        gri.a("VideoCapture", "SourceStreamRequirementObserver#close: mIsSourceStreamRequired = " + this.b);
        s12 s12Var = this.a;
        if (s12Var == null) {
            gri.a("VideoCapture", "SourceStreamRequirementObserver#close: Already closed!");
            return;
        }
        if (this.b) {
            this.b = false;
            if (s12Var != null) {
                s12Var.a();
            } else {
                gri.a("VideoCapture", "SourceStreamRequirementObserver#isSourceStreamRequired: Received new data despite being closed already");
            }
        }
        this.a = null;
    }

    @Override // defpackage.uqa
    public final void onError(Throwable th) {
        gri.j("VideoCapture", "SourceStreamRequirementObserver#onError", th);
    }
}
