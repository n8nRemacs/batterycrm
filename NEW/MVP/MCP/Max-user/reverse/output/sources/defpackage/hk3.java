package defpackage;

import java.util.Objects;

/* loaded from: classes.dex */
public abstract class hk3 {
    public final void a() throws InterruptedException {
        rq0 rq0Var = new rq0(1);
        f(rq0Var);
        rq0Var.d();
    }

    public final ik3 c(hk3 hk3Var) {
        Objects.requireNonNull(hk3Var, "other is null");
        return new ik3(this, 0, hk3Var);
    }

    public final uk3 d(p6 p6Var) {
        return new uk3(this, pdf.e, p6Var);
    }

    public final uk3 e(gu3 gu3Var) {
        return new uk3(this, gu3Var, pdf.d);
    }

    public final void f(rk3 rk3Var) {
        try {
            g(rk3Var);
        } catch (NullPointerException e) {
            throw e;
        } catch (Throwable th) {
            raj.c(th);
            t8j.a(th);
            NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
            nullPointerException.initCause(th);
            throw nullPointerException;
        }
    }

    public abstract void g(rk3 rk3Var);

    public final qk3 h(j0e j0eVar) {
        Objects.requireNonNull(j0eVar, "scheduler is null");
        return new qk3(this, j0eVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final vqa i() {
        return this instanceof on6 ? ((on6) this).b() : new vk3(0, this);
    }
}
