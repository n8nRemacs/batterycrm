package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class xed extends dtf implements sm6 {
    public final /* synthetic */ zed X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xed(zed zedVar, long j, Continuation continuation) {
        super(2, continuation);
        this.X = zedVar;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((xed) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new xed(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        zed zedVar = this.X;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = zed.I0;
            xfd xfdVarC = zedVar.C();
            this.o = 1;
            Object objF = xfdVarC.f(this.Y, this);
            g84 g84Var = g84.a;
            if (objF == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        yy7[] yy7VarArr2 = zed.I0;
        zedVar.y().g(zedVar.C().j() != null ? Long.valueOf(r0.hashCode()) : null);
        if (zedVar.E()) {
            zedVar.y().a();
        } else {
            zedVar.y().b();
        }
        return qqg.a;
    }
}
