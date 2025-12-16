package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class nwb implements jzb {
    public static final /* synthetic */ yy7[] l;
    public final long a;
    public final k18 b;
    public final k18 c;
    public final k18 d;
    public final k18 e;
    public final k18 f;
    public final jve g;
    public final gbd h;
    public final AtomicLong i;
    public final t9f j;
    public f84 k;

    static {
        z8a z8aVar = new z8a(nwb.class, "addSubscribersJob", "getAddSubscribersJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        l = new yy7[]{z8aVar};
    }

    public nwb(long j, k18 k18Var, k18 k18Var2, k18 k18Var3, k18 k18Var4, k18 k18Var5) {
        this.a = j;
        this.b = k18Var;
        this.c = k18Var2;
        this.d = k18Var3;
        this.e = k18Var4;
        this.f = k18Var5;
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 5);
        this.g = jveVarB;
        this.h = new gbd(jveVarB);
        this.i = new AtomicLong();
        this.j = c7j.c();
    }

    @Override // defpackage.jzb
    public final void a() {
        this.k = null;
    }

    @Override // defpackage.jzb
    public final void b(yyb yybVar) {
    }

    @Override // defpackage.jzb
    public final void d(long j) {
    }

    @Override // defpackage.jzb
    public final void e(ContextScope contextScope) {
        this.k = contextScope;
        gw0.w(new g56(new gbd(((twb) this.e.getValue()).a), new lwb(this, null), 1), contextScope);
    }
}
