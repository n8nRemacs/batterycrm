package defpackage;

import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.storage.ui.SettingsStorageScreen;

/* loaded from: classes2.dex */
public final class ese extends dtf implements sm6 {
    public final /* synthetic */ SettingsStorageScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ese(Continuation continuation, SettingsStorageScreen settingsStorageScreen) {
        super(2, continuation);
        this.X = settingsStorageScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ese eseVar = (ese) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        eseVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ese eseVar = new ese(continuation, this.X);
        eseVar.o = obj;
        return eseVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean z = cdaVar instanceof bse;
        SettingsStorageScreen settingsStorageScreen = this.X;
        if (z) {
            bse bseVar = (bse) cdaVar;
            yy7[] yy7VarArr = SettingsStorageScreen.X;
            yy7[] yy7VarArr2 = BottomSheetWidget.B0;
            oq3 oq3VarA = j5j.a(bseVar.b, null, null, 4);
            s5g s5gVar = bseVar.d;
            if (s5gVar != null) {
                oq3VarA.f(s5gVar);
            }
            for (ase aseVar : bseVar.c) {
                boolean z2 = aseVar.c;
                n5g n5gVar = aseVar.b;
                int i = aseVar.a;
                if (z2) {
                    oq3VarA.b(i, n5gVar);
                } else {
                    oq3VarA.d(i, n5gVar);
                }
            }
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            confirmationBottomSheetE.setTargetController(settingsStorageScreen);
            c54 parentController = settingsStorageScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(settingsStorageScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else if (cdaVar instanceof cse) {
            ccb ccbVar = new ccb(settingsStorageScreen);
            ccbVar.g(((cse) cdaVar).b);
            ccbVar.e(new qcb(ivd.m));
            ccbVar.i();
        }
        return qqg.a;
    }
}
