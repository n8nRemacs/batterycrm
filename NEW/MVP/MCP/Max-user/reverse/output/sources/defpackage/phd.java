package defpackage;

import android.os.Trace;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public abstract class phd {
    public final qhd a = new qhd();
    public boolean b = false;
    public int c = 1;

    public void A(boolean z) {
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z;
    }

    public void B(rhd rhdVar) {
        this.a.unregisterObserver(rhdVar);
    }

    public final void h(mid midVar, int i) {
        phd phdVar = midVar.C0;
        View view = midVar.a;
        boolean z = phdVar == null;
        if (z) {
            midVar.c = i;
            if (this.b) {
                midVar.o = k(i);
            }
            midVar.t0 = (midVar.t0 & (-520)) | 1;
            int i2 = beg.a;
            Trace.beginSection("RV OnBindView");
        }
        midVar.C0 = this;
        if (RecyclerView.K1) {
            if (view.getParent() == null) {
                WeakHashMap weakHashMap = hfh.a;
                if (view.isAttachedToWindow() != midVar.s()) {
                    throw new IllegalStateException("Temp-detached state out of sync with reality. holder.isTmpDetached(): " + midVar.s() + ", attached to window: " + view.isAttachedToWindow() + ", holder: " + midVar);
                }
            }
            if (view.getParent() == null) {
                WeakHashMap weakHashMap2 = hfh.a;
                if (view.isAttachedToWindow()) {
                    throw new IllegalStateException("Attempting to bind attached holder with no parent (AKA temp detached): " + midVar);
                }
            }
        }
        s(midVar, i, midVar.i());
        if (z) {
            ArrayList arrayList = midVar.u0;
            if (arrayList != null) {
                arrayList.clear();
            }
            midVar.t0 &= -1025;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof xhd) {
                ((xhd) layoutParams).c = true;
            }
            int i3 = beg.a;
            Trace.endSection();
        }
    }

    public int i(phd phdVar, mid midVar, int i) {
        if (phdVar == this) {
            return i;
        }
        return -1;
    }

    public abstract int j();

    public long k(int i) {
        return -1L;
    }

    public int l(int i) {
        return 0;
    }

    public final void m() {
        this.a.b();
    }

    public final void n(int i, int i2) {
        this.a.c(i, i2);
    }

    public final void o(int i, int i2, Object obj) {
        this.a.d(i, i2, obj);
    }

    public final void p(int i, int i2) {
        this.a.e(i, i2);
    }

    public void q(RecyclerView recyclerView) {
    }

    public abstract void r(mid midVar, int i);

    public void s(mid midVar, int i, List list) {
        r(midVar, i);
    }

    public abstract mid t(ViewGroup viewGroup, int i);

    public void u(RecyclerView recyclerView) {
    }

    public boolean v(mid midVar) {
        return false;
    }

    public void w(mid midVar) {
    }

    public void x(mid midVar) {
    }

    public void y(mid midVar) {
    }

    public void z(rhd rhdVar) {
        this.a.registerObserver(rhdVar);
    }
}
