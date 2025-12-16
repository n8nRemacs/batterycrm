package defpackage;

import bolts.Task;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ox4 implements p44 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public ox4(px4 px4Var, rac racVar, oac oacVar, hj0 hj0Var) {
        this.e = px4Var;
        this.b = racVar;
        this.c = oacVar;
        this.d = hj0Var;
    }

    @Override // defpackage.p44
    public final Object a(Task task) {
        switch (this.a) {
            case 0:
                px4 px4Var = (px4) ((px4) this.e).d;
                hj0 hj0Var = (hj0) this.d;
                rac racVar = (rac) this.b;
                oac oacVar = (oac) this.c;
                if (task.isCancelled() || (task.isFaulted() && (task.getError() instanceof CancellationException))) {
                    racVar.k(oacVar, "DiskCacheProducer");
                    hj0Var.c();
                } else if (task.isFaulted()) {
                    racVar.d(oacVar, "DiskCacheProducer", task.getError(), null);
                    px4Var.a(hj0Var, oacVar);
                } else {
                    ce5 ce5Var = (ce5) task.getResult();
                    if (ce5Var != null) {
                        racVar.a(oacVar, "DiskCacheProducer", px4.c(racVar, oacVar, true, ce5Var.y()));
                        racVar.e(oacVar, "DiskCacheProducer", true);
                        ((mk0) oacVar).h("disk", "default");
                        hj0Var.i(1.0f);
                        hj0Var.g(1, ce5Var);
                        ce5Var.close();
                    } else {
                        racVar.a(oacVar, "DiskCacheProducer", px4.c(racVar, oacVar, false, 0));
                        px4Var.a(hj0Var, oacVar);
                    }
                }
                return null;
            default:
                Executor executor = (Executor) this.d;
                return ((Boolean) ((Callable) this.b).call()).booleanValue() ? Task.forResult(null).onSuccessTask((p44) this.c, executor).onSuccessTask((ox4) ((ao6) this.e).b, executor) : Task.forResult(null);
        }
    }

    public ox4(Callable callable, p44 p44Var, Executor executor, ao6 ao6Var) {
        this.b = callable;
        this.c = p44Var;
        this.d = executor;
        this.e = ao6Var;
    }
}
