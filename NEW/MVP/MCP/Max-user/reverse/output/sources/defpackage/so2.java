package defpackage;

import java.io.IOException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class so2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaViewerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.X = chatMediaViewerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) throws IOException {
        so2 so2Var = (so2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        so2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        so2 so2Var = new so2(continuation, this.X);
        so2Var.o = obj;
        return so2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws IOException {
        g8j.b(obj);
        cda cdaVar = (cda) this.o;
        boolean z = cdaVar instanceof fo5;
        ChatMediaViewerScreen chatMediaViewerScreen = this.X;
        if (z) {
            ChatMediaViewerScreen.I0(chatMediaViewerScreen);
            ko2.c.p0().b(":external_callback", gwi.b(new imb("params", ((fo5) cdaVar).b)));
        } else if (cdaVar instanceof pp7) {
            ChatMediaViewerScreen.I0(chatMediaViewerScreen);
            ko2 ko2Var = ko2.c;
            ko2Var.p0().c(((oi4) ((pp7) cdaVar).a).a, null);
        } else if (cdaVar instanceof ei4) {
            ChatMediaViewerScreen.I0(chatMediaViewerScreen);
            ko2.c.s0((ei4) cdaVar);
        }
        return qqg.a;
    }
}
