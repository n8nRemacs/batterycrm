package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fu9 extends dtf implements sm6 {
    public vu9 X;
    public long Y;
    public boolean Z;
    public n9a o;
    public boolean s0;
    public int t0;
    public /* synthetic */ Object u0;
    public final /* synthetic */ vu9 v0;
    public final /* synthetic */ long w0;
    public final /* synthetic */ boolean x0;
    public final /* synthetic */ boolean y0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fu9(vu9 vu9Var, long j, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.v0 = vu9Var;
        this.w0 = j;
        this.x0 = z;
        this.y0 = z2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((fu9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        fu9 fu9Var = new fu9(this.v0, this.w0, this.x0, this.y0, continuation);
        fu9Var.u0 = obj;
        return fu9Var;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        vu9 vu9Var;
        n9a n9aVar;
        long j;
        boolean z;
        boolean z2;
        int i = this.t0;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.u0;
            vu9Var = this.v0;
            n9aVar = vu9Var.A1;
            this.u0 = f84Var;
            this.o = n9aVar;
            this.X = vu9Var;
            j = this.w0;
            this.Y = j;
            z = this.x0;
            this.Z = z;
            z2 = this.y0;
            this.s0 = z2;
            this.t0 = 1;
            Object objE = n9aVar.e(null, this);
            g84 g84Var = g84.a;
            if (objE == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = this.s0;
            z = this.Z;
            j = this.Y;
            vu9Var = this.X;
            n9aVar = this.o;
            f84Var = (f84) this.u0;
            g8j.b(obj);
        }
        boolean z3 = z2;
        boolean z4 = z;
        long j2 = j;
        vu9 vu9Var2 = vu9Var;
        try {
            x9f x9fVar = vu9Var2.x1;
            if (x9fVar == null || !x9fVar.isActive()) {
                vu9Var2.x1 = svi.e(f84Var, ((q2b) vu9Var2.X).b(), null, new eu9(vu9Var2, j2, z4, z3, null), 2);
            }
            n9aVar.g(null);
            return qqg.a;
        } catch (Throwable th) {
            n9aVar.g(null);
            throw th;
        }
    }
}
