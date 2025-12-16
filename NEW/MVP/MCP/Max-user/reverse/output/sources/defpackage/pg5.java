package defpackage;

import kotlin.coroutines.Continuation;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* loaded from: classes2.dex */
public final class pg5 extends dtf implements sm6 {
    public final /* synthetic */ EnterPinCodeScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pg5(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.X = enterPinCodeScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        pg5 pg5Var = (pg5) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        pg5Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        pg5 pg5Var = new pg5(continuation, this.X);
        pg5Var.o = obj;
        return pg5Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        jva onBackPressedDispatcher = this.X.getOnBackPressedDispatcher();
        if (onBackPressedDispatcher != null) {
            onBackPressedDispatcher.d();
        }
        return qqg.a;
    }
}
