package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class iu2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iu2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        iu2 iu2Var = (iu2) l((u27) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        iu2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        iu2 iu2Var = new iu2(continuation, this.X);
        iu2Var.o = obj;
        return iu2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        u27 u27Var = (u27) this.o;
        imb imbVar = u27Var == null ? null : new imb(new Long(u27Var.b), u27Var.d);
        yy7[] yy7VarArr = ChatScreen.l1;
        this.X.X0().t(imbVar);
        return qqg.a;
    }
}
