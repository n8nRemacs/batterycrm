package defpackage;

import java.io.InputStream;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class gd8 implements nac {
    public final Executor a;
    public final py0 b;

    public gd8(Executor executor, py0 py0Var) {
        this.a = executor;
        this.b = py0Var;
    }

    @Override // defpackage.nac
    public final void a(hj0 hj0Var, oac oacVar) {
        mk0 mk0Var = (mk0) oacVar;
        rac racVar = mk0Var.c;
        rf7 rf7Var = mk0Var.a;
        mk0Var.h("local", "fetch");
        fd8 fd8Var = new fd8(this, hj0Var, racVar, oacVar, e(), rf7Var, racVar, oacVar);
        mk0Var.a(new hh4(3, fd8Var));
        this.a.execute(fd8Var);
    }

    public final ce5 c(InputStream inputStream, int i) {
        qk4 qk4VarJ0;
        py0 py0Var = this.b;
        try {
            if (i <= 0) {
                py0Var.getClass();
                of9 of9Var = new of9((mf9) py0Var.b);
                try {
                    ((bj) py0Var.c).a(inputStream, of9Var);
                    nf9 nf9VarW = of9Var.w();
                    of9Var.close();
                    qk4VarJ0 = vc3.j0(nf9VarW);
                } catch (Throwable th) {
                    of9Var.close();
                    throw th;
                }
            } else {
                py0Var.getClass();
                of9 of9Var2 = new of9((mf9) py0Var.b, i);
                try {
                    ((bj) py0Var.c).a(inputStream, of9Var2);
                    nf9 nf9VarW2 = of9Var2.w();
                    of9Var2.close();
                    qk4VarJ0 = vc3.j0(nf9VarW2);
                } catch (Throwable th2) {
                    of9Var2.close();
                    throw th2;
                }
            }
            qk4 qk4Var = qk4VarJ0;
            ce5 ce5Var = new ce5(qk4Var);
            xc3.b(inputStream);
            qk4Var.close();
            return ce5Var;
        } catch (Throwable th3) {
            xc3.b(inputStream);
            vc3.P(null);
            throw th3;
        }
    }

    public abstract ce5 d(rf7 rf7Var);

    public abstract String e();
}
