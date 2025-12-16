package defpackage;

import android.view.View;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class kfd extends dtf implements sm6 {
    public final /* synthetic */ RecordControlsWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kfd(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.X = recordControlsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kfd kfdVar = (kfd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kfdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kfd kfdVar = new kfd(continuation, this.X);
        kfdVar.o = obj;
        return kfdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        red redVar = (red) this.o;
        yy7[] yy7VarArr = RecordControlsWidget.g1;
        RecordControlsWidget recordControlsWidget = this.X;
        View viewP0 = recordControlsWidget.P0();
        vu2 vu2Var = new vu2(redVar, 5, recordControlsWidget);
        if (viewP0.isLaidOut()) {
            vu2Var.invoke();
        } else if (!viewP0.isLaidOut() || viewP0.isLayoutRequested()) {
            viewP0.addOnLayoutChangeListener(new es0(13, vu2Var));
        } else {
            vu2Var.invoke();
        }
        return qqg.a;
    }
}
