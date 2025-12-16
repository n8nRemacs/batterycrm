package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class h63 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ tcf Y;
    public final /* synthetic */ a93 Z;
    public tcf o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h63(tcf tcfVar, Continuation continuation, a93 a93Var, long j) {
        super(2, continuation);
        this.Y = tcfVar;
        this.Z = a93Var;
        this.s0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((h63) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new h63(this.Y, continuation, this.Z, this.s0);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        tcf tcfVar;
        int i = this.X;
        long j = this.s0;
        a93 a93Var = this.Z;
        if (i == 0) {
            g8j.b(obj);
            ve2 ve2VarI = a93Var.i();
            tcfVar = this.Y;
            this.o = tcfVar;
            this.X = 1;
            ve2VarI.getClass();
            obj = si2.g(ve2VarI, j, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            tcfVar = this.o;
            g8j.b(obj);
        }
        pb2 pb2Var = (pb2) obj;
        pb2 pb2Var2 = null;
        if (pb2Var == null) {
            ((hwa) ((k18) a93Var.a).getValue()).f(j);
            pb2Var = null;
        }
        if (pb2Var != null) {
            ((f9a) ((ConcurrentHashMap) a93Var.o).computeIfAbsent(new Long(pb2Var.a), new i63(new e63(pb2Var, 1)))).setValue(pb2Var);
            pb2Var2 = pb2Var;
        }
        tcfVar.setValue(pb2Var2);
        return qqg.a;
    }
}
