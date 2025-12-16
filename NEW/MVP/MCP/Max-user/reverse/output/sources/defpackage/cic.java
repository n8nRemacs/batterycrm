package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.profile.screens.invite.ProfileInviteScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class cic extends dtf implements sm6 {
    public final /* synthetic */ ProfileInviteScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cic(Continuation continuation, ProfileInviteScreen profileInviteScreen) {
        super(2, continuation);
        this.X = profileInviteScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cic cicVar = (cic) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cicVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cic cicVar = new cic(continuation, this.X);
        cicVar.o = obj;
        return cicVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        uhc uhcVar = (uhc) this.o;
        yy7[] yy7VarArr = BottomSheetWidget.B0;
        oq3 oq3VarA = j5j.a(uhcVar.a, null, null, 6);
        oq3VarA.f(uhcVar.b);
        uhcVar.c.forEach(new pv2(new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 12), 2));
        ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
        ProfileInviteScreen profileInviteScreen = this.X;
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
        return qqg.a;
    }
}
