package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class n63 extends dtf implements sm6 {
    public final /* synthetic */ w63 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ String Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n63(w63 w63Var, long j, String str, Continuation continuation) {
        super(2, continuation);
        this.X = w63Var;
        this.Y = j;
        this.Z = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((n63) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new n63(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            pr0 pr0Var = new pr0(this.X, this.Y, this.Z, 1);
            this.o = 1;
            Object objI = vmi.i(bd5.a, pr0Var, this);
            g84 g84Var = g84.a;
            if (objI == g84Var) {
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
