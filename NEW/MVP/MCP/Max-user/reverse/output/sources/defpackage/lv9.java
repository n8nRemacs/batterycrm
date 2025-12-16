package defpackage;

import kotlin.coroutines.Continuation;
import one.me.messages.list.ui.MessagesListWidget;
import one.me.sdk.lists.widgets.EndlessRecyclerView2;

/* loaded from: classes2.dex */
public final class lv9 extends dtf implements sm6 {
    public final /* synthetic */ MessagesListWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv9(Continuation continuation, MessagesListWidget messagesListWidget) {
        super(2, continuation);
        this.X = messagesListWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lv9 lv9Var = (lv9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lv9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lv9 lv9Var = new lv9(continuation, this.X);
        lv9Var.o = obj;
        return lv9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = MessagesListWidget.b1;
        MessagesListWidget messagesListWidget = this.X;
        EndlessRecyclerView2 endlessRecyclerView2H0 = messagesListWidget.H0();
        if (endlessRecyclerView2H0.getScrollState() == 0) {
            messagesListWidget.A0().f(endlessRecyclerView2H0, false);
        }
        return qqg.a;
    }
}
