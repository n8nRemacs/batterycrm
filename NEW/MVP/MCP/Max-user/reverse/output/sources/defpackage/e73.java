package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* loaded from: classes2.dex */
public final class e73 extends dtf implements sm6 {
    public final /* synthetic */ ChatsTabWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e73(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.X = chatsTabWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        e73 e73Var = (e73) l((List) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        e73Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        e73 e73Var = new e73(continuation, this.X);
        e73Var.o = obj;
        return e73Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        g8j.b(obj);
        List list = (List) this.o;
        ChatsTabWidget chatsTabWidget = this.X;
        chatsTabWidget.A0.f(list);
        chatsTabWidget.z0().M(list);
        z34 z34Var = chatsTabWidget.c;
        if (z34Var != null) {
            z34Var.dismiss();
        }
        chatsTabWidget.c = null;
        return qqg.a;
    }
}
