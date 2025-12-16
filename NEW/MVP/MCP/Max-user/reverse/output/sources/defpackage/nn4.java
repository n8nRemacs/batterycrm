package defpackage;

import java.util.concurrent.Executor;
import kotlinx.coroutines.internal.SystemPropsKt;
import kotlinx.coroutines.internal.SystemPropsKt__SystemProps_commonKt;

/* loaded from: classes.dex */
public final class nn4 extends kj5 implements Executor {
    public static final nn4 a = new nn4();
    public static final z74 b;

    static {
        qrg qrgVar = qrg.a;
        int available_processors = SystemPropsKt.getAVAILABLE_PROCESSORS();
        b = z74.limitedParallelism$default(qrgVar, SystemPropsKt__SystemProps_commonKt.systemProp$default("kotlinx.coroutines.io.parallelism", 64 < available_processors ? available_processors : 64, 0, 0, 12, (Object) null), null, 2, null);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // defpackage.z74
    /* renamed from: dispatch */
    public final void mo13dispatch(x74 x74Var, Runnable runnable) {
        b.mo13dispatch(x74Var, runnable);
    }

    @Override // defpackage.z74
    public final void dispatchYield(x74 x74Var, Runnable runnable) {
        b.dispatchYield(x74Var, runnable);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        mo13dispatch(bd5.a, runnable);
    }

    @Override // defpackage.z74
    public final z74 limitedParallelism(int i, String str) {
        return qrg.a.limitedParallelism(i, str);
    }

    @Override // defpackage.z74
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.kj5
    public final Executor w() {
        return this;
    }
}
