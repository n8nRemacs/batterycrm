package defpackage;

import java.lang.ref.WeakReference;
import java.util.Set;

/* loaded from: classes.dex */
public final class nq7 extends lq7 {
    public final oq7 b;
    public final WeakReference c;

    public nq7(oq7 oq7Var, n84 n84Var) {
        super(n84Var.a);
        this.b = oq7Var;
        this.c = new WeakReference(n84Var);
    }

    @Override // defpackage.lq7
    public final void a(Set set) {
        lq7 lq7Var = (lq7) this.c.get();
        if (lq7Var == null) {
            this.b.c(this);
        } else {
            lq7Var.a(set);
        }
    }
}
