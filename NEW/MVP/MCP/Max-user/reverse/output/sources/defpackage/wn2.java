package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class wn2 extends dtf implements sm6 {
    public List X;
    public int Y;
    public final /* synthetic */ jo2 Z;
    public Object o;
    public final /* synthetic */ ul2 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn2(jo2 jo2Var, ul2 ul2Var, Continuation continuation) {
        super(2, continuation);
        this.Z = jo2Var;
        this.s0 = ul2Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((wn2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new wn2(this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        List listF;
        jo2 jo2Var;
        f9a f9aVar;
        int i = this.Y;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = jo2.W0;
            jo2 jo2Var2 = this.Z;
            pb2 pb2VarZ = jo2Var2.z();
            eh9 eh9Var = pb2VarZ != null ? pb2VarZ.c : null;
            Long lValueOf = eh9Var != null ? Long.valueOf(eh9Var.getC()) : null;
            if (lValueOf != null) {
                long jLongValue = lValueOf.longValue();
                ul2 ul2Var = this.s0;
                wqi.c(ul2Var.a, "getHistoryItems: %d", Long.valueOf(jLongValue));
                listF = ul2Var.b.f(jLongValue);
                this.o = jo2Var2;
                this.X = listF;
                this.Y = 1;
                if (jo2.x(jo2Var2, listF, this) != g84Var) {
                    jo2Var = jo2Var2;
                }
                return g84Var;
            }
            return qqg.a;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f9aVar = (f9a) this.o;
            g8j.b(obj);
            f9aVar.setValue(obj);
            return qqg.a;
        }
        listF = this.X;
        jo2Var = (jo2) this.o;
        g8j.b(obj);
        tcf tcfVar = jo2Var.T0;
        this.o = tcfVar;
        this.X = null;
        this.Y = 2;
        Object objE = jo2Var.E(listF, this);
        if (objE != g84Var) {
            f9aVar = tcfVar;
            obj = objE;
            f9aVar.setValue(obj);
            return qqg.a;
        }
        return g84Var;
    }
}
