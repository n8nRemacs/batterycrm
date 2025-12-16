package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class s56 extends dtf implements sm6 {
    public /* synthetic */ int o;

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((s56) l(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        s56 s56Var = new s56(2, continuation);
        s56Var.o = ((Number) obj).intValue();
        return s56Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        return Boolean.valueOf(this.o > 0);
    }
}
