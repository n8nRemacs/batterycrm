package defpackage;

import android.view.View;
import android.view.ViewGroup;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;
import one.me.settings.twofa.password.TwoFACheckPassScreen;

/* loaded from: classes2.dex */
public final class jkg extends dtf implements sm6 {
    public final /* synthetic */ TwoFACheckPassScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkg(Continuation continuation, TwoFACheckPassScreen twoFACheckPassScreen) {
        super(2, continuation);
        this.X = twoFACheckPassScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jkg jkgVar = (jkg) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jkgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jkg jkgVar = new jkg(continuation, this.X);
        jkgVar.o = obj;
        return jkgVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        nmg nmgVar = (nmg) this.o;
        TwoFACheckPassScreen twoFACheckPassScreen = this.X;
        bbd bbdVar = twoFACheckPassScreen.Z;
        bbd bbdVar2 = twoFACheckPassScreen.s0;
        yy7[] yy7VarArr = TwoFACheckPassScreen.t0;
        if (nmgVar instanceof kmg) {
            yy7[] yy7VarArr2 = BottomSheetWidget.B0;
            kmg kmgVar = (kmg) nmgVar;
            oq3 oq3VarA = j5j.a(kmgVar.a, null, kmgVar.d, 2);
            oq3VarA.f(kmgVar.b);
            kmgVar.c.forEach(new m4(24, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 15)));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            confirmationBottomSheetE.setTargetController(twoFACheckPassScreen);
            c54 parentController = twoFACheckPassScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(twoFACheckPassScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else if (nmgVar instanceof lmg) {
            ccb ccbVar = new ccb(twoFACheckPassScreen);
            lmg lmgVar = (lmg) nmgVar;
            ccbVar.e(new qcb(lmgVar.b));
            ccbVar.g(lmgVar.a);
            yy7[] yy7VarArr3 = TwoFACheckPassScreen.t0;
            ViewGroup.LayoutParams layoutParams = ((View) bbdVar2.D(twoFACheckPassScreen, yy7VarArr3[3])).getLayoutParams();
            ViewGroup.MarginLayoutParams marginLayoutParams = layoutParams instanceof ViewGroup.MarginLayoutParams ? (ViewGroup.MarginLayoutParams) layoutParams : null;
            ccbVar.c(new kcb(0, 0, ((View) bbdVar2.D(twoFACheckPassScreen, yy7VarArr3[3])).getMeasuredHeight() + (marginLayoutParams != null ? marginLayoutParams.bottomMargin : 0), 3));
            ccbVar.i();
            ((OneMeButton) bbdVar.D(twoFACheckPassScreen, yy7VarArr3[2])).setProgressEnabled(false);
        } else if (nmgVar instanceof mmg) {
            ((OneMeButton) bbdVar.D(twoFACheckPassScreen, TwoFACheckPassScreen.t0[2])).setProgressEnabled(((mmg) nmgVar).a);
        } else if (!(nmgVar instanceof jmg)) {
            throw new NoWhenBranchMatchedException();
        }
        return qqg.a;
    }
}
