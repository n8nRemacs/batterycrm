package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ri2 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ si9 Y;
    public final /* synthetic */ ve2 Z;
    public int o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri2(si9 si9Var, ve2 ve2Var, long j, Continuation continuation) {
        super(2, continuation);
        this.Y = si9Var;
        this.Z = ve2Var;
        this.s0 = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ri2) l((af2) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ri2 ri2Var = new ri2(this.Y, this.Z, this.s0, continuation);
        ri2Var.X = obj;
        return ri2Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        af2 af2Var;
        ri2 ri2Var;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            af2Var = (af2) this.X;
            long j = af2Var.h0;
            gx9 gx9Var = (gx9) this.Z.u.getValue();
            this.X = af2Var;
            this.o = 1;
            ri2Var = this;
            obj = gx9Var.a.l(this.s0, j, ri2Var);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            af2Var = (af2) this.X;
            g8j.b(obj);
            ri2Var = this;
        }
        si9 si9Var = (si9) obj;
        si9 si9Var2 = ri2Var.Y;
        if (si9Var == null || si9Var2.c > si9Var.c) {
            af2Var.h0 = si9Var2.b;
        }
        return qqg.a;
    }
}
