package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ec2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ hbd Y;
    public final /* synthetic */ hc2 Z;
    public int o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec2(hbd hbdVar, Continuation continuation, hc2 hc2Var, long j) {
        super(2, continuation);
        this.Y = hbdVar;
        this.Z = hc2Var;
        this.s0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ec2) l((z26) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ec2 ec2Var = new ec2(this.Y, continuation, this.Z, this.s0);
        ec2Var.X = obj;
        return ec2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            dc2 dc2Var = new dc2((z26) this.X, this.Z, this.s0);
            this.o = 1;
            Object objD = this.Y.a.d(dc2Var, this);
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
