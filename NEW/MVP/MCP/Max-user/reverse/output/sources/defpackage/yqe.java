package defpackage;

import java.util.Collection;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class yqe extends dtf implements sm6 {
    public final /* synthetic */ ere X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yqe(ere ereVar, Continuation continuation) {
        super(2, continuation);
        this.X = ereVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((yqe) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yqe(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            ere ereVar = this.X;
            qlh qlhVar = (qlh) ereVar.x0.getValue();
            long jS = ((w4e) ereVar.y()).s();
            this.o = 1;
            qlhVar.getClass();
            dsd dsdVarC = dsd.c(1, "SELECT * FROM webapp_biometry WHERE user_id = ?");
            obj = k7j.a(qlhVar.a, xrf.m(dsdVarC, 1, jS), new nlh(qlhVar, dsdVarC, 0), this);
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
        return Boolean.valueOf(!((Collection) obj).isEmpty());
    }
}
