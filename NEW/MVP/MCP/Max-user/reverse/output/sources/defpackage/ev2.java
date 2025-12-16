package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class ev2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ev2 ev2Var = (ev2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ev2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ev2 ev2Var = new ev2(continuation, this.X);
        ev2Var.o = obj;
        return ev2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof jc3) {
            this.X.getRouter().C();
        } else if (cdaVar instanceof ei4) {
            wv2.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
