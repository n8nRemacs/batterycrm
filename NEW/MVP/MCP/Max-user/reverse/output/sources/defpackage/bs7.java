package defpackage;

import android.net.Uri;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyqr.InviteByQrBottomSheet;

/* loaded from: classes2.dex */
public final class bs7 extends dtf implements sm6 {
    public final /* synthetic */ InviteByQrBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bs7(InviteByQrBottomSheet inviteByQrBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.X = inviteByQrBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bs7 bs7Var = (bs7) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bs7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bs7 bs7Var = new bs7(this.X, continuation);
        bs7Var.o = obj;
        return bs7Var;
    }

    /* JADX WARN: Type inference failed for: r8v5, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        xqc xqcVar;
        Uri uri;
        qqg qqgVar = qqg.a;
        g8j.b(obj);
        f84 f84Var = (f84) this.o;
        InviteByQrBottomSheet inviteByQrBottomSheet = this.X;
        try {
            yy7[] yy7VarArr = InviteByQrBottomSheet.O0;
            xqcVar = (xqc) ((ds7) inviteByQrBottomSheet.K0.getValue()).Z.a.getValue();
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        if (xqcVar != null && (uri = xqcVar.a) != null) {
            if (inviteByQrBottomSheet.O0().a == ((w4e) ((pb3) inviteByQrBottomSheet.H0.getValue())).s()) {
                ((mx3) inviteByQrBottomSheet.M0.getValue()).a(inviteByQrBottomSheet.getContext(), uri);
            } else {
                String str = ap7.a;
                ap7.h(inviteByQrBottomSheet.getContext(), uri, "image/*");
            }
            inviteByQrBottomSheet.E0(true);
            ipdVar = qqgVar;
            Throwable thA = kpd.a(ipdVar);
            if (thA != null) {
                wqi.e(f84Var.getClass().getName(), "shareQrCode: failed to share qr code", thA);
                ((ccb) inviteByQrBottomSheet.G0.getValue()).i();
            }
        }
        return qqgVar;
    }
}
