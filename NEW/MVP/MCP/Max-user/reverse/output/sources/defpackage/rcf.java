package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rcf extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n46 Y;
    public final /* synthetic */ uid Z;
    public int o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rcf(n46 n46Var, uid uidVar, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = n46Var;
        this.Z = uidVar;
        this.s0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rcf) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rcf rcfVar = new rcf(this.Y, this.Z, this.s0, continuation);
        rcfVar.X = obj;
        return rcfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            qcf qcfVar = new qcf(this.Y, this.Z, (z26) this.X, this.s0, null);
            this.o = 1;
            Object objD = d7j.d(qcfVar, this);
            g84 g84Var = g84.a;
            if (objD == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        return qqg.a;
    }
}
