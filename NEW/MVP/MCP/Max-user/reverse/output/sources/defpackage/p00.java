package defpackage;

import java.util.Objects;

/* loaded from: classes2.dex */
public final class p00 {
    public final yi5 a;
    public final qx5 b;
    public final kr8 c;

    public p00(qx5 qx5Var, m0g m0gVar, yi5 yi5Var) {
        this.a = yi5Var;
        this.b = qx5Var;
        kr8 kr8Var = new kr8(200, 0);
        this.c = kr8Var;
        m0gVar.getClass();
        n0g n0gVar = (n0g) m0gVar;
        g4b g4bVar = (g4b) n0gVar.a.getValue();
        g4bVar.i(g4bVar.b().a("preview-disk-cache", false), "preview-disk-cache");
        j3f j3fVar = u0e.a;
        zl3 zl3Var = new zl3();
        xr8 xr8Var = new xr8(new sr8(new n00(this)), new n00(this), 1);
        j0e j0eVarA = n0gVar.a();
        Objects.requireNonNull(j0eVarA, "scheduler is null");
        j0e j0eVarB = n0gVar.b();
        Objects.requireNonNull(j0eVarB, "scheduler is null");
        pr8 pr8Var = new pr8(new xtd(5, kr8Var), new n00(this), pdf.d);
        try {
            as8 as8Var = new as8(pr8Var, j0eVarB, 0);
            try {
                qu1 qu1Var = new qu1(as8Var);
                as8Var.c(qu1Var);
                n42 n42Var = (n42) qu1Var.b;
                py4 py4VarB = j0eVarA.b(new zn6(qu1Var, 13, xr8Var));
                n42Var.getClass();
                ty4.d(n42Var, py4VarB);
                zl3Var.a(pr8Var);
            } catch (NullPointerException e) {
                throw e;
            } catch (Throwable th) {
                raj.c(th);
                NullPointerException nullPointerException = new NullPointerException("subscribeActual failed");
                nullPointerException.initCause(th);
                throw nullPointerException;
            }
        } catch (NullPointerException e2) {
            throw e2;
        } catch (Throwable th2) {
            raj.c(th2);
            NullPointerException nullPointerException2 = new NullPointerException("subscribeActual failed");
            nullPointerException2.initCause(th2);
            throw nullPointerException2;
        }
    }
}
