package defpackage;

import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class ld7 extends gd7 {
    public final Executor D0;
    public final Object E0 = new Object();
    public jf7 F0;
    public kd7 G0;

    public ld7(Executor executor) {
        this.D0 = executor;
    }

    @Override // defpackage.gd7
    public final jf7 a(lf7 lf7Var) {
        return lf7Var.e();
    }

    @Override // defpackage.gd7
    public final void c() {
        synchronized (this.E0) {
            try {
                jf7 jf7Var = this.F0;
                if (jf7Var != null) {
                    jf7Var.close();
                    this.F0 = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.gd7
    public final void f(jf7 jf7Var) {
        synchronized (this.E0) {
            try {
                if (!this.C0) {
                    jf7Var.close();
                    return;
                }
                if (this.G0 == null) {
                    kd7 kd7Var = new kd7(jf7Var, this);
                    this.G0 = kd7Var;
                    wsf.b(b(kd7Var), new mc5(17, kd7Var), ayi.a());
                } else {
                    if (jf7Var.getImageInfo().getTimestamp() <= this.G0.b.getImageInfo().getTimestamp()) {
                        jf7Var.close();
                    } else {
                        jf7 jf7Var2 = this.F0;
                        if (jf7Var2 != null) {
                            jf7Var2.close();
                        }
                        this.F0 = jf7Var;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
