package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class dp9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dp9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.X = messageWriteWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        dp9 dp9Var = (dp9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        dp9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        dp9 dp9Var = new dp9(continuation, this.X);
        dp9Var.o = obj;
        return dp9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yh5 yh5Var = (yh5) this.o;
        in9 in9Var = yh5Var != null ? (in9) yh5Var.a : null;
        MessageWriteWidget messageWriteWidget = this.X;
        tcf tcfVar = messageWriteWidget.F0;
        if ((in9Var != null ? in9Var.a : 0) == 2) {
            messageWriteWidget.C0().setLeftIcon(yud.Y0);
            tcfVar.m(null, Boolean.TRUE);
        } else {
            messageWriteWidget.C0().setEmojiExpandableState(wj9.a);
            fk9 fk9Var = messageWriteWidget.C0().d;
            fk9Var.setShowSoftInputOnFocus(true);
            fk9Var.setOnFocusChangeListener(null);
            messageWriteWidget.C0().setLeftIcon(yud.U0);
            tcfVar.m(null, Boolean.FALSE);
        }
        return qqg.a;
    }
}
