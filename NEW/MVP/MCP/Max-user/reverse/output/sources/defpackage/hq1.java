package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.calls.share.CallSharePickerScreen;
import one.me.sdk.bottomsheet.BaseBottomSheetWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes.dex */
public final class hq1 extends dtf implements sm6 {
    public final /* synthetic */ CallSharePickerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hq1(Continuation continuation, CallSharePickerScreen callSharePickerScreen) {
        super(2, continuation);
        this.X = callSharePickerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hq1 hq1Var = (hq1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hq1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hq1 hq1Var = new hq1(continuation, this.X);
        hq1Var.o = obj;
        return hq1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof jc3) {
            up1.c.p0().d();
        } else if (cdaVar instanceof eq1) {
            eo7 eo7Var = CallSharePickerScreen.y0;
            oq3 oq3VarE = az1.e(h0b.a, null, null, 4);
            oq3VarE.a.putParcelable("icon", new rq3(f0b.a, 2, 1));
            oq3VarE.a(new pq3(g0b.b, new n5g(h0b.c), 3, 32), new pq3(g0b.a, new n5g(h0b.b), 2, 32));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
            confirmationBottomSheetE.J0(true);
            hs hsVar = confirmationBottomSheetE.o;
            yy7 yy7Var = BaseBottomSheetWidget.t0[2];
            hsVar.b(confirmationBottomSheetE, Boolean.FALSE);
            CallSharePickerScreen callSharePickerScreen = this.X;
            callSharePickerScreen.x0 = confirmationBottomSheetE;
            yy7[] yy7VarArr = BottomSheetWidget.B0;
            confirmationBottomSheetE.setTargetController(callSharePickerScreen);
            c54 parentController = callSharePickerScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(callSharePickerScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else if (cdaVar instanceof ei4) {
            up1.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
