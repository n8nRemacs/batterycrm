package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xrh extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ yrh Y;
    public final /* synthetic */ orh Z;
    public int o;
    public final /* synthetic */ uqh s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xrh(uqh uqhVar, orh orhVar, yrh yrhVar, Continuation continuation) {
        super(2, continuation);
        this.Y = yrhVar;
        this.Z = orhVar;
        this.s0 = uqhVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xrh) l((Throwable) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        xrh xrhVar = new xrh(this.s0, this.Z, this.Y, continuation);
        xrhVar.X = obj;
        return xrhVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            Throwable th = (Throwable) this.X;
            yrh yrhVar = this.Y;
            yrhVar.getClass();
            aw7 aw7VarE = yrh.e(th);
            xh3 xh3VarF = yrhVar.f();
            pv0 pv0Var = yrhVar.d;
            String str = this.s0.c;
            this.o = 1;
            Object objA = xh3VarF.a(pv0Var, aw7VarE, this.Z, str, this);
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
