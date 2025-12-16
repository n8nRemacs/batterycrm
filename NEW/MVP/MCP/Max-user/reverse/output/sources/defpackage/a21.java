package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.calls.ui.bottomsheet.exit.RecordExitBottomSheet;
import one.me.calls.ui.ui.settings.CallAdminSettingsScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;

/* loaded from: classes.dex */
public final class a21 extends dtf implements sm6 {
    public final /* synthetic */ CallAdminSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a21(Continuation continuation, CallAdminSettingsScreen callAdminSettingsScreen) {
        super(2, continuation);
        this.X = callAdminSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        a21 a21Var = (a21) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        a21Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        a21 a21Var = new a21(continuation, this.X);
        a21Var.o = obj;
        return a21Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean z = cdaVar instanceof xm1;
        CallAdminSettingsScreen callAdminSettingsScreen = this.X;
        if (z) {
            yy7[] yy7VarArr = BottomSheetWidget.B0;
            RecordExitBottomSheet recordExitBottomSheet = new RecordExitBottomSheet(bgd.b, Boolean.FALSE);
            recordExitBottomSheet.setTargetController(callAdminSettingsScreen);
            c54 parentController = callAdminSettingsScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            recordExitBottomSheet.N0(callAdminSettingsScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(recordExitBottomSheet, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else if (cdaVar instanceof cn1) {
            yy7[] yy7VarArr2 = CallAdminSettingsScreen.s0;
            ((vye) callAdminSettingsScreen.X.getValue()).getClass();
            vye.b(km1.a, new wg5((cn1) cdaVar, callAdminSettingsScreen, 0, 1));
        }
        return qqg.a;
    }
}
