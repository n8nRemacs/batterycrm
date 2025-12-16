package defpackage;

import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class aic extends dtf implements sm6 {
    public final /* synthetic */ ProfileInviteScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aic(Continuation continuation, ProfileInviteScreen profileInviteScreen) {
        super(2, continuation);
        this.X = profileInviteScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        aic aicVar = (aic) l((xhc) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        aicVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        aic aicVar = new aic(continuation, this.X);
        aicVar.o = obj;
        return aicVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        xhc xhcVar = (xhc) this.o;
        boolean z = xhcVar instanceof whc;
        qqg qqgVar = qqg.a;
        ProfileInviteScreen profileInviteScreen = this.X;
        if (z) {
            whc whcVar = (whc) xhcVar;
            CharSequence charSequenceB = whcVar.a.b(profileInviteScreen.getContext());
            if (charSequenceB != null) {
                ccb ccbVar = new ccb(profileInviteScreen);
                ccbVar.e(new qcb(whcVar.b));
                ccbVar.h(charSequenceB);
                ccbVar.i();
                return qqgVar;
            }
        } else {
            if (xhcVar instanceof thc) {
                xb3.a(profileInviteScreen.getContext(), ((thc) xhcVar).a);
                return qqgVar;
            }
            if (xhcVar instanceof vhc) {
                h6j.a(1).o(((vhc) xhcVar).a).B((ImageView) profileInviteScreen.o.D(profileInviteScreen, ProfileInviteScreen.X[0])).build().u(profileInviteScreen);
                return qqgVar;
            }
            if (!(xhcVar instanceof uhc)) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr = BottomSheetWidget.B0;
            uhc uhcVar = (uhc) xhcVar;
            oq3 oq3VarA = j5j.a(uhcVar.a, null, null, 6);
            oq3VarA.f(uhcVar.b);
            uhcVar.c.forEach(new m4(16, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 11)));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            confirmationBottomSheetE.setTargetController(profileInviteScreen);
            c54 parentController = profileInviteScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(profileInviteScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        }
        return qqgVar;
    }
}
