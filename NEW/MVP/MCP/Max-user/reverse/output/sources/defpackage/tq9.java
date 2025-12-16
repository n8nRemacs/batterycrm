package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tq9 extends dtf implements sm6 {
    public final /* synthetic */ Long X;
    public final /* synthetic */ uq9 Y;
    public final /* synthetic */ long Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq9(Long l, uq9 uq9Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = l;
        this.Y = uq9Var;
        this.Z = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tq9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tq9(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        uq9 uq9Var = this.Y;
        if (i == 0) {
            g8j.b(obj);
            Long l = this.X;
            if (l == null) {
                return null;
            }
            gx9 gx9Var = (gx9) uq9Var.a.getValue();
            long jLongValue = l.longValue();
            this.o = 1;
            obj = gx9Var.a.j(jLongValue, this);
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
        if (si9Var == null) {
            return null;
        }
        eh9 eh9VarA = pj9.a((pj9) uq9Var.b.getValue(), si9Var);
        long j = eh9VarA.a.b;
        long j2 = this.Z;
        return new sk9(1, j2, eh9VarA, null, null, null, 0, j2, j);
    }
}
