package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class qfd extends dtf implements sm6 {
    public final /* synthetic */ rkh X;
    public final /* synthetic */ RecordControlsWidget Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qfd(Continuation continuation, rkh rkhVar, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.X = rkhVar;
        this.Y = recordControlsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qfd qfdVar = (qfd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qfdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qfd qfdVar = new qfd(continuation, this.X, this.Y);
        qfdVar.o = obj;
        return qfdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        fa8 fa8Var = (fa8) this.o;
        yy7[] yy7VarArr = RecordControlsWidget.g1;
        this.X.d((Long) this.Y.S0().y0.a.getValue(), fa8Var);
        return qqg.a;
    }
}
