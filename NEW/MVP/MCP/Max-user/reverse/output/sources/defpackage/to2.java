package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class to2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaViewerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public to2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.X = chatMediaViewerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        to2 to2Var = (to2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        to2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        to2 to2Var = new to2(continuation, this.X);
        to2Var.o = obj;
        return to2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        jp2 jp2Var = (jp2) this.o;
        yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
        int i = jp2Var.a;
        float f = jp2Var.b;
        if (i != 0) {
            ChatMediaViewerScreen chatMediaViewerScreen = this.X;
            ca9 ca9Var = chatMediaViewerScreen.B0;
            if (ca9Var != null) {
                ca9Var.a().setRotation(f);
            }
            za0 za0Var = chatMediaViewerScreen.C0;
            if (za0Var != null) {
                za0Var.c().setRotation(f);
            }
        }
        return qqg.a;
    }
}
