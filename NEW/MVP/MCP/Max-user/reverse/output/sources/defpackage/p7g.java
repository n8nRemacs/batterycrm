package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class p7g implements nac {
    public final /* synthetic */ int a;
    public final nac b;
    public final Object c;

    public /* synthetic */ p7g(nac nacVar, Object obj, int i) {
        this.a = i;
        this.b = nacVar;
        this.c = obj;
    }

    @Override // defpackage.nac
    public final void a(hj0 hj0Var, oac oacVar) {
        switch (this.a) {
            case 0:
                aqc aqcVar = (aqc) this.c;
                ml6.i();
                mk0 mk0Var = (mk0) oacVar;
                rac racVar = mk0Var.c;
                mk0Var.v0.w.getClass();
                fd8 fd8Var = new fd8(hj0Var, racVar, oacVar, this);
                mk0Var.a(new ia7(fd8Var, 4, this));
                synchronized (aqcVar) {
                    ((Executor) aqcVar.b).execute(fd8Var);
                }
                return;
            default:
                ((xnd) this.b).a(new lt0(this, hj0Var, oacVar), oacVar);
                return;
        }
    }
}
