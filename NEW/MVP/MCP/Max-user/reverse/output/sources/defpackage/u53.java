package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* loaded from: classes2.dex */
public final class u53 extends dtf implements sm6 {
    public final /* synthetic */ ChatsListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u53(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.X = chatsListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        u53 u53Var = (u53) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        u53Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        u53 u53Var = new u53(continuation, this.X);
        u53Var.o = obj;
        return u53Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.E0.E((List) this.o);
        return qqg.a;
    }
}
