package defpackage;

import java.util.List;

/* loaded from: classes.dex */
public final /* synthetic */ class l89 implements w89, x89 {
    public final /* synthetic */ z89 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;

    public /* synthetic */ l89(z89 z89Var, int i, int i2) {
        this.a = z89Var;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.x89
    public void b(a5c a5cVar, u69 u69Var, List list) {
        z89 z89Var = this.a;
        a5cVar.V(list, z89Var.U(u69Var, a5cVar, this.b), z89Var.U(u69Var, a5cVar, this.c));
    }

    @Override // defpackage.w89
    public void h(a5c a5cVar, u69 u69Var) {
        z89 z89Var = this.a;
        int iU = z89Var.U(u69Var, a5cVar, this.b);
        int iU2 = z89Var.U(u69Var, a5cVar, this.c);
        a5cVar.m0();
        a5cVar.a.j1(iU, iU2);
    }
}
