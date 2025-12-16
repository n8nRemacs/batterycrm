package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;

/* loaded from: classes2.dex */
public final class tv9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tv9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.X = messagesListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        tv9 tv9Var = (tv9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        tv9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        tv9 tv9Var = new tv9(continuation, this.X);
        tv9Var.o = obj;
        return tv9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int iK;
        g8j.b(obj);
        asg asgVar = (asg) this.o;
        long jA = asgVar.a();
        MessagesListWidget messagesListWidget = this.X;
        hs hsVar = messagesListWidget.d;
        yy7[] yy7VarArr = MessagesListWidget.b1;
        yy7 yy7Var = yy7VarArr[2];
        hsVar.b(messagesListWidget, Long.valueOf(jA));
        xrg xrgVar = messagesListWidget.H0;
        if (xrgVar != null) {
            hs hsVar2 = messagesListWidget.X;
            yy7 yy7Var2 = yy7VarArr[4];
            xrgVar.c = ((Boolean) hsVar2.a(messagesListWidget)).booleanValue() ? 0L : asgVar.a();
            messagesListWidget.H0().Y();
            if ((asgVar instanceof zrg) && (iK = messagesListWidget.C0.K(((zrg) asgVar).a)) >= 0) {
                messagesListWidget.O0.e = -1;
                messagesListWidget.H0().getLinearLayoutManager().o1(iK, messagesListWidget.H0().getMeasuredHeight() - xrgVar.i().getMeasuredHeight());
            }
        }
        return qqg.a;
    }
}
