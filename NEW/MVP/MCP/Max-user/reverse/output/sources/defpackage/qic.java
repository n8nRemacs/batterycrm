package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes2.dex */
public final class qic extends xfh {
    public static final /* synthetic */ yy7[] H0;
    public final AtomicLong A0;
    public final AtomicBoolean B0;
    public final tcf C0;
    public final hbd D0;
    public final ci5 E0;
    public final ci5 F0;
    public final jve G0;
    public final k18 X;
    public final jve Y;
    public final k18 Z;
    public final long b;
    public final k18 c;
    public final k18 d;
    public final k18 o;
    public final k18 s0;
    public final k18 t0;
    public final k18 u0;
    public final k18 v0;
    public final k18 w0;
    public final k18 x0;
    public final t9f y0;
    public final AtomicLong z0;

    static {
        z8a z8aVar = new z8a(qic.class, "getChatLinkJob", "getGetChatLinkJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        H0 = new yy7[]{z8aVar};
    }

    public qic(long j, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5, k18 k18Var6, k18 k18Var7, k18 k18Var8, k18 k18Var9, k18 k18Var10, k18 k18Var11, k18 k18Var12) {
        this.b = j;
        this.c = k18Var;
        this.d = k18Var3;
        this.o = k18Var4;
        this.X = k18Var5;
        jve jveVarB = kve.b(1, 0, 6);
        this.Y = jveVarB;
        this.Z = k18Var2;
        this.s0 = k18Var7;
        this.t0 = k18Var8;
        this.u0 = k18Var9;
        this.v0 = k18Var10;
        this.w0 = k18Var11;
        this.x0 = k18Var12;
        u92 u92VarY = gw0.y(jveVarB, new uxb(((ui0) k18Var6.getValue()).b, this, 7));
        this.y0 = c7j.c();
        this.z0 = new AtomicLong();
        this.A0 = new AtomicLong(-9223372036854775807L);
        this.B0 = new AtomicBoolean(false);
        tcf tcfVarA = ucf.a(hd5.a);
        this.C0 = tcfVarA;
        this.D0 = new hbd(tcfVarA);
        this.E0 = new ci5(0);
        this.F0 = new ci5(0);
        this.G0 = kve.b(1, 0, 6);
        gw0.w(gw0.u(new g56(u92VarY, new bzb(2, this, qic.class, "handleApiError", "handleApiError(Lone/me/profile/screens/invite/CreateLinkErrors;)V", 4, 3), 1), ((q2b) w()).a()), this.a);
        gw0.w(gw0.u(new uxb(new g56(new mwd(new pic(new d53(((w63) k18Var3.getValue()).j(j), 12), null, this)), new gic(this, null), 1), this, 6), ((q2b) w()).a()), this.a);
        ohc ohcVar = (ohc) k18Var12.getValue();
        ohcVar.a.d(ohcVar);
        gw0.w(gw0.u(new g56(new gbd(((ohc) k18Var12.getValue()).b), new hic(this, null), 1), ((q2b) w()).a()), this.a);
    }

    @Override // defpackage.xfh
    public final void s() {
        ohc ohcVar = (ohc) this.x0.getValue();
        ohcVar.a.f(ohcVar);
        yy7[] yy7VarArr = H0;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.y0;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final void t(defpackage.pb2 r31) {
        /*
            Method dump skipped, instructions count: 533
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qic.t(pb2):void");
    }

    public final pb2 u() {
        return (pb2) ((w63) this.d.getValue()).j(this.b).a.getValue();
    }

    public final String v() {
        rf2 rf2Var;
        String str;
        ku3 ku3Var;
        pb2 pb2VarU = u();
        if (pb2VarU != null && pb2VarU.K()) {
            pb2 pb2VarU2 = u();
            if (pb2VarU2 == null || (ku3Var = (ku3) ue3.G(pb2VarU2.l())) == null) {
                return null;
            }
            return ku3Var.i();
        }
        pb2 pb2VarU3 = u();
        if (pb2VarU3 == null || (rf2Var = pb2VarU3.b) == null || (str = rf2Var.I) == null || str.length() == 0) {
            return null;
        }
        return str;
    }

    public final lzf w() {
        return (lzf) this.o.getValue();
    }
}
