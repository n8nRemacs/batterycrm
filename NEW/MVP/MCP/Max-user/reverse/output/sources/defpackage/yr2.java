package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yr2 extends dtf implements sm6 {
    public final /* synthetic */ zr2 X;
    public final /* synthetic */ fh9 Y;
    public final /* synthetic */ gm9 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yr2(zr2 zr2Var, fh9 fh9Var, gm9 gm9Var, Continuation continuation) {
        super(2, continuation);
        this.X = zr2Var;
        this.Y = fh9Var;
        this.Z = gm9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yr2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yr2(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        zr2 zr2Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            obj = zr2.a(zr2Var, this.Y, this);
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
        si9 si9Var = (si9) obj;
        tcf tcfVar = (tcf) zr2Var.h;
        long j = si9Var.b;
        tcfVar.m(null, new u27(si9Var.c, si9Var.a, j, this.Z.d));
        return qqg.a;
    }
}
