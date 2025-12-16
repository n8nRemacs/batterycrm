package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ck1 extends dtf implements sm6 {
    public final /* synthetic */ dk1 X;
    public final /* synthetic */ tj1 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck1(dk1 dk1Var, tj1 tj1Var, Continuation continuation) {
        super(2, continuation);
        this.X = dk1Var;
        this.Y = tj1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ck1) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ck1(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        qqg qqgVar = qqg.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return qqgVar;
        }
        g8j.b(obj);
        dk1 dk1Var = this.X;
        pb2 pb2Var = (pb2) dk1Var.o.a.getValue();
        if (pb2Var != null) {
            long j = pb2Var.a;
            c82 c82Var = (c82) dk1Var.b.getValue();
            CharSequence charSequence = this.Y.a;
            if (charSequence == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            String string = charSequence.toString();
            this.o = 1;
            Object objA = c82Var.a(j, string, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
                return g84Var;
            }
        }
        return qqgVar;
    }
}
