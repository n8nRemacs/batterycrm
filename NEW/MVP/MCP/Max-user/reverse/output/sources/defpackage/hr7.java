package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.inviteactions.invitebyphone.InviteByPhoneScreen;

/* loaded from: classes2.dex */
public final class hr7 extends dtf implements sm6 {
    public final /* synthetic */ InviteByPhoneScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hr7(Continuation continuation, InviteByPhoneScreen inviteByPhoneScreen) {
        super(2, continuation);
        this.X = inviteByPhoneScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hr7 hr7Var = (hr7) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hr7Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hr7 hr7Var = new hr7(continuation, this.X);
        hr7Var.o = obj;
        return hr7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        er7 er7Var = (er7) this.o;
        if (er7Var == null) {
            throw new NoWhenBranchMatchedException();
        }
        InviteByPhoneScreen inviteByPhoneScreen = this.X;
        ((mx3) inviteByPhoneScreen.v0.getValue()).a(inviteByPhoneScreen.getContext(), er7Var.a);
        return qqg.a;
    }
}
