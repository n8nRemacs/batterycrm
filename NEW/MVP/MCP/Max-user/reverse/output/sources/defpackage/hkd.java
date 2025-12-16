package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class hkd implements Executor {
    public final /* synthetic */ Executor a;
    public final /* synthetic */ zb8 b;

    public hkd(ExecutorService executorService, zb8 zb8Var) {
        this.a = executorService;
        this.b = zb8Var;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
    }
}
