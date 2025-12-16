package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class ofd extends dtf implements sm6 {
    public final /* synthetic */ RecordControlsWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ofd(Continuation continuation, RecordControlsWidget recordControlsWidget) {
        super(2, continuation);
        this.X = recordControlsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ofd ofdVar = (ofd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ofdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ofd ofdVar = new ofd(continuation, this.X);
        ofdVar.o = obj;
        return ofdVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xdd xddVar = (xdd) this.o;
        boolean zA = fni.a(xddVar, udd.a);
        RecordControlsWidget recordControlsWidget = this.X;
        if (zA) {
            yy7[] yy7VarArr = RecordControlsWidget.g1;
            zed zedVarS0 = recordControlsWidget.S0();
            if (zedVarS0.w0.getValue() instanceof ped) {
                zedVarS0.J();
            }
            xfh.r(zedVarS0.B0, led.a);
        } else {
            boolean zA2 = fni.a(xddVar, wdd.a);
            tdd tddVar = tdd.a;
            if (zA2) {
                yy7[] yy7VarArr2 = RecordControlsWidget.g1;
                boolean z = (recordControlsWidget.S0().x0.a.getValue() == null || (recordControlsWidget.S0().x0.a.getValue() instanceof qed)) ? false : true;
                if (recordControlsWidget.R0() == tddVar && z) {
                    recordControlsWidget.S0().F();
                }
            } else {
                if (!fni.a(xddVar, vdd.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                yy7[] yy7VarArr3 = RecordControlsWidget.g1;
                if (recordControlsWidget.R0() == tddVar) {
                    zed zedVarS02 = recordControlsWidget.S0();
                    tcf tcfVar = zedVarS02.w0;
                    if ((tcfVar.getValue() instanceof ped) || (tcfVar.getValue() instanceof ned)) {
                        tcfVar.m(null, new oed(zedVarS02.E(), true));
                    }
                }
            }
        }
        return qqg.a;
    }
}
