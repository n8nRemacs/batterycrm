package one.me.sdk.lists.widgets;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import defpackage.bid;
import defpackage.ipi;
import defpackage.ns2;
import defpackage.phd;
import defpackage.sf5;
import defpackage.tf5;
import defpackage.uf5;
import defpackage.wf5;
import defpackage.wqi;
import defpackage.xf5;
import defpackage.xid;
import kotlin.Metadata;
import ru.ok.android.externcalls.analytics.events.SdkMetricStatEvent;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0002\u00070J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010 \u001a\u00020\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010\u0011R\u001b\u0010&\u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001b\u0010+\u001a\u00020'8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010*R\u0011\u0010/\u001a\u00020,8F¢\u0006\u0006\u001a\u0004\b-\u0010.¨\u00061"}, d2 = {"Lone/me/sdk/lists/widgets/EndlessRecyclerView2;", "Lone/me/sdk/lists/widgets/EmptyRecyclerView;", "Lxid;", "delegate", "Lqqg;", "setRefreshingNextDelegate", "(Lxid;)V", "Luf5;", "setDelegate", "(Luf5;)V", "Landroidx/recyclerview/widget/a;", "layout", "setLayoutManager", "(Landroidx/recyclerview/widget/a;)V", "", SdkMetricStatEvent.VALUE_KEY, "setRefreshingNext", "(Z)V", "setRefreshingPrev", "Lsf5;", "pager", "setPager", "(Lsf5;)V", "", "threshold", "setThreshold", "(I)V", "c2", "Z", "getIgnoreRefreshingFlagsForScrollEvent", "()Z", "setIgnoreRefreshingFlagsForScrollEvent", "ignoreRefreshingFlagsForScrollEvent", "", "f2", "Lk18;", "getFrameIntervalNanos", "()J", "frameIntervalNanos", "", "g2", "getTag", "()Ljava/lang/String;", "tag", "Landroidx/recyclerview/widget/LinearLayoutManager;", "getLinearLayoutManager", "()Landroidx/recyclerview/widget/LinearLayoutManager;", "linearLayoutManager", "wf5", "lists_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EndlessRecyclerView2 extends EmptyRecyclerView {
    public static final /* synthetic */ int h2 = 0;
    public wf5 Y1;
    public int Z1;
    public boolean a2;
    public boolean b2;

    /* renamed from: c2, reason: from kotlin metadata */
    public boolean ignoreRefreshingFlagsForScrollEvent;
    public uf5 d2;
    public final xf5 e2;
    public final Object f2;
    public final Object g2;

    public EndlessRecyclerView2(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final long getFrameIntervalNanos() {
        return ((Number) this.f2.getValue()).longValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final String getTag() {
        return (String) this.g2.getValue();
    }

    @Override // one.me.sdk.lists.widgets.EmptyRecyclerView
    public final void G0(phd phdVar) {
        if (phdVar != null) {
            EmptyRecyclerView.I0(phdVar, this.e2);
        }
    }

    @Override // one.me.sdk.lists.widgets.EmptyRecyclerView
    public final void H0() {
        phd adapter = getAdapter();
        if (adapter != null) {
            EmptyRecyclerView.J0(adapter, this.e2);
        }
    }

    public final boolean M0() {
        return getChildCount() != 0 && getChildAt(0).getTop() <= getTop() && getChildAt(getChildCount() - 1).getBottom() >= getBottom();
    }

    public final boolean getIgnoreRefreshingFlagsForScrollEvent() {
        return this.ignoreRefreshingFlagsForScrollEvent;
    }

    public final LinearLayoutManager getLinearLayoutManager() {
        return (LinearLayoutManager) getLayoutManager();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        EndlessRecyclerView2 endlessRecyclerView2;
        try {
            super.onLayout(z, i, i2, i3, i4);
            endlessRecyclerView2 = this;
        } catch (Exception e) {
            endlessRecyclerView2 = this;
            wqi.e("EndlessRecyclerView2", "onLayout", e);
        }
        wf5 wf5Var = endlessRecyclerView2.Y1;
        if (wf5Var != null) {
            wf5Var.b(this, 0, 0);
        }
    }

    public final void setDelegate(uf5 delegate) {
        this.d2 = delegate;
    }

    public final void setIgnoreRefreshingFlagsForScrollEvent(boolean z) {
        this.ignoreRefreshingFlagsForScrollEvent = z;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public void setLayoutManager(a layout) {
        if (!(layout instanceof LinearLayoutManager)) {
            throw new IllegalArgumentException("layout manager must be an instance of LinearLayoutManager or StaggeredGridLayoutManager");
        }
        super.setLayoutManager(layout);
    }

    public final void setPager(sf5 pager) {
        if (pager == null) {
            bid bidVar = this.Y1;
            if (bidVar != null) {
                s0(bidVar);
                this.Y1 = null;
                return;
            }
            return;
        }
        wf5 wf5Var = new wf5(this, pager);
        int i = this.Z1;
        if (i > 0) {
            wf5Var.b = i;
        }
        m(wf5Var);
        this.Y1 = wf5Var;
    }

    public final void setRefreshingNext(boolean value) {
        if (this.a2 == value) {
            return;
        }
        if (value) {
            uf5 uf5Var = this.d2;
            if (uf5Var != null) {
                uf5Var.d();
            }
        } else {
            uf5 uf5Var2 = this.d2;
            if (uf5Var2 != null) {
                uf5Var2.g();
            }
        }
        this.a2 = value;
    }

    public final void setRefreshingNextDelegate(xid delegate) {
    }

    public final void setRefreshingPrev(boolean value) {
        if (this.b2 == value) {
            return;
        }
        this.b2 = value;
    }

    public final void setThreshold(int threshold) {
        this.Z1 = threshold;
        wf5 wf5Var = this.Y1;
        if (wf5Var == null || threshold <= 0) {
            return;
        }
        wf5Var.b = threshold;
    }

    public EndlessRecyclerView2(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.Z1 = 1;
        this.e2 = new xf5(this);
        this.f2 = ipi.b(3, new ns2(context, 5));
        this.g2 = ipi.b(3, new tf5(this, 0));
    }
}
