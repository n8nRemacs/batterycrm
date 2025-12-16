package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.twofa.restore.TwoFAStartRestoreScreen;

/* loaded from: classes2.dex */
public final class wng extends dtf implements sm6 {
    public final /* synthetic */ TwoFAStartRestoreScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wng(Continuation continuation, TwoFAStartRestoreScreen twoFAStartRestoreScreen) {
        super(2, continuation);
        this.X = twoFAStartRestoreScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wng wngVar = (wng) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wngVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wng wngVar = new wng(continuation, this.X);
        wngVar.o = obj;
        return wngVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        nmg nmgVar = (nmg) this.o;
        TwoFAStartRestoreScreen twoFAStartRestoreScreen = this.X;
        bbd bbdVar = twoFAStartRestoreScreen.X;
        yy7[] yy7VarArr = TwoFAStartRestoreScreen.s0;
        if (nmgVar instanceof kmg) {
            yy7[] yy7VarArr2 = BottomSheetWidget.B0;
            kmg kmgVar = (kmg) nmgVar;
            oq3 oq3VarA = j5j.a(kmgVar.a, null, kmgVar.d, 2);
            oq3VarA.f(kmgVar.b);
            kmgVar.c.forEach(new m4(27, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 18)));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            confirmationBottomSheetE.setTargetController(twoFAStartRestoreScreen);
            c54 parentController = twoFAStartRestoreScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(twoFAStartRestoreScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else if (nmgVar instanceof lmg) {
            ccb ccbVar = new ccb(twoFAStartRestoreScreen);
            lmg lmgVar = (lmg) nmgVar;
            ccbVar.e(new qcb(lmgVar.b));
            ccbVar.g(lmgVar.a);
            ccbVar.i();
        } else if (!(nmgVar instanceof mmg)) {
            if (!(nmgVar instanceof jmg)) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr3 = TwoFAStartRestoreScreen.s0;
            jmg jmgVar = (jmg) nmgVar;
            ((pog) bbdVar.D(twoFAStartRestoreScreen, yy7VarArr3[0])).d(jmgVar.a);
            ((pog) bbdVar.D(twoFAStartRestoreScreen, yy7VarArr3[0])).c(jmgVar.b);
        }
        return qqg.a;
    }
}
