package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public final class md1 implements jd1 {
    public static final /* synthetic */ yy7[] t0;
    public final bwf Y;
    public final tcf Z;
    public final k18 a;
    public final k18 b;
    public final k18 c;
    public final bwf o;
    public final hbd s0;
    public final t9f d = c7j.c();
    public final AtomicBoolean X = new AtomicBoolean(false);

    static {
        z8a z8aVar = new z8a(md1.class, "checkInviteJob", "getCheckInviteJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        t0 = new yy7[]{z8aVar};
    }

    public md1(k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4) {
        this.a = k18Var2;
        this.b = k18Var;
        this.c = k18Var3;
        this.o = new bwf(new nz(k18Var4, 5));
        this.Y = new bwf(new m3(this, 12, k18Var));
        tcf tcfVarA = ucf.a(Boolean.FALSE);
        this.Z = tcfVarA;
        this.s0 = new hbd(tcfVarA);
    }

    public final void a() {
        x9f x9fVarE = svi.e((sv1) this.c.getValue(), (z74) this.o.getValue(), null, new ld1(this, null), 2);
        this.d.O(this, t0[0], x9fVarE);
    }

    @Override // ru.ok.android.externcalls.sdk.events.ConversationEventsListener
    public final void onCallAccepted() {
        super.onCallAccepted();
        a();
    }
}
