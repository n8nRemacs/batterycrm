package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import one.me.sdk.lists.widgets.EmptyRecyclerView;

/* loaded from: classes2.dex */
public class yf5 extends EmptyRecyclerView {
    public final LinkedHashSet Y1;
    public final LinkedHashSet Z1;
    public qf5 a2;
    public of5 b2;
    public boolean c2;
    public boolean d2;
    public int e2;
    public Integer f2;
    public boolean g2;

    public yf5(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.Y1 = new LinkedHashSet();
        this.Z1 = new LinkedHashSet();
        this.e2 = 1;
        super.setOnScrollListener(new rf5(0, this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setRefreshingNext$lambda$3(yf5 yf5Var) {
        of5 of5Var = yf5Var.b2;
        if (of5Var == null) {
            return;
        }
        if (!yf5Var.c2) {
            of5Var.m();
        } else {
            of5Var.a.e(of5Var.j() - 1, 1);
        }
    }

    @Override // one.me.sdk.lists.widgets.EmptyRecyclerView
    public final void G0(phd phdVar) {
        this.b2 = phdVar instanceof of5 ? (of5) phdVar : null;
        F0();
    }

    @Override // one.me.sdk.lists.widgets.EmptyRecyclerView
    public final phd L0(phd phdVar) {
        if (phdVar instanceof of5) {
            return phdVar;
        }
        if (phdVar != null) {
            return new of5(this, phdVar);
        }
        return null;
    }

    public final void N0(int i) {
        if (Z()) {
            if (i > 5) {
                return;
            }
            post(new l30(this, i, 10));
        } else {
            if (this.d2) {
                of5 of5Var = this.b2;
                if (of5Var != null) {
                    of5Var.a.e(0, 1);
                    return;
                }
                return;
            }
            of5 of5Var2 = this.b2;
            if (of5Var2 != null) {
                of5Var2.a.f(0, 1);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public phd getAdapter() {
        return this.b2;
    }

    public final boolean getIgnoreRefreshingFlagsForScrollEvent() {
        return this.g2;
    }

    public final LinearLayoutManager getLinearLayoutManager() {
        a layoutManager = super.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            return (LinearLayoutManager) layoutManager;
        }
        return null;
    }

    public final xid getRefreshingNextDelegate() {
        return null;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void h0() {
        Iterator it = this.Z1.iterator();
        if (it.hasNext()) {
            throw ctd.h(it);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void m(bid bidVar) {
        this.Y1.add(bidVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        yf5 yf5Var;
        try {
            super.onLayout(z, i, i2, i3, i4);
            yf5Var = this;
        } catch (Exception e) {
            yf5Var = this;
            wqi.e("EndlessRecyclerView", "onLayout", e);
        }
        qf5 qf5Var = yf5Var.a2;
        if (qf5Var != null) {
            qf5Var.b(this, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void s0(bid bidVar) {
        this.Y1.remove(bidVar);
    }

    public final void setIgnoreRefreshingFlagsForScrollEvent(boolean z) {
        this.g2 = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(a aVar) {
        if (!(aVar instanceof LinearLayoutManager) && !(aVar instanceof StaggeredGridLayoutManager)) {
            throw new IllegalArgumentException("layout manager must be an instance of LinearLayoutManager or StaggeredGridLayoutManager");
        }
        super.setLayoutManager(aVar);
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setOnScrollListener(bid bidVar) {
        throw new UnsupportedOperationException("use addOnScrollListener(OnScrollListener) and removeOnScrollListener(OnScrollListener) instead");
    }

    public final void setPager(sf5 sf5Var) {
        if (sf5Var == null) {
            bid bidVar = this.a2;
            if (bidVar != null) {
                s0(bidVar);
                this.a2 = null;
                return;
            }
            return;
        }
        qf5 qf5Var = new qf5(this, sf5Var);
        int i = this.e2;
        if (i <= 0) {
            throw new IllegalArgumentException(ho7.f(i, "illegal threshold: ").toString());
        }
        qf5Var.b = i;
        m(qf5Var);
        this.a2 = qf5Var;
    }

    public final void setProgressView(int i) {
        this.f2 = Integer.valueOf(i);
    }

    @SuppressLint({"NotifyDataSetChanged"})
    public final void setRefreshingNext(boolean z) {
        if (this.c2 == z) {
            return;
        }
        if (z && this.f2 == null) {
            z = false;
        }
        this.c2 = z;
        y7j.c(5, this, new qj4(22, this), null);
    }

    public final void setRefreshingNextDelegate(xid xidVar) {
    }

    public final void setRefreshingPrev(boolean z) {
        if (this.d2 == z) {
            return;
        }
        if (z && this.f2 == null) {
            this.d2 = false;
        } else {
            this.d2 = z;
        }
        N0(0);
    }

    public final void setThreshold(int i) {
        this.e2 = i;
        qf5 qf5Var = this.a2;
        if (qf5Var != null) {
            if (i <= 0) {
                throw new IllegalArgumentException(ho7.f(i, "illegal threshold: ").toString());
            }
            qf5Var.b = i;
        }
    }
}
