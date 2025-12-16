package defpackage;

import java.util.HashMap;

/* loaded from: classes.dex */
public final class tc3 extends r0 {
    public final kke h;
    public final qp7 i;
    public final /* synthetic */ int j;

    public tc3(nac nacVar, kke kkeVar, qp7 qp7Var, int i) {
        this.j = i;
        HashMap map = kkeVar.X;
        this.h = kkeVar;
        this.i = qp7Var;
        ml6.i();
        this.a = map;
        ml6.i();
        qp7Var.b(kkeVar);
        ml6.i();
        nacVar.a(new d4(0, this), kkeVar);
    }

    @Override // defpackage.r0
    public void a(Object obj) {
        switch (this.j) {
            case 0:
                vc3.P((vc3) obj);
                break;
        }
    }

    @Override // defpackage.r0, defpackage.pe4
    public final boolean close() {
        if (!super.close()) {
            return false;
        }
        if (g()) {
            return true;
        }
        qp7 qp7Var = this.i;
        kke kkeVar = this.h;
        qp7Var.h(kkeVar);
        kkeVar.e();
        return true;
    }

    @Override // defpackage.r0, defpackage.pe4
    public Object d() {
        switch (this.j) {
            case 0:
                return vc3.y((vc3) super.d());
            default:
                return super.d();
        }
    }

    public final void n(Object obj, int i, oac oacVar) {
        boolean zA = hj0.a(i);
        if (k(obj, zA, ((mk0) oacVar).X) && zA) {
            this.i.g(this.h);
        }
    }
}
