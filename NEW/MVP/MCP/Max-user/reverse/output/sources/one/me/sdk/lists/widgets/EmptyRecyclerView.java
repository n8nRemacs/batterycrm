package one.me.sdk.lists.widgets;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.ctd;
import defpackage.fni;
import defpackage.i3;
import defpackage.kd5;
import defpackage.ld5;
import defpackage.phd;
import defpackage.rhd;
import defpackage.vid;
import defpackage.wqi;
import defpackage.xf5;
import defpackage.yy7;
import defpackage.z8a;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011R/\u0010\u0018\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0011¨\u0006\u0019"}, d2 = {"Lone/me/sdk/lists/widgets/EmptyRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Lphd;", "adapter", "Lqqg;", "setAdapter", "(Lphd;)V", "Landroid/view/View;", "emptyView", "setEmptyView", "(Landroid/view/View;)V", "<set-?>", "U1", "Ldbd;", "getMEmptyView", "()Landroid/view/View;", "setMEmptyView", "mEmptyView", "lists_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public class EmptyRecyclerView extends RecyclerView {
    public static final /* synthetic */ yy7[] X1;
    public final i3 U1;
    public kd5 V1;
    public final LinkedHashSet W1;

    static {
        z8a z8aVar = new z8a(EmptyRecyclerView.class, "mEmptyView", "getMEmptyView()Landroid/view/View;");
        vid.a.getClass();
        X1 = new yy7[]{z8aVar};
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.U1 = new ld5(this, 0);
        this.W1 = new LinkedHashSet();
    }

    public static void I0(phd phdVar, rhd rhdVar) {
        if (rhdVar == null) {
            return;
        }
        try {
            phdVar.z(rhdVar);
        } catch (Exception e) {
            wqi.p(phdVar.getClass().getName(), "fail to unregister data observer", e);
        }
    }

    public static void J0(phd phdVar, rhd rhdVar) {
        if (rhdVar == null) {
            return;
        }
        try {
            phdVar.B(rhdVar);
        } catch (Exception e) {
            wqi.p(phdVar.getClass().getName(), "fail to unregister data observer", e);
        }
    }

    private final View getMEmptyView() {
        yy7 yy7Var = X1[0];
        return (View) this.U1.b;
    }

    private final void setMEmptyView(View view) {
        this.U1.O(this, X1[0], view);
    }

    public final void F0() {
        if (getMEmptyView() == null || getAdapter() == null) {
            return;
        }
        phd adapter = getAdapter();
        boolean z = adapter != null && adapter.j() == 0;
        View mEmptyView = getMEmptyView();
        if (mEmptyView != null) {
            mEmptyView.setVisibility(z ? 0 : 8);
        }
        setVisibility(z ? 8 : 0);
    }

    public void G0(phd phdVar) {
    }

    public void H0() {
    }

    public final void K0(phd phdVar, boolean z) {
        phd adapter = getAdapter();
        if (adapter != null) {
            J0(adapter, this.V1);
        }
        EndlessRecyclerView2 endlessRecyclerView2 = (EndlessRecyclerView2) this;
        phd adapter2 = endlessRecyclerView2.getAdapter();
        xf5 xf5Var = endlessRecyclerView2.e2;
        if (adapter2 != null) {
            J0(adapter2, xf5Var);
        }
        setLayoutFrozen(false);
        y0(phdVar, true, z);
        k0(true);
        requestLayout();
        if (phdVar != null) {
            I0(phdVar, this.V1);
        }
        if (phdVar != null) {
            I0(phdVar, xf5Var);
        }
    }

    public phd L0(phd phdVar) {
        return phdVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView
    public final void setAdapter(phd adapter) {
        kd5 kd5Var;
        phd adapter2 = getAdapter();
        if (adapter2 != null && (kd5Var = this.V1) != null) {
            J0(adapter2, kd5Var);
            this.V1 = null;
        }
        phd phdVarL0 = L0(adapter);
        H0();
        super.setAdapter(phdVarL0);
        if (phdVarL0 != null && getMEmptyView() != null) {
            kd5 kd5Var2 = new kd5(0, this);
            this.V1 = kd5Var2;
            I0(phdVarL0, kd5Var2);
        }
        G0(phdVarL0);
        F0();
    }

    public final void setEmptyView(View emptyView) {
        if (fni.a(emptyView, getMEmptyView())) {
            return;
        }
        View mEmptyView = getMEmptyView();
        if (mEmptyView != null) {
            mEmptyView.setVisibility(8);
        }
        setMEmptyView(emptyView);
        F0();
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
        Iterator it = this.W1.iterator();
        if (it.hasNext()) {
            throw ctd.h(it);
        }
    }

    public EmptyRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.U1 = new ld5(this, 1);
        this.W1 = new LinkedHashSet();
    }
}
