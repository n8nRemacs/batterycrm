package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.ui.call.panels.CallTopPanelWidget;

/* loaded from: classes.dex */
public final class zr1 extends dtf implements sm6 {
    public final /* synthetic */ CallTopPanelWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zr1(Continuation continuation, CallTopPanelWidget callTopPanelWidget) {
        super(2, continuation);
        this.X = callTopPanelWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zr1 zr1Var = (zr1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zr1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zr1 zr1Var = new zr1(continuation, this.X);
        zr1Var.o = obj;
        return zr1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        scg scgVar = (scg) this.o;
        yy7[] yy7VarArr = CallTopPanelWidget.d;
        ur1 ur1VarY0 = this.X.y0();
        ur1VarY0.x(scgVar.c, scgVar.f);
        ur1VarY0.setButtonsVisibility(new sr1(scgVar.d, scgVar.e));
        boolean z = scgVar.b;
        hqi.g(ur1VarY0.K0, z, 0L, null, 6);
        hqi.g(ur1VarY0.L0, z, 0L, null, 6);
        return qqg.a;
    }
}
