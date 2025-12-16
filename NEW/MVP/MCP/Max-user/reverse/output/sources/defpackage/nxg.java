package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class nxg implements f84 {
    public final ContextScope a;

    public nxg(z74 z74Var, a84 a84Var) {
        this.a = d7j.a(zk6.a().plus(z74Var).plus(a84Var));
    }

    @Override // defpackage.f84
    public final x74 getCoroutineContext() {
        return this.a.getCoroutineContext();
    }
}
