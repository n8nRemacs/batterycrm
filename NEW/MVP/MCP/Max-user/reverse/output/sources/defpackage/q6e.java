package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class q6e extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ s6e Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q6e(s6e s6eVar, Continuation continuation) {
        super(2, continuation);
        this.Y = s6eVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((q6e) l((Throwable) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        q6e q6eVar = new q6e(this.Y, continuation);
        q6eVar.X = obj;
        return q6eVar;
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
        Throwable th = (Throwable) this.X;
        this.o = 1;
        Object objB = s6e.b(this.Y, th, this);
        g84 g84Var = g84.a;
        return objB == g84Var ? g84Var : objB;
    }
}
