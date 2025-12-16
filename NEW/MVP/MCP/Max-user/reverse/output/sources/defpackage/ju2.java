package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class ju2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ju2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ju2 ju2Var = (ju2) l((ys0) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ju2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ju2 ju2Var = new ju2(continuation, this.X);
        ju2Var.o = obj;
        return ju2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        g8j.b(obj);
        ys0 ys0Var = (ys0) this.o;
        yy7[] yy7VarArr = ChatScreen.l1;
        ChatScreen chatScreen = this.X;
        ds9 ds9VarX0 = chatScreen.X0();
        boolean zA = fni.a(ys0Var.name(), "SEARCH");
        tcf tcfVar = ds9VarX0.b;
        do {
            value = tcfVar.getValue();
            ((Boolean) value).getClass();
        } while (!tcfVar.c(value, Boolean.valueOf(zA)));
        ChatScreen.J0(chatScreen, ys0Var);
        return qqg.a;
    }
}
