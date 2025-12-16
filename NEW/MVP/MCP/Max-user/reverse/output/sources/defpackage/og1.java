package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.more.CallMoreBottomSheet;

/* loaded from: classes.dex */
public final class og1 extends dtf implements sm6 {
    public final /* synthetic */ CallMoreBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og1(Continuation continuation, CallMoreBottomSheet callMoreBottomSheet) {
        super(2, continuation);
        this.X = callMoreBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        og1 og1Var = (og1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        og1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        og1 og1Var = new og1(continuation, this.X);
        og1Var.o = obj;
        return og1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (fni.a((cda) this.o, jm1.D)) {
            this.X.E0(true);
        }
        return qqg.a;
    }
}
