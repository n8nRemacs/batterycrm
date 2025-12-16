package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class tqe extends dtf implements sm6 {
    public final /* synthetic */ ere X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tqe(ere ereVar, Continuation continuation) {
        super(2, continuation);
        this.X = ereVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((tqe) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new tqe(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            this.o = 1;
            Object objV = ere.v(this.X, this);
            g84 g84Var = g84.a;
            if (objV == g84Var) {
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
