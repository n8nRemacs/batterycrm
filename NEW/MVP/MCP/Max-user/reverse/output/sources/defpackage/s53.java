package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.list.ChatsListWidget;

/* loaded from: classes2.dex */
public final class s53 extends dtf implements sm6 {
    public final /* synthetic */ ChatsListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s53(Continuation continuation, ChatsListWidget chatsListWidget) {
        super(2, continuation);
        this.X = chatsListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        s53 s53Var = (s53) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        s53Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        s53 s53Var = new s53(continuation, this.X);
        s53Var.o = obj;
        return s53Var;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        if (cdaVar instanceof ei4) {
            y14.c.s0((ei4) cdaVar);
        } else if (cdaVar instanceof haf) {
            yy7[] yy7VarArr = ChatsListWidget.L0;
            haf hafVar = (haf) cdaVar;
            ((kj1) this.X.H0.getValue()).l(hafVar.b, hafVar.c, new oe1(cdaVar, 1));
        }
        return qqg.a;
    }
}
