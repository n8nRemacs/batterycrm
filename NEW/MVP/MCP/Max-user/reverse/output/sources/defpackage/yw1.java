package defpackage;

import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class yw1 extends dtf implements sm6 {
    public final /* synthetic */ zw1 X;
    public final /* synthetic */ List o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw1(List list, zw1 zw1Var, Continuation continuation) {
        super(2, continuation);
        this.o = list;
        this.X = zw1Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        yw1 yw1Var = (yw1) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        yw1Var.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new yw1(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        g8j.b(obj);
        for (o37 o37Var : this.o) {
            boolean z = o37Var instanceof k37;
            zw1 zw1Var = this.X;
            if (z) {
                k37 k37Var = (k37) o37Var;
                ((c6i) zw1Var.a.getValue()).b(new oge(k37Var.b, k37Var.d, null, false, rs4.REGULAR));
            } else if (o37Var instanceof m37) {
                m37 m37Var = (m37) o37Var;
                ((c6i) zw1Var.a.getValue()).b(new oge(m37Var.b, m37Var.c, null, false, rs4.REGULAR));
            } else if (o37Var instanceof l37) {
                l37 l37Var = (l37) o37Var;
                ((c6i) zw1Var.a.getValue()).b(new oge(l37Var.b, l37Var.e, null, true, rs4.REGULAR));
            } else if (!(o37Var instanceof n37)) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return qqg.a;
    }
}
