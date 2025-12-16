package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.privacy.ui.blacklist.SettingsBlacklistScreen;

/* loaded from: classes2.dex */
public final class fne extends dtf implements sm6 {
    public final /* synthetic */ SettingsBlacklistScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fne(Continuation continuation, SettingsBlacklistScreen settingsBlacklistScreen) {
        super(2, continuation);
        this.X = settingsBlacklistScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fne fneVar = (fne) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fneVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fne fneVar = new fne(continuation, this.X);
        fneVar.o = obj;
        return fneVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof ei4) {
            gqe.c.s0((ei4) cdaVar);
        } else {
            boolean z = cdaVar instanceof fme;
            SettingsBlacklistScreen settingsBlacklistScreen = this.X;
            if (z) {
                fme fmeVar = (fme) cdaVar;
                yy7[] yy7VarArr = SettingsBlacklistScreen.Y;
                yy7[] yy7VarArr2 = BottomSheetWidget.B0;
                oq3 oq3VarA = j5j.a(fmeVar.b, fmeVar.e, null, 4);
                for (eme emeVar : fmeVar.c) {
                    boolean z2 = emeVar.c;
                    n5g n5gVar = emeVar.a;
                    int i = emeVar.b;
                    if (z2) {
                        oq3VarA.d(i, n5gVar);
                    } else {
                        oq3VarA.c(i, n5gVar);
                    }
                }
                ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
                confirmationBottomSheetE.setTargetController(settingsBlacklistScreen);
                c54 parentController = settingsBlacklistScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                confirmationBottomSheetE.N0(settingsBlacklistScreen);
                if (ytdVarE0 != null) {
                    bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                    az1.u(false, budVar, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar);
                }
            } else if (cdaVar instanceof gme) {
                ccb ccbVar = new ccb(settingsBlacklistScreen);
                ccbVar.g(((gme) cdaVar).b);
                ccbVar.i();
            } else if (cdaVar instanceof ime) {
                ccb ccbVar2 = new ccb(settingsBlacklistScreen);
                ccbVar2.e(new qcb(jbb.b));
                ccbVar2.g(((ime) cdaVar).b);
                ccbVar2.i();
            }
        }
        return qqg.a;
    }
}
