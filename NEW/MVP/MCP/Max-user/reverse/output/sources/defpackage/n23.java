package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.search.ChatsListSearchScreen;

/* loaded from: classes2.dex */
public final class n23 extends dtf implements sm6 {
    public final /* synthetic */ ChatsListSearchScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n23(Continuation continuation, ChatsListSearchScreen chatsListSearchScreen) {
        super(2, continuation);
        this.X = chatsListSearchScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        n23 n23Var = (n23) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        n23Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        n23 n23Var = new n23(continuation, this.X);
        n23Var.o = obj;
        return n23Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        this.X.C0.E((List) this.o);
        return qqg.a;
    }
}
