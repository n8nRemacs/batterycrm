package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class hv2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hv2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        hv2 hv2Var = (hv2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        hv2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        hv2 hv2Var = new hv2(continuation, this.X);
        hv2Var.o = obj;
        return hv2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        mn9 mn9Var = (mn9) this.o;
        yy7[] yy7VarArr = ChatScreen.l1;
        ChatScreen chatScreen = this.X;
        if (chatScreen.g1().f1.a.getValue() != null) {
            ChatScreen.J0(chatScreen, !(chatScreen.a1().X.a.getValue() instanceof d7e) ? ys0.b : mn9Var == null ? ys0.c : ys0.a);
        }
        return qqg.a;
    }
}
