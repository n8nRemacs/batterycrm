package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class u0a extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ds4 Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0a(ds4 ds4Var, Continuation continuation) {
        super(2, continuation);
        this.Y = ds4Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((u0a) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        u0a u0aVar = new u0a(this.Y, continuation);
        u0aVar.X = obj;
        return u0aVar;
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
        t0a t0aVar = new t0a((f84) this.X, this.Y);
        this.o = 1;
        Object objI = vmi.i(bd5.a, t0aVar, this);
        g84 g84Var = g84.a;
        return objI == g84Var ? g84Var : objI;
    }
}
