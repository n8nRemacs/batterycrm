package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;

/* loaded from: classes.dex */
public final class xo3 extends dtf implements sm6 {
    public final /* synthetic */ ConfirmAddOpponentToCallBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo3(Continuation continuation, ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet) {
        super(2, continuation);
        this.X = confirmAddOpponentToCallBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xo3 xo3Var = (xo3) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xo3Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xo3 xo3Var = new xo3(continuation, this.X);
        xo3Var.o = obj;
        return xo3Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof ei4) {
            ug1.c.s0((ei4) cdaVar);
            this.X.E0(true);
        }
        return qqg.a;
    }
}
