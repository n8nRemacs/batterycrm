package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class yfi {
    public static final Object a = new Object();

    public static final vl7 a(zy7 zy7Var, String str) {
        return new vl7(str, new wl7(zy7Var));
    }

    public static pm3 b(pm3 pm3Var, long j, long j2, long j3, boolean z, boolean z2) {
        g95 g95Var = (g95) ((h95) pm3Var.a.get(0)).a.get(0);
        oz8 oz8Var = new oz8();
        oz8Var.b(j);
        oz8Var.a(j2);
        oz8Var.e = z;
        qz8 qz8Var = new qz8(oz8Var);
        k09 k09Var = g95Var.a;
        t95 t95Var = g95Var.f;
        mz8 mz8VarA = k09Var.a();
        mz8VarA.d = qz8Var.a();
        k09 k09VarA = mz8VarA.a();
        t95 t95Var2 = z2 ? new t95(t95Var.a, zjd.o) : t95Var;
        f95 f95VarA = g95Var.a();
        f95VarA.a = k09VarA;
        hsi.b(j3 > 0);
        f95VarA.d = j3;
        f95VarA.f = t95Var2;
        g95 g95Var2 = new g95(f95VarA.a, f95VarA.b, f95VarA.c, j3, f95VarA.e, t95Var2);
        pm3 pm3VarB = pm3Var.b();
        zjd zjdVarM = wg7.m(new h95(new ao6(new g95[]{g95Var2})));
        hsi.a("The composition must contain at least one EditedMediaItemSequence.", !zjdVarM.isEmpty());
        pm3VarB.a = wg7.j(zjdVarM);
        return pm3VarB.a();
    }

    public static ora c(lrd lrdVar, String[] strArr, Callable callable) {
        Executor executor = lrdVar.b;
        if (executor == null) {
            executor = null;
        }
        j3f j3fVar = u0e.a;
        rj5 rj5Var = new rj5(executor, false);
        yr8 yr8Var = new yr8(callable);
        z9a z9aVar = new z9a(strArr, 18, lrdVar);
        int i = 2;
        return new ora(new tsa(new vk3(i, z9aVar).p(rj5Var), rj5Var, 4).l(rj5Var), new xu9(28, yr8Var), i);
    }
}
