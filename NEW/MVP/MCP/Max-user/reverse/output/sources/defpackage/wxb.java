package defpackage;

/* loaded from: classes2.dex */
public final class wxb extends xfh {
    public static final /* synthetic */ yy7[] E0;
    public final hbd A0;
    public final tcf B0;
    public final tcf C0;
    public volatile n8a D0;
    public final xxb X;
    public final yg2 Y;
    public final k18 Z;
    public final String b;
    public final z13 c;
    public final ay3 d;
    public final pb3 o;
    public final sl7 s0;
    public final bwf t0;
    public final k18 u0;
    public final t9f v0;
    public final hbd w0;
    public final tcf x0;
    public final hbd y0;
    public final tcf z0;

    static {
        z8a z8aVar = new z8a(wxb.class, "searchJob", "getSearchJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        E0 = new yy7[]{z8aVar};
    }

    public wxb(String str, z13 z13Var, ay3 ay3Var, pb3 pb3Var, xxb xxbVar, yg2 yg2Var, lzf lzfVar, k18 k18Var, sl7 sl7Var, bwf bwfVar) {
        e03 e03Var = e03.a;
        e03Var.getAccessor().d(47);
        bwf bwfVarD = e03Var.getAccessor().d(220);
        this.b = str;
        this.c = z13Var;
        this.d = ay3Var;
        this.o = pb3Var;
        this.X = xxbVar;
        this.Y = yg2Var;
        this.Z = k18Var;
        this.s0 = sl7Var;
        this.t0 = bwfVar;
        this.u0 = bwfVarD;
        this.v0 = c7j.c();
        hd5 hd5Var = hd5.a;
        tcf tcfVarA = ucf.a(hd5Var);
        this.w0 = new hbd(tcfVarA);
        tcf tcfVarA2 = ucf.a(Boolean.TRUE);
        this.x0 = tcfVarA2;
        this.y0 = new hbd(tcfVarA2);
        tcf tcfVarA3 = ucf.a(null);
        this.z0 = tcfVarA3;
        this.A0 = new hbd(tcfVarA3);
        this.B0 = ucf.a(0L);
        tcf tcfVarA4 = ucf.a(hd5Var);
        this.C0 = tcfVarA4;
        this.D0 = dk8.a();
        g56 g56Var = new g56(new y83(new z41(z13Var.w0, tcfVarA4, new s3(this, null, 21), 3), 29, this), new ir9(2, tcfVarA, f9a.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 9), 1);
        q2b q2bVar = (q2b) lzfVar;
        gw0.w(gw0.u(g56Var, q2bVar.a()), this.a);
        pe8 pe8Var = (pe8) pb3Var;
        String str2 = (String) pe8Var.o0.D(pe8Var, pe8.U0[1]);
        str2 = str2 == null ? "" : str2;
        StringBuilder sb = new StringBuilder();
        int length = str2.length();
        for (int i = 0; i < length; i++) {
            char cCharAt = str2.charAt(i);
            if (Character.isDigit(cCharAt)) {
                sb.append(cCharAt);
            }
        }
        Long lI = cnf.i(sb.toString());
        gw0.w(gw0.u(new g56(new fe1(new z41(this.d.b(), new m36(new nxb(2, null), new uxb(new y83(this.B0, 28, this), this, 0)), new v43(3, null, 1), 3), new vi5(8, new vs6(17)), this, lI, 4), new ir9(2, this.C0, f9a.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0, 8), 1), q2bVar.a()), this.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00b3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.fxb t(defpackage.wxb r26, defpackage.hs2 r27) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wxb.t(wxb, hs2):fxb");
    }

    @Override // defpackage.xfh
    public final void s() {
        u().i = null;
    }

    public final zm8 u() {
        return (zm8) this.Z.getValue();
    }
}
