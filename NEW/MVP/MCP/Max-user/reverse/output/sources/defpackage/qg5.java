package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.settings.privacy.ui.ForgotPinCodeDialog;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;

/* loaded from: classes2.dex */
public final class qg5 extends dtf implements sm6 {
    public final /* synthetic */ EnterPinCodeScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qg5(Continuation continuation, EnterPinCodeScreen enterPinCodeScreen) {
        super(2, continuation);
        this.X = enterPinCodeScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qg5 qg5Var = (qg5) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qg5Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qg5 qg5Var = new qg5(continuation, this.X);
        qg5Var.o = obj;
        return qg5Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = BottomSheetWidget.B0;
        ForgotPinCodeDialog forgotPinCodeDialog = new ForgotPinCodeDialog();
        EnterPinCodeScreen enterPinCodeScreen = this.X;
        forgotPinCodeDialog.setTargetController(enterPinCodeScreen);
        c54 parentController = enterPinCodeScreen;
        while (parentController.getParentController() != null) {
            parentController = parentController.getParentController();
        }
        eud eudVar = parentController instanceof eud ? (eud) parentController : null;
        ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
        forgotPinCodeDialog.N0(enterPinCodeScreen);
        if (ytdVarE0 != null) {
            bud budVar = new bud(forgotPinCodeDialog, null, null, null, false, -1);
            az1.u(false, budVar, true, "forgot-pin");
            ytdVarE0.H(budVar);
        }
        return qqg.a;
    }
}
