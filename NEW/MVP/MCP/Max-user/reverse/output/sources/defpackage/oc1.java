package defpackage;

import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class oc1 extends y0f {
    public final iv6 o;

    public oc1(iv6 iv6Var, ExecutorService executorService) {
        super(executorService);
        this.o = iv6Var;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        if (!(d2fVar instanceof nc1)) {
            d2fVar.z((t98) C(i));
            return;
        }
        nc1 nc1Var = (nc1) d2fVar;
        t98 t98Var = (t98) C(i);
        if (t98Var instanceof te1) {
            nc1Var.z(t98Var);
            iv6 iv6Var = this.o;
            f8j.d((roe) nc1Var.a, 300L, new ub(iv6Var, 4, (te1) t98Var));
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        return new nc1(new roe(viewGroup.getContext(), 0));
    }
}
