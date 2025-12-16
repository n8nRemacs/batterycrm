package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class vh0 extends dtf implements sm6 {
    public final /* synthetic */ zh0 X;
    public final /* synthetic */ k18 Y;
    public final /* synthetic */ boolean Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh0(zh0 zh0Var, k18 k18Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = zh0Var;
        this.Y = k18Var;
        this.Z = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((vh0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new vh0(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        zh0 zh0Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            hi0 hi0Var = zh0Var.c;
            th0 th0Var = (th0) this.Y.getValue();
            this.o = 1;
            hi0Var.getClass();
            Object objD = d7j.d(new gi0(hi0Var, th0Var, null), this);
            g84 g84Var = g84.a;
            if (objD != g84Var) {
                objD = qqgVar;
            }
            if (objD == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        zh0Var.Y.m(null, zh0Var.t(this.Z));
        return qqgVar;
    }
}
