package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ws6 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ zs6 Y;
    public final /* synthetic */ mk3 Z;
    public w63 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws6(zs6 zs6Var, mk3 mk3Var, Continuation continuation) {
        super(2, continuation);
        this.Y = zs6Var;
        this.Z = mk3Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ws6) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ws6(this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) throws Throwable {
        w63 w63Var;
        int i = this.X;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            w63Var = (w63) this.Y.b.getValue();
            this.o = w63Var;
            this.X = 1;
            obj = this.Z.awaitInternal(this);
            if (obj != g84Var) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        w63Var = this.o;
        g8j.b(obj);
        long jLongValue = ((Number) obj).longValue();
        this.o = null;
        this.X = 2;
        Object objR = w63Var.r(jLongValue, this);
        return objR == g84Var ? g84Var : objR;
    }
}
