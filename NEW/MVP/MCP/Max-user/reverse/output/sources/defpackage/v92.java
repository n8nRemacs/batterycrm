package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class v92 extends dtf implements sm6 {
    public final /* synthetic */ x26 X;
    public final /* synthetic */ xde Y;
    public final /* synthetic */ wce Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v92(x26 x26Var, xde xdeVar, wce wceVar, Continuation continuation) {
        super(2, continuation);
        this.X = x26Var;
        this.Y = xdeVar;
        this.Z = wceVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((v92) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new v92(this.X, this.Y, this.Z, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        wce wceVar = this.Z;
        try {
            if (i == 0) {
                g8j.b(obj);
                x26 x26Var = this.X;
                xde xdeVar = this.Y;
                this.o = 1;
                Object objD = x26Var.d(xdeVar, this);
                g84 g84Var = g84.a;
                if (objD == g84Var) {
                    return g84Var;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8j.b(obj);
            }
            wceVar.c();
            return qqg.a;
        } catch (Throwable th) {
            wceVar.c();
            throw th;
        }
    }
}
