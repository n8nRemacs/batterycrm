package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ekf extends dtf implements sm6 {
    public final /* synthetic */ ikf X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ekf(ikf ikfVar, Continuation continuation) {
        super(2, continuation);
        this.X = ikfVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ekf) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ekf(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            kdd kddVar = (kdd) this.X.d.getValue();
            qk3 qk3VarH = new esa(kddVar.b().a(Collections.singletonList(hdd.STICKER)), new ao6(28, kddVar)).h((j0e) kddVar.c.getValue());
            this.o = 1;
            Object objA = n8j.a(qk3VarH, this);
            g84 g84Var = g84.a;
            if (objA == g84Var) {
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
