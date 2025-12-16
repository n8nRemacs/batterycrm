package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.complaintbottomsheet.ComplaintBottomSheet;

/* loaded from: classes2.dex */
public final class vj3 extends dtf implements sm6 {
    public final /* synthetic */ ComplaintBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vj3(Continuation continuation, ComplaintBottomSheet complaintBottomSheet) {
        super(2, continuation);
        this.X = complaintBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vj3 vj3Var = (vj3) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vj3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vj3 vj3Var = new vj3(continuation, this.X);
        vj3Var.o = obj;
        return vj3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (!fni.a((yj3) this.o, yj3.a)) {
            throw new NoWhenBranchMatchedException();
        }
        ((ccb) this.X.o.getValue()).i();
        return qqg.a;
    }
}
