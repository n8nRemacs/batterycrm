package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.messagewrite.recordcontrols.RecordControlsWidget;

/* loaded from: classes2.dex */
public final class mfd extends dtf implements sm6 {
    public final /* synthetic */ RecordControlsWidget X;
    public final /* synthetic */ View Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mfd(Continuation continuation, RecordControlsWidget recordControlsWidget, View view) {
        super(2, continuation);
        this.X = recordControlsWidget;
        this.Y = view;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        mfd mfdVar = (mfd) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mfdVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mfd mfdVar = new mfd(continuation, this.X, this.Y);
        mfdVar.o = obj;
        return mfdVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        RecordControlsWidget recordControlsWidget = this.X;
        k18 k18Var = recordControlsWidget.d;
        g8j.b(obj);
        med medVar = (med) this.o;
        if (fni.a(medVar, ked.a)) {
            yy7[] yy7VarArr = RecordControlsWidget.g1;
            if (!((qsb) k18Var.getValue()).c(qsb.h)) {
                ((qsb) k18Var.getValue()).i(new s2i(recordControlsWidget, 1), pab.c);
            }
            if (!((qsb) k18Var.getValue()).c(qsb.m)) {
                ((qsb) k18Var.getValue()).m(new s2i(recordControlsWidget, 1));
            }
        } else if (fni.a(medVar, led.a)) {
            yy7[] yy7VarArr2 = RecordControlsWidget.g1;
            yy7[] yy7VarArr3 = BottomSheetWidget.B0;
            oq3 oq3VarE = az1.e(nab.d, null, null, 6);
            oq3VarE.f(new n5g(nab.c));
            oq3VarE.a(new pq3(1, new n5g(nab.b), 3, 56));
            oq3VarE.a(new pq3(2, new n5g(mvd.q), 2, 56));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
            confirmationBottomSheetE.setTargetController(recordControlsWidget);
            c54 parentController = recordControlsWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(recordControlsWidget);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else {
            if (!fni.a(medVar, jed.a)) {
                throw new NoWhenBranchMatchedException();
            }
            uog.i(this.Y, q07.REJECT);
        }
        return qqg.a;
    }
}
