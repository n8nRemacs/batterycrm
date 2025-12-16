package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class ro4 extends kua {
    public final ll b;
    public final bu4 c;
    public final tvd d;
    public final ka5 e;
    public final xtd f;

    public ro4(a93 a93Var, rm rmVar, vm vmVar, u5i u5iVar, List list) {
        super(a93Var);
        this.b = u5iVar;
        this.f = (xtd) a93Var.c;
        ys4 ys4Var = new ys4(rmVar, u5iVar);
        kob kobVar = new kob(new tlf());
        kobVar.X = (jm) a93Var.d;
        ((rl) kobVar.b).c = new dz4(new t9f(11, ys4Var));
        bu4 bu4Var = new bu4(kobVar, ys4Var, vmVar, (xtd) a93Var.c, list);
        this.e = new ka5(ys4Var, bu4Var, kobVar);
        this.c = bu4Var;
        this.d = new tvd(bu4Var);
    }

    @Override // defpackage.kua
    public final ml b() {
        return this.c;
    }

    @Override // defpackage.kua
    public final ll c() {
        return this.b;
    }

    @Override // defpackage.kua
    public final xl d() {
        return this.f;
    }

    @Override // defpackage.kua
    public final lua e() {
        return this.e;
    }

    @Override // defpackage.kua
    public final tvd f() {
        return this.d;
    }

    @Override // defpackage.kua
    public final a93 g() {
        a93 a93Var = new a93(5);
        a(a93Var);
        return a93Var;
    }
}
