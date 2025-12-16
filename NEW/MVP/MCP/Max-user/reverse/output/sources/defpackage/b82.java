package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b82 extends dtf implements sm6 {
    public final /* synthetic */ String X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b82(String str, Continuation continuation) {
        super(2, continuation);
        this.X = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        b82 b82Var = (b82) l((af2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        b82Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        b82 b82Var = new b82(this.X, continuation);
        b82Var.o = obj;
        return b82Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        ((af2) this.o).g = this.X;
        return qqg.a;
    }
}
