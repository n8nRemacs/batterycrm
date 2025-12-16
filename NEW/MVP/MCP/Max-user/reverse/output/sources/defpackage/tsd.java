package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class tsd implements f84 {
    public final /* synthetic */ ContextScope a;

    public tsd(a84 a84Var) {
        this.a = d7j.a(zk6.a().plus(a84Var));
    }

    @Override // defpackage.f84
    public final x74 getCoroutineContext() {
        return this.a.getCoroutineContext();
    }
}
