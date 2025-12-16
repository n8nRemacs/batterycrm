package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class v41 extends dtf implements sm6 {
    public final /* synthetic */ c51 X;
    public final /* synthetic */ boolean Y;
    public /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v41(c51 c51Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = c51Var;
        this.Y = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        v41 v41Var = (v41) l((pb2) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        v41Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        v41 v41Var = new v41(this.X, this.Y, continuation);
        v41Var.o = obj;
        return v41Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        CharSequence charSequence;
        g8j.b(obj);
        pb2 pb2Var = (pb2) this.o;
        tcf tcfVar = this.X.i;
        boolean z = this.Y;
        while (true) {
            Object value = tcfVar.getValue();
            n41 n41Var = (n41) value;
            pb2Var.p0();
            CharSequence charSequence2 = pb2Var.t0;
            if (z) {
                pb2Var.q0();
                charSequence = pb2Var.w0;
            } else {
                charSequence = "";
            }
            CharSequence charSequence3 = charSequence;
            long j = pb2Var.a;
            String strI = pb2Var.i(il0.d, hl0.a);
            long jH = pb2Var.h();
            pb2 pb2Var2 = pb2Var;
            long j2 = pb2Var.b.a;
            Long l = new Long(j);
            Long l2 = new Long(j2);
            Long l3 = new Long(jH);
            n41Var.getClass();
            if (tcfVar.c(value, new n41(l, l2, charSequence2, strI, l3, charSequence3, !z))) {
                return qqg.a;
            }
            pb2Var = pb2Var2;
        }
    }
}
