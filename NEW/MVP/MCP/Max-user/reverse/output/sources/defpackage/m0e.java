package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class m0e extends kj5 {
    public e84 a;

    @Override // defpackage.z74
    /* renamed from: dispatch */
    public final void mo13dispatch(x74 x74Var, Runnable runnable) {
        e84.y(this.a, runnable, 6);
    }

    @Override // defpackage.z74
    public final void dispatchYield(x74 x74Var, Runnable runnable) {
        e84.y(this.a, runnable, 2);
    }

    @Override // defpackage.kj5
    public final Executor w() {
        return this.a;
    }
}
