package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class mv9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mv9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.X = messagesListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        mv9 mv9Var = (mv9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        mv9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        mv9 mv9Var = new mv9(continuation, this.X);
        mv9Var.o = obj;
        return mv9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        MessagesListWidget messagesListWidget = this.X;
        bwf bwfVar = messagesListWidget.S0;
        g8j.b(obj);
        if (((Boolean) this.o).booleanValue()) {
            yy7[] yy7VarArr = MessagesListWidget.b1;
            messagesListWidget.H0().s0((dv9) bwfVar.getValue());
            messagesListWidget.H0().m((dv9) bwfVar.getValue());
        }
        return qqg.a;
    }
}
