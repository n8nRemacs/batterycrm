package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calllist.ui.callpresettings.CallPresettingsScreen;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes.dex */
public final class yj1 extends dtf implements sm6 {
    public final /* synthetic */ CallPresettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj1(Continuation continuation, CallPresettingsScreen callPresettingsScreen) {
        super(2, continuation);
        this.X = callPresettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yj1 yj1Var = (yj1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yj1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yj1 yj1Var = new yj1(continuation, this.X);
        yj1Var.o = obj;
        return yj1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ak1 ak1Var = (ak1) this.o;
        CallPresettingsScreen callPresettingsScreen = this.X;
        ((OneMeButton) callPresettingsScreen.Y.D(callPresettingsScreen, CallPresettingsScreen.Z[2])).setVisibility(ak1Var.a ? 0 : 8);
        return qqg.a;
    }
}
