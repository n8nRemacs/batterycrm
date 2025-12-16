package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* loaded from: classes2.dex */
public final class i73 extends dtf implements sm6 {
    public final /* synthetic */ ChatsTabWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i73(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.X = chatsTabWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        i73 i73Var = (i73) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        i73Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        i73 i73Var = new i73(continuation, this.X);
        i73Var.o = obj;
        return i73Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int size = ((List) this.o).size();
        ChatsTabWidget chatsTabWidget = this.X;
        if (size > 1) {
            yy7[] yy7VarArr = ChatsTabWidget.F0;
            chatsTabWidget.A0().setVisibility(0);
            chatsTabWidget.B0().setUserInputEnabled(true);
        } else {
            yy7[] yy7VarArr2 = ChatsTabWidget.F0;
            chatsTabWidget.A0().setVisibility(8);
            chatsTabWidget.B0().setUserInputEnabled(false);
        }
        return qqg.a;
    }
}
