package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class mk7 extends dtf implements sm6 {
    public final /* synthetic */ qk7 X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mk7(qk7 qk7Var, Continuation continuation) {
        super(2, continuation);
        this.X = qk7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((mk7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new mk7(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String str;
        Object objA;
        int i = this.o;
        qqg qqgVar = qqg.a;
        qk7 qk7Var = this.X;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            Object value = qk7Var.k.a.getValue();
            xk7 xk7Var = value instanceof xk7 ? (xk7) value : null;
            if (xk7Var != null && (str = xk7Var.a) != null) {
                qk7Var.j.m(null, yk7.a);
                gk7 gk7Var = qk7Var.b;
                this.o = 1;
                objA = gk7Var.a(str, this);
                if (objA != g84Var) {
                }
                return g84Var;
            }
            return qqgVar;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        objA = obj;
        vk7 vk7Var = (vk7) objA;
        if (vk7Var != null) {
            ((al7) qk7Var.f.getValue()).a("informer_close", vk7Var.a, vk7Var.j.a);
            gk7 gk7Var2 = qk7Var.b;
            vk7 vk7VarA = vk7.a(vk7Var, 0L, 0L, System.currentTimeMillis(), 0, 12287);
            this.o = 2;
            if (k7j.b(gk7Var2.a, new ci(gk7Var2, 18, vk7VarA), this) == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
