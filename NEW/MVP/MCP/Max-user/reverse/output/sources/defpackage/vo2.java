package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class vo2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaViewerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.X = chatMediaViewerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vo2 vo2Var = (vo2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vo2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vo2 vo2Var = new vo2(continuation, this.X);
        vo2Var.o = obj;
        return vo2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        ca9 ca9Var;
        g8j.b(obj);
        if (((Boolean) this.o).booleanValue()) {
            ChatMediaViewerScreen chatMediaViewerScreen = this.X;
            x9f x9fVar = chatMediaViewerScreen.O0;
            if (x9fVar != null) {
                x9fVar.cancel((CancellationException) null);
            }
            chatMediaViewerScreen.N0().b((gp2) chatMediaViewerScreen.Q0().a1.a.getValue());
            ca9 ca9Var2 = chatMediaViewerScreen.B0;
            if (ca9Var2 != null) {
                dqi.a(ca9Var2.a, ca9Var2.a(), 1);
            }
            if (chatMediaViewerScreen.N0().getVisibility() == 0 && (ca9Var = chatMediaViewerScreen.B0) != null) {
                ca9Var.c(true);
            }
            chatMediaViewerScreen.V0();
            chatMediaViewerScreen.Q0().k1.h(Boolean.FALSE);
        }
        return qqg.a;
    }
}
