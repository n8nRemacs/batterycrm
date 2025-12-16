package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class cwb extends dtf implements sm6 {
    public final /* synthetic */ gwb X;
    public final /* synthetic */ double Y;
    public final /* synthetic */ double Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cwb(gwb gwbVar, double d, double d2, Continuation continuation) {
        super(2, continuation);
        this.X = gwbVar;
        this.Y = d;
        this.Z = d2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((cwb) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new cwb(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            jve jveVar = this.X.u0;
            imb imbVar = new imb(new Double(this.Y), new Double(this.Z));
            this.o = 1;
            Object objA = jveVar.a(imbVar, this);
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
