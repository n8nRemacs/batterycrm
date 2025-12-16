package defpackage;

import android.content.ActivityNotFoundException;
import android.content.Context;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.profile.ProfileScreen;
import one.me.profile.RknBottomSheet;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;

/* loaded from: classes2.dex */
public final class rlc extends dtf implements sm6 {
    public final /* synthetic */ ProfileScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlc(Continuation continuation, ProfileScreen profileScreen) {
        super(2, continuation);
        this.X = profileScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        rlc rlcVar = (rlc) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        rlcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rlc rlcVar = new rlc(continuation, this.X);
        rlcVar.o = obj;
        return rlcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v20 */
    /* JADX WARN: Type inference failed for: r14v21, types: [c54] */
    /* JADX WARN: Type inference failed for: r14v52 */
    /* JADX WARN: Type inference failed for: r14v53, types: [c54] */
    /* JADX WARN: Type inference failed for: r14v59 */
    /* JADX WARN: Type inference failed for: r14v60 */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ytd ytdVarE0;
        g8j.b(obj);
        lmc lmcVar = (lmc) this.o;
        boolean z = lmcVar instanceof fmc;
        ProfileScreen profileScreen = this.X;
        if (z) {
            fmc fmcVar = (fmc) lmcVar;
            yy7[] yy7VarArr = ProfileScreen.C0;
            yy7[] yy7VarArr2 = BottomSheetWidget.B0;
            oq3 oq3VarA = j5j.a(fmcVar.a, fmcVar.d, null, 4);
            oq3VarA.f(fmcVar.b);
            pq3[] pq3VarArr = (pq3[]) fmcVar.c.toArray(new pq3[0]);
            oq3VarA.a((pq3[]) Arrays.copyOf(pq3VarArr, pq3VarArr.length));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            confirmationBottomSheetE.setTargetController(profileScreen);
            ?? parentController = profileScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(profileScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        } else if (lmcVar instanceof emc) {
            CharSequence charSequenceB = ((emc) lmcVar).a.b(profileScreen.getContext());
            if (charSequenceB != null) {
                ccb ccbVar = new ccb(profileScreen);
                ccbVar.e(tcb.a);
                ccbVar.f(vcb.a);
                ccbVar.h(charSequenceB);
                ccbVar.d(new ulc(0, lmcVar));
                ccbVar.i();
            }
        } else if (lmcVar instanceof gmc) {
            gmc gmcVar = (gmc) lmcVar;
            CharSequence charSequenceB2 = gmcVar.a.b(profileScreen.getContext());
            if (charSequenceB2 != null) {
                ccb ccbVar2 = new ccb(profileScreen);
                Integer num = gmcVar.b;
                if (num != null) {
                    ccbVar2.e(new qcb(num.intValue()));
                }
                ccbVar2.h(charSequenceB2);
                ccbVar2.a(gmcVar.c);
                ccbVar2.i();
            }
        } else if (lmcVar instanceof kmc) {
            ccb ccbVar3 = new ccb(profileScreen);
            kmc kmcVar = (kmc) lmcVar;
            Integer num2 = kmcVar.a;
            if (num2 != null) {
                ccbVar3.e(new qcb(num2.intValue()));
            }
            ccbVar3.g(kmcVar.b);
            ccbVar3.i();
        } else if (lmcVar instanceof bmc) {
            String str = ap7.a;
            Context context = profileScreen.getContext();
            CharSequence charSequenceB3 = ((bmc) lmcVar).a.b(profileScreen.getContext());
            if (charSequenceB3 == null) {
                charSequenceB3 = "";
            }
            ap7.i(context, charSequenceB3, null);
        } else if (lmcVar instanceof imc) {
            h6j.a(1).o(((imc) lmcVar).a).B((roe) profileScreen.x0.D(profileScreen, ProfileScreen.C0[9])).build().u(profileScreen);
        } else {
            if (lmcVar instanceof hmc) {
                ((hmc) lmcVar).getClass();
                gwi.b(new imb("profile:participant_id_for_action", new Long(0L)));
                yy7[] yy7VarArr3 = ProfileScreen.C0;
                profileScreen.C0();
                throw null;
            }
            if (fni.a(lmcVar, cmc.a)) {
                yy7[] yy7VarArr4 = ProfileScreen.C0;
                ((qsb) profileScreen.z0.getValue()).k(new s2i(profileScreen, 1));
            } else if (lmcVar instanceof dmc) {
                try {
                    profileScreen.startActivityForResult(((dmc) lmcVar).a, 333);
                    gda.g((gda) profileScreen.A0.getValue(), f1e.AVATAR_PICKER_CAMERA);
                } catch (ActivityNotFoundException unused) {
                    yy7[] yy7VarArr5 = ProfileScreen.C0;
                    profileScreen.D0().E();
                    wqi.e(ProfileScreen.class.getName(), "failed open camera", null);
                }
            } else {
                if (!(lmcVar instanceof jmc)) {
                    throw new NoWhenBranchMatchedException();
                }
                yy7[] yy7VarArr6 = ProfileScreen.C0;
                yy7[] yy7VarArr7 = BottomSheetWidget.B0;
                RknBottomSheet rknBottomSheet = new RknBottomSheet();
                rknBottomSheet.setTargetController(profileScreen);
                ?? parentController2 = profileScreen;
                while (parentController2.getParentController() != null) {
                    parentController2 = parentController2.getParentController();
                }
                eud eudVar2 = parentController2 instanceof eud ? (eud) parentController2 : null;
                ytdVarE0 = eudVar2 != null ? ((RootController) eudVar2).E0() : null;
                rknBottomSheet.N0(profileScreen);
                if (ytdVarE0 != null) {
                    bud budVar2 = new bud(rknBottomSheet, null, null, null, false, -1);
                    az1.u(false, budVar2, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar2);
                }
            }
        }
        return qqg.a;
    }
}
