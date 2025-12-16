package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes.dex */
public final class ep2 extends dtf implements sm6 {
    public xw X;
    public yq2 Y;
    public xw Z;
    public long o;
    public yq2 s0;
    public int t0;
    public final /* synthetic */ yq2 u0;
    public final /* synthetic */ k18 v0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ep2(yq2 yq2Var, k18 k18Var, Continuation continuation) {
        super(2, continuation);
        this.u0 = yq2Var;
        this.v0 = k18Var;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ep2) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        return new ep2(this.u0, this.v0, continuation);
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        Object objJ;
        yq2 yq2Var;
        xw xwVar;
        long j;
        yq2 yq2Var2;
        xw xwVar2;
        qqg qqgVar = qqg.a;
        g84 g84Var = g84.a;
        int i = this.t0;
        if (i == 0) {
            g8j.b(obj);
            yq2 yq2Var3 = this.u0;
            gx9 gx9Var = yq2Var3.s0;
            long j2 = yq2Var3.d;
            this.t0 = 1;
            objJ = gx9Var.a.j(j2, this);
            if (objJ != g84Var) {
            }
            return g84Var;
        }
        if (i != 1) {
            if (i == 2) {
                g8j.b(obj);
                return qqgVar;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.o;
            yq2Var = this.s0;
            xwVar = this.Z;
            yq2Var2 = this.Y;
            xwVar2 = this.X;
            g8j.b(obj);
            yy7[] yy7VarArr = yq2.u1;
            yq2Var2.getClass();
            gw0.w(gw0.u(new g56(new x3(xwVar.z, yq2Var2, 16), new wq2(yq2Var2, null), 1), ((q2b) yq2Var2.t0).a()), yq2Var2.a);
            gw0.w(gw0.u(new g56(new x3(new hbd(yq2Var2.D().i().S(yq2Var2.b)), yq2Var2, 15), new tq2(yq2Var2, null), 1), ((q2b) yq2Var2.t0).a()), yq2Var2.a);
            wqi.c(yq2Var2.w0, "Media viewer. Start load around", new Object[0]);
            xwVar.n(j);
            yq2Var.N0 = xwVar2;
            return qqgVar;
        }
        g8j.b(obj);
        objJ = obj;
        si9 si9Var = (si9) objJ;
        if (si9Var != null) {
            if (this.u0.X && si9Var.E()) {
                yq2 yq2Var4 = this.u0;
                this.t0 = 2;
                if (yq2.v(yq2Var4, si9Var, this) == g84Var) {
                }
            } else {
                long j3 = si9Var.c;
                new Long(j3);
                q19 q19Var = (q19) this.u0.D().i().S(this.u0.b).getValue();
                yq2 yq2Var5 = this.u0;
                yq2Var5.P0.updateAndGet(new dp2(yq2Var5, q19Var, si9Var, 0));
                String str = this.u0.w0;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, "Media viewer. Create loader with initialTime:" + j3 + ", saved markers:" + q19Var, null);
                    }
                }
                yq2 yq2Var6 = this.u0;
                rj2 rj2Var = (rj2) this.v0.getValue();
                yq2 yq2Var7 = this.u0;
                xw xwVarA = rj2Var.a(yq2Var7.b, yq2Var7.d, j3, yq2Var7.O0, yq2Var7, 40);
                yq2 yq2Var8 = this.u0;
                this.X = xwVarA;
                this.Y = yq2Var8;
                this.Z = xwVarA;
                this.s0 = yq2Var6;
                this.o = j3;
                this.t0 = 3;
                if (yq2Var8.P(si9Var, this) != g84Var) {
                    yq2Var = yq2Var6;
                    xwVar = xwVarA;
                    j = j3;
                    yq2Var2 = yq2Var8;
                    xwVar2 = xwVar;
                    yy7[] yy7VarArr2 = yq2.u1;
                    yq2Var2.getClass();
                    gw0.w(gw0.u(new g56(new x3(xwVar.z, yq2Var2, 16), new wq2(yq2Var2, null), 1), ((q2b) yq2Var2.t0).a()), yq2Var2.a);
                    gw0.w(gw0.u(new g56(new x3(new hbd(yq2Var2.D().i().S(yq2Var2.b)), yq2Var2, 15), new tq2(yq2Var2, null), 1), ((q2b) yq2Var2.t0).a()), yq2Var2.a);
                    wqi.c(yq2Var2.w0, "Media viewer. Start load around", new Object[0]);
                    xwVar.n(j);
                    yq2Var.N0 = xwVar2;
                    return qqgVar;
                }
            }
            return g84Var;
        }
        return qqgVar;
    }
}
