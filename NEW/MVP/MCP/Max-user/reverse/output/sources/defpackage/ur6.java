package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ur6 extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ vr6 Y;
    public final /* synthetic */ long Z;
    public int o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur6(vr6 vr6Var, long j, long j2, Continuation continuation) {
        super(2, continuation);
        this.Y = vr6Var;
        this.Z = j;
        this.s0 = j2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ur6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ur6 ur6Var = new ur6(this.Y, this.Z, this.s0, continuation);
        ur6Var.X = obj;
        return ur6Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            f84 f84Var = (f84) this.X;
            m36 m36VarC = zs0.c(gw0.s(((l24) this.Y.a.getValue()).c(this.Z), new sr6(f84Var, this.Z, this.Y, this.s0, null)), s65.g(this.s0), new tr6(2, null));
            this.o = 1;
            obj = gw0.p(m36VarC, this);
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
        Object obj2 = ((kpd) obj).a;
        if (obj2 instanceof ipd) {
            return null;
        }
        return obj2;
    }
}
