package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class m58 extends dtf implements sm6 {
    public final /* synthetic */ o58 X;
    public final /* synthetic */ l58 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m58(o58 o58Var, l58 l58Var, Continuation continuation) {
        super(2, continuation);
        this.X = o58Var;
        this.Y = l58Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((m58) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new m58(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            jve jveVar = this.X.a;
            l58 l58Var = this.Y;
            g58 g58Var = new g58(l58Var.a, l58Var.b, new Long(l58Var.c), l58Var.d, l58Var.o, l58Var.X, l58Var.Y, l58Var.Z);
            this.o = 1;
            Object objA = jveVar.a(g58Var, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
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
