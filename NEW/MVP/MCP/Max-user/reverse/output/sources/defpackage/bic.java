package defpackage;

import android.content.Context;
import android.content.Intent;
import kotlin.coroutines.Continuation;
import one.me.profile.screens.invite.ProfileInviteScreen;
import org.apache.http.protocol.HTTP;

/* loaded from: classes2.dex */
public final class bic extends dtf implements sm6 {
    public final /* synthetic */ ProfileInviteScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bic(Continuation continuation, ProfileInviteScreen profileInviteScreen) {
        super(2, continuation);
        this.X = profileInviteScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        bic bicVar = (bic) l((cda) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        bicVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        bic bicVar = new bic(continuation, this.X);
        bicVar.o = obj;
        return bicVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean z = cdaVar instanceof yhc;
        ProfileInviteScreen profileInviteScreen = this.X;
        if (z) {
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", ((yhc) cdaVar).b);
            intent.setType(HTTP.PLAIN_TEXT_TYPE);
            bud budVar = (bud) ue3.Q(profileInviteScreen.getRouter().e());
            kkc.c.p0().b(":chats/share", gwi.b(new imb("oneme:share:data", intent), new imb("oneme:share:title", z7.e(profileInviteScreen.getContext(), mvd.V1)), new imb("oneme:share:is:internal:url:sharing", Boolean.TRUE), new imb("tag", budVar != null ? budVar.b : null)));
        } else if (cdaVar instanceof zhc) {
            String str = ap7.a;
            Context context = profileInviteScreen.getContext();
            CharSequence charSequenceB = ((zhc) cdaVar).b.b(profileInviteScreen.getContext());
            if (charSequenceB == null) {
                charSequenceB = "";
            }
            ap7.i(context, charSequenceB, null);
        } else if (cdaVar instanceof ei4) {
            kkc.c.s0((ei4) cdaVar);
        } else if (cdaVar instanceof jc3) {
            profileInviteScreen.getRouter().B(profileInviteScreen);
        }
        return qqg.a;
    }
}
