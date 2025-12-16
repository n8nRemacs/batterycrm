package defpackage;

import org.apache.http.HttpStatus;

/* loaded from: classes.dex */
public final class aeh extends xfh {
    public static final /* synthetic */ yy7[] C0;
    public final tcf A0;
    public final hbd B0;
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final long b;
    public final long c;
    public final gx9 d;
    public final k18 o;
    public final tcf s0;
    public final hbd t0;
    public final tcf u0;
    public final hbd v0;
    public final ci5 w0;
    public final t9f x0;
    public final tcf y0;
    public final hbd z0;

    static {
        z8a z8aVar = new z8a(aeh.class, "reloadWebAppJob", "getReloadWebAppJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        C0 = new yy7[]{z8aVar};
    }

    public aeh(long j, long j2, String str) {
        ak2 ak2Var = ak2.a;
        gx9 gx9Var = (gx9) ak2Var.getAccessor().c(138);
        lzf lzfVar = (lzf) ak2Var.getAccessor().c(8);
        bwf bwfVarD = ak2Var.getAccessor().d(123);
        bwf bwfVarD2 = ak2Var.getAccessor().d(109);
        bwf bwfVarD3 = ak2Var.getAccessor().d(HttpStatus.SC_GONE);
        bwf bwfVarD4 = ak2Var.getAccessor().d(46);
        bwf bwfVarD5 = ak2Var.getAccessor().d(48);
        this.b = j;
        this.c = j2;
        this.d = gx9Var;
        this.o = bwfVarD;
        this.X = bwfVarD2;
        this.Y = bwfVarD3;
        this.Z = bwfVarD4;
        tcf tcfVarA = ucf.a(str);
        this.s0 = tcfVarA;
        this.t0 = gw0.C(new z41(tcfVarA, bwfVarD5, this, 6), this.a, yve.a, null);
        tcf tcfVarA2 = ucf.a(null);
        this.u0 = tcfVarA2;
        this.v0 = new hbd(tcfVarA2);
        this.w0 = new ci5(0);
        this.x0 = c7j.c();
        tcf tcfVarA3 = ucf.a(new gp2(null, null, 31));
        this.y0 = tcfVarA3;
        this.z0 = new hbd(tcfVarA3);
        tcf tcfVarA4 = ucf.a(null);
        this.A0 = tcfVarA4;
        this.B0 = new hbd(tcfVarA4);
        xfh.o(this, ((q2b) lzfVar).a(), new wdh(this, null), 2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object t(defpackage.aeh r11, defpackage.q44 r12) {
        /*
            Method dump skipped, instructions count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeh.t(aeh, q44):java.lang.Object");
    }

    public final void u(int i) {
        int i2 = d1b.v;
        long j = this.c;
        ci5 ci5Var = this.w0;
        if (i != i2) {
            if (i == d1b.y) {
                ko2.c.getClass();
                xfh.r(ci5Var, ko2.L0(j, null));
                return;
            }
            return;
        }
        ko2.c.getClass();
        xc0.l(":chats?id=" + this.b + "&type=local&message_id=" + j, ci5Var);
    }

    public final void v(String str, boolean z) {
        String name = aeh.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, "videoWebView: onPageStartLoading: " + str + " " + z, null);
            }
        }
        if (!fni.a((String) this.s0.getValue(), str) || z) {
            this.u0.m(null, wlb.a);
        }
    }
}
