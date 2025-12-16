package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class w38 extends dtf implements sm6 {
    public final /* synthetic */ x38 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w38(x38 x38Var, Continuation continuation) {
        super(2, continuation);
        this.X = x38Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        w38 w38Var = (w38) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        w38Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        w38 w38Var = new w38(this.X, continuation);
        w38Var.o = obj;
        return w38Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        x38 x38Var = this.X;
        l48 l48Var = x38Var.a;
        if (l48Var.d.compareTo(l38.b) >= 0) {
            l48Var.a(x38Var);
        } else {
            eoi.b(f84Var.getCoroutineContext());
        }
        return qqg.a;
    }
}
