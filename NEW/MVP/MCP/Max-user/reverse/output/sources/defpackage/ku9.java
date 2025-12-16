package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ku9 extends dtf implements sm6 {
    public final /* synthetic */ vu9 X;
    public final /* synthetic */ String Y;
    public final /* synthetic */ w10 Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ku9(vu9 vu9Var, String str, w10 w10Var, Continuation continuation) {
        super(2, continuation);
        this.X = vu9Var;
        this.Y = str;
        this.Z = w10Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ku9) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ku9(this.X, this.Y, this.Z, continuation);
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
        sxd sxdVar = this.X.u0;
        boolean z = this.Z.b.o;
        this.o = 1;
        Object objB = sxdVar.b(this.Y, z, this);
        g84 g84Var = g84.a;
        return objB == g84Var ? g84Var : objB;
    }
}
