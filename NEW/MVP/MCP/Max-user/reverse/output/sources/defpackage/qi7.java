package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class qi7 extends dtf implements sm6 {
    public int X;
    public int Y;
    public final /* synthetic */ bj7 Z;
    public bj7 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qi7(bj7 bj7Var, Continuation continuation) {
        super(2, continuation);
        this.Z = bj7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((qi7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new qi7(this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        bj7 bj7Var;
        int i;
        int i2 = this.Y;
        g84 g84Var = g84.a;
        try {
            if (i2 == 0) {
                g8j.b(obj);
                bj7Var = this.Z;
                String str = bj7.D0;
                if (!((qsb) bj7Var.o.getValue()).e()) {
                    throw new IllegalStateException("storage permissions not granted");
                }
                qo6 qo6Var = qo6.a;
                this.o = bj7Var;
                this.Y = 1;
                obj = bj7.a(bj7Var, qo6Var, this);
                if (obj == g84Var) {
                }
                return g84Var;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i = this.X;
                g8j.b(obj);
                return new jpd(new Integer(i + ((Number) obj).intValue()));
            }
            bj7Var = this.o;
            g8j.b(obj);
            int iIntValue = ((Number) obj).intValue();
            so6 so6Var = so6.a;
            this.o = null;
            this.X = iIntValue;
            this.Y = 2;
            Object objA = bj7.a(bj7Var, so6Var, this);
            if (objA != g84Var) {
                i = iIntValue;
                obj = objA;
                return new jpd(new Integer(i + ((Number) obj).intValue()));
            }
            return g84Var;
        } catch (Throwable th) {
            return new hpd(th);
        }
    }
}
