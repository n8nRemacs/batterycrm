package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class so9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public so9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.X = messageWriteWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        so9 so9Var = (so9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        so9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        so9 so9Var = new so9(continuation, this.X);
        so9Var.o = obj;
        return so9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        yy7[] yy7VarArr = MessageWriteWidget.L0;
        MessageWriteWidget messageWriteWidget = this.X;
        dqi.d(messageWriteWidget.C0(), new z11(11, messageWriteWidget));
        return qqg.a;
    }
}
