package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;
import one.me.calllist.ui.CallHistoryScreen;

/* loaded from: classes.dex */
public final class va1 extends dtf implements sm6 {
    public final /* synthetic */ CallHistoryScreen X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public va1(Continuation continuation, CallHistoryScreen callHistoryScreen) {
        super(2, continuation);
        this.X = callHistoryScreen;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        va1 va1Var = (va1) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        va1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        va1 va1Var = new va1(continuation, this.X);
        va1Var.o = obj;
        return va1Var;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        g8j.b(obj);
        CallHistoryScreen callHistoryScreen = this.X;
        bbd bbdVar = callHistoryScreen.s0;
        yy7[] yy7VarArr = CallHistoryScreen.D0;
        if (((xa1) callHistoryScreen.A0().o.getValue()).a) {
            ((yfb) bbdVar.D(callHistoryScreen, CallHistoryScreen.D0[1])).c(String.valueOf(((xa1) callHistoryScreen.A0().o.getValue()).b.size()), Collections.singletonList(new vfb(0, y2d.call_history_item_call_toolbar_action_remove, iwc.ic_delete_22)), new ra1(callHistoryScreen, 0), new k(18, callHistoryScreen));
        } else {
            tcf tcfVar = callHistoryScreen.A0().o;
            do {
                value = tcfVar.getValue();
            } while (!tcfVar.c(value, new xa1()));
            ((yfb) bbdVar.D(callHistoryScreen, CallHistoryScreen.D0[1])).a();
        }
        yfb yfbVar = (yfb) bbdVar.D(callHistoryScreen, CallHistoryScreen.D0[1]);
        ((bgb) yfbVar.y0.getValue()).setSelectionTitle(String.valueOf(((xa1) callHistoryScreen.A0().o.getValue()).b.size()));
        return qqg.a;
    }
}
