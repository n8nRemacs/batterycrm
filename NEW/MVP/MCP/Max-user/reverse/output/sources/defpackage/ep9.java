package defpackage;

import kotlin.coroutines.Continuation;
import one.me.sdk.messagewrite.MessageWriteWidget;

/* loaded from: classes2.dex */
public final class ep9 extends dtf implements sm6 {
    public final /* synthetic */ MessageWriteWidget X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep9(Continuation continuation, MessageWriteWidget messageWriteWidget) {
        super(2, continuation);
        this.X = messageWriteWidget;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        ep9 ep9Var = (ep9) l(obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        ep9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ep9 ep9Var = new ep9(continuation, this.X);
        ep9Var.o = obj;
        return ep9Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        MessageWriteWidget.A0(this.X, (sn9) this.o);
        return qqg.a;
    }
}
