package defpackage;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class fhc extends xfh {
    public static final /* synthetic */ yy7[] z0;
    public final k18 X;
    public final k18 Y;
    public final tcf Z;
    public final b95 b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final hbd s0;
    public final tcf t0;
    public final hbd u0;
    public final ci5 v0;
    public final ci5 w0;
    public final t9f x0;
    public final AtomicReference y0;

    static {
        z8a z8aVar = new z8a(fhc.class, "submitChangesJob", "getSubmitChangesJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        z0 = new yy7[]{z8aVar};
    }

    public fhc(long j, dfc dfcVar) {
        b95 qg2Var;
        yec yecVar = yec.a;
        this.c = yecVar.getAccessor().d(47);
        this.d = yecVar.c();
        bwf bwfVar = new bwf(new hdc(11));
        this.o = yecVar.getAccessor().d(10);
        this.X = yecVar.getAccessor().d(111);
        this.Y = yecVar.getAccessor().d(14);
        yecVar.b();
        tcf tcfVarA = ucf.a(hd5.a);
        this.Z = tcfVarA;
        this.s0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(null);
        this.t0 = tcfVarA2;
        this.u0 = new hbd(tcfVarA2);
        this.v0 = new ci5(0);
        this.w0 = new ci5(0);
        this.x0 = c7j.c();
        this.y0 = new AtomicReference();
        int iOrdinal = dfcVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            qg2Var = new qg2(j, this.a);
        } else {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            qg2Var = new tw3(j, this.a);
        }
        this.b = qg2Var;
        gw0.w(gw0.u(new g56(new d53(qg2Var.f, 12), new vgc(this, null), 1), ((q2b) t()).a()), this.a);
        gw0.w(gw0.u(new g56(qg2Var.d, new wgc(this, null), 1), ((q2b) t()).c()), this.a);
        gw0.w(gw0.u(new g56(qg2Var.e, new xgc(this, null), 1), ((q2b) t()).c()), this.a);
        gw0.w(new g56(new gbd(((pfc) bwfVar.getValue()).a), new ehc(this, null), 1), this.a);
    }

    @Override // defpackage.xfh
    public final void s() {
        this.b.b();
    }

    public final lzf t() {
        return (lzf) this.d.getValue();
    }

    public final void u() {
        if (!((qsb) this.o.getValue()).c(qsb.m)) {
            xfh.r(this.v0, sfc.b);
            return;
        }
        svi.e(this.a, ((q2b) t()).b(), null, new chc(this, null), 2);
    }

    public final void v() {
        this.y0.set(null);
        xfh.r(this.v0, new dgc(new n5g(u8b.k), Integer.valueOf(yud.J)));
    }

    public final void w() {
        x9f x9fVarE = svi.e(this.a, null, null, new dhc(this, null), 3);
        this.x0.O(this, z0[0], x9fVarE);
    }
}
