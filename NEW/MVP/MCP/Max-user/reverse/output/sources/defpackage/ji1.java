package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.calls.ui.bottomsheet.opponent.ConfirmAddOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponent.ConfirmRemoveOpponentToCallBottomSheet;
import one.me.calls.ui.bottomsheet.opponents.CallOpponentsListWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* loaded from: classes.dex */
public final class ji1 extends dtf implements sm6 {
    public final /* synthetic */ CallOpponentsListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ji1(Continuation continuation, CallOpponentsListWidget callOpponentsListWidget) {
        super(2, continuation);
        this.X = callOpponentsListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ji1 ji1Var = (ji1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ji1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ji1 ji1Var = new ji1(continuation, this.X);
        ji1Var.o = obj;
        return ji1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v22 */
    /* JADX WARN: Type inference failed for: r15v23, types: [c54] */
    /* JADX WARN: Type inference failed for: r15v30 */
    /* JADX WARN: Type inference failed for: r15v31, types: [c54] */
    /* JADX WARN: Type inference failed for: r15v37 */
    /* JADX WARN: Type inference failed for: r15v38 */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ytd ytdVarE0;
        CallOpponentsListWidget callOpponentsListWidget = this.X;
        ?? r1 = callOpponentsListWidget.d;
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof en1) {
            en1 en1Var = (en1) cdaVar;
            yy7[] yy7VarArr = CallOpponentsListWidget.H0;
            int i = 1;
            int i2 = 0;
            if (en1Var instanceof om1) {
                yy7[] yy7VarArr2 = BottomSheetWidget.B0;
                ConfirmAddOpponentToCallBottomSheet confirmAddOpponentToCallBottomSheet = new ConfirmAddOpponentToCallBottomSheet();
                confirmAddOpponentToCallBottomSheet.setTargetController(callOpponentsListWidget);
                ?? parentController = callOpponentsListWidget;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                confirmAddOpponentToCallBottomSheet.N0(callOpponentsListWidget);
                if (ytdVarE0 != null) {
                    bud budVar = new bud(confirmAddOpponentToCallBottomSheet, null, null, null, false, -1);
                    az1.u(false, budVar, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar);
                }
            } else if (en1Var instanceof sm1) {
                yy7[] yy7VarArr3 = BottomSheetWidget.B0;
                ConfirmRemoveOpponentToCallBottomSheet confirmRemoveOpponentToCallBottomSheet = new ConfirmRemoveOpponentToCallBottomSheet(((sm1) en1Var).D);
                confirmRemoveOpponentToCallBottomSheet.setTargetController(callOpponentsListWidget);
                ?? parentController2 = callOpponentsListWidget;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                eud eudVar2 = parentController2 instanceof eud ? (eud) parentController2 : null;
                ytdVarE0 = eudVar2 != null ? ((RootController) eudVar2).E0() : null;
                confirmRemoveOpponentToCallBottomSheet.N0(callOpponentsListWidget);
                if (ytdVarE0 != null) {
                    bud budVar2 = new bud(confirmRemoveOpponentToCallBottomSheet, null, null, null, false, -1);
                    az1.u(false, budVar2, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar2);
                }
            } else if (en1Var instanceof hm1) {
                callOpponentsListWidget.getRouter().B(callOpponentsListWidget);
            } else if (en1Var instanceof ym1) {
                ug1.c.N0(((ym1) en1Var).D, callOpponentsListWidget.getContext().getString(m0b.a2), CallOpponentsListWidget.class.getName());
            } else if (en1Var instanceof lm1) {
                xb3.a(callOpponentsListWidget.getContext(), ((lm1) en1Var).D);
                if (xb3.b()) {
                    String string = callOpponentsListWidget.getContext().getString(d3d.call_link_share_dialog_share_link_copy);
                    ccb ccbVar = new ccb(callOpponentsListWidget);
                    ccbVar.h(string);
                    ccbVar.d(new ns1(4, null));
                    ccbVar.c(new kcb(0, 0, 0, 3));
                    ccbVar.i();
                }
            } else if (en1Var instanceof cn1) {
                ((vye) r1.getValue()).getClass();
                vye.b(km1.a, new wg5((cn1) en1Var, callOpponentsListWidget, i2, i));
            } else if (en1Var instanceof dn1) {
                ((vye) r1.getValue()).getClass();
                vye.b(km1.b, new wg5(callOpponentsListWidget, (dn1) en1Var, i2, 2));
            }
        } else if (cdaVar instanceof ei4) {
            ug1.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
