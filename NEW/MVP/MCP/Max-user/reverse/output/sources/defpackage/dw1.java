package defpackage;

import android.app.Application;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class dw1 extends dtf implements sm6 {
    public final /* synthetic */ hw1 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dw1(hw1 hw1Var, Continuation continuation) {
        super(2, continuation);
        this.X = hw1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dw1 dw1Var = (dw1) l((n41) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dw1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dw1 dw1Var = new dw1(this.X, continuation);
        dw1Var.o = obj;
        return dw1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        wqi.c("CallEngineTag", "Chat info was changed chat=" + ((n41) this.o) + ", restart service.", new Object[0]);
        hw1 hw1Var = this.X;
        zo1 zo1Var = (zo1) hw1Var.D0.getValue();
        Application application = (Application) hw1Var.d.getValue();
        zo1Var.getClass();
        zo1.d(application);
        return qqg.a;
    }
}
