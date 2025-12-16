package defpackage;

import java.util.Set;
import kotlin.coroutines.Continuation;
import one.me.calls.share.CallSharePickerScreen;

/* loaded from: classes.dex */
public final class fq1 extends dtf implements sm6 {
    public final /* synthetic */ CallSharePickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fq1(Continuation continuation, CallSharePickerScreen callSharePickerScreen) {
        super(2, continuation);
        this.X = callSharePickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fq1 fq1Var = (fq1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fq1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fq1 fq1Var = new fq1(continuation, this.X);
        fq1Var.o = obj;
        return fq1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (!((Set) this.o).isEmpty()) {
            eo7 eo7Var = CallSharePickerScreen.y0;
            ((dq1) this.X.I0().c).f();
        }
        return qqg.a;
    }
}
