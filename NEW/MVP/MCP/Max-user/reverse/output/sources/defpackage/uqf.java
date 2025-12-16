package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class uqf extends dtf implements sm6 {
    public xqf X;
    public int Y;
    public /* synthetic */ Object Z;
    public n9a o;
    public final /* synthetic */ xqf s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqf(xqf xqfVar, Continuation continuation) {
        super(2, continuation);
        this.s0 = xqfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((uqf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        uqf uqfVar = new uqf(this.s0, continuation);
        uqfVar.Z = obj;
        return uqfVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        n9a n9aVar;
        xqf xqfVar;
        x9f x9fVar;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.Y;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.Z;
            xqf xqfVar2 = this.s0;
            n9aVar = xqfVar2.p;
            this.Z = f84Var;
            this.o = n9aVar;
            this.X = xqfVar2;
            this.Y = 1;
            if (n9aVar.e(null, this) == g84Var) {
                return g84Var;
            }
            xqfVar = xqfVar2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            xqfVar = this.X;
            n9aVar = this.o;
            f84Var = (f84) this.Z;
            g8j.b(obj);
        }
        try {
            if (xqf.e(xqfVar.b) && ((x9fVar = xqfVar.q) == null || !x9fVar.isActive())) {
                xqfVar.q = svi.e(f84Var, null, null, new tqf(xqfVar, null), 3);
                n9aVar.g(null);
                return qqgVar;
            }
            return qqgVar;
        } finally {
            n9aVar.g(null);
        }
    }
}
