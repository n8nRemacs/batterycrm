package defpackage;

import kotlin.coroutines.Continuation;
import one.me.calllist.ui.page.CallHistoryPageScreen;

/* loaded from: classes.dex */
public final class la1 extends dtf implements sm6 {
    public final /* synthetic */ CallHistoryPageScreen X;
    public /* synthetic */ boolean o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la1(CallHistoryPageScreen callHistoryPageScreen, Continuation continuation) {
        super(2, continuation);
        this.X = callHistoryPageScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        la1 la1Var = (la1) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        la1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        la1 la1Var = new la1(this.X, continuation);
        la1Var.o = ((Boolean) obj).booleanValue();
        return la1Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        g8j.b(obj);
        boolean z = this.o;
        v17 v17Var = CallHistoryPageScreen.u0;
        tcf tcfVar = this.X.A0().s0;
        do {
            value = tcfVar.getValue();
            ((Boolean) value).getClass();
        } while (!tcfVar.c(value, Boolean.valueOf(z)));
        return qqg.a;
    }
}
