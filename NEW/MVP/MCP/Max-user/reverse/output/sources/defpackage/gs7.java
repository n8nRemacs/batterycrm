package defpackage;

import android.content.Context;
import android.net.Uri;
import java.util.Arrays;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitefriendsbottomsheet.InviteFriendsToMaxBottomSheet;

/* loaded from: classes2.dex */
public final class gs7 extends dtf implements sm6 {
    public final /* synthetic */ InviteFriendsToMaxBottomSheet X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gs7(InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet, Continuation continuation) {
        super(2, continuation);
        this.X = inviteFriendsToMaxBottomSheet;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gs7 gs7Var = (gs7) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gs7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gs7 gs7Var = new gs7(this.X, continuation);
        gs7Var.o = obj;
        return gs7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        g8j.b(obj);
        InviteFriendsToMaxBottomSheet inviteFriendsToMaxBottomSheet = this.X;
        fyg fygVar = (fyg) inviteFriendsToMaxBottomSheet.F0.getValue();
        int i = inviteFriendsToMaxBottomSheet.H0;
        Context context = inviteFriendsToMaxBottomSheet.getContext();
        l5c l5cVar = (l5c) ((age) inviteFriendsToMaxBottomSheet.D0.getValue());
        String string = l5cVar.g.getString("invite-long", null);
        if (string == null) {
            string = String.format(context.getString(fvd.J), Arrays.copyOf(new Object[]{l5cVar.l()}, 1));
        }
        CharSequence charSequenceA = fygVar.a(i, string);
        if (charSequenceA == null) {
            charSequenceA = "";
        }
        xb3.a(inviteFriendsToMaxBottomSheet.getContext(), charSequenceA.toString());
        try {
            xqc xqcVar = (xqc) ((ds7) inviteFriendsToMaxBottomSheet.I0.getValue()).Z.a.getValue();
            ipdVar = xqcVar != null ? xqcVar.a : null;
        } catch (Throwable th) {
            ipdVar = new ipd(th);
        }
        Object obj2 = ipdVar instanceof ipd ? null : ipdVar;
        String str = ap7.a;
        ap7.i(inviteFriendsToMaxBottomSheet.getContext(), charSequenceA, (Uri) obj2);
        ((is7) inviteFriendsToMaxBottomSheet.E0.getValue()).a("clicked_to_invite", "main", "trigger_max");
        w4e w4eVar = (w4e) ((pb3) inviteFriendsToMaxBottomSheet.C0.getValue());
        w4eVar.N.O(w4eVar, w4e.m0[31], Boolean.TRUE);
        inviteFriendsToMaxBottomSheet.E0(true);
        return qqg.a;
    }
}
