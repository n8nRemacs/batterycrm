package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* loaded from: classes2.dex */
public final class h73 extends dtf implements sm6 {
    public final /* synthetic */ ChatsTabWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h73(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.X = chatsTabWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        h73 h73Var = (h73) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        h73Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        h73 h73Var = new h73(continuation, this.X);
        h73Var.o = obj;
        return h73Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int iIntValue = ((Number) this.o).intValue();
        yy7[] yy7VarArr = ChatsTabWidget.F0;
        ChatsTabWidget chatsTabWidget = this.X;
        if (chatsTabWidget.B0().getCurrentItem() != iIntValue || chatsTabWidget.A0().getSelectedTabPosition() != iIntValue) {
            chatsTabWidget.B0().e(iIntValue, false);
            chatsTabWidget.A0().o(iIntValue, 0.0f, true, true, true);
        }
        return qqg.a;
    }
}
