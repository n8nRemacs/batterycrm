package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class oo2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaViewerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oo2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.X = chatMediaViewerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        oo2 oo2Var = (oo2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        oo2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        oo2 oo2Var = new oo2(continuation, this.X);
        oo2Var.o = obj;
        return oo2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ip2 ip2Var = (ip2) this.o;
        ChatMediaViewerScreen chatMediaViewerScreen = this.X;
        pm2 pm2Var = chatMediaViewerScreen.G0;
        int iJ = pm2Var.j();
        pm2Var.x0.b(ip2Var.a, new vy1(15, new yo2(chatMediaViewerScreen, iJ, ip2Var)));
        return qqg.a;
    }
}
