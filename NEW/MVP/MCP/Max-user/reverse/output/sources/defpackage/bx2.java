package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class bx2 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ zx2 Y;
    public final /* synthetic */ CharSequence Z;
    public j35 o;
    public final /* synthetic */ Long s0;
    public final /* synthetic */ Long t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx2(zx2 zx2Var, CharSequence charSequence, Long l, Long l2, Continuation continuation) {
        super(2, continuation);
        this.Y = zx2Var;
        this.Z = charSequence;
        this.s0 = l;
        this.t0 = l2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((bx2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new bx2(this.Y, this.Z, this.s0, this.t0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        j35 j35Var;
        int i = this.X;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            zx2 zx2Var = this.Y;
            j35Var = zx2Var.t0;
            this.o = j35Var;
            this.X = 1;
            obj = zx2Var.D(this);
            if (obj != g84Var) {
            }
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        j35Var = this.o;
        g8j.b(obj);
        j35 j35Var2 = j35Var;
        long jLongValue = ((Number) obj).longValue();
        this.o = null;
        this.X = 2;
        Object objI = svi.i(((q2b) ((lzf) ((k18) j35Var2.t0).getValue())).b(), new i35(j35Var2, jLongValue, this.Z, this.t0, this.s0, null), this);
        if (objI != g84Var) {
            objI = qqgVar;
        }
        return objI == g84Var ? g84Var : qqgVar;
    }
}
