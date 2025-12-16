package defpackage;

/* loaded from: classes.dex */
public final class f5c extends wh6 {
    public final /* synthetic */ int f = 0;
    public final Object g;

    public f5c(s9g s9gVar, k09 k09Var) {
        super(s9gVar);
        this.g = k09Var;
    }

    @Override // defpackage.wh6, defpackage.s9g
    public m9g f(int i, m9g m9gVar, boolean z) {
        switch (this.f) {
            case 0:
                s9g s9gVar = this.e;
                m9g m9gVarF = s9gVar.f(i, m9gVar, z);
                if (s9gVar.m(m9gVarF.c, (q9g) this.g, 0L).a()) {
                    m9gVarF.i(m9gVar.a, m9gVar.b, m9gVar.c, m9gVar.d, m9gVar.e, v8.f, true);
                } else {
                    m9gVarF.f = true;
                }
                return m9gVarF;
            default:
                return super.f(i, m9gVar, z);
        }
    }

    @Override // defpackage.wh6, defpackage.s9g
    public q9g m(int i, q9g q9gVar, long j) {
        switch (this.f) {
            case 1:
                super.m(i, q9gVar, j);
                k09 k09Var = (k09) this.g;
                q9gVar.c = k09Var;
                a09 a09Var = k09Var.b;
                q9gVar.getClass();
                return q9gVar;
            default:
                return super.m(i, q9gVar, j);
        }
    }

    public f5c(s9g s9gVar) {
        super(s9gVar);
        this.g = new q9g();
    }
}
