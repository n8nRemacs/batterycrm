package defpackage;

import java.util.List;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class gi0 extends dtf implements sm6 {
    public boolean X;
    public boolean Y;
    public int Z;
    public boolean o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ hi0 t0;
    public final /* synthetic */ th0 u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi0(hi0 hi0Var, th0 th0Var, Continuation continuation) {
        super(2, continuation);
        this.t0 = hi0Var;
        this.u0 = th0Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gi0) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        gi0 gi0Var = new gi0(this.t0, this.u0, continuation);
        gi0Var.s0 = obj;
        return gi0Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        hi0 hi0Var = this.t0;
        k18 k18Var = hi0Var.d;
        k18 k18Var2 = hi0Var.a;
        int i = this.Z;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.s0;
            z = !((qsb) k18Var2.getValue()).c(qsb.f);
            boolean z4 = !((qsb) k18Var2.getValue()).d();
            boolean z5 = !((qsb) k18Var2.getValue()).c(qsb.h);
            bs4[] bs4VarArr = {svi.b(f84Var, ((q2b) ((lzf) k18Var.getValue())).b(), new di0(hi0Var, null), 2), svi.b(f84Var, ((q2b) ((lzf) k18Var.getValue())).b(), new ei0(hi0Var, null), 2), svi.b(f84Var, ((q2b) ((lzf) k18Var.getValue())).a(), new fi0(this.u0, null), 2)};
            this.o = z;
            this.X = z4;
            this.Y = z5;
            this.Z = 1;
            obj = new ne0(bs4VarArr).a(this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
            z2 = z5;
            z3 = z4;
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z2 = this.Y;
            z3 = this.X;
            z = this.o;
            g8j.b(obj);
        }
        List list = (List) obj;
        ((Boolean) list.get(0)).booleanValue();
        ((Boolean) list.get(1)).booleanValue();
        ((Boolean) list.get(2)).booleanValue();
        hi0Var.e = z;
        hi0Var.g = z3;
        hi0Var.f = z2;
        return qqg.a;
    }
}
