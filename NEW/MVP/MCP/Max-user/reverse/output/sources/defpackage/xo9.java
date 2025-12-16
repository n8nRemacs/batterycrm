package defpackage;

import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class xo9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xo9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.X = messageWriteWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        xo9 xo9Var = (xo9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        xo9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xo9 xo9Var = new xo9(continuation, this.X);
        xo9Var.o = obj;
        return xo9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        gl8 gl8Var = (gl8) this.o;
        boolean z = gl8Var instanceof el8;
        MessageWriteWidget messageWriteWidget = this.X;
        if (z) {
            dp8 dp8Var = messageWriteWidget.D0;
            if (dp8Var != null) {
                el8 el8Var = (el8) gl8Var;
                dp8Var.d(el8Var.a, el8Var.b, el8Var.c);
            }
        } else {
            if (!(gl8Var instanceof fl8)) {
                throw new NoWhenBranchMatchedException();
            }
            fl8 fl8Var = (fl8) gl8Var;
            dp8 dp8Var2 = messageWriteWidget.D0;
            if (dp8Var2 != null) {
                dp8Var2.a(fl8Var.a, fl8Var.b, fl8Var.c, fl8Var.d);
            }
        }
        return qqg.a;
    }
}
