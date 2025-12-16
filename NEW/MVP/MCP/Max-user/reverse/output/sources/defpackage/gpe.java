package defpackage;

import android.content.ActivityNotFoundException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import one.me.settings.SettingsListScreen;

/* loaded from: classes2.dex */
public final class gpe extends dtf implements sm6 {
    public final /* synthetic */ SettingsListScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gpe(Continuation continuation, SettingsListScreen settingsListScreen) {
        super(2, continuation);
        this.X = settingsListScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gpe gpeVar = (gpe) l((cda) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gpeVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gpe gpeVar = new gpe(continuation, this.X);
        gpeVar.o = obj;
        return gpeVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean z = cdaVar instanceof upe;
        qqg qqgVar = qqg.a;
        if (z) {
            bpe.c.p0().b(a9h.d(((upe) cdaVar).b, ":profile/edit?id=", "&type=contact"), null);
            return qqgVar;
        }
        if (cdaVar instanceof vpe) {
            bpe.c.p0().b(a9h.d(((vpe) cdaVar).b, ":profile/avatars?id=", "&type=contact"), null);
            return qqgVar;
        }
        boolean zA = fni.a(cdaVar, rpe.b);
        SettingsListScreen settingsListScreen = this.X;
        if (zA) {
            yy7[] yy7VarArr = SettingsListScreen.A0;
            yy7[] yy7VarArr2 = BottomSheetWidget.B0;
            oq3 oq3VarE = az1.e(pbb.r, null, null, 6);
            oq3VarE.a(new pq3(obb.d, new n5g(pbb.u), 3, 56));
            oq3VarE.a(new pq3(obb.c, new n5g(pbb.t), 3, 56));
            oq3VarE.a(new pq3(obb.b, new n5g(pbb.s), 3, 56));
            oq3VarE.a(new pq3(obb.a, new n5g(mvd.p), 2, 56));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarE.e();
            confirmationBottomSheetE.setTargetController(settingsListScreen);
            c54 parentController = settingsListScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(settingsListScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
                return qqgVar;
            }
        } else {
            if (fni.a(cdaVar, spe.b)) {
                yy7[] yy7VarArr3 = SettingsListScreen.A0;
                ((qsb) settingsListScreen.u0.getValue()).k(new s2i(settingsListScreen, 1));
                return qqgVar;
            }
            if (cdaVar instanceof tpe) {
                tpe tpeVar = (tpe) cdaVar;
                c39.c.L0(tpeVar.b, tpeVar.c);
                return qqgVar;
            }
            if (cdaVar instanceof wpe) {
                try {
                    settingsListScreen.startActivityForResult(((wpe) cdaVar).b, 333);
                    gda.g((gda) settingsListScreen.v0.getValue(), f1e.AVATAR_PICKER_CAMERA);
                    return qqgVar;
                } catch (ActivityNotFoundException unused) {
                    wqi.e(SettingsListScreen.class.getName(), "failed open camera", null);
                    settingsListScreen.D0().A();
                    return qqgVar;
                }
            }
            if (fni.a(cdaVar, xpe.b)) {
                bpe.c.p0().b(":media-picker/select/photo", null);
                return qqgVar;
            }
            if (cdaVar instanceof ype) {
                ype ypeVar = (ype) cdaVar;
                CharSequence charSequenceB = ypeVar.b.b(settingsListScreen.getContext());
                if (charSequenceB != null) {
                    ccb ccbVar = (ccb) settingsListScreen.t0.getValue();
                    ccbVar.h(charSequenceB);
                    ccbVar.e(new qcb(ypeVar.c.intValue()));
                    ccbVar.i();
                    return qqgVar;
                }
            } else if (cdaVar instanceof ei4) {
                bpe.c.s0((ei4) cdaVar);
            }
        }
        return qqgVar;
    }
}
