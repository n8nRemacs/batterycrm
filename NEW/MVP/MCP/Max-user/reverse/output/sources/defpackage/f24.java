package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class f24 implements jzb {
    public static final /* synthetic */ yy7[] h;
    public final fde a;
    public final k18 b;
    public final k18 c;
    public f84 d;
    public final t9f e = c7j.c();
    public final jve f;
    public final gbd g;

    static {
        z8a z8aVar = new z8a(f24.class, "collectJob", "getCollectJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        h = new yy7[]{z8aVar};
    }

    public f24(k18 k18Var, k18 k18Var2, fde fdeVar) {
        this.a = fdeVar;
        this.b = k18Var;
        this.c = k18Var2;
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 5);
        this.f = jveVarB;
        this.g = new gbd(jveVarB);
    }

    @Override // defpackage.jzb
    public final void a() {
        this.d = null;
    }

    @Override // defpackage.jzb
    public final void b(yyb yybVar) {
        this.a.F(yybVar);
    }

    @Override // defpackage.jzb
    public final void d(long j) {
        this.a.E(j);
    }

    @Override // defpackage.jzb
    public final void e(ContextScope contextScope) {
        this.d = contextScope;
    }
}
