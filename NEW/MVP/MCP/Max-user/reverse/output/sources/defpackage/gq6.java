package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gq6 extends dtf implements sm6 {
    public final /* synthetic */ tq6 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq6(tq6 tq6Var, Continuation continuation) {
        super(2, continuation);
        this.X = tq6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gq6 gq6Var = (gq6) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gq6Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gq6 gq6Var = new gq6(this.X, continuation);
        gq6Var.o = obj;
        return gq6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.t0.setValue((List) this.o);
        return qqg.a;
    }
}
