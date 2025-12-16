package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class np9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public /* synthetic */ int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public np9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.X = messageWriteWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        np9 np9Var = (np9) l(Integer.valueOf(((Number) obj).intValue()), (Continuation) obj2);
        qqg qqgVar = qqg.a;
        np9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        np9 np9Var = new np9(continuation, this.X);
        np9Var.o = ((Number) obj).intValue();
        return np9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object value;
        g8j.b(obj);
        int i = this.o;
        yy7[] yy7VarArr = MessageWriteWidget.L0;
        tcf tcfVar = this.X.J0().G0;
        do {
            value = tcfVar.getValue();
            ((Number) value).intValue();
        } while (!tcfVar.c(value, Integer.valueOf(i)));
        return qqg.a;
    }
}
