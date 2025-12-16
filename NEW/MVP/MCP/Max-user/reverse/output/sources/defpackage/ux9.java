package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ux9 extends dtf implements sm6 {
    public final /* synthetic */ ay9 X;
    public final /* synthetic */ long Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ux9(ay9 ay9Var, long j, Continuation continuation) {
        super(2, continuation);
        this.X = ay9Var;
        this.Y = j;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ux9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ux9(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            String str = this.X.i;
            long j = this.Y;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.d;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, vb9.e(j, "Scrolling to requested message with id="), null);
                }
            }
            ay9 ay9Var = this.X;
            long j2 = this.Y;
            this.o = 1;
            if (ay9.a(ay9Var, j2, this) == g84Var) {
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
