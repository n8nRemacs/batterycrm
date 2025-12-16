package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class emg extends xfh {
    public static final /* synthetic */ yy7[] O0 = {new z8a(emg.class, "checkPasswordJob", "getCheckPasswordJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, emg.class, "passwordChangeJob", "getPasswordChangeJob()Lkotlinx/coroutines/Job;"), new z8a(emg.class, "checkHintJob", "getCheckHintJob()Lkotlinx/coroutines/Job;"), new z8a(emg.class, "addEmailJob", "getAddEmailJob()Lkotlinx/coroutines/Job;"), new z8a(emg.class, "requestNewCodeJob", "getRequestNewCodeJob()Lkotlinx/coroutines/Job;")};
    public final tcf A0;
    public final hbd B0;
    public final ci5 C0;
    public final ci5 D0;
    public final ci5 E0;
    public x9f F0;
    public final t9f G0;
    public final t9f H0;
    public final t9f I0;
    public final t9f J0;
    public final t9f K0;
    public x9f L0;
    public x9f M0;
    public x9f N0;
    public final up7 X;
    public final String Y;
    public final k18 Z;
    public final jlg b;
    public final ilg c;
    public final rp7 d;
    public final String o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final bwf v0;
    public final tcf w0;
    public final hbd x0;
    public final AtomicReference y0;
    public final AtomicReference z0;

    public emg(jlg jlgVar, ilg ilgVar, rp7 rp7Var, String str, up7 up7Var) {
        ykg ykgVar = ykg.a;
        k18 k18VarB = ykgVar.b();
        bwf bwfVarD = ykgVar.getAccessor().d(48);
        k18 k18VarA = ykgVar.a();
        bwf bwfVarD2 = ykgVar.getAccessor().d(484);
        this.b = jlgVar;
        this.c = ilgVar;
        this.d = rp7Var;
        this.o = str;
        this.X = up7Var;
        this.Y = emg.class.getName();
        this.Z = k18VarB;
        this.s0 = bwfVarD;
        this.t0 = k18VarA;
        this.u0 = bwfVarD2;
        this.v0 = new bwf(new kvf(8, this));
        tcf tcfVarA = ucf.a(null);
        this.w0 = tcfVarA;
        this.x0 = new hbd(tcfVarA);
        this.y0 = new AtomicReference(null);
        this.z0 = new AtomicReference(null);
        tcf tcfVarA2 = ucf.a(0L);
        this.A0 = tcfVarA2;
        this.B0 = gw0.C(new yh0(tcfVarA2, 13), this.a, yve.a, null);
        this.C0 = new ci5(0);
        this.D0 = new ci5(0);
        this.E0 = new ci5(0);
        this.G0 = c7j.c();
        this.H0 = c7j.c();
        this.I0 = c7j.c();
        this.J0 = c7j.c();
        this.K0 = c7j.c();
        svi.e(this.a, null, null, new vlg(this, null), 3);
    }

    @Override // defpackage.xfh
    public final void s() {
        x9f x9fVar = this.F0;
        if (x9fVar != null) {
            x9fVar.cancel((CancellationException) null);
        }
        this.F0 = null;
        this.M0 = null;
        this.L0 = null;
    }

    public final void t(up7 up7Var) {
        x9f x9fVar = this.M0;
        if (x9fVar == null || !x9fVar.isActive()) {
            if (up7Var == null) {
                up7Var = this.X;
            }
            if (up7Var == null) {
                wqi.e(this.Y, "Final step: Can't create 2FA because navData is null", null);
            } else {
                this.M0 = xfh.o(this, ((q2b) w()).b(), new slg(this, up7Var, null), 2);
            }
        }
    }

    public final void u(up7 up7Var) {
        if (up7Var == null) {
            up7Var = this.X;
        }
        String str = this.Y;
        if (up7Var == null) {
            wqi.e(str, "Can't finish restore because navData is null", null);
            return;
        }
        x9f x9fVar = this.N0;
        if (x9fVar != null && x9fVar.isActive()) {
            wqi.q(str, "Don't need start finish restore if it in process now", new Object[0]);
            return;
        }
        xfh.r(this.C0, new mmg(true));
        int iOrdinal = this.d.ordinal();
        if (iOrdinal == 0) {
            this.N0 = xfh.o(this, ((q2b) w()).b(), new tlg(this, up7Var, null), 2);
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            this.N0 = xfh.o(this, ((q2b) w()).b(), new ulg(this, up7Var, null), 2);
        }
    }

    public final zkg v() {
        return (zkg) this.v0.getValue();
    }

    public final lzf w() {
        return (lzf) this.Z.getValue();
    }
}
