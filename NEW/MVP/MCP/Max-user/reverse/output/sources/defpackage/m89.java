package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class m89 implements w89, x89 {
    public final /* synthetic */ int a;
    public final /* synthetic */ z89 b;
    public final /* synthetic */ int c;

    public /* synthetic */ m89(z89 z89Var, int i, int i2) {
        this.a = i2;
        this.b = z89Var;
        this.c = i;
    }

    @Override // defpackage.x89
    public void b(a5c a5cVar, u69 u69Var, List list) {
        switch (this.a) {
            case 1:
                a5cVar.b(this.b.U(u69Var, a5cVar, this.c), list);
                break;
            case 2:
                z89 z89Var = this.b;
                z89Var.getClass();
                int size = list.size();
                int i = this.c;
                if (size != 1) {
                    a5cVar.V(list, z89Var.U(u69Var, a5cVar, i), z89Var.U(u69Var, a5cVar, i + 1));
                    break;
                } else {
                    int iU = z89Var.U(u69Var, a5cVar, i);
                    k09 k09Var = (k09) list.get(0);
                    a5cVar.m0();
                    a5cVar.a.l1(wg7.m(k09Var), iU, iU + 1);
                    break;
                }
            default:
                a5cVar.b(this.b.U(u69Var, a5cVar, this.c), list);
                break;
        }
    }

    @Override // defpackage.w89
    public void h(a5c a5cVar, u69 u69Var) {
        switch (this.a) {
            case 0:
                a5cVar.Z(this.b.U(u69Var, a5cVar, this.c));
                break;
            default:
                a5cVar.U(this.b.U(u69Var, a5cVar, this.c));
                break;
        }
    }
}
