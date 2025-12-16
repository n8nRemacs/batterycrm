package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class uvd implements v2f, ou1 {
    public final /* synthetic */ l42 a;

    public /* synthetic */ uvd(l42 l42Var) {
        this.a = l42Var;
    }

    @Override // defpackage.v2f
    public void a(Object obj) {
        this.a.resumeWith(obj);
    }

    @Override // defpackage.v2f
    public void c(py4 py4Var) {
        this.a.e(new iqb(22, py4Var));
    }

    @Override // defpackage.ou1
    public void i(mbd mbdVar, ood oodVar) {
        this.a.f(oodVar, obe.c);
    }

    @Override // defpackage.ou1
    public void j(mbd mbdVar, IOException iOException) {
        this.a.resumeWith(new ipd(iOException));
    }

    @Override // defpackage.v2f
    public void onError(Throwable th) {
        this.a.resumeWith(new ipd(th));
    }
}
