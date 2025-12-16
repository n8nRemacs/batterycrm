package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class lt0 extends ws4 {
    public final oac c;
    public final /* synthetic */ p7g d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt0(p7g p7gVar, hj0 hj0Var, oac oacVar) {
        super(hj0Var);
        this.d = p7gVar;
        this.c = oacVar;
    }

    @Override // defpackage.ws4, defpackage.hj0
    public final void f(Throwable th) {
        ((f8g) this.d.c).a(this.b, this.c);
    }

    @Override // defpackage.hj0
    public final void h(int i, Object obj) throws IOException {
        ce5 ce5Var = (ce5) obj;
        oac oacVar = this.c;
        rf7 rf7Var = ((mk0) oacVar).a;
        boolean zA = hj0.a(i);
        boolean zB = tei.b(ce5Var, rf7Var.h);
        hj0 hj0Var = this.b;
        if (ce5Var != null && (zB || rf7Var.e)) {
            if (zA && zB) {
                hj0Var.g(i, ce5Var);
            } else {
                hj0Var.g(i & (-2), ce5Var);
            }
        }
        if (!zA || zB || rf7Var.c()) {
            return;
        }
        ce5.d(ce5Var);
        ((f8g) this.d.c).a(hj0Var, oacVar);
    }
}
