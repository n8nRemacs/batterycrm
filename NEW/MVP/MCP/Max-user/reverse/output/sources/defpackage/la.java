package defpackage;

import android.graphics.drawable.LayerDrawable;
import android.view.View;
import android.view.ViewGroup;
import java.util.concurrent.ExecutorService;

/* loaded from: classes.dex */
public final class la extends y0f {
    public final rjh X;
    public final ka o;

    public la(ka kaVar, ExecutorService executorService, rjh rjhVar) {
        super(executorService);
        this.o = kaVar;
        this.X = rjhVar;
    }

    @Override // defpackage.y0f, defpackage.phd
    /* renamed from: H */
    public final void r(d2f d2fVar, int i) {
        iv ivVar = this.d;
        int k0 = ((t98) ivVar.f.get(i)).getK0();
        int i2 = j0b.X0;
        ka kaVar = this.o;
        if (k0 != i2) {
            if (((t98) ivVar.f.get(i)).getK0() != j0b.U0) {
                d2fVar.z((t98) C(i));
                return;
            }
            View view = ((ha) d2fVar).a;
            t98 t98Var = (t98) C(i);
            if (t98Var instanceof jxg) {
                ((roe) view).setModelItem((jxg) t98Var);
                f8j.d(view, 300L, new j6(3, kaVar));
                return;
            }
            return;
        }
        ja jaVar = (ja) d2fVar;
        t98 t98Var2 = (t98) C(i);
        rjh rjhVar = jaVar.E0;
        View view2 = jaVar.a;
        if (t98Var2 instanceof ixg) {
            jaVar.z((ixg) t98Var2);
            v0b v0bVar = (v0b) view2;
            v0bVar.f();
            v0bVar.k((LayerDrawable) rjhVar.b.getValue(), (LayerDrawable) rjhVar.c.getValue(), new ia(kaVar, 0, (ixg) t98Var2));
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i == j0b.X0) {
            return new ja(viewGroup.getContext(), this.X);
        }
        if (i != j0b.U0) {
            throw new IllegalStateException(("unknown item viewType " + i).toString());
        }
        roe roeVar = new roe(viewGroup.getContext(), 0);
        ha haVar = new ha(roeVar);
        roeVar.setThemeDepended(noe.b);
        return haVar;
    }
}
