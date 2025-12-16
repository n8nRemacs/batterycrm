package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class f49 extends dtf implements sm6 {
    public final /* synthetic */ h49 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f49(h49 h49Var, Continuation continuation) {
        super(2, continuation);
        this.X = h49Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        f49 f49Var = (f49) l((w8h) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        f49Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        f49 f49Var = new f49(this.X, continuation);
        f49Var.o = obj;
        return f49Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        h49.a(this.X, new Long(((w8h) this.o).b));
        return qqg.a;
    }
}
