package defpackage;

import kotlin.coroutines.Continuation;
import one.me.startconversation.chattitleicon.ChatTitleIconScreen;

/* loaded from: classes2.dex */
public final class gz2 extends dtf implements sm6 {
    public final /* synthetic */ ChatTitleIconScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gz2(Continuation continuation, ChatTitleIconScreen chatTitleIconScreen) {
        super(2, continuation);
        this.X = chatTitleIconScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        gz2 gz2Var = (gz2) l((hz2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        gz2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gz2 gz2Var = new gz2(continuation, this.X);
        gz2Var.o = obj;
        return gz2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        if (fni.a((hz2) this.o, hz2.a)) {
            yy7[] yy7VarArr = ChatTitleIconScreen.z0;
            ChatTitleIconScreen chatTitleIconScreen = this.X;
            chatTitleIconScreen.A0().setProgressEnabled(false);
            ccb ccbVar = new ccb(chatTitleIconScreen);
            ccbVar.g(new n5g(odb.b));
            ccbVar.i();
        }
        return qqg.a;
    }
}
