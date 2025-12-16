package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;

/* loaded from: classes.dex */
public final class ki1 extends dtf implements sm6 {
    public final /* synthetic */ CallOpponentsListWidget X;
    public final /* synthetic */ zi1 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ki1(CallOpponentsListWidget callOpponentsListWidget, zi1 zi1Var, Continuation continuation) {
        super(2, continuation);
        this.X = callOpponentsListWidget;
        this.Y = zi1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ki1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ki1(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        yy7[] yy7VarArr = CallOpponentsListWidget.H0;
        ci1 ci1VarE0 = this.X.E0();
        this.o = 1;
        Object objI = svi.i(((q2b) ci1VarE0.o).b(), new zh1(ci1VarE0, this.Y, null), this);
        g84 g84Var = g84.a;
        if (objI != g84Var) {
            objI = qqgVar;
        }
        return objI == g84Var ? g84Var : qqgVar;
    }
}
