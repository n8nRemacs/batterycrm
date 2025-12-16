package defpackage;

import android.os.Bundle;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.webapp.rootscreen.WebAppRootScreen;

/* loaded from: classes2.dex */
public final class wth extends dtf implements sm6 {
    public final /* synthetic */ WebAppRootScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wth(Continuation continuation, WebAppRootScreen webAppRootScreen) {
        super(2, continuation);
        this.X = webAppRootScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wth wthVar = (wth) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wthVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wth wthVar = new wth(continuation, this.X);
        wthVar.o = obj;
        return wthVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15, types: [c54] */
    /* JADX WARN: Type inference failed for: r1v26 */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [c54] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ytd ytdVarE0;
        g8j.b(obj);
        vlh vlhVar = (vlh) this.o;
        boolean z = vlhVar instanceof rlh;
        WebAppRootScreen webAppRootScreen = this.X;
        if (z) {
            goh gohVar = webAppRootScreen.E0;
            if (gohVar != null) {
                rlh rlhVar = (rlh) vlhVar;
                gohVar.b(rlhVar.c, rlhVar.a, rlhVar.b);
            }
        } else {
            yy7[] yy7VarArr = WebAppRootScreen.R0;
            if (fni.a(vlhVar, slh.a)) {
                qsh qshVar = qsh.c;
                hs hsVar = webAppRootScreen.x0;
                yy7 yy7Var = WebAppRootScreen.R0[1];
                long jLongValue = ((Number) hsVar.a(webAppRootScreen)).longValue();
                qshVar.p0().d();
                qshVar.p0().b(":settings/webapp?bot_id=" + jLongValue, null);
            } else if (vlhVar instanceof tlh) {
                Bundle bundleE = ho7.e(4, "dialog_id");
                yy7[] yy7VarArr2 = BottomSheetWidget.B0;
                tlh tlhVar = (tlh) vlhVar;
                oq3 oq3VarA = j5j.a(tlhVar.a, bundleE, null, 4);
                oq3VarA.f(tlhVar.b);
                oq3VarA.g(Integer.valueOf(yud.B));
                tlhVar.c.forEach(new m4(28, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 19)));
                ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
                confirmationBottomSheetE.setTargetController(webAppRootScreen);
                ?? parentController = webAppRootScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                confirmationBottomSheetE.N0(webAppRootScreen);
                if (ytdVarE0 != null) {
                    bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                    az1.u(false, budVar, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar);
                }
            } else {
                if (!(vlhVar instanceof ulh)) {
                    throw new NoWhenBranchMatchedException();
                }
                Bundle bundleE2 = ho7.e(5, "dialog_id");
                yy7[] yy7VarArr3 = BottomSheetWidget.B0;
                ulh ulhVar = (ulh) vlhVar;
                oq3 oq3VarA2 = j5j.a(ulhVar.a, bundleE2, null, 4);
                ulhVar.b.forEach(new m4(29, new fr2(1, oq3VarA2, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 20)));
                ConfirmationBottomSheet confirmationBottomSheetE2 = oq3VarA2.e();
                confirmationBottomSheetE2.setTargetController(webAppRootScreen);
                ?? parentController2 = webAppRootScreen;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                eud eudVar2 = parentController2 instanceof eud ? (eud) parentController2 : null;
                ytdVarE0 = eudVar2 != null ? ((RootController) eudVar2).E0() : null;
                confirmationBottomSheetE2.N0(webAppRootScreen);
                if (ytdVarE0 != null) {
                    bud budVar2 = new bud(confirmationBottomSheetE2, null, null, null, false, -1);
                    az1.u(false, budVar2, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar2);
                }
            }
        }
        return qqg.a;
    }
}
