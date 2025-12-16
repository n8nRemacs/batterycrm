package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class onc extends dtf implements sm6 {
    public final /* synthetic */ pnc X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public onc(pnc pncVar, Continuation continuation) {
        super(2, continuation);
        this.X = pncVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((onc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new onc(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        pnc pncVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            yac yacVar = pncVar.T0;
            this.o = 1;
            qqg qqgVarC = yacVar.C(this);
            g84 g84Var = g84.a;
            if (qqgVarC == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        xfh.r(pncVar.E0, new kmc(new n5g(x8b.I0), new Integer(yud.o)));
        return qqg.a;
    }
}
