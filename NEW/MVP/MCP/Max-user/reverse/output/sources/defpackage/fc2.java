package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fc2 extends dtf implements sm6 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ hc2 Y;
    public final /* synthetic */ pb2 Z;
    public int o;
    public final /* synthetic */ List s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fc2(Object obj, Continuation continuation, hc2 hc2Var, pb2 pb2Var, List list) {
        super(2, continuation);
        this.X = obj;
        this.Y = hc2Var;
        this.Z = pb2Var;
        this.s0 = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fc2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fc2(this.X, continuation, this.Y, this.Z, this.s0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, k18] */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        long jLongValue = ((Number) this.X).longValue();
        hc2 hc2Var = this.Y;
        jt4 jt4Var = (jt4) hc2Var.X.getValue();
        long j = hc2Var.b;
        pb2 pb2Var = this.Z;
        long j2 = pb2Var.b.a;
        int iG = pb2Var.g(jLongValue);
        this.o = 1;
        ((hwa) jt4Var.a.getValue()).E(j, j2, this.s0, true, iG);
        g84 g84Var = g84.a;
        return qqgVar == g84Var ? g84Var : qqgVar;
    }
}
