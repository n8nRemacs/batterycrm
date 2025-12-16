package defpackage;

import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.twofa.creation.TwoFACreationScreen;

/* loaded from: classes2.dex */
public final class nlg extends dtf implements sm6 {
    public final /* synthetic */ TwoFACreationScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nlg(Continuation continuation, TwoFACreationScreen twoFACreationScreen) {
        super(2, continuation);
        this.X = twoFACreationScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        nlg nlgVar = (nlg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        nlgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        nlg nlgVar = new nlg(continuation, this.X);
        nlgVar.o = obj;
        return nlgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        nmg nmgVar = (nmg) this.o;
        yy7[] yy7VarArr = TwoFACreationScreen.w0;
        boolean z = nmgVar instanceof kmg;
        TwoFACreationScreen twoFACreationScreen = this.X;
        if (z) {
            yy7[] yy7VarArr2 = BottomSheetWidget.B0;
            kmg kmgVar = (kmg) nmgVar;
            oq3 oq3VarA = j5j.a(kmgVar.a, null, kmgVar.d, 2);
            oq3VarA.f(kmgVar.b);
            kmgVar.c.forEach(new m4(25, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 16)));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            confirmationBottomSheetE.setTargetController(twoFACreationScreen);
            c54 parentController = twoFACreationScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(twoFACreationScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else if (nmgVar instanceof lmg) {
            ccb ccbVar = new ccb(twoFACreationScreen);
            lmg lmgVar = (lmg) nmgVar;
            ccbVar.e(new qcb(lmgVar.b));
            ccbVar.g(lmgVar.a);
            if (twoFACreationScreen.z0() != ilg.b && lmgVar.c) {
                ViewGroup.LayoutParams layoutParams = twoFACreationScreen.y0().getLayoutParams();
                ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
                ccbVar.c(new kcb(0, 0, twoFACreationScreen.y0().getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0), 3));
                twoFACreationScreen.y0().setProgressEnabled(false);
            }
            ccbVar.i();
        } else if (nmgVar instanceof mmg) {
            twoFACreationScreen.y0().setProgressEnabled(((mmg) nmgVar).a);
        } else {
            if (!(nmgVar instanceof jmg)) {
                throw new NoWhenBranchMatchedException();
            }
            jmg jmgVar = (jmg) nmgVar;
            twoFACreationScreen.A0().d(jmgVar.a);
            twoFACreationScreen.A0().c(jmgVar.b);
        }
        return qqg.a;
    }
}
