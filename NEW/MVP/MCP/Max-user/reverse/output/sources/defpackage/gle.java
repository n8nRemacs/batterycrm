package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.media.ui.SettingMediaScreen;

/* loaded from: classes2.dex */
public final class gle extends dtf implements sm6 {
    public final /* synthetic */ SettingMediaScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gle(Continuation continuation, SettingMediaScreen settingMediaScreen) {
        super(2, continuation);
        this.X = settingMediaScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gle gleVar = (gle) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gleVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gle gleVar = new gle(continuation, this.X);
        gleVar.o = obj;
        return gleVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof qpe) {
            qpe qpeVar = (qpe) cdaVar;
            yy7[] yy7VarArr = SettingMediaScreen.X;
            yy7[] yy7VarArr2 = BottomSheetWidget.B0;
            oq3 oq3VarA = j5j.a(qpeVar.b, null, null, 4);
            for (ppe ppeVar : qpeVar.c) {
                ppeVar.getClass();
                oq3VarA.d(ppeVar.b, ppeVar.a);
            }
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            SettingMediaScreen settingMediaScreen = this.X;
            confirmationBottomSheetE.setTargetController(settingMediaScreen);
            c54 parentController = settingMediaScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(settingMediaScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else if (cdaVar instanceof ei4) {
            fle.c.s0((ei4) cdaVar);
        } else if (cdaVar instanceof ope) {
            fle.c.p0().b(":settings/caching", null);
        }
        return qqg.a;
    }
}
