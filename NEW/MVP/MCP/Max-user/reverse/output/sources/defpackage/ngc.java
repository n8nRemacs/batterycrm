package defpackage;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.profileedit.ProfileEditScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import ru.ok.tamtam.android.prefs.PmsKey;

/* loaded from: classes2.dex */
public final class ngc extends dtf implements sm6 {
    public final /* synthetic */ ProfileEditScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ngc(ProfileEditScreen profileEditScreen, Continuation continuation) {
        super(2, continuation);
        this.X = profileEditScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ngc ngcVar = (ngc) l((cda) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ngcVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ngc ngcVar = new ngc(this.X, continuation);
        ngcVar.o = obj;
        return ngcVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean zA = fni.a(cdaVar, ufc.b);
        qqg qqgVar = qqg.a;
        if (!zA) {
            boolean z = cdaVar instanceof cgc;
            ProfileEditScreen profileEditScreen = this.X;
            if (z) {
                api.c(profileEditScreen);
                yy7[] yy7VarArr = BottomSheetWidget.B0;
                cgc cgcVar = (cgc) cdaVar;
                oq3 oq3VarA = j5j.a(cgcVar.b, null, null, 6);
                oq3VarA.f(cgcVar.c);
                cgcVar.d.forEach(new m4(15, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 10)));
                ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
                confirmationBottomSheetE.setTargetController(profileEditScreen);
                c54 parentController = profileEditScreen;
                while (parentController.getParentController() != null) {
                    parentController = parentController.getParentController();
                }
                eud eudVar = parentController instanceof eud ? (eud) parentController : null;
                ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
                confirmationBottomSheetE.N0(profileEditScreen);
                if (ytdVarE0 != null) {
                    bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                    az1.u(false, budVar, true, "BottomSheetWidget");
                    ytdVarE0.H(budVar);
                    return qqgVar;
                }
            } else if (cdaVar instanceof dgc) {
                dgc dgcVar = (dgc) cdaVar;
                CharSequence charSequenceB = dgcVar.b.b(profileEditScreen.getContext());
                if (charSequenceB != null) {
                    ccb ccbVar = new ccb(profileEditScreen);
                    ccbVar.h(charSequenceB);
                    ccbVar.e(new qcb(dgcVar.c.intValue()));
                    ccbVar.i();
                    return qqgVar;
                }
            } else {
                if (fni.a(cdaVar, zfc.b)) {
                    yy7[] yy7VarArr2 = ProfileEditScreen.x0;
                    profileEditScreen.z0().w();
                    return qqgVar;
                }
                if (fni.a(cdaVar, bgc.b)) {
                    rfc.c.p0().b(":media-picker/select/photo", null);
                    return qqgVar;
                }
                if (cdaVar instanceof agc) {
                    try {
                        profileEditScreen.startActivityForResult(((agc) cdaVar).b, 333);
                        gda.g((gda) profileEditScreen.v0.getValue(), f1e.AVATAR_PICKER_CAMERA);
                        return qqgVar;
                    } catch (ActivityNotFoundException unused) {
                        wqi.e(ProfileEditScreen.class.getName(), "failed open camera", null);
                        profileEditScreen.z0().v();
                        return qqgVar;
                    }
                }
                if (cdaVar instanceof vfc) {
                    vfc vfcVar = (vfc) cdaVar;
                    c39.c.L0(vfcVar.b, vfcVar.c);
                    return qqgVar;
                }
                if (fni.a(cdaVar, sfc.b)) {
                    yy7[] yy7VarArr3 = ProfileEditScreen.x0;
                    ((qsb) profileEditScreen.u0.getValue()).k(new s2i(profileEditScreen, 1));
                    return qqgVar;
                }
                if (fni.a(cdaVar, yfc.b)) {
                    yy7[] yy7VarArr4 = ProfileEditScreen.x0;
                    if (profileEditScreen.getRouter().a.a.size() == 2) {
                        bud budVar2 = (bud) profileEditScreen.getRouter().e().get(1);
                        if (fni.a(budVar2 != null ? budVar2.a : null, profileEditScreen)) {
                            Activity activityD = ((RootController) ((b3b) rfc.c.p0().a()).f()).G0().d();
                            if (activityD != null) {
                                activityD.finish();
                                return qqgVar;
                            }
                        }
                    }
                    rfc.c.p0().b(":chat-list", null);
                    return qqgVar;
                }
                if (cdaVar instanceof xfc) {
                    rfc.c.p0().b(a9h.d(((xfc) cdaVar).b, ":chats?id=", "&type=local"), null);
                    return qqgVar;
                }
                if (cdaVar instanceof ei4) {
                    rfc.c.s0((ei4) cdaVar);
                    return qqgVar;
                }
                if (cdaVar instanceof tfc) {
                    tfc tfcVar = (tfc) cdaVar;
                    dfc dfcVar = tfcVar.c;
                    long j = tfcVar.b;
                    int iOrdinal = dfcVar.ordinal();
                    if (iOrdinal == 0) {
                        rfc.c.p0().b(a9h.d(j, ":profile/edit/link?id=", "&type=local_chat&flow=edit"), null);
                        return qqgVar;
                    }
                    if (iOrdinal == 1) {
                        rfc.c.p0().b(a9h.d(j, ":profile/edit/link?id=", "&type=server_chat&flow=edit"), null);
                        return qqgVar;
                    }
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rfc rfcVar = rfc.c;
                    rfcVar.getClass();
                    l5c l5cVar = (l5c) ((age) yec.a.getAccessor().d(47).getValue());
                    l5cVar.getClass();
                    if (l5cVar.j(PmsKey.f1accountnicknameenabled, false)) {
                        rfcVar.p0().b(a9h.d(j, ":profile/edit/link?id=", "&type=contact&flow=edit"), null);
                        return qqgVar;
                    }
                } else {
                    if (cdaVar instanceof wfc) {
                        rfc rfcVar2 = rfc.c;
                        long j2 = ((wfc) cdaVar).b;
                        rfcVar2.p0().b(":profile/invite?id=" + j2, null);
                        return qqgVar;
                    }
                    if (cdaVar instanceof jc3) {
                        api.c(profileEditScreen);
                        profileEditScreen.getRouter().B(profileEditScreen);
                    }
                }
            }
        }
        return qqgVar;
    }
}
