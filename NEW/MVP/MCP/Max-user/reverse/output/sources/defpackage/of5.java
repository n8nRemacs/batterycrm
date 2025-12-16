package defpackage;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class of5 extends phd {
    public final phd d;
    public final /* synthetic */ yf5 o;

    public of5(yf5 yf5Var, phd phdVar) {
        this.o = yf5Var;
        this.d = phdVar;
        A(phdVar.b);
    }

    @Override // defpackage.phd
    public final void B(rhd rhdVar) {
        super.B(rhdVar);
        this.d.B(rhdVar);
    }

    @Override // defpackage.phd
    public final int j() {
        yf5 yf5Var = this.o;
        int i = 0;
        int i2 = (!yf5Var.c2 || yf5Var.f2 == null) ? 0 : 1;
        if (yf5Var.d2 && yf5Var.f2 != null) {
            i = 1;
        }
        return this.d.j() + i + i2;
    }

    @Override // defpackage.phd
    public final long k(int i) {
        yf5 yf5Var = this.o;
        if (yf5Var.d2 && i == 0) {
            return -100L;
        }
        if (yf5Var.c2 && i == j() - 1) {
            return -200L;
        }
        phd phdVar = this.d;
        if (phdVar.j() > 0) {
            return phdVar.k(i - (yf5Var.d2 ? 1 : 0));
        }
        return -1L;
    }

    @Override // defpackage.phd
    public final int l(int i) {
        yf5 yf5Var = this.o;
        if (yf5Var.d2 && i == 0) {
            return -1;
        }
        if (yf5Var.c2 && i == j() - 1) {
            return -1;
        }
        phd phdVar = this.d;
        if (phdVar.j() > 0) {
            return phdVar.l(i - (yf5Var.d2 ? 1 : 0));
        }
        return -1;
    }

    @Override // defpackage.phd
    public final void q(RecyclerView recyclerView) {
        this.d.q(recyclerView);
    }

    @Override // defpackage.phd
    public final void r(mid midVar, int i) {
        s(midVar, i, new ArrayList());
    }

    @Override // defpackage.phd
    public final void s(mid midVar, int i, List list) {
        if (midVar instanceof nf5) {
            return;
        }
        phd phdVar = this.d;
        if (phdVar.j() > 0) {
            phdVar.s(midVar, i - (this.o.d2 ? 1 : 0), list);
        }
    }

    @Override // defpackage.phd
    public final mid t(ViewGroup viewGroup, int i) {
        if (i != -1) {
            return this.d.t(viewGroup, i);
        }
        yf5 yf5Var = this.o;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(yf5Var.getContext());
        Integer num = yf5Var.f2;
        if (num != null) {
            return new nf5(layoutInflaterFrom.inflate(num.intValue(), viewGroup, false));
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // defpackage.phd
    public final void u(RecyclerView recyclerView) {
        this.d.u(recyclerView);
    }

    @Override // defpackage.phd
    public final boolean v(mid midVar) {
        return (midVar instanceof nf5) || this.d.v(midVar);
    }

    @Override // defpackage.phd
    public final void w(mid midVar) {
        if (midVar instanceof nf5) {
            return;
        }
        this.d.w(midVar);
    }

    @Override // defpackage.phd
    public final void x(mid midVar) {
        if (midVar instanceof nf5) {
            return;
        }
        this.d.x(midVar);
    }

    @Override // defpackage.phd
    public final void y(mid midVar) {
        if (midVar instanceof nf5) {
            return;
        }
        this.d.y(midVar);
    }

    @Override // defpackage.phd
    public final void z(rhd rhdVar) {
        super.z(rhdVar);
        this.d.z(rhdVar);
    }
}
