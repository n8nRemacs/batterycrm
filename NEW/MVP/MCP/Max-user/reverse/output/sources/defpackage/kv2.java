package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class kv2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kv2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        kv2 kv2Var = (kv2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        kv2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        kv2 kv2Var = new kv2(continuation, this.X);
        kv2Var.o = obj;
        return kv2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        q6a q6aVar = (q6a) this.o;
        yy7[] yy7VarArr = ChatScreen.l1;
        ChatScreen chatScreen = this.X;
        if (chatScreen.getView() != null) {
            if (q6aVar.a > 0) {
                chatScreen.e1().c(String.valueOf(q6aVar.a), q6aVar.b, new tl2(9, chatScreen), new z11(4, chatScreen));
            } else if (chatScreen.e1().b()) {
                chatScreen.e1().a();
            }
        }
        return qqg.a;
    }
}
