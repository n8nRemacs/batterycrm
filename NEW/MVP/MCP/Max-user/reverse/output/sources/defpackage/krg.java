package defpackage;

import java.util.Iterator;
import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class krg extends dtf implements sm6 {
    public final /* synthetic */ int X;
    public final /* synthetic */ nrg o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public krg(nrg nrgVar, int i, Continuation continuation) {
        super(2, continuation);
        this.o = nrgVar;
        this.X = i;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        krg krgVar = (krg) l((f84) obj, (Continuation) obj2);
        qqg qqgVar = qqg.a;
        krgVar.n(qqgVar);
        return qqgVar;
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new krg(this.o, this.X, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object next;
        g8j.b(obj);
        nrg nrgVar = this.o;
        hwa hwaVar = (hwa) nrgVar.s0.getValue();
        byte b = (byte) this.X;
        hwaVar.u().c(new gj3(hwaVar.t().a.k(), rj3.s0, b, new long[0], new long[]{nrgVar.c}, null, null), false, 0L, (12 & 8) != 0 ? 0 : 1);
        Iterator it = ((Iterable) nrgVar.w0.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((jj3) next).a == b) {
                break;
            }
        }
        jj3 jj3Var = (jj3) next;
        nrgVar.t().j(jj3Var != null ? new vx1(jj3Var.b) : jbe.c, nrgVar.b);
        xfh.r(nrgVar.z0, new erg(new n5g(m0b.M2), ivd.H0, bdb.b));
        return qqg.a;
    }
}
