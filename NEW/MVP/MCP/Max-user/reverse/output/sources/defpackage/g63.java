package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class g63 extends dtf implements sm6 {
    public final /* synthetic */ a93 X;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g63(a93 a93Var, Continuation continuation) {
        super(2, continuation);
        this.X = a93Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        g63 g63Var = (g63) l((pb2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        g63Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        g63 g63Var = new g63(this.X, continuation);
        g63Var.o = obj;
        return g63Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        pb2 pb2Var = (pb2) this.o;
        ((f9a) ((ConcurrentHashMap) this.X.o).computeIfAbsent(new Long(pb2Var.a), new ni(9, new d63(pb2Var, 2)))).setValue(pb2Var);
        return qqg.a;
    }
}
