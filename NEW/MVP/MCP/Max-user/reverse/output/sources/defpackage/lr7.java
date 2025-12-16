package defpackage;

import android.view.View;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class lr7 extends dtf implements sm6 {
    public final /* synthetic */ InviteByPhoneScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lr7(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.X = inviteByPhoneScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lr7 lr7Var = (lr7) l((dr7) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lr7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lr7 lr7Var = new lr7(continuation, this.X);
        lr7Var.o = obj;
        return lr7Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17, types: [c54] */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v32 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [c54] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ytd ytdVarE0;
        Integer numN;
        g8j.b(obj);
        dr7 dr7Var = (dr7) this.o;
        yy7[] yy7VarArr = InviteByPhoneScreen.z0;
        InviteByPhoneScreen inviteByPhoneScreen = this.X;
        OneMeButton oneMeButtonZ0 = inviteByPhoneScreen.z0();
        oneMeButtonZ0.setProgressEnabled(false);
        oneMeButtonZ0.setClickable(true);
        if (dr7Var instanceof zq7) {
            InviteByPhoneScreen.y0(inviteByPhoneScreen, ((zq7) dr7Var).a.b(inviteByPhoneScreen.getContext()));
        } else if (dr7Var instanceof ar7) {
            ar7 ar7Var = (ar7) dr7Var;
            n5g n5gVar = ar7Var.a;
            n5g n5gVar2 = ar7Var.b;
            inviteByPhoneScreen.a.getClass();
            CharSequence charSequenceB = n5gVar.b(inviteByPhoneScreen.getContext());
            if (charSequenceB != null) {
                CharSequence charSequenceB2 = n5gVar2.b(inviteByPhoneScreen.getContext());
                ccb ccbVar = new ccb(inviteByPhoneScreen);
                ccbVar.h(charSequenceB);
                ccbVar.b(charSequenceB2);
                View view = inviteByPhoneScreen.getView();
                ccbVar.c(new kcb(1, (view == null || (numN = dqi.n(view)) == null) ? 0 : numN.intValue(), 0, 4));
                ccbVar.i();
            }
        } else {
            if (dr7Var instanceof br7) {
                yy7[] yy7VarArr2 = BottomSheetWidget.B0;
                oq3 oq3VarE = az1.e(u5b.c, null, null, 6);
                oq3VarE.f(new n5g(u5b.b));
                oq3VarE.d(s5b.b, new n5g(avd.w0));
                oq3VarE.d(s5b.a, new n5g(u5b.a));
                ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
                confirmationBottomSheetE.setTargetController(inviteByPhoneScreen);
                ?? parentController = inviteByPhoneScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                confirmationBottomSheetE.N0(inviteByPhoneScreen);
                if (ytdVarE0 != null) {
                    bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                    az1.u(false, budVar, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar);
                }
            } else if (dr7Var instanceof cr7) {
                yy7[] yy7VarArr3 = BottomSheetWidget.B0;
                oq3 oq3VarE2 = az1.e(v9b.c, null, null, 6);
                oq3VarE2.f(new n5g(v9b.b));
                oq3VarE2.d(u9b.d, new n5g(v9b.a));
                ConfirmationBottomSheet confirmationBottomSheetE2 = oq3VarE2.e();
                confirmationBottomSheetE2.setTargetController(inviteByPhoneScreen);
                ?? parentController2 = inviteByPhoneScreen;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                eud eudVar2 = parentController2 instanceof eud ? (eud) parentController2 : null;
                ytdVarE0 = eudVar2 != null ? ((RootController) eudVar2).E0() : null;
                confirmationBottomSheetE2.N0(inviteByPhoneScreen);
                if (ytdVarE0 != null) {
                    bud budVar2 = new bud(confirmationBottomSheetE2, null, null, null, false, -1);
                    az1.u(false, budVar2, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar2);
                }
            } else {
                if (dr7Var != null) {
                    throw new NoWhenBranchMatchedException();
                }
                InviteByPhoneScreen.y0(inviteByPhoneScreen, null);
            }
        }
        return qqg.a;
    }
}
