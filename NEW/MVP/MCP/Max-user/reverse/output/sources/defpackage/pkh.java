package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class pkh extends dtf implements um6 {
    public /* synthetic */ rkh X;
    public final /* synthetic */ int o = 0;

    public /* synthetic */ pkh(int i, Continuation continuation) {
        super(i, continuation);
    }

    @Override // defpackage.um6
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.o) {
            case 0:
                pkh pkhVar = new pkh(3, (Continuation) obj3);
                pkhVar.X = (rkh) obj;
                qqg qqgVar = qqg.a;
                pkhVar.n(qqgVar);
                return qqgVar;
            default:
                pkh pkhVar2 = new pkh(this.X, (Continuation) obj3);
                qqg qqgVar2 = qqg.a;
                pkhVar2.n(qqgVar2);
                return qqgVar2;
        }
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        red redVar = null;
        switch (i) {
            case 0:
                g8j.b(obj);
                rkh rkhVar = this.X;
                qkh qkhVar = rkhVar.c;
                if (qkhVar != null) {
                    RecordControlsWidget recordControlsWidget = (RecordControlsWidget) ((hfd) qkhVar).b;
                    yy7[] yy7VarArr = RecordControlsWidget.g1;
                    redVar = (red) recordControlsWidget.S0().x0.a.getValue();
                }
                rkhVar.setBackgroundColor(redVar instanceof ned);
                break;
            default:
                g8j.b(obj);
                rkh rkhVar2 = this.X;
                qkh qkhVar2 = rkhVar2.c;
                if (qkhVar2 != null) {
                    RecordControlsWidget recordControlsWidget2 = (RecordControlsWidget) ((hfd) qkhVar2).b;
                    yy7[] yy7VarArr2 = RecordControlsWidget.g1;
                    redVar = (red) recordControlsWidget2.S0().x0.a.getValue();
                }
                rkhVar2.setDurationColor(redVar instanceof ned);
                break;
        }
        return qqgVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pkh(rkh rkhVar, Continuation continuation) {
        super(3, continuation);
        this.X = rkhVar;
    }
}
