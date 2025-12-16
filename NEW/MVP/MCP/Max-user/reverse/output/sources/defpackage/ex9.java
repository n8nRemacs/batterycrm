package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ex9 extends dtf implements sm6 {
    public final /* synthetic */ gx9 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ xl9 Z;
    public int o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ex9(gx9 gx9Var, long j, xl9 xl9Var, long j2, Continuation continuation) {
        super(2, continuation);
        this.X = gx9Var;
        this.Y = j;
        this.Z = xl9Var;
        this.s0 = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ex9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ex9(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            final gx9 gx9Var = this.X;
            final long j = this.Y;
            final xl9 xl9Var = this.Z;
            final long j2 = this.s0;
            cm6 cm6Var = new cm6() { // from class: dx9
                @Override // defpackage.cm6
                public final Object invoke() {
                    gx9Var.a.d().q(j, xl9Var, j2);
                    return qqg.a;
                }
            };
            this.o = 1;
            Object objI = vmi.i(bd5.a, cm6Var, this);
            g84 g84Var = g84.a;
            if (objI == g84Var) {
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
