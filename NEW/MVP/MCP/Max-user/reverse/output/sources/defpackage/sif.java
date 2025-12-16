package defpackage;

import android.content.Intent;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.stickerssettings.StickersSettingsScreen;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class sif extends dtf implements sm6 {
    public final /* synthetic */ StickersSettingsScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sif(Continuation continuation, StickersSettingsScreen stickersSettingsScreen) {
        super(2, continuation);
        this.X = stickersSettingsScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        sif sifVar = (sif) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sifVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        sif sifVar = new sif(continuation, this.X);
        sifVar.o = obj;
        return sifVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        rne rneVar = (rne) this.o;
        yy7[] yy7VarArr = StickersSettingsScreen.X;
        boolean z = rneVar instanceof pne;
        StickersSettingsScreen stickersSettingsScreen = this.X;
        if (z) {
            h6j.a(2).o(((pne) rneVar).a).D().build().u(stickersSettingsScreen);
        } else {
            if (rneVar instanceof mne) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", ((mne) rneVar).a);
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                bud budVar = (bud) ue3.Q(stickersSettingsScreen.getRouter().e());
                pif.c.L0(intent, budVar != null ? budVar.b : null);
            } else if (rneVar instanceof nne) {
                String str = ap7.a;
                ap7.i(stickersSettingsScreen.getContext(), ((nne) rneVar).a, null);
            } else if (rneVar instanceof one) {
                one oneVar = (one) rneVar;
                yy7[] yy7VarArr2 = BottomSheetWidget.B0;
                oq3 oq3VarA = j5j.a(oneVar.a, null, null, 6);
                oq3VarA.f(oneVar.b);
                oneVar.c.forEach(new m4(21, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 14)));
                ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
                confirmationBottomSheetE.setTargetController(stickersSettingsScreen);
                c54 parentController = stickersSettingsScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                confirmationBottomSheetE.N0(stickersSettingsScreen);
                if (ytdVarE0 != null) {
                    bud budVar2 = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                    az1.u(false, budVar2, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar2);
                }
            } else {
                if (!(rneVar instanceof qne)) {
                    throw new NoWhenBranchMatchedException();
                }
                ccb ccbVar = new ccb(stickersSettingsScreen);
                qne qneVar = (qne) rneVar;
                ccbVar.e(new qcb(qneVar.a));
                CharSequence charSequenceB = qneVar.b.b(stickersSettingsScreen.getContext());
                if (charSequenceB == null) {
                    charSequenceB = "";
                }
                ccbVar.h(charSequenceB);
                ccbVar.i();
            }
        }
        return qqg.a;
    }
}
