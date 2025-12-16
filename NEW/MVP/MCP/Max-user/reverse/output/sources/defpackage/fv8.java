package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fv8 extends dtf implements sm6 {
    public final /* synthetic */ ice X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fv8(Continuation continuation, ice iceVar) {
        super(2, continuation);
        this.X = iceVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fv8 fv8Var = (fv8) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fv8Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fv8 fv8Var = new fv8(continuation, this.X);
        fv8Var.o = obj;
        return fv8Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.E((List) this.o);
        return qqg.a;
    }
}
