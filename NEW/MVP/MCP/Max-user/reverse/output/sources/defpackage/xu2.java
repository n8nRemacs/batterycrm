package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class xu2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xu2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.o = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        xu2 xu2Var = (xu2) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xu2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xu2(continuation, this.o);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = ChatScreen.l1;
        this.o.K0();
        return qqg.a;
    }
}
