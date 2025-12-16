package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class cp9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cp9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.X = messageWriteWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        cp9 cp9Var = (cp9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        cp9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        cp9 cp9Var = new cp9(continuation, this.X);
        cp9Var.o = obj;
        return cp9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yh5 yh5Var = (yh5) this.o;
        hn9 hn9Var = yh5Var != null ? (hn9) yh5Var.a : null;
        yy7[] yy7VarArr = MessageWriteWidget.L0;
        wj9 wj9Var = hn9Var != null ? hn9Var.a : wj9.a;
        MessageWriteWidget messageWriteWidget = this.X;
        messageWriteWidget.C0().setEmojiExpandableState(wj9Var);
        if (wj9Var == wj9.b) {
            ik9 ik9VarC0 = messageWriteWidget.C0();
            po9 po9Var = new po9(messageWriteWidget, 6);
            fk9 fk9Var = ik9VarC0.d;
            fk9Var.setShowSoftInputOnFocus(false);
            fk9Var.setOnFocusChangeListener(new wa3(2, po9Var));
        }
        return qqg.a;
    }
}
