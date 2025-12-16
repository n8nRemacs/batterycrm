package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class b7i extends dtf implements sm6 {
    public final /* synthetic */ e7i X;
    public final /* synthetic */ double Y;
    public final /* synthetic */ double Z;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7i(e7i e7iVar, double d, double d2, Continuation continuation) {
        super(2, continuation);
        this.X = e7iVar;
        this.Y = d;
        this.Z = d2;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((b7i) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new b7i(this.X, this.Y, this.Z, continuation);
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
        this.o = 1;
        Object objD = e7i.d(this.X, this.Y, this.Z, this);
        g84 g84Var = g84.a;
        return objD == g84Var ? g84Var : objD;
    }
}
