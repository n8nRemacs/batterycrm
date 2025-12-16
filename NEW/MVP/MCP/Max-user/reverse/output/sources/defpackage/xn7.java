package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xn7 extends dtf implements sm6 {
    public final /* synthetic */ yn7 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xn7(yn7 yn7Var, Continuation continuation) {
        super(2, continuation);
        this.X = yn7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xn7 xn7Var = (xn7) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xn7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xn7 xn7Var = new xn7(this.X, continuation);
        xn7Var.o = obj;
        return xn7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        yn7 yn7Var = this.X;
        tcf tcfVar = yn7Var.x0;
        g8j.b(obj);
        List list = (List) this.o;
        x2b x2bVar = (x2b) ue3.I(list);
        if (x2bVar != null && fni.a(((x2b) tcfVar.getValue()).a, x2bVar.a)) {
            tcfVar.m(null, x2bVar);
        }
        yn7Var.y0.m(null, list);
        return qqg.a;
    }
}
