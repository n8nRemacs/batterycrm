package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class ks3 {
    public final tcf a;

    public ks3(lzf lzfVar, oje ojeVar) {
        ContextScope contextScopeA = d7j.a(((q2b) lzfVar).a().limitedParallelism(1, "conn-events"));
        tcf tcfVarA = ucf.a(Integer.valueOf(ojeVar.k));
        this.a = tcfVarA;
        gw0.w(new g56(s8j.a(ojeVar.g), new rw(2, tcfVarA, f9a.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 16), 1), contextScopeA);
    }
}
