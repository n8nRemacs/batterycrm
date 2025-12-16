package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class lu2 extends dtf implements sm6 {
    public final /* synthetic */ x26 X;
    public final /* synthetic */ ChatScreen Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lu2(x26 x26Var, Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = x26Var;
        this.Y = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lu2 lu2Var = (lu2) l((yh5) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lu2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lu2 lu2Var = new lu2(this.X, continuation, this.Y);
        lu2Var.o = obj;
        return lu2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        gn9 gn9Var;
        ChatScreen chatScreen = this.Y;
        g8j.b(obj);
        Object objA = ((yh5) this.o).a();
        Throwable thA = kpd.a(objA);
        qqg qqgVar = qqg.a;
        if (thA == null) {
            try {
                yy7[] yy7VarArr = ChatScreen.l1;
                yh5 yh5Var = (yh5) chatScreen.V0().C0.a.getValue();
                if (yh5Var == null || (gn9Var = (gn9) yh5Var.a) == null || !gn9Var.a) {
                    no9.B(chatScreen.V0(), true, 2);
                    chatScreen.K0();
                } else {
                    no9.C(chatScreen.V0(), 3);
                }
                ipdVar = qqgVar;
            } catch (Throwable th) {
                ipdVar = new ipd(th);
            }
            g8j.b(ipdVar);
        }
        return qqgVar;
    }
}
