package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class gv9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gv9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.X = messagesListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gv9 gv9Var = (gv9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gv9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gv9 gv9Var = new gv9(continuation, this.X);
        gv9Var.o = obj;
        return gv9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        o3e o3eVar = (o3e) this.o;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        MessagesListWidget messagesListWidget = this.X;
        if (messagesListWidget.E0().x() == 0) {
            messagesListWidget.E0().u1(new hv9(messagesListWidget, o3eVar));
        } else {
            messagesListWidget.E0().w1("ScrollButton");
            MessagesListWidget.z0(messagesListWidget, o3eVar);
        }
        return qqg.a;
    }
}
