package defpackage;

import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* loaded from: classes2.dex */
public final class ir7 extends dtf implements sm6 {
    public final /* synthetic */ InviteByPhoneScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ir7(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.X = inviteByPhoneScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ir7 ir7Var = (ir7) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ir7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ir7 ir7Var = new ir7(continuation, this.X);
        ir7Var.o = obj;
        return ir7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof ei4) {
            InviteByPhoneScreen inviteByPhoneScreen = this.X;
            api.c(inviteByPhoneScreen);
            bsi.a(inviteByPhoneScreen);
            xq7.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
