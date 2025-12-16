package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xv extends dtf implements sm6 {
    public final /* synthetic */ xw X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ mk3 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv(xw xwVar, long j, mk3 mk3Var, Continuation continuation) {
        super(2, continuation);
        this.X = xwVar;
        this.Y = j;
        this.Z = mk3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xv) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xv(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            xw xwVar = this.X;
            wu wuVar = xwVar.j;
            x6i x6iVar = new x6i(2, this.Z);
            this.o = 1;
            Object objR = xwVar.r(wuVar, this.Y, x6iVar, this);
            g84 g84Var = g84.a;
            if (objR == g84Var) {
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
