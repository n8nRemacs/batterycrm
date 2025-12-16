package defpackage;

import java.io.IOException;

/* loaded from: classes.dex */
public final class isa extends vqa implements drf {
    public final tv0 a;

    public isa(tv0 tv0Var) {
        this.a = tv0Var;
    }

    @Override // defpackage.drf
    public final Object get() throws InterruptedException, IOException {
        Object objCall = this.a.call();
        aj5 aj5Var = bj5.a;
        return objCall;
    }

    @Override // defpackage.vqa
    public final void o(vta vtaVar) {
        gs4 gs4Var = new gs4(vtaVar);
        vtaVar.c(gs4Var);
        if (gs4Var.e()) {
            return;
        }
        try {
            Object objCall = this.a.call();
            aj5 aj5Var = bj5.a;
            gs4Var.d(objCall);
        } catch (Throwable th) {
            raj.c(th);
            if (gs4Var.e()) {
                t8j.a(th);
            } else {
                vtaVar.onError(th);
            }
        }
    }
}
