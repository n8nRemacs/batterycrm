package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.profileedit.screens.adminpermissions.ProfileEditAdminPermissionsWidget;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class vec extends dtf implements sm6 {
    public final /* synthetic */ ProfileEditAdminPermissionsWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vec(Continuation continuation, ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget) {
        super(2, continuation);
        this.X = profileEditAdminPermissionsWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vec vecVar = (vec) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vecVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vec vecVar = new vec(continuation, this.X);
        vecVar.o = obj;
        return vecVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cec cecVar = (cec) this.o;
        boolean z = cecVar instanceof aec;
        ProfileEditAdminPermissionsWidget profileEditAdminPermissionsWidget = this.X;
        if (z) {
            api.c(profileEditAdminPermissionsWidget);
            yy7[] yy7VarArr = BottomSheetWidget.B0;
            aec aecVar = (aec) cecVar;
            oq3 oq3VarA = j5j.a(aecVar.a, null, null, 6);
            oq3VarA.f(aecVar.b);
            aecVar.c.forEach(new pv2(new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 9), 1));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            confirmationBottomSheetE.setTargetController(profileEditAdminPermissionsWidget);
            c54 parentController = profileEditAdminPermissionsWidget;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(profileEditAdminPermissionsWidget);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else {
            if (!(cecVar instanceof bec)) {
                throw new NoWhenBranchMatchedException();
            }
            bcb bcbVar = profileEditAdminPermissionsWidget.u0;
            if (bcbVar != null) {
                bcbVar.a();
            }
            ccb ccbVar = new ccb(profileEditAdminPermissionsWidget);
            bec becVar = (bec) cecVar;
            ccbVar.g(becVar.a);
            Integer num = becVar.b;
            if (num != null) {
                ccbVar.e(new qcb(num.intValue()));
            }
            profileEditAdminPermissionsWidget.u0 = ccbVar.i();
        }
        return qqg.a;
    }
}
