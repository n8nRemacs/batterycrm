package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class fp9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fp9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.X = messageWriteWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fp9 fp9Var = (fp9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fp9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fp9 fp9Var = new fp9(continuation, this.X);
        fp9Var.o = obj;
        return fp9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        MessageWriteWidget.y0(this.X, (mn9) this.o);
        return qqg.a;
    }
}
