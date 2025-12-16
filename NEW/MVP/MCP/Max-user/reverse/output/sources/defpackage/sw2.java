package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sw2 extends dtf implements sm6 {
    public final /* synthetic */ long X;
    public final /* synthetic */ zx2 Y;
    public final /* synthetic */ vf6 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sw2(long j, zx2 zx2Var, vf6 vf6Var, Continuation continuation) {
        super(2, continuation);
        this.X = j;
        this.Y = zx2Var;
        this.Z = vf6Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sw2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new sw2(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        zx2 zx2Var = this.Y;
        if (i == 0) {
            g8j.b(obj);
            ew0 ew0Var = (ew0) zx2Var.F0.getValue();
            this.o = 1;
            obj = ew2.d.d(this.X, 1, ew0Var, this.Z, false, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        xfh.r(zx2Var.d1, (ew2) obj);
        return qqg.a;
    }
}
