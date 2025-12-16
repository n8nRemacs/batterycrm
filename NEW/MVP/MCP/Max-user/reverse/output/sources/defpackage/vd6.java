package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class vd6 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ tid Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vd6(tid tidVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = tidVar;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vd6) l((h17) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        vd6 vd6Var = new vd6(this.Y, this.Z, continuation);
        vd6Var.X = obj;
        return vd6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h17 h17Var = (h17) this.X;
            g8j.b(obj);
            return h17Var;
        }
        g8j.b(obj);
        h17 h17Var2 = (h17) this.X;
        long jCurrentTimeMillis = System.currentTimeMillis() - this.Y.a;
        long j = this.Z;
        if (jCurrentTimeMillis <= j) {
            this.X = h17Var2;
            this.o = 1;
            Object objC = s8j.c(j - jCurrentTimeMillis, this);
            g84 g84Var = g84.a;
            if (objC == g84Var) {
                return g84Var;
            }
        }
        return h17Var2;
    }
}
