package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes.dex */
public final class nh1 extends y0f {
    public final Executor X;
    public final h08 o;

    /* JADX WARN: Illegal instructions before constructor call */
    public nh1(h08 h08Var) {
        ExecutorService executorServiceA = y4e.a.g().a();
        super(executorServiceA);
        this.o = h08Var;
        this.X = executorServiceA;
    }

    @Override // defpackage.y0f, defpackage.phd
    public final int l(int i) {
        return ((t98) this.d.f.get(i)).getK0();
    }

    @Override // defpackage.phd
    public final void s(mid midVar, int i, List list) {
        d2f d2fVar = (d2f) midVar;
        boolean zIsEmpty = list.isEmpty();
        iv ivVar = this.d;
        if (zIsEmpty) {
            d2fVar.z((t98) ivVar.f.get(i));
            return;
        }
        if (((t98) ivVar.f.get(i)).getK0() != 1) {
            d2fVar.z((t98) ivVar.f.get(i));
            return;
        }
        mh1 mh1Var = (mh1) d2fVar;
        View view = mh1Var.a;
        nz5 nz5Var = new nz5(lee.g(new b26((zde) new at(2, list), (em6) new gf1(2), (em6) nee.a), zx0.x0));
        while (nz5Var.hasNext()) {
            gh1 gh1Var = (gh1) nz5Var.next();
            if (gh1Var instanceof fh1) {
                ((v0b) view).setTitle(((fh1) gh1Var).a);
            } else if (gh1Var instanceof ch1) {
                v0b v0bVar = (v0b) view;
                v0bVar.setSubtitle(v0bVar.getContext().getString(((ch1) gh1Var).a.intValue()));
            } else if (gh1Var instanceof bh1) {
                bh1 bh1Var = (bh1) gh1Var;
                ((v0b) view).g(bh1Var.a.a, bh1Var.b, bh1Var.c);
            } else if (gh1Var instanceof dh1) {
                dh1 dh1Var = (dh1) gh1Var;
                mh1Var.F(dh1Var.a, dh1Var.b, dh1Var.c);
            } else {
                if (!(gh1Var instanceof eh1)) {
                    throw new NoWhenBranchMatchedException();
                }
                eh1 eh1Var = (eh1) gh1Var;
                boolean z = eh1Var.a;
                zi1 zi1Var = eh1Var.b;
                if (z) {
                    view.setOnClickListener(null);
                } else {
                    f8j.d(view, 300L, new ub(mh1Var, 7, zi1Var));
                }
            }
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new mh1(viewGroup.getContext(), this.o);
        }
        throw new IllegalArgumentException(wy1.e(i, "Not supported viewType=", " for CallOpponentsListAdapter"));
    }
}
