package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class x09 extends dtf implements sm6 {
    public final /* synthetic */ y09 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x09(y09 y09Var, Continuation continuation) {
        super(2, continuation);
        this.o = y09Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        x09 x09Var = (x09) l(bool, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        x09Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new x09(this.o, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        y09 y09Var = this.o;
        y09Var.e(!y09Var.e);
        y09Var.h.invoke();
        return qqg.a;
    }
}
