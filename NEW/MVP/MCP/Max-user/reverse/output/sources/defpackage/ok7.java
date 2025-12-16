package defpackage;

import kotlin.coroutines.Continuation;

/* loaded from: classes2.dex */
public final class ok7 extends dtf implements sm6 {
    public tid X;
    public long Y;
    public int Z;
    public vk7 o;
    public /* synthetic */ Object s0;
    public final /* synthetic */ qk7 t0;
    public final /* synthetic */ String u0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok7(qk7 qk7Var, String str, Continuation continuation) {
        super(2, continuation);
        this.t0 = qk7Var;
        this.u0 = str;
    }

    @Override // defpackage.sm6
    public final Object invoke(Object obj, Object obj2) {
        return ((ok7) l((f84) obj, (Continuation) obj2)).n(qqg.a);
    }

    @Override // defpackage.ij0
    public final Continuation l(Object obj, Continuation continuation) {
        ok7 ok7Var = new ok7(this.t0, this.u0, continuation);
        ok7Var.s0 = obj;
        return ok7Var;
    }

    @Override // defpackage.ij0
    public final Object n(Object obj) {
        f84 f84Var;
        Object objA;
        vk7 vk7Var;
        tid tidVar;
        f84 f84Var2;
        tid tidVar2;
        vk7 vk7Var2;
        long j;
        long j2;
        int i = this.Z;
        qqg qqgVar = qqg.a;
        qk7 qk7Var = this.t0;
        g84 g84Var = g84.a;
        if (i == 0) {
            g8j.b(obj);
            f84Var = (f84) this.s0;
            gk7 gk7Var = qk7Var.b;
            this.s0 = f84Var;
            this.Z = 1;
            objA = gk7Var.a(this.u0, this);
            if (objA != g84Var) {
            }
            return g84Var;
        }
        if (i != 1) {
            if (i == 2) {
                j2 = this.Y;
                tidVar2 = this.X;
                vk7Var2 = this.o;
                f84Var2 = (f84) this.s0;
                g8j.b(obj);
                tidVar2.a = j2;
                f84 f84Var3 = f84Var2;
                tidVar = tidVar2;
                f84Var = f84Var3;
                vk7Var = vk7Var2;
                qk7Var.i = vk7Var.i;
                qk7Var.g.O(qk7Var, qk7.n[0], svi.e(f84Var, null, i84.b, new nk7(tidVar, qk7Var, null), 1));
                return qqgVar;
            }
            if (i != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j = this.Y;
            tidVar2 = this.X;
            vk7Var2 = this.o;
            f84Var2 = (f84) this.s0;
            g8j.b(obj);
            tidVar2.a = j;
            f84 f84Var32 = f84Var2;
            tidVar = tidVar2;
            f84Var = f84Var32;
            vk7Var = vk7Var2;
            qk7Var.i = vk7Var.i;
            qk7Var.g.O(qk7Var, qk7.n[0], svi.e(f84Var, null, i84.b, new nk7(tidVar, qk7Var, null), 1));
            return qqgVar;
        }
        f84Var = (f84) this.s0;
        g8j.b(obj);
        objA = obj;
        vk7Var = (vk7) objA;
        if (vk7Var == null) {
            return qqgVar;
        }
        k18 k18Var = qk7Var.f;
        gk7 gk7Var2 = qk7Var.b;
        ((al7) k18Var.getValue()).a("informer_show", vk7Var.a, vk7Var.j.a);
        tidVar = new tid();
        long j3 = vk7Var.l;
        tidVar.a = j3;
        if (j3 != 0) {
            if (j3 < vk7Var.m) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                vk7 vk7VarA = vk7.a(vk7Var, 0L, jCurrentTimeMillis, 0L, vk7Var.n + 1, 6143);
                this.s0 = f84Var;
                this.o = vk7Var;
                this.X = tidVar;
                this.Y = jCurrentTimeMillis;
                this.Z = 3;
                if (k7j.b(gk7Var2.a, new ci(gk7Var2, 18, vk7VarA), this) != g84Var) {
                    f84Var2 = f84Var;
                    tidVar2 = tidVar;
                    vk7Var2 = vk7Var;
                    j = jCurrentTimeMillis;
                    tidVar2.a = j;
                    f84 f84Var322 = f84Var2;
                    tidVar = tidVar2;
                    f84Var = f84Var322;
                    vk7Var = vk7Var2;
                }
            }
            qk7Var.i = vk7Var.i;
            qk7Var.g.O(qk7Var, qk7.n[0], svi.e(f84Var, null, i84.b, new nk7(tidVar, qk7Var, null), 1));
            return qqgVar;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        vk7 vk7VarA2 = vk7.a(vk7Var, 0L, jCurrentTimeMillis2, 0L, 1, 6143);
        this.s0 = f84Var;
        this.o = vk7Var;
        this.X = tidVar;
        this.Y = jCurrentTimeMillis2;
        this.Z = 2;
        if (k7j.b(gk7Var2.a, new ci(gk7Var2, 18, vk7VarA2), this) != g84Var) {
            f84Var2 = f84Var;
            tidVar2 = tidVar;
            vk7Var2 = vk7Var;
            j2 = jCurrentTimeMillis2;
            tidVar2.a = j2;
            f84 f84Var3222 = f84Var2;
            tidVar = tidVar2;
            f84Var = f84Var3222;
            vk7Var = vk7Var2;
            qk7Var.i = vk7Var.i;
            qk7Var.g.O(qk7Var, qk7.n[0], svi.e(f84Var, null, i84.b, new nk7(tidVar, qk7Var, null), 1));
            return qqgVar;
        }
        return g84Var;
    }
}
