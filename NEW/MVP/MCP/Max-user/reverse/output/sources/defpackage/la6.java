package defpackage;

import kotlinx.coroutines.internal.ContextScope;

/* loaded from: classes2.dex */
public final class la6 implements jzb {
    public final fde a;
    public final cb6 b;
    public final k18 c;
    public final k18 d;
    public final jve e;
    public final gbd f;
    public f84 g;
    public boolean h;

    public la6(fde fdeVar, k18 k18Var) {
        vb6 vb6Var = vb6.a;
        cb6 cb6VarC = vb6Var.c();
        bwf bwfVarD = vb6Var.getAccessor().d(454);
        this.a = fdeVar;
        this.b = cb6VarC;
        this.c = bwfVarD;
        this.d = k18Var;
        jve jveVarB = kve.b(0, Integer.MAX_VALUE, 5);
        this.e = jveVarB;
        this.f = new gbd(jveVarB);
    }

    @Override // defpackage.jzb
    public final void a() {
        this.g = null;
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
        this.g = contextScope;
    }
}
