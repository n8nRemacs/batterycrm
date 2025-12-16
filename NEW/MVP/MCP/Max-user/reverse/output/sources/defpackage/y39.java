package defpackage;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class y39 extends dtf implements sm6 {
    public final /* synthetic */ h49 X;
    public final /* synthetic */ long Y;
    public final /* synthetic */ long Z;
    public int o;
    public final /* synthetic */ boolean s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y39(h49 h49Var, long j, long j2, boolean z, Continuation continuation) {
        super(2, continuation);
        this.X = h49Var;
        this.Y = j;
        this.Z = j2;
        this.s0 = z;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((y39) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new y39(this.X, this.Y, this.Z, this.s0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objJ;
        Object value;
        Object value2;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.o;
        if (i == 0) {
            g8j.b(obj);
            gx9 gx9Var = (gx9) this.X.g.getValue();
            long j = this.Y;
            this.o = 1;
            objJ = gx9Var.a.j(j, this);
            if (objJ == g84Var) {
                return g84Var;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g8j.b(obj);
            objJ = obj;
        }
        si9 si9Var = (si9) objJ;
        if (si9Var == null) {
            String str = this.X.b;
            long j2 = this.Y;
            l6b l6bVar = wqi.a;
            if (l6bVar != null) {
                lg8 lg8Var = lg8.X;
                if (l6bVar.b(lg8Var)) {
                    l6bVar.c(lg8Var, str, vb9.e(j2, "Can't create playlist because we can't find message by id: "), null);
                }
            }
            this.X.n = null;
            tcf tcfVar = this.X.o;
            do {
                value2 = tcfVar.getValue();
            } while (!tcfVar.c(value2, new x39(0L, (LinkedHashSet) null, 7)));
            xw xwVar = this.X.p;
            if (xwVar != null) {
                xwVar.e();
            }
            this.X.p = null;
            return qqgVar;
        }
        h49 h49Var = this.X;
        long j3 = this.Y;
        long j4 = this.Z;
        boolean z = this.s0;
        by0 by0Var = new by0();
        by0Var.b = j3;
        by0Var.c = j4;
        by0Var.a = z;
        h49Var.n = by0Var;
        tcf tcfVar2 = this.X.o;
        long j5 = this.Y;
        do {
            value = tcfVar2.getValue();
        } while (!tcfVar2.c(value, new x39(j5, gke.d(new Long(j5)), 4)));
        h49 h49Var2 = this.X;
        long j6 = this.Z;
        long j7 = si9Var.b;
        h49Var2.getClass();
        Set set = h49.A;
        q19 q19Var = new q19(j7, j7, set, j6);
        h49Var2.r.updateAndGet(new dp2(h49Var2, (q19) ((w63) h49Var2.f.getValue()).i().S(j6).getValue(), q19Var, 1));
        x9f x9fVar = h49Var2.t;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        h49Var2.t = gw0.w(new g56(new y83(new hbd(((w63) h49Var2.f.getValue()).i().S(j6)), 19, h49Var2), new c49(h49Var2, null), 1), h49Var2.m);
        h49 h49Var3 = this.X;
        long j8 = this.Z;
        xw xwVar2 = h49Var3.p;
        if (xwVar2 != null) {
            xwVar2.e();
        }
        xw xwVarA = ((rj2) h49Var3.i.getValue()).a(j8, si9Var.a, si9Var.c, set, new ny1(h49Var3, j8, 7), 20);
        x9f x9fVar2 = h49Var3.s;
        if (x9fVar2 != null) {
            x9fVar2.cancel((CancellationException) null);
        }
        h49Var3.s = gw0.w(gw0.u(new g56(xwVarA.z, new g49(h49Var3, null), 1), ((q2b) ((lzf) h49Var3.j.getValue())).b()), h49Var3.m);
        xwVarA.n(si9Var.c);
        h49Var3.p = xwVarA;
        return qqgVar;
    }
}
