package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class wo2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaViewerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.X = chatMediaViewerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wo2 wo2Var = (wo2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wo2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wo2 wo2Var = new wo2(continuation, this.X);
        wo2Var.o = obj;
        return wo2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        int iOrdinal = ((w54) this.o).ordinal();
        ChatMediaViewerScreen chatMediaViewerScreen = this.X;
        if (iOrdinal == 0) {
            yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
            chatMediaViewerScreen.Q0().I();
            chatMediaViewerScreen.X0(true, true);
        } else if (iOrdinal == 1) {
            yy7[] yy7VarArr2 = ChatMediaViewerScreen.Q0;
            chatMediaViewerScreen.Q0().x();
            chatMediaViewerScreen.X0(true, false);
        } else if (iOrdinal == 2) {
            yy7[] yy7VarArr3 = ChatMediaViewerScreen.Q0;
            if (chatMediaViewerScreen.S0()) {
                ca9 ca9Var = chatMediaViewerScreen.B0;
                if (ca9Var != null) {
                    ca9Var.a().setVisibility(8);
                    ca9Var.a().setAlpha(0.0f);
                }
                chatMediaViewerScreen.Q0().I();
            }
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr4 = ChatMediaViewerScreen.Q0;
            chatMediaViewerScreen.Q0().x();
            chatMediaViewerScreen.X0(true, true);
        }
        return qqg.a;
    }
}
