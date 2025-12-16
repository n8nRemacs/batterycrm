package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallBottomPanelWidget;

/* loaded from: classes.dex */
public final class x31 extends dtf implements sm6 {
    public final /* synthetic */ CallBottomPanelWidget X;
    public final /* synthetic */ k31 Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x31(CallBottomPanelWidget callBottomPanelWidget, k31 k31Var, Continuation continuation) {
        super(2, continuation);
        this.X = callBottomPanelWidget;
        this.Y = k31Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        x31 x31Var = (x31) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        x31Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        x31 x31Var = new x31(this.X, this.Y, continuation);
        x31Var.o = obj;
        return x31Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        yy7[] yy7VarArr = CallBottomPanelWidget.Z;
        gw0.w(new g56(this.X.z0().u0, new zr0(2, this.Y, k31.class, "setVolumeMicrophone", "setVolumeMicrophone(F)V", 4, 3), 1), f84Var);
        return qqg.a;
    }
}
