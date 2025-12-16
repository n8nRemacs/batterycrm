package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class sx9 extends dtf implements sm6 {
    public final /* synthetic */ ay9 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sx9(ay9 ay9Var, Continuation continuation) {
        super(2, continuation);
        this.X = ay9Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((sx9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new sx9(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        String str = this.X.i;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str, "Scrolling to first reacted message", null);
            }
        }
        n3e n3eVar = ((o3e) this.X.o.getValue()).d;
        if (n3eVar != null) {
            long j = n3eVar.b;
            ay9 ay9Var = this.X;
            this.o = 1;
            ay9.d(ay9Var, j, 0L, 0, 14);
            if (qqgVar == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
