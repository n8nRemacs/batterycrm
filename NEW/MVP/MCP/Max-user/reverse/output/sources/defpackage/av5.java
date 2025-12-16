package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class av5 extends dtf implements sm6 {
    public final /* synthetic */ cv5 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public int o;
    public final /* synthetic */ long s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public av5(cv5 cv5Var, long j, long j2, long j3, Continuation continuation) {
        super(2, continuation);
        this.X = cv5Var;
        this.Y = j;
        this.Z = j2;
        this.s0 = j3;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((av5) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new av5(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            return obj;
        }
        g8j.b(obj);
        hwa hwaVar = (hwa) this.X.b.getValue();
        fh2 fh2Var = new fh2(this.Y, this.Z, this.s0);
        this.o = 1;
        Object objF = hwaVar.F(fh2Var, this);
        g84 g84Var = g84.a;
        return objF == g84Var ? g84Var : objF;
    }
}
