package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class eda extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ gda Y;
    public final /* synthetic */ f1e Z;
    public int o;
    public final /* synthetic */ qmb s0;
    public final /* synthetic */ hg8 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eda(int i, gda gdaVar, f1e f1eVar, qmb qmbVar, hg8 hg8Var, Continuation continuation) {
        super(2, continuation);
        this.X = i;
        this.Y = gdaVar;
        this.Z = f1eVar;
        this.s0 = qmbVar;
        this.t0 = hg8Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((eda) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new eda(this.X, this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qmb qmbVar = this.s0;
        f1e f1eVar = this.Z;
        int i2 = this.X;
        gda gdaVar = this.Y;
        if (i == 0) {
            g8j.b(obj);
            if (i2 != 1) {
                gdaVar.getClass();
                gdaVar.h(f1eVar.a, this.t0, i2, qmbVar);
                return qqg.a;
            }
            this.o = 1;
            Object objA = gda.a(gdaVar, this);
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
        gdaVar.getClass();
        gdaVar.h(f1eVar.a, null, i2, qmbVar);
        return qqg.a;
    }
}
