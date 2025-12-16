package defpackage;

import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class z50 implements uqa {
    public final /* synthetic */ we5 a;
    public final /* synthetic */ a60 b;

    public z50(a60 a60Var, we5 we5Var) {
        this.b = a60Var;
        this.a = we5Var;
    }

    @Override // defpackage.uqa
    public final void a(Object obj) {
        dv0 dv0Var = (dv0) obj;
        Objects.requireNonNull(dv0Var);
        a60 a60Var = this.b;
        if (a60Var.l == this.a) {
            gri.a("AudioSource", "Receive BufferProvider state change: " + a60Var.h + " to " + dv0Var);
            if (a60Var.h != dv0Var) {
                a60Var.h = dv0Var;
                a60Var.f();
            }
        }
    }

    @Override // defpackage.uqa
    public final void onError(Throwable th) {
        a60 a60Var = this.b;
        if (a60Var.l == this.a) {
            Executor executor = a60Var.j;
            enb enbVar = a60Var.k;
            if (executor == null || enbVar == null) {
                return;
            }
            executor.execute(new ud(enbVar, 10, th));
        }
    }
}
