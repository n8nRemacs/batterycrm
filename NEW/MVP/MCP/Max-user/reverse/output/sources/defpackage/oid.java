package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;

/* loaded from: classes.dex */
public final class oid extends z4 {
    public final RecyclerView d;
    public final nid e;

    public oid(RecyclerView recyclerView) {
        this.d = recyclerView;
        nid nidVar = this.e;
        if (nidVar != null) {
            this.e = nidVar;
        } else {
            this.e = new nid(this);
        }
    }

    @Override // defpackage.z4
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.X()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().b0(accessibilityEvent);
        }
    }

    @Override // defpackage.z4
    public final void d(View view, m5 m5Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, m5Var.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.X() || recyclerView.getLayoutManager() == null) {
            return;
        }
        a layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.c0(recyclerView2.c, recyclerView2.r1, m5Var);
    }

    @Override // defpackage.z4
    public final boolean g(View view, int i, Bundle bundle) {
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (recyclerView.X() || recyclerView.getLayoutManager() == null) {
            return false;
        }
        a layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        return layoutManager.r0(recyclerView2.c, recyclerView2.r1, i, bundle);
    }
}
