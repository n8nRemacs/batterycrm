package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qhc extends dtf implements sm6 {
    public final /* synthetic */ rhc X;
    public final /* synthetic */ hhc Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qhc(rhc rhcVar, hhc hhcVar, Continuation continuation) {
        super(2, continuation);
        this.X = rhcVar;
        this.Y = hhcVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qhc) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qhc(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            rhc rhcVar = this.X;
            jve jveVar = rhcVar.a;
            ihc ihcVar = new ihc(null, rhc.a(rhcVar, this.Y.b));
            this.o = 1;
            Object objA = jveVar.a(ihcVar, this);
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
