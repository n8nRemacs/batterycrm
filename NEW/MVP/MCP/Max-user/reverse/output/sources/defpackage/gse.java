package defpackage;

import java.util.Collections;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class gse extends dtf implements sm6 {
    public final /* synthetic */ nse X;
    public int o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gse(nse nseVar, Continuation continuation) {
        super(2, continuation);
        this.X = nseVar;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((gse) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new gse(this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            nse nseVar = this.X;
            qv5 qv5Var = (qv5) nseVar.o.getValue();
            qv5Var.k.getClass();
            qv5Var.a(new y6i(16, null)).h(Collections.singleton(zy0.a));
            yy0 yy0Var = (yy0) nseVar.Y.getValue();
            Long l = yy0Var != null ? new Long(yy0Var.a) : null;
            if (l != null) {
                nse.t(nseVar, l.longValue());
            }
            this.o = 1;
            Object objU = nse.u(nseVar, this);
            g84 g84Var = g84.a;
            if (objU == g84Var) {
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
