package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ud0 extends dtf implements sm6 {
    public vd0 X;
    public int Y;
    public final /* synthetic */ vd0 Z;
    public n9a o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ud0(vd0 vd0Var, Continuation continuation) {
        super(2, continuation);
        this.Z = vd0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ud0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ud0(this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        n9a n9aVar;
        vd0 vd0Var;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.Y;
        if (i == 0) {
            g8j.b(obj);
            vd0 vd0Var2 = this.Z;
            n9aVar = vd0Var2.u0;
            this.o = n9aVar;
            this.X = vd0Var2;
            this.Y = 1;
            if (n9aVar.e(null, this) == g84Var) {
                return g84Var;
            }
            vd0Var = vd0Var2;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            vd0Var = this.X;
            n9aVar = this.o;
            g8j.b(obj);
        }
        try {
            long j = vd0Var.o;
            int i2 = (int) (j >> 32);
            if (Float.intBitsToFloat(i2) != -1.0f) {
                int i3 = (int) (j & 4294967295L);
                if (Float.intBitsToFloat(i3) != -1.0f) {
                    float f = 2;
                    if (vd0Var.X.postRotate(90.0f, Float.intBitsToFloat(i2) / f, Float.intBitsToFloat(i3) / f)) {
                        vd0Var.s0 = !vd0Var.s0;
                    }
                    return qqgVar;
                }
            }
            return qqgVar;
        } finally {
            n9aVar.g(null);
        }
    }
}
