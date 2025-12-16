package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rx9 extends dtf implements sm6 {
    public final /* synthetic */ ay9 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx9(ay9 ay9Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = ay9Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rx9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new rx9(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        rx9 rx9Var;
        int i = this.o;
        qqg qqgVar = qqg.a;
        ay9 ay9Var = this.X;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            yy7[] yy7VarArr = ay9.r;
            gx9 gx9Var = (gx9) ay9Var.j.getValue();
            long j = ay9Var.a.a;
            this.o = 1;
            rx9Var = this;
            obj = gx9Var.a.l(j, this.Y, rx9Var);
            if (obj != g84Var) {
            }
            return g84Var;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        rx9Var = this;
        si9 si9Var = (si9) obj;
        if (si9Var != null) {
            long j2 = si9Var.a;
            rx9Var.o = 2;
            if (ay9.a(ay9Var, j2, this) == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
