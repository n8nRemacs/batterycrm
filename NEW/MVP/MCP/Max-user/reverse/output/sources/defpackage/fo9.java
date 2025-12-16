package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class fo9 extends dtf implements sm6 {
    public final /* synthetic */ CharSequence X;
    public final /* synthetic */ no9 o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fo9(no9 no9Var, CharSequence charSequence, Continuation continuation) {
        super(2, continuation);
        this.o = no9Var;
        this.X = charSequence;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        fo9 fo9Var = (fo9) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        fo9Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new fo9(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        no9 no9Var = this.o;
        pb2 pb2Var = (pb2) no9Var.b.getValue();
        Long l = pb2Var != null ? new Long(pb2Var.b.a) : null;
        CharSequence charSequence = this.X;
        if (charSequence != null && charSequence.length() != 0 && l != null) {
            dkb dkbVar = (dkb) no9Var.w0.getValue();
            long jLongValue = l.longValue();
            if (jLongValue == 0) {
                dkbVar.getClass();
            } else {
                dkbVar.f(jLongValue, null, 0L);
            }
        }
        return qqg.a;
    }
}
