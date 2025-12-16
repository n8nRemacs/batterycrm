package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class xo2 extends dtf implements sm6 {
    public final /* synthetic */ ip2 X;
    public final /* synthetic */ ChatMediaViewerScreen o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo2(ChatMediaViewerScreen chatMediaViewerScreen, ip2 ip2Var, Continuation continuation) {
        super(2, continuation);
        this.o = chatMediaViewerScreen;
        this.X = ip2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xo2 xo2Var = (xo2) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xo2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xo2(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ChatMediaViewerScreen chatMediaViewerScreen = this.o;
        if (chatMediaViewerScreen.getView() != null) {
            yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
            chatMediaViewerScreen.R0().e(this.X.b, false);
        }
        return qqg.a;
    }
}
