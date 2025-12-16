package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class wo9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.X = messageWriteWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        wo9 wo9Var = (wo9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        wo9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        wo9 wo9Var = new wo9(continuation, this.X);
        wo9Var.o = obj;
        return wo9Var;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        MessageWriteWidget messageWriteWidget = this.X;
        bbd bbdVar = messageWriteWidget.z0;
        g8j.b(obj);
        cl8 cl8Var = (cl8) this.o;
        int iV = az1.v(cl8Var.b);
        if (iV == 0) {
            yy7[] yy7VarArr = MessageWriteWidget.L0;
            messageWriteWidget.C0().setLeftIcon(yud.U0);
            yy7[] yy7VarArr2 = MessageWriteWidget.L0;
            ((RecyclerView) bbdVar.D(messageWriteWidget, yy7VarArr2[3])).setVisibility(8);
            ((RecyclerView) bbdVar.D(messageWriteWidget, yy7VarArr2[3])).x0(0);
            messageWriteWidget.C0().setSelection(messageWriteWidget.C0().getSelectionEnd());
        } else if (iV == 1) {
            yy7[] yy7VarArr3 = MessageWriteWidget.L0;
            messageWriteWidget.C0().setLeftIcon(ivd.S0);
        } else {
            if (iV != 2) {
                throw new NoWhenBranchMatchedException();
            }
            yy7[] yy7VarArr4 = MessageWriteWidget.L0;
            messageWriteWidget.C0().setLeftIcon(ivd.Q);
            ((dl8) messageWriteWidget.I0.getValue()).E(cl8Var.a);
            ((RecyclerView) bbdVar.D(messageWriteWidget, MessageWriteWidget.L0[3])).setVisibility(0);
        }
        return qqg.a;
    }
}
