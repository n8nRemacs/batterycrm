package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class qp9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qp9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.X = messageWriteWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        qp9 qp9Var = (qp9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        qp9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qp9 qp9Var = new qp9(continuation, this.X);
        qp9Var.o = obj;
        return qp9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        boolean zBooleanValue = ((Boolean) this.o).booleanValue();
        yy7[] yy7VarArr = MessageWriteWidget.L0;
        MessageWriteWidget messageWriteWidget = this.X;
        messageWriteWidget.C0().setKeyboardVisible(zBooleanValue);
        ncg ncgVar = messageWriteWidget.G0;
        if (ncgVar != null) {
            ncgVar.dismiss();
        }
        messageWriteWidget.G0 = null;
        return qqg.a;
    }
}
