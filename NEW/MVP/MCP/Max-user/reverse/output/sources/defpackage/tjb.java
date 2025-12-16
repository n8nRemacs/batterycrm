package defpackage;

/* loaded from: classes2.dex */
public final class tjb extends xfh {
    public static final /* synthetic */ yy7[] Z;
    public final hbd X;
    public final t9f Y;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final tcf o;

    static {
        z8a z8aVar = new z8a(tjb.class, "changePushNewUserJob", "getChangePushNewUserJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        Z = new yy7[]{z8aVar};
    }

    public tjb() {
        ooa ooaVar = ooa.a;
        bwf bwfVarD = ooaVar.getAccessor().d(61);
        bwf bwfVarD2 = ooaVar.getAccessor().d(79);
        bwf bwfVarD3 = ooaVar.getAccessor().d(8);
        this.b = bwfVarD2;
        this.c = bwfVarD;
        this.d = bwfVarD3;
        tcf tcfVarA = ucf.a(hd5.a);
        this.o = tcfVarA;
        this.X = new hbd(tcfVarA);
        this.Y = c7j.c();
        tcfVarA.setValue(t());
    }

    public final o98 t() {
        o98 o98VarD = ve3.d();
        o98VarD.add(new toe(z7b.u, 0, new n5g(b8b.r), null, null, null, new doe(((sxg) this.c.getValue()).g.getBoolean("app.notification.show.new.users", true), true), null, null, 440));
        return ve3.a(o98VarD);
    }

    public final void u(long j) {
        if (j == z7b.u) {
            this.Y.O(this, Z[0], svi.d(this.a, ((q2b) ((lzf) this.d.getValue())).b(), i84.b, new sjb(this, null)));
        }
    }
}
