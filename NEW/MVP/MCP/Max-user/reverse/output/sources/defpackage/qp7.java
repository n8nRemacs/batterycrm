package defpackage;

import java.util.Map;

/* loaded from: classes.dex */
public final class qp7 implements end, rac {
    public final fnd a;
    public final sh6 b;
    public final fnd c;
    public final end d;

    public qp7(th6 th6Var, sh6 sh6Var) {
        this.a = th6Var;
        this.b = sh6Var;
        this.c = th6Var;
        this.d = sh6Var;
    }

    @Override // defpackage.rac
    public final void a(oac oacVar, String str, Map map) {
        fnd fndVar = this.a;
        if (fndVar != null) {
            fndVar.i(((mk0) oacVar).b, str, map);
        }
        sh6 sh6Var = this.b;
        if (sh6Var != null) {
            sh6Var.a(oacVar, str, map);
        }
    }

    @Override // defpackage.end
    public final void b(kke kkeVar) {
        fnd fndVar = this.c;
        if (fndVar != null) {
            fndVar.b(kkeVar.a, kkeVar.d, kkeVar.b, kkeVar.g());
        }
        end endVar = this.d;
        if (endVar != null) {
            endVar.b(kkeVar);
        }
    }

    @Override // defpackage.rac
    public final void c(oac oacVar) {
        fnd fndVar = this.a;
        if (fndVar != null) {
            fndVar.g(((mk0) oacVar).b);
        }
        sh6 sh6Var = this.b;
        if (sh6Var != null) {
            sh6Var.c(oacVar);
        }
    }

    @Override // defpackage.rac
    public final void d(oac oacVar, String str, Throwable th, Map map) {
        fnd fndVar = this.a;
        if (fndVar != null) {
            fndVar.j(((mk0) oacVar).b, str, th, map);
        }
        sh6 sh6Var = this.b;
        if (sh6Var != null) {
            sh6Var.d(oacVar, str, th, map);
        }
    }

    @Override // defpackage.rac
    public final void e(oac oacVar, String str, boolean z) {
        fnd fndVar = this.a;
        if (fndVar != null) {
            fndVar.f(((mk0) oacVar).b, str, z);
        }
        sh6 sh6Var = this.b;
        if (sh6Var != null) {
            sh6Var.e(oacVar, str, z);
        }
    }

    @Override // defpackage.end
    public final void f(oac oacVar, Throwable th) {
        fnd fndVar = this.c;
        if (fndVar != null) {
            mk0 mk0Var = (mk0) oacVar;
            fndVar.c(mk0Var.a, mk0Var.b, th, mk0Var.g());
        }
        end endVar = this.d;
        if (endVar != null) {
            endVar.f(oacVar, th);
        }
    }

    @Override // defpackage.end
    public final void g(oac oacVar) {
        fnd fndVar = this.c;
        if (fndVar != null) {
            mk0 mk0Var = (mk0) oacVar;
            fndVar.a(mk0Var.a, mk0Var.b, mk0Var.g());
        }
        end endVar = this.d;
        if (endVar != null) {
            endVar.g(oacVar);
        }
    }

    @Override // defpackage.end
    public final void h(oac oacVar) {
        fnd fndVar = this.c;
        if (fndVar != null) {
            fndVar.k(((mk0) oacVar).b);
        }
        end endVar = this.d;
        if (endVar != null) {
            endVar.h(oacVar);
        }
    }

    @Override // defpackage.rac
    public final boolean i(oac oacVar, String str) {
        fnd fndVar = this.a;
        Boolean boolValueOf = fndVar != null ? Boolean.valueOf(fndVar.h(((mk0) oacVar).b)) : null;
        if (!fni.a(boolValueOf, Boolean.TRUE)) {
            sh6 sh6Var = this.b;
            boolValueOf = sh6Var != null ? Boolean.valueOf(sh6Var.i(oacVar, str)) : null;
        }
        if (boolValueOf != null) {
            return boolValueOf.booleanValue();
        }
        return false;
    }

    @Override // defpackage.rac
    public final void j(oac oacVar, String str) {
        fnd fndVar = this.a;
        if (fndVar != null) {
            fndVar.d(((mk0) oacVar).b, str);
        }
        sh6 sh6Var = this.b;
        if (sh6Var != null) {
            sh6Var.j(oacVar, str);
        }
    }

    @Override // defpackage.rac
    public final void k(oac oacVar, String str) {
        fnd fndVar = this.a;
        if (fndVar != null) {
            fndVar.e(((mk0) oacVar).b, str);
        }
        sh6 sh6Var = this.b;
        if (sh6Var != null) {
            sh6Var.k(oacVar, str);
        }
    }
}
