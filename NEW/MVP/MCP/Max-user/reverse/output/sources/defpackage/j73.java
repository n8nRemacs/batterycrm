package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chats.tab.ChatsTabWidget;

/* loaded from: classes2.dex */
public final class j73 extends dtf implements sm6 {
    public final /* synthetic */ ChatsTabWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j73(Continuation continuation, ChatsTabWidget chatsTabWidget) {
        super(2, continuation);
        this.X = chatsTabWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        j73 j73Var = (j73) l((h17) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        j73Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        j73 j73Var = new j73(continuation, this.X);
        j73Var.o = obj;
        return j73Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        h17 h17Var = (h17) this.o;
        ChatsTabWidget chatsTabWidget = this.X;
        yy7[] yy7VarArr = ChatsTabWidget.F0;
        String name = ChatsTabWidget.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "handleHeaderStateUpdate: state=" + h17Var, null);
            }
        }
        zhg.b(chatsTabWidget.C0());
        b90 b90Var = new b90();
        b90Var.U(0);
        zhg.a(chatsTabWidget.C0(), b90Var);
        yfb yfbVarC0 = chatsTabWidget.C0();
        CharSequence charSequenceB = h17Var.a.b(chatsTabWidget.getContext());
        if (charSequenceB == null) {
            charSequenceB = "";
        }
        yfbVarC0.setTitle(charSequenceB);
        yfb yfbVarC02 = chatsTabWidget.C0();
        s5g s5gVar = h17Var.b;
        yfbVarC02.setSubtitle(s5gVar != null ? s5gVar.b(chatsTabWidget.getContext()) : null);
        chatsTabWidget.C0().setTextShimmerEnabled(h17Var.b != null);
        return qqg.a;
    }
}
