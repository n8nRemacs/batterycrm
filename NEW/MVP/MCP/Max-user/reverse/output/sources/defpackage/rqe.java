package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class rqe extends dtf implements sm6 {
    public /* synthetic */ Object X;
    public final /* synthetic */ ere Y;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqe(ere ereVar, Continuation continuation) {
        super(2, continuation);
        this.Y = ereVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((rqe) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        rqe rqeVar = new rqe(this.Y, continuation);
        rqeVar.X = obj;
        return rqeVar;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        try {
            if (i == 0) {
                g8j.b(obj);
                qqe qqeVar = new qqe((f84) this.X, null, this.Y);
                this.o = 1;
                obj = yei.f(500L, qqeVar, this);
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
        } catch (Throwable th) {
            obj = new ipd(th);
        }
        return new kpd(obj);
    }
}
