package defpackage;

import android.content.Context;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class cpa extends xfh {
    public static final /* synthetic */ yy7[] F0 = {new z8a(cpa.class, "resetDefaultsJob", "getResetDefaultsJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, cpa.class, "changeAllNotificationsEnabledJob", "getChangeAllNotificationsEnabledJob()Lkotlinx/coroutines/Job;"), new z8a(cpa.class, "changeShowContentJob", "getChangeShowContentJob()Lkotlinx/coroutines/Job;"), new z8a(cpa.class, "changeCallVibrationStateJob", "getChangeCallVibrationStateJob()Lkotlinx/coroutines/Job;")};
    public final Object A0;
    public final t9f B0;
    public final t9f C0;
    public final t9f D0;
    public final t9f E0;
    public final k18 X;
    public final k18 Y;
    public final tcf Z;
    public final jq b;
    public final Context c;
    public final k18 d;
    public final k18 o;
    public final hbd s0;
    public final tcf t0;
    public final hbd u0;
    public final hbd v0;
    public final tcf w0;
    public final tcf x0;
    public final tcf y0;
    public final ci5 z0;

    public cpa() {
        ooa ooaVar = ooa.a;
        jq jqVar = (jq) ooaVar.getAccessor().c(437);
        bwf bwfVarD = ooaVar.getAccessor().d(61);
        bwf bwfVarD2 = ooaVar.getAccessor().d(48);
        bwf bwfVarD3 = ooaVar.getAccessor().d(79);
        bwf bwfVarD4 = ooaVar.getAccessor().d(8);
        bwf bwfVarD5 = ooaVar.getAccessor().d(398);
        Context context = (Context) ooaVar.getAccessor().c(12);
        this.b = jqVar;
        this.c = context;
        this.d = bwfVarD;
        this.o = bwfVarD3;
        this.X = bwfVarD4;
        this.Y = bwfVarD5;
        tcf tcfVarA = ucf.a(hd5.a);
        this.Z = tcfVarA;
        this.s0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(Boolean.valueOf(!jqVar.b()));
        this.t0 = tcfVarA2;
        this.u0 = new hbd(tcfVarA2);
        this.v0 = new hbd(ucf.a(Boolean.valueOf(jqVar.b())));
        tcf tcfVarA3 = ucf.a(Boolean.valueOf(jqVar.b()));
        this.w0 = tcfVarA3;
        tcf tcfVarA4 = ucf.a(((sxg) bwfVarD.getValue()).j());
        this.x0 = tcfVarA4;
        tcf tcfVarA5 = ucf.a(0);
        this.y0 = tcfVarA5;
        this.z0 = new ci5(0);
        this.A0 = ipi.b(3, new nz(bwfVarD2, 26));
        this.B0 = c7j.c();
        this.C0 = c7j.c();
        this.D0 = c7j.c();
        this.E0 = c7j.c();
        gw0.w(gw0.u(new g56(new c66(new x26[]{s8j.a(t().j), s8j.a(t().k), new hbd(tcfVarA3), new hbd(tcfVarA5), new hbd(tcfVarA4)}, new yoa(this, null)), new woa(this, null), 1), ((q2b) ((lzf) bwfVarD4.getValue())).b()), this.a);
    }

    public static n5g u(int i) {
        return i != 0 ? i != 1 ? i != 2 ? new n5g(b8b.z) : new n5g(b8b.A) : new n5g(b8b.y) : new n5g(b8b.z);
    }

    public final sxg t() {
        return (sxg) this.d.getValue();
    }

    public final void v(long j) {
        long j2 = z7b.r;
        ci5 ci5Var = this.z0;
        if (j == j2) {
            gna.c.getClass();
            xfh.r(ci5Var, new ei4(":settings/ringtone"));
            return;
        }
        long j3 = z7b.s;
        k18 k18Var = this.X;
        ContextScope contextScope = this.a;
        i84 i84Var = i84.b;
        yy7[] yy7VarArr = F0;
        if (j == j3) {
            this.E0.O(this, yy7VarArr[3], svi.d(contextScope, ((q2b) ((lzf) k18Var.getValue())).b(), i84Var, new bpa(this, null)));
            return;
        }
        if (j == z7b.m) {
            this.C0.O(this, yy7VarArr[1], svi.d(contextScope, ((q2b) ((lzf) k18Var.getValue())).b(), i84Var, new zoa(this, null)));
            return;
        }
        if (j == z7b.k) {
            gna.c.getClass();
            xfh.r(ci5Var, new ei4(":settings/notifications/dialog"));
            return;
        }
        if (j == z7b.d) {
            gna.c.getClass();
            xfh.r(ci5Var, new ei4(":settings/notifications/chat"));
            return;
        }
        if (j == z7b.w) {
            gna.c.getClass();
            xfh.r(ci5Var, new ei4(":settings/notifications/other"));
        } else if (j == z7b.A) {
            this.D0.O(this, yy7VarArr[2], xfh.o(this, ((q2b) ((lzf) k18Var.getValue())).b(), new xoa(this, null), 2));
        } else if (j == z7b.q) {
            xfh.r(ci5Var, qoa.b);
        }
    }
}
