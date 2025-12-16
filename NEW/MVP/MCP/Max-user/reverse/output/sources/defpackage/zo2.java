package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class zo2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaViewerScreen X;
    public /* synthetic */ long o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zo2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.X = chatMediaViewerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        zo2 zo2Var = (zo2) l(new s65(((s65) obj).a), (Continuation) obj2);
        qqg qqgVar = qqg.a;
        zo2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        zo2 zo2Var = new zo2(continuation, this.X);
        zo2Var.o = ((s65) obj).a;
        return zo2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        long j = this.o;
        ChatMediaViewerScreen chatMediaViewerScreen = this.X;
        boolean z = chatMediaViewerScreen.N0;
        qqg qqgVar = qqg.a;
        if (z) {
            return qqgVar;
        }
        chatMediaViewerScreen.N0().d(s65.g(j), chatMediaViewerScreen.O0().O0(), chatMediaViewerScreen.O0().getDuration());
        return qqgVar;
    }
}
