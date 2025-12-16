package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.ImageView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.android.root.RootController;
import one.me.profileedit.screens.changelink.ProfileChangeLinkScreen;
import one.me.sdk.bottomsheet.BottomSheetWidget;
import one.me.sdk.bottomsheet.ConfirmationBottomSheet;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class scc extends dtf implements sm6 {
    public final /* synthetic */ ProfileChangeLinkScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public scc(Continuation continuation, ProfileChangeLinkScreen profileChangeLinkScreen) {
        super(2, continuation);
        this.X = profileChangeLinkScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        scc sccVar = (scc) l((ddc) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        sccVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        scc sccVar = new scc(continuation, this.X);
        sccVar.o = obj;
        return sccVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        CharSequence charSequenceB;
        g8j.b(obj);
        ddc ddcVar = (ddc) this.o;
        boolean z = ddcVar instanceof adc;
        qqg qqgVar = qqg.a;
        ProfileChangeLinkScreen profileChangeLinkScreen = this.X;
        if (z) {
            api.c(profileChangeLinkScreen);
            h6j.a(1).o(((adc) ddcVar).b).B((ImageView) profileChangeLinkScreen.Y.D(profileChangeLinkScreen, ProfileChangeLinkScreen.t0[2])).build().u(profileChangeLinkScreen);
            return qqgVar;
        }
        if (ddcVar instanceof cdc) {
            cdc cdcVar = (cdc) ddcVar;
            s5g s5gVar = cdcVar.b;
            if (s5gVar != null && (charSequenceB = s5gVar.b(profileChangeLinkScreen.getContext())) != null) {
                s5g s5gVar2 = cdcVar.c;
                CharSequence charSequenceB2 = s5gVar2 != null ? s5gVar2.b(profileChangeLinkScreen.getContext()) : null;
                ccb ccbVar = new ccb(profileChangeLinkScreen);
                ccbVar.h(charSequenceB);
                ccbVar.b(charSequenceB2);
                int i = cdcVar.d ? 1 : 2;
                cdb cdbVar = ccbVar.b;
                ccbVar.b = cdb.a(cdbVar, null, null, null, null, kcb.a(cdbVar.o, i, 0, 0, 6), null, null, 111);
                ccbVar.c(new kcb(0, 0, ProfileChangeLinkScreen.y0(profileChangeLinkScreen).getVisibility() == 0 ? (kti.d(12 * vw4.d().getDisplayMetrics().density) * 2) + ProfileChangeLinkScreen.y0(profileChangeLinkScreen).getMeasuredHeight() : 0, 3));
                Integer num = cdcVar.e;
                ccbVar.e(num != null ? new qcb(num.intValue()) : rcb.a);
                ccbVar.i();
                return qqgVar;
            }
        } else {
            if (ddcVar instanceof ycc) {
                Intent intent = new Intent();
                intent.setAction("android.intent.action.SEND");
                intent.putExtra("android.intent.extra.TEXT", ((ycc) ddcVar).b.b(profileChangeLinkScreen.getContext()));
                intent.setType(HTTP.PLAIN_TEXT_TYPE);
                rfc.c.p0().b(":chats/share", gwi.b(new imb("oneme:share:data", intent), new imb("oneme:share:title", z7.e(profileChangeLinkScreen.getContext(), mvd.V1)), new imb("tag", ProfileChangeLinkScreen.class.getName())));
                return qqgVar;
            }
            if (ddcVar instanceof bdc) {
                rfc rfcVar = rfc.c;
                bdc bdcVar = (bdc) ddcVar;
                long j = bdcVar.b;
                int i2 = bdcVar.c;
                ii4 ii4VarP0 = rfcVar.p0();
                StringBuilder sbM = u45.m(i2, j, ":invite/qr?height=", "&id=");
                sbM.append("&type=chat");
                ii4VarP0.b(sbM.toString(), null);
                return qqgVar;
            }
            if (ddcVar instanceof vcc) {
                xb3.a(profileChangeLinkScreen.getContext(), ((vcc) ddcVar).b);
                return qqgVar;
            }
            if (!(ddcVar instanceof zcc)) {
                if (!(ddcVar instanceof wcc)) {
                    if (!(ddcVar instanceof xcc)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    rfc.c.p0().e(new ffb(18, new iqb(profileChangeLinkScreen, ddcVar, 11)));
                    return qqgVar;
                }
                String str = ap7.a;
                Context context = profileChangeLinkScreen.getContext();
                CharSequence charSequenceB3 = ((wcc) ddcVar).b.b(profileChangeLinkScreen.getContext());
                if (charSequenceB3 == null) {
                    charSequenceB3 = "";
                }
                ap7.i(context, charSequenceB3, null);
                return qqgVar;
            }
            yy7[] yy7VarArr = BottomSheetWidget.B0;
            zcc zccVar = (zcc) ddcVar;
            oq3 oq3VarA = j5j.a(zccVar.b, null, null, 6);
            oq3VarA.f(zccVar.c);
            zccVar.d.forEach(new m4(14, new fr2(1, oq3VarA, oq3.class, "addButton", "addButton([Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Button;)Lone/me/sdk/bottomsheet/ConfirmationBottomSheet$Builder;", 8, 8)));
            ConfirmationBottomSheet confirmationBottomSheetE = oq3VarA.e();
            confirmationBottomSheetE.setTargetController(profileChangeLinkScreen);
            c54 parentController = profileChangeLinkScreen;
            while (parentController.getParentController() != null) {
                parentController = parentController.getParentController();
            }
            eud eudVar = parentController instanceof eud ? (eud) parentController : null;
            ytd ytdVarE0 = eudVar != null ? ((RootController) eudVar).E0() : null;
            confirmationBottomSheetE.N0(profileChangeLinkScreen);
            if (ytdVarE0 != null) {
                bud budVar = new bud(confirmationBottomSheetE, null, null, null, false, -1);
                az1.u(false, budVar, true, "BottomSheetWidget");
                ytdVarE0.H(budVar);
            }
        }
        return qqgVar;
    }
}
