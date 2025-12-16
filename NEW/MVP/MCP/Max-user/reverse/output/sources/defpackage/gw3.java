package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gw3 extends dtf implements sm6 {
    public final /* synthetic */ tw3 X;
    public final /* synthetic */ boolean Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gw3(tw3 tw3Var, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = tw3Var;
        this.Y = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gw3) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gw3(this.X, this.Y, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        tw3 tw3Var = this.X;
        if (i == 0) {
            g8j.b(obj);
            hfd hfdVar = tw3Var.y;
            this.o = 1;
            obj = ((m1g) ((p8b) ((k18) hfdVar.b).getValue()).a.getValue()).e(new zf8(this.Y, 1), this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
        }
        tw3.p(tw3Var, ((eld) obj).c);
        return qqg.a;
    }
}
