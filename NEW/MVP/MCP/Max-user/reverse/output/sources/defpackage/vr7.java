package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vr7 extends dtf implements sm6 {
    public final /* synthetic */ wr7 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr7(wr7 wr7Var, Continuation continuation) {
        super(2, continuation);
        this.X = wr7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vr7 vr7Var = (vr7) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vr7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vr7 vr7Var = new vr7(this.X, continuation);
        vr7Var.o = obj;
        return vr7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        wr7 wr7Var = this.X;
        tcf tcfVar = wr7Var.C0;
        g8j.b(obj);
        List list = (List) this.o;
        x2b x2bVar = (x2b) ue3.I(list);
        if (x2bVar != null && fni.a(((x2b) tcfVar.getValue()).a, x2bVar.a)) {
            tcfVar.m(null, x2bVar);
        }
        wr7Var.z0.m(null, list);
        return qqg.a;
    }
}
