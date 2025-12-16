package defpackage;

import java.util.List;
import java.util.concurrent.Executors;

/* loaded from: classes.dex */
public abstract class l98 extends phd {
    public final iv d;

    public l98(f9j f9jVar) {
        k98 k98Var = new k98(this);
        iv6 iv6Var = new iv6(2, this);
        synchronized (kj2.a) {
            try {
                if (kj2.b == null) {
                    kj2.b = Executors.newFixedThreadPool(2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        iv ivVar = new iv(iv6Var, new xt4(kj2.b, 4, f9jVar));
        this.d = ivVar;
        ivVar.d.add(k98Var);
    }

    public final Object C(int i) {
        return this.d.f.get(i);
    }

    public void D(List list, List list2) {
    }

    public final void E(List list) {
        this.d.b(list, null);
    }

    public void F(List list, Runnable runnable) {
        this.d.b(list, runnable);
    }

    @Override // defpackage.phd
    public int j() {
        return this.d.f.size();
    }

    public l98(xt4 xt4Var) {
        k98 k98Var = new k98(this);
        iv ivVar = new iv(new iv6(2, this), xt4Var);
        this.d = ivVar;
        ivVar.d.add(k98Var);
    }
}
