package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.twofa.configuration.TwoFASettingsScreen;

/* loaded from: classes2.dex */
public final class kng extends dtf implements sm6 {
    public final /* synthetic */ TwoFASettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kng(Continuation continuation, TwoFASettingsScreen twoFASettingsScreen) {
        super(2, continuation);
        this.X = twoFASettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kng kngVar = (kng) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kngVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kng kngVar = new kng(continuation, this.X);
        kngVar.o = obj;
        return kngVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        clg clgVar = (clg) this.o;
        int i = TwoFASettingsScreen.X;
        boolean z = clgVar instanceof alg;
        TwoFASettingsScreen twoFASettingsScreen = this.X;
        if (z) {
            ccb ccbVar = new ccb(twoFASettingsScreen);
            alg algVar = (alg) clgVar;
            ccbVar.g(algVar.a);
            ccbVar.e(new qcb(algVar.b));
            ccbVar.i();
        } else {
            if (!(clgVar instanceof blg)) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr = BottomSheetWidget.B0;
            blg blgVar = (blg) clgVar;
            oq3 oq3VarA = j5j.a(blgVar.a, null, f1e.SETTINGS_2FA_PASSWORD_DROP, 2);
            oq3VarA.f(blgVar.b);
            blgVar.c.forEach(new m4(26, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 17)));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            confirmationBottomSheetE.setTargetController(twoFASettingsScreen);
            c54 parentController = twoFASettingsScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(twoFASettingsScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        }
        return qqg.a;
    }
}
