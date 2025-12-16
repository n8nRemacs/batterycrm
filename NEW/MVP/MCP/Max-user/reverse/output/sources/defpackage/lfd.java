package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class lfd extends dtf implements sm6 {
    public final /* synthetic */ RecordControlsWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lfd(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.X = recordControlsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lfd lfdVar = (lfd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lfdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lfd lfdVar = new lfd(continuation, this.X);
        lfdVar.o = obj;
        return lfdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        String str = (String) this.o;
        RecordControlsWidget recordControlsWidget = this.X;
        rkh rkhVar = recordControlsWidget.D0;
        if (rkhVar != null) {
            rkhVar.setDurationText(str);
        }
        recordControlsWidget.I0().setText(str);
        return qqg.a;
    }
}
