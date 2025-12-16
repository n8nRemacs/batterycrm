package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.externalcallback.ExternalCallbackWidget;

/* loaded from: classes.dex */
public final class ro5 extends dtf implements sm6 {
    public final /* synthetic */ ExternalCallbackWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ro5(Continuation continuation, ExternalCallbackWidget externalCallbackWidget) {
        super(2, continuation);
        this.X = externalCallbackWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ro5 ro5Var = (ro5) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ro5Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ro5 ro5Var = new ro5(continuation, this.X);
        ro5Var.o = obj;
        return ro5Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean z = cdaVar instanceof ei4;
        ExternalCallbackWidget externalCallbackWidget = this.X;
        if (z) {
            ul8.c.s0((ei4) cdaVar);
        } else if (cdaVar instanceof mo5) {
            ccb ccbVar = new ccb(externalCallbackWidget);
            ccbVar.g(((mo5) cdaVar).b);
            ccbVar.i();
        }
        externalCallbackWidget.E0(false);
        return qqg.a;
    }
}
