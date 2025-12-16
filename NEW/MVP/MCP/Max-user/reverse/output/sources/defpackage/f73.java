package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* loaded from: classes2.dex */
public final class f73 extends dtf implements sm6 {
    public final /* synthetic */ ChatsTabWidget X;
    public /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f73(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.X = chatsTabWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        f73 f73Var = (f73) l(Long.valueOf(((Number) obj).longValue()), (Continuation) obj2);
        qqg qqgVar = qqg.a;
        f73Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        f73 f73Var = new f73(continuation, this.X);
        f73Var.o = ((Number) obj).longValue();
        return f73Var;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (this.o > 0) {
            yy7[] yy7VarArr = ChatsTabWidget.F0;
        }
        return qqg.a;
    }
}
