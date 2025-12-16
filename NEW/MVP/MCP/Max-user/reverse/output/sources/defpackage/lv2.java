package defpackage;

import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class lv2 extends dtf implements sm6 {
    public final /* synthetic */ x26 X;
    public final /* synthetic */ ChatScreen Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lv2(x26 x26Var, Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.X = x26Var;
        this.Y = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        lv2 lv2Var = (lv2) l((yh5) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        lv2Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        lv2 lv2Var = new lv2(this.X, continuation, this.Y);
        lv2Var.o = obj;
        return lv2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object ipdVar;
        g8j.b(obj);
        Object objA = ((yh5) this.o).a();
        Throwable thA = kpd.a(objA);
        qqg qqgVar = qqg.a;
        if (thA == null) {
            try {
                ChatScreen chatScreen = this.Y;
                yy7[] yy7VarArr = ChatScreen.l1;
                chatScreen.k1();
                ipdVar = qqgVar;
            } catch (Throwable th) {
                ipdVar = new ipd(th);
            }
            g8j.b(ipdVar);
        }
        return qqgVar;
    }
}
