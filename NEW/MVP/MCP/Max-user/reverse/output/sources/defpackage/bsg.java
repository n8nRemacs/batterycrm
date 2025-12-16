package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bsg extends dtf implements sm6 {
    public final /* synthetic */ csg X;
    public final /* synthetic */ pb2 Y;
    public final /* synthetic */ cm6 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bsg(csg csgVar, pb2 pb2Var, cm6 cm6Var, Continuation continuation) {
        super(2, continuation);
        this.X = csgVar;
        this.Y = pb2Var;
        this.Z = cm6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bsg) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bsg(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.X.g = false;
            csg csgVar = this.X;
            pb2 pb2Var = this.Y;
            hr9 hr9Var = (hr9) csgVar.b.getValue();
            this.o = 1;
            if (csgVar.a(pb2Var, hr9Var, this) == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        this.Z.invoke();
        return qqg.a;
    }
}
