package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class qo2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaViewerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qo2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.X = chatMediaViewerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qo2 qo2Var = (qo2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qo2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qo2 qo2Var = new qo2(continuation, this.X);
        qo2Var.o = obj;
        return qo2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        gp2 gp2Var = (gp2) this.o;
        yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
        ChatMediaViewerScreen chatMediaViewerScreen = this.X;
        chatMediaViewerScreen.N0().a(gp2Var, ((gu5) chatMediaViewerScreen.M0()).s());
        CharSequence charSequence = gp2Var.c;
        if (((gu5) chatMediaViewerScreen.M0()).s()) {
            d52 d52VarL0 = chatMediaViewerScreen.L0();
            if (d52VarL0 != null) {
                d52VarL0.setVisibility(chatMediaViewerScreen.N0().getVisibility() == 0 && charSequence.length() > 0 ? 0 : 8);
            }
            d52 d52VarL02 = chatMediaViewerScreen.L0();
            if (d52VarL02 != null) {
                d52VarL02.setText(charSequence);
            }
        }
        return qqg.a;
    }
}
