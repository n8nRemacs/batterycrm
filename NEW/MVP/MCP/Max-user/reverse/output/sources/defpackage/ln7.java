package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ln7 extends dtf implements sm6 {
    public int X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ String Z;
    public String o;
    public final /* synthetic */ yn7 s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ln7(String str, String str2, yn7 yn7Var, Continuation continuation) {
        super(2, continuation);
        this.Y = str;
        this.Z = str2;
        this.s0 = yn7Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ln7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ln7(this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        String strK;
        int i = this.X;
        yn7 yn7Var = this.s0;
        if (i == 0) {
            g8j.b(obj);
            strK = u45.k(this.Y, " ", this.Z);
            String strB = yn7Var.G0.b(strK, "");
            z70 z70Var = (z70) yn7Var.c.getValue();
            this.o = strK;
            this.X = 1;
            obj = z70Var.a(strB, 1, this);
            g84 g84Var = g84.a;
            if (obj == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            strK = this.o;
            g8j.b(obj);
        }
        y70 y70Var = (y70) obj;
        xfh.r(yn7Var.Z, new zm7(y70Var.c, strK, y70Var.d));
        return qqg.a;
    }
}
