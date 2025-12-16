package defpackage;

/* loaded from: classes2.dex */
public final class owh extends xfh {
    public static final /* synthetic */ yy7[] z0 = {new z8a(owh.class, "toggleBiometryJob", "getToggleBiometryJob()Lkotlinx/coroutines/Job;"), u45.h(vid.a, owh.class, "loadWebAppSectionsJob", "getLoadWebAppSectionsJob()Lkotlinx/coroutines/Job;")};
    public final k18 X;
    public final k18 Y;
    public final k18 Z;
    public final long b;
    public final long c;
    public final lqh d;
    public final String o;
    public final k18 s0;
    public final tcf t0;
    public final hbd u0;
    public final ci5 v0;
    public final ci5 w0;
    public final t9f x0;
    public final t9f y0;

    public owh(long j, long j2) {
        StringBuilder sbL = az1.l(j, "webapp_biom_s_key_", "_");
        sbL.append(j2);
        lqh lqhVar = new lqh(sbL.toString(), true);
        kph kphVar = kph.a;
        bwf bwfVarD = kphVar.getAccessor().d(196);
        bwf bwfVarD2 = kphVar.getAccessor().d(591);
        bwf bwfVarD3 = kphVar.getAccessor().d(8);
        bwf bwfVarD4 = kphVar.getAccessor().d(164);
        this.b = j;
        this.c = j2;
        this.d = lqhVar;
        this.o = owh.class.getName();
        this.X = bwfVarD;
        this.Y = bwfVarD2;
        this.Z = bwfVarD3;
        this.s0 = bwfVarD4;
        tcf tcfVarA = ucf.a(new kwh("", hd5.a));
        this.t0 = tcfVarA;
        this.u0 = new hbd(tcfVarA);
        this.v0 = new ci5(0);
        this.w0 = new ci5(0);
        this.x0 = c7j.c();
        this.y0 = c7j.c();
        t();
    }

    public final void t() {
        x9f x9fVarD = svi.d(this.a, ((q2b) ((lzf) this.Z.getValue())).b(), i84.b, new lwh(this, null));
        this.y0.O(this, z0[1], x9fVarD);
    }
}
