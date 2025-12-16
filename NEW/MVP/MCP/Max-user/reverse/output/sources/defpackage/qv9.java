package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class qv9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.X = messagesListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qv9 qv9Var = (qv9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qv9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qv9 qv9Var = new qv9(continuation, this.X);
        qv9Var.o = obj;
        return qv9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean zBooleanValue = ((Boolean) this.o).booleanValue();
        yy7[] yy7VarArr = MessagesListWidget.b1;
        this.X.J0().setVisibility(!zBooleanValue ? 0 : 8);
        return qqg.a;
    }
}
