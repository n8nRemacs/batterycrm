package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;
import one.me.chatscreen.ChatScreen;

/* loaded from: classes2.dex */
public final class dv2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ChatScreen Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dv2(Continuation continuation, ChatScreen chatScreen) {
        super(2, continuation);
        this.Y = chatScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((dv2) l(obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dv2 dv2Var = new dv2(continuation, this.Y);
        dv2Var.X = obj;
        return dv2Var;
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
        pf2 pf2Var = (pf2) this.X;
        yy7[] yy7VarArr = ChatScreen.l1;
        ChatScreen chatScreen = this.Y;
        mqf mqfVar = (mqf) chatScreen.H0.getValue();
        Context context = chatScreen.getContext();
        this.o = 1;
        Object objI = svi.i(((q2b) mqfVar.t()).a(), new jqf(pf2Var, mqfVar, context, null), this);
        g84 g84Var = g84.a;
        if (objI != g84Var) {
            objI = qqgVar;
        }
        return objI == g84Var ? g84Var : qqgVar;
    }
}
