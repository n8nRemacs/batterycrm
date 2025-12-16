package defpackage;

import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ym0 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ an0 Y;
    public List o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym0(an0 an0Var, Continuation continuation) {
        super(2, continuation);
        this.Y = an0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ym0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ym0(this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        List list;
        pb2 pb2Var;
        tcf tcfVar;
        Object value;
        an0 an0Var = this.Y;
        AtomicLong atomicLong = an0Var.l;
        int i = this.X;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            long j = atomicLong.get();
            if (j != -1) {
                this.X = 1;
                obj = an0.g(an0Var, null, j, this);
                if (obj != g84Var) {
                }
                return g84Var;
            }
            return qqg.a;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = this.o;
            g8j.b(obj);
            pb2Var = (pb2) obj;
            tcfVar = an0Var.h;
            do {
                value = tcfVar.getValue();
            } while (!tcfVar.c(value, ue3.T((List) value, le9.c(pb2Var, list))));
            return qqg.a;
        }
        g8j.b(obj);
        imb imbVar = (imb) obj;
        if (imbVar != null) {
            long jLongValue = ((Number) imbVar.a).longValue();
            List list2 = (List) imbVar.b;
            atomicLong.set(jLongValue);
            d53 d53Var = new d53(((w63) an0Var.f.getValue()).j(an0Var.a), 12);
            this.o = list2;
            this.X = 2;
            Object objP = gw0.p(d53Var, this);
            if (objP != g84Var) {
                list = list2;
                obj = objP;
                pb2Var = (pb2) obj;
                tcfVar = an0Var.h;
                do {
                    value = tcfVar.getValue();
                } while (!tcfVar.c(value, ue3.T((List) value, le9.c(pb2Var, list))));
            }
            return g84Var;
        }
        return qqg.a;
    }
}
