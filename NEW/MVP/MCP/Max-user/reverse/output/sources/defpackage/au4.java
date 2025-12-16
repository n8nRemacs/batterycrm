package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class au4 extends kua {
    public final bu4 b;
    public final tvd c;
    public final jdc d;

    public au4(a93 a93Var, wo3 wo3Var, ubg ubgVar, List list) {
        super(a93Var);
        rl rlVar = new rl(3, wo3Var);
        kob kobVar = new kob(new tlf());
        kobVar.X = (jm) a93Var.d;
        ((rl) kobVar.b).c = new dz4(new t9f(11, rlVar));
        bu4 bu4Var = new bu4(kobVar, rlVar, ubgVar, (xtd) a93Var.c, list);
        this.d = new jdc(rlVar, bu4Var, kobVar, 8);
        this.b = bu4Var;
        this.c = new tvd(bu4Var);
    }

    @Override // defpackage.kua
    public final ml b() {
        return this.b;
    }

    @Override // defpackage.kua
    public final lua e() {
        return this.d;
    }

    @Override // defpackage.kua
    public final tvd f() {
        return this.c;
    }

    @Override // defpackage.kua
    public final a93 g() {
        a93 a93Var = new a93(5);
        a(a93Var);
        return a93Var;
    }
}
