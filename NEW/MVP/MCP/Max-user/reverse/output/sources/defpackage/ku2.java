package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class ku2 extends dtf implements sm6 {
    public final /* synthetic */ ChatScreen X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ku2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ku2(continuation, this.X);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        ChatScreen chatScreen = this.X;
        if (chatScreen.getView() != null) {
            x26 x26VarM = gw0.m(new z41(chatScreen.a1().X, chatScreen.g1().f1, new s3(chatScreen, null, 6), 3));
            ju2 ju2Var = new ju2(null, chatScreen);
            this.o = 1;
            Object objD = x26VarM.d(new f56(kia.a, ju2Var, 1), this);
            g84 g84Var = g84.a;
            if (objD != g84Var) {
                objD = qqgVar;
            }
            if (objD != g84Var) {
                objD = qqgVar;
            }
            if (objD == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
