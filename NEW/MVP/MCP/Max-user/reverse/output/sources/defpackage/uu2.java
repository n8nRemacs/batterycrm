package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class uu2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uu2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        uu2 uu2Var = (uu2) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        uu2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uu2 uu2Var = new uu2(continuation, this.X);
        uu2Var.o = ((Boolean) obj).booleanValue();
        return uu2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (this.o) {
            c54 c54Var = this.X;
            c54Var.getRouter().B(c54Var);
        }
        return qqg.a;
    }
}
