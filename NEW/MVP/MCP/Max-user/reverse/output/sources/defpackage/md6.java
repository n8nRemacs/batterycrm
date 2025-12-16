package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final /* synthetic */ class md6 implements cm6 {
    public final /* synthetic */ int a;
    public final /* synthetic */ od6 b;
    public final /* synthetic */ neb c;

    public /* synthetic */ md6(od6 od6Var, neb nebVar, int i) {
        this.a = i;
        this.b = od6Var;
        this.c = nebVar;
    }

    @Override // defpackage.cm6
    public final Object invoke() {
        switch (this.a) {
            case 0:
                od6 od6Var = this.b;
                List list = od6Var.s0;
                if (list != null) {
                    this.c.j();
                    od6Var.v0.b(list, null);
                }
                od6Var.s0 = null;
                break;
            default:
                od6 od6Var2 = this.b;
                nd6 nd6Var = od6Var2.d;
                if (nd6Var != null) {
                    this.c.k(nd6Var);
                }
                od6Var2.d = null;
                od6Var2.o = null;
                iv ivVar = od6Var2.v0;
                od6Var2.s0 = ivVar.f;
                ivVar.b(null, null);
                break;
        }
        return qqg.a;
    }
}
