package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yt9 extends dtf implements sm6 {
    public vu9 X;
    public List Y;
    public int Z;
    public n9a o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ vu9 t0;
    public final /* synthetic */ List u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yt9(vu9 vu9Var, List list, Continuation continuation) {
        super(2, continuation);
        this.t0 = vu9Var;
        this.u0 = list;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yt9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        yt9 yt9Var = new yt9(this.t0, this.u0, continuation);
        yt9Var.s0 = obj;
        return yt9Var;
    }

    /* JADX WARN: Finally extract failed */
    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        vu9 vu9Var;
        n9a n9aVar;
        List list;
        int i = this.Z;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.s0;
            vu9Var = this.t0;
            n9aVar = vu9Var.z1;
            this.s0 = f84Var;
            this.o = n9aVar;
            this.X = vu9Var;
            list = this.u0;
            this.Y = list;
            this.Z = 1;
            Object objE = n9aVar.e(null, this);
            g84 g84Var = g84.a;
            if (objE == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = this.Y;
            vu9Var = this.X;
            n9aVar = this.o;
            f84Var = (f84) this.s0;
            g8j.b(obj);
        }
        try {
            x9f x9fVar = vu9Var.w1;
            if (x9fVar == null || !x9fVar.isActive()) {
                vu9Var.w1 = svi.e(f84Var, ((q2b) vu9Var.X).b(), null, new xt9(vu9Var, list, null), 2);
            }
            n9aVar.g(null);
            return qqg.a;
        } catch (Throwable th) {
            n9aVar.g(null);
            throw th;
        }
    }
}
