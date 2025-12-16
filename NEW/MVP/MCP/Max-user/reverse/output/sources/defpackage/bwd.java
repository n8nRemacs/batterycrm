package defpackage;

/* loaded from: classes2.dex */
public abstract class bwd {
    public static final awd a = new awd(0, u0e.b());

    public static qu1 a(p6 p6Var, gu3 gu3Var, j0e j0eVar) {
        int i = 0;
        qk3 qk3VarH = new kk3(i, new zvd(p6Var)).h(j0eVar);
        qu1 qu1Var = new qu1(gu3Var, i, new yl4(9));
        qk3VarH.f(qu1Var);
        return qu1Var;
    }

    public static void b(py4 py4Var) {
        if (c(py4Var)) {
            return;
        }
        py4Var.dispose();
    }

    public static boolean c(py4 py4Var) {
        return py4Var == null || py4Var.e();
    }
}
