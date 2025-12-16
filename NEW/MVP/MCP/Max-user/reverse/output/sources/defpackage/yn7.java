package defpackage;

/* loaded from: classes2.dex */
public final class yn7 extends xfh implements mr3 {
    public static final /* synthetic */ yy7[] H0 = {new z8a(yn7.class, "authJob", "getAuthJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, yn7.class, "jobPhoneValidation", "getJobPhoneValidation()Lkotlinx/coroutines/Job;")};
    public volatile boolean A0;
    public final n5g B0;
    public x9f C0;
    public final hbd D0;
    public final tcf E0;
    public final x26 F0;
    public final yid G0;
    public final k18 X;
    public final k18 Y;
    public final ci5 Z;
    public final /* synthetic */ agh b;
    public final bwf c;
    public final k18 d;
    public final k18 o;
    public final jve s0;
    public final ci5 t0;
    public final g56 u0;
    public final t9f v0;
    public final t9f w0;
    public final tcf x0;
    public final tcf y0;
    public final hbd z0;

    public yn7(String str) {
        hh8 hh8Var = hh8.a;
        hh8Var.getClass();
        bwf bwfVar = new bwf(new c38(5));
        bwf bwfVarD = hh8Var.getAccessor().d(8);
        bwf bwfVarD2 = hh8Var.getAccessor().d(139);
        bwf bwfVarD3 = hh8Var.getAccessor().d(83);
        bwf bwfVarD4 = hh8Var.getAccessor().d(481);
        bwf bwfVarD5 = hh8Var.getAccessor().d(479);
        bwf bwfVarD6 = hh8Var.getAccessor().d(14);
        agh aghVar = new agh(bwfVarD2, new wm7(1));
        this.b = aghVar;
        this.c = bwfVar;
        this.d = bwfVarD;
        this.o = bwfVarD4;
        this.X = bwfVarD5;
        this.Y = bwfVarD6;
        this.Z = new ci5(0);
        jve jveVarB = kve.b(0, 0, 7);
        this.s0 = jveVarB;
        this.t0 = new ci5(0);
        int i = 12;
        g56 g56Var = new g56(gw0.y(jveVarB, new d53(aghVar.d, i)), new pn7(this, null), 1);
        this.u0 = g56Var;
        this.v0 = c7j.c();
        this.w0 = c7j.c();
        tcf tcfVarA = ucf.a(y2b.a);
        this.x0 = tcfVarA;
        tcf tcfVarA2 = ucf.a(hd5.a);
        this.y0 = tcfVarA2;
        this.z0 = new hbd(tcfVarA2);
        this.B0 = new n5g(t3d.oneme_login_input_select_country_info);
        this.D0 = gw0.C(new fe1(tcfVarA, this, bwfVarD, bwfVarD4, 2), this.a, yve.a, new a94((x2b) tcfVarA.getValue(), Integer.MAX_VALUE, new n5g(t3d.oneme_login_input_default_phone_hint)));
        tcf tcfVarA3 = ucf.a(str);
        this.E0 = tcfVarA3;
        this.F0 = gw0.u(new z41(new y83(tcfVarA3, i, this), new y83(tcfVarA, 13, bwfVarD4), new mn7(3, null, 0), 3), ((q2b) ((lzf) bwfVarD.getValue())).a());
        this.G0 = new yid("[^0-9+]");
        gw0.w(gw0.u(new g56(g56Var, new kn7(this, bwfVarD3, null), 1), ((q2b) ((lzf) bwfVarD.getValue())).a()), this.a);
    }

    @Override // defpackage.mr3
    public final gbd i() {
        return this.b.d;
    }

    @Override // defpackage.xfh
    public final void s() {
        yy7[] yy7VarArr = H0;
        yy7 yy7Var = yy7VarArr[0];
        t9f t9fVar = this.v0;
        qt7 qt7Var = (qt7) t9fVar.D(this, yy7Var);
        if (qt7Var != null) {
            qt7Var.cancel(null);
        }
        t9fVar.O(this, yy7VarArr[0], null);
        yy7 yy7Var2 = yy7VarArr[1];
        t9f t9fVar2 = this.w0;
        qt7 qt7Var2 = (qt7) t9fVar2.D(this, yy7Var2);
        if (qt7Var2 != null) {
            qt7Var2.cancel(null);
        }
        t9fVar2.O(this, yy7VarArr[1], null);
    }
}
