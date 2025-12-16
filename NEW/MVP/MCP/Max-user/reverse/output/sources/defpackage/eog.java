package defpackage;

import java.util.concurrent.CancellationException;

/* loaded from: classes2.dex */
public final class eog extends xfh {
    public static final /* synthetic */ yy7[] D0 = {new z8a(eog.class, "requestNewCodeJob", "getRequestNewCodeJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, eog.class, "deleteUserJob", "getDeleteUserJob()Lkotlinx/coroutines/Job;")};
    public final t9f A0;
    public final t9f B0;
    public x9f C0;
    public final String X;
    public final k18 Y;
    public final k18 Z;
    public final String b;
    public final up7 c;
    public final rp7 d;
    public final w7b o;
    public final k18 s0;
    public final tcf t0;
    public final hbd u0;
    public final tcf v0;
    public final hbd w0;
    public final ci5 x0;
    public final ci5 y0;
    public x9f z0;

    public eog(rp7 rp7Var, up7 up7Var, String str) {
        w7b w7bVar = new w7b();
        ykg ykgVar = ykg.a;
        bwf bwfVarD = ykgVar.getAccessor().d(46);
        k18 k18VarB = ykgVar.b();
        k18 k18VarA = ykgVar.a();
        this.b = str;
        this.c = up7Var;
        this.d = rp7Var;
        this.o = w7bVar;
        this.X = eog.class.getName();
        this.Y = bwfVarD;
        this.Z = k18VarB;
        this.s0 = k18VarA;
        tcf tcfVarA = ucf.a(null);
        this.t0 = tcfVarA;
        this.u0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(0L);
        this.v0 = tcfVarA2;
        this.w0 = gw0.C(new yh0(tcfVarA2, 14), this.a, yve.a, null);
        this.x0 = new ci5(0);
        this.y0 = new ci5(0);
        this.A0 = c7j.c();
        this.B0 = c7j.c();
        xfh.o(this, null, new aog(this, null), 3);
    }

    @Override // defpackage.xfh
    public final void s() {
        x9f x9fVar = this.z0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.z0 = null;
        this.C0 = null;
    }
}
