package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class pq2 extends dtf implements sm6 {
    public final /* synthetic */ yq2 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ String Z;
    public int o;
    public final /* synthetic */ long s0;
    public final /* synthetic */ long t0;
    public final /* synthetic */ boolean u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq2(yq2 yq2Var, long j, String str, long j2, long j3, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = yq2Var;
        this.Y = j;
        this.Z = str;
        this.s0 = j2;
        this.t0 = j3;
        this.u0 = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((pq2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new pq2(this.X, this.Y, this.Z, this.s0, this.t0, this.u0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            yxd yxdVar = (yxd) this.X.C0.getValue();
            this.o = 1;
            Object objA = yxdVar.a(this.Y, this.Z, this.s0, this.t0, this.u0, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
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
