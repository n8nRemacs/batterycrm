package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.stickerssettings.stickersscreen.StickersScreen;

/* loaded from: classes2.dex */
public final class jhf extends dtf implements sm6 {
    public final /* synthetic */ StickersScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jhf(Continuation continuation, StickersScreen stickersScreen) {
        super(2, continuation);
        this.X = stickersScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        jhf jhfVar = (jhf) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        jhfVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        jhf jhfVar = new jhf(continuation, this.X);
        jhfVar.o = obj;
        return jhfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        rne rneVar = (rne) this.o;
        yy7[] yy7VarArr = StickersScreen.u0;
        boolean z = rneVar instanceof one;
        StickersScreen stickersScreen = this.X;
        if (z) {
            one oneVar = (one) rneVar;
            yy7[] yy7VarArr2 = BottomSheetWidget.B0;
            oq3 oq3VarA = j5j.a(oneVar.a, null, null, 6);
            oq3VarA.f(oneVar.b);
            oneVar.c.forEach(new m4(20, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 13)));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            confirmationBottomSheetE.setTargetController(stickersScreen);
            c54 parentController = stickersScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(stickersScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else if (rneVar instanceof qne) {
            ccb ccbVar = new ccb(stickersScreen);
            qne qneVar = (qne) rneVar;
            ccbVar.e(new qcb(qneVar.a));
            CharSequence charSequenceB = qneVar.b.b(stickersScreen.getContext());
            if (charSequenceB == null) {
                charSequenceB = "";
            }
            ccbVar.h(charSequenceB);
            ccbVar.i();
        }
        return qqg.a;
    }
}
