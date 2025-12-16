package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qcf extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ n46 Y;
    public final /* synthetic */ uid Z;
    public int o;
    public final /* synthetic */ z26 s0;
    public final /* synthetic */ long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qcf(n46 n46Var, uid uidVar, z26 z26Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = n46Var;
        this.Z = uidVar;
        this.s0 = z26Var;
        this.t0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qcf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        qcf qcfVar = new qcf(this.Y, this.Z, this.s0, this.t0, continuation);
        qcfVar.X = obj;
        return qcfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            pcf pcfVar = new pcf(this.Z, this.s0, f84Var, this.t0);
            this.o = 1;
            Object objD = this.Y.d(pcfVar, this);
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
