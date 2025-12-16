package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class vo9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.X = messageWriteWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        vo9 vo9Var = (vo9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        vo9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vo9 vo9Var = new vo9(continuation, this.X);
        vo9Var.o = obj;
        return vo9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean zBooleanValue = ((Boolean) this.o).booleanValue();
        yy7[] yy7VarArr = MessageWriteWidget.L0;
        MessageWriteWidget messageWriteWidget = this.X;
        if (messageWriteWidget.getView() != null) {
            messageWriteWidget.C0().setInputEnabled(!zBooleanValue);
        }
        return qqg.a;
    }
}
