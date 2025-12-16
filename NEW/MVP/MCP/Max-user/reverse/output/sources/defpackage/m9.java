package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class m9 implements jzb {
    public static final /* synthetic */ yy7[] i;
    public final long a;
    public final k18 b;
    public final k18 c;
    public f84 d;
    public final jve e;
    public final gbd f;
    public final t9f g;
    public final boolean h;

    static {
        z8a z8aVar = new z8a(m9.class, "processActionJob", "getProcessActionJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        i = new yy7[]{z8aVar};
    }

    public m9(long j, k18 k18Var, k18 k18Var2) {
        this.a = j;
        this.b = k18Var;
        this.c = k18Var2;
        boolean z = false;
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 5);
        this.e = jveVarB;
        this.f = new gbd(jveVarB);
        this.g = c7j.c();
        pb2 pb2Var = (pb2) ((w63) k18Var.getValue()).j(j).a.getValue();
        if (pb2Var != null && pb2Var.M()) {
            z = true;
        }
        this.h = z;
    }

    @Override // defpackage.jzb
    public final void a() {
        this.d = null;
    }

    @Override // defpackage.jzb
    public final void b(yyb yybVar) {
    }

    @Override // defpackage.jzb
    public final void d(long j) {
    }

    @Override // defpackage.jzb
    public final void e(ContextScope contextScope) {
        this.d = contextScope;
    }
}
