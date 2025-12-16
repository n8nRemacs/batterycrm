package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;

/* loaded from: classes.dex */
public final class uo2 extends dtf implements sm6 {
    public final /* synthetic */ ChatMediaViewerScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo2(Continuation continuation, ChatMediaViewerScreen chatMediaViewerScreen) {
        super(2, continuation);
        this.X = chatMediaViewerScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        uo2 uo2Var = (uo2) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        uo2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uo2 uo2Var = new uo2(continuation, this.X);
        uo2Var.o = obj;
        return uo2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        v54 v54Var = (v54) this.o;
        yy7[] yy7VarArr = ChatMediaViewerScreen.Q0;
        boolean zA = fni.a(v54Var, r54.a);
        ChatMediaViewerScreen chatMediaViewerScreen = this.X;
        if (zA) {
            if (chatMediaViewerScreen.M0 >= 0.0f) {
                chatMediaViewerScreen.O0().b(chatMediaViewerScreen.M0);
                chatMediaViewerScreen.M0 = -1.0f;
                chatMediaViewerScreen.N0().c(false);
            } else {
                chatMediaViewerScreen.M0 = chatMediaViewerScreen.O0().a();
                chatMediaViewerScreen.O0().b(0.0f);
                chatMediaViewerScreen.N0().c(true);
            }
        } else if (fni.a(v54Var, t54.a)) {
            chatMediaViewerScreen.N0 = true;
            chatMediaViewerScreen.Q0().x();
        } else if (v54Var instanceof u54) {
            chatMediaViewerScreen.N0 = false;
            chatMediaViewerScreen.O0().seekTo(((u54) v54Var).a);
            chatMediaViewerScreen.Q0().I();
        } else if (v54Var instanceof s54) {
            yq2 yq2VarQ0 = chatMediaViewerScreen.Q0();
            yq2VarQ0.p1.O(yq2VarQ0, yq2.u1[4], svi.d(yq2VarQ0.a, ((q2b) yq2VarQ0.t0).b(), i84.b, new dq2(((s54) v54Var).a, yq2VarQ0, null)));
        } else {
            if (!fni.a(v54Var, q54.a)) {
                throw new NoWhenBranchMatchedException();
            }
            chatMediaViewerScreen.Q0().x();
            chatMediaViewerScreen.Q0().O(d1b.e, null);
        }
        return qqg.a;
    }
}
