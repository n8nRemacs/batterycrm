package defpackage;

import java.util.List;

/* loaded from: classes2.dex */
public final class a8g extends xfh {
    public static final /* synthetic */ yy7[] o;
    public final tcf b = ucf.a(hd5.a);
    public final t9f c;
    public final List d;

    static {
        z8a z8aVar = new z8a(a8g.class, "loadJob", "getLoadJob()Lkotlinx/coroutines/Job;");
        vid.a.getClass();
        o = new yy7[]{z8aVar};
    }

    public a8g(g4b g4bVar) {
        t9f t9fVarC = c7j.c();
        this.c = t9fVarC;
        imb imbVar = new imb("single", g4bVar.d());
        jj5 jj5Var = g4bVar.l;
        yy7[] yy7VarArr = g4b.q;
        yy7 yy7Var = yy7VarArr[5];
        imb imbVar2 = new imb("trnsmt", g4bVar.e(jj5Var));
        jj5 jj5Var2 = g4bVar.k;
        yy7 yy7Var2 = yy7VarArr[4];
        imb imbVar3 = new imb("net", g4bVar.e(jj5Var2));
        jj5 jj5Var3 = g4bVar.j;
        yy7 yy7Var3 = yy7VarArr[3];
        this.d = ve3.j(imbVar, imbVar2, imbVar3, new imb("single-low", g4bVar.e(jj5Var3)));
        t9fVarC.O(this, o[0], xfh.o(this, null, new z7g(this, null), 1));
    }
}
