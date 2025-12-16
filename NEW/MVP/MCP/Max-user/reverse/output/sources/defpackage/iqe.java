package defpackage;

import android.os.Bundle;
import android.os.Parcelable;
import java.util.ArrayList;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.privacy.ui.ChangeDisabledDialog;
import one.me.settings.privacy.ui.SettingsPrivacyScreen;
import one.me.settings.privacy.ui.pincode.EnterPinCodeScreen;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes2.dex */
public final class iqe extends dtf implements sm6 {
    public final /* synthetic */ SettingsPrivacyScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iqe(Continuation continuation, SettingsPrivacyScreen settingsPrivacyScreen) {
        super(2, continuation);
        this.X = settingsPrivacyScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        iqe iqeVar = (iqe) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        iqeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        iqe iqeVar = new iqe(continuation, this.X);
        iqeVar.o = obj;
        return iqeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v27 */
    /* JADX WARN: Type inference failed for: r1v28, types: [c54] */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v36 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [c54] */
    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        ytd ytdVarE0;
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean z = cdaVar instanceof fme;
        SettingsPrivacyScreen settingsPrivacyScreen = this.X;
        if (z) {
            fme fmeVar = (fme) cdaVar;
            yy7[] yy7VarArr = SettingsPrivacyScreen.Z;
            yy7[] yy7VarArr2 = BottomSheetWidget.B0;
            s5g s5gVar = fmeVar.b;
            f1e f1eVar = fmeVar.d;
            Bundle bundle = new Bundle();
            bundle.putParcelable("title", s5gVar);
            bundle.putBundle(ApiProtocol.PARAM_PAYLOAD, null);
            if (f1eVar != null) {
                bundle.putString("stat_screen", f1eVar.name());
            }
            for (eme emeVar : fmeVar.c) {
                boolean z2 = emeVar.c;
                n5g n5gVar = emeVar.a;
                int i = emeVar.b;
                if (z2) {
                    ArrayList<? extends Parcelable> parcelableArrayList = bundle.getParcelableArrayList("buttons");
                    if (parcelableArrayList == null) {
                        parcelableArrayList = new ArrayList<>();
                    }
                    parcelableArrayList.add(new pq3(i, n5gVar, 1, 56));
                    bundle.putParcelableArrayList("buttons", parcelableArrayList);
                } else {
                    ArrayList<? extends Parcelable> parcelableArrayList2 = bundle.getParcelableArrayList("buttons");
                    if (parcelableArrayList2 == null) {
                        parcelableArrayList2 = new ArrayList<>();
                    }
                    parcelableArrayList2.add(new pq3(i, n5gVar, 3, 56));
                    bundle.putParcelableArrayList("buttons", parcelableArrayList2);
                }
            }
            ConfirmationBottomSheet confirmationBottomSheet = new ConfirmationBottomSheet(bundle);
            confirmationBottomSheet.setTargetController(settingsPrivacyScreen);
            ?? parentController = settingsPrivacyScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheet.N0(settingsPrivacyScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheet, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else if (cdaVar instanceof ei4) {
            gqe.c.s0((ei4) cdaVar);
        } else if (cdaVar instanceof gme) {
            ccb ccbVar = new ccb(settingsPrivacyScreen);
            ccbVar.g(((gme) cdaVar).b);
            ccbVar.i();
        } else if (cdaVar instanceof hme) {
            ccb ccbVar2 = new ccb(settingsPrivacyScreen);
            hme hmeVar = (hme) cdaVar;
            ccbVar2.g(hmeVar.b);
            ccbVar2.e(new qcb(hmeVar.c.intValue()));
            ccbVar2.i();
        } else if (cdaVar instanceof dme) {
            EnterPinCodeScreen enterPinCodeScreen = new EnterPinCodeScreen();
            enterPinCodeScreen.setTargetController(settingsPrivacyScreen);
            settingsPrivacyScreen.getRouter().H(l8j.a(enterPinCodeScreen, new h0h(), new h0h()));
        } else if (cdaVar instanceof cme) {
            yy7[] yy7VarArr3 = BottomSheetWidget.B0;
            ChangeDisabledDialog changeDisabledDialog = new ChangeDisabledDialog();
            changeDisabledDialog.setTargetController(settingsPrivacyScreen);
            ?? parentController2 = settingsPrivacyScreen;
            while (parentController2.getParentController() != null) {
                parentController2 = parentController2.getParentController();
            }
            eud eudVar2 = parentController2 instanceof eud ? (eud) parentController2 : null;
            ytdVarE0 = eudVar2 != null ? ((RootController) eudVar2).E0() : null;
            changeDisabledDialog.N0(settingsPrivacyScreen);
            if (ytdVarE0 != null) {
                bud budVar2 = new bud(changeDisabledDialog, null, null, null, false, -1);
                az1.u(false, budVar2, true, "change-disabled");
                ytdVarE0.H(budVar2);
            }
        }
        yy7[] yy7VarArr4 = SettingsPrivacyScreen.Z;
        settingsPrivacyScreen.y0().O0.g();
        return qqg.a;
    }
}
