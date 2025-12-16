package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class nid extends z4 {
    public final oid d;
    public final WeakHashMap e = new WeakHashMap();

    public nid(oid oidVar) {
        this.d = oidVar;
    }

    @Override // defpackage.z4
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        z4 z4Var = (z4) this.e.get(view);
        return z4Var != null ? z4Var.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.z4
    public final y6i b(View view) {
        z4 z4Var = (z4) this.e.get(view);
        return z4Var != null ? z4Var.b(view) : super.b(view);
    }

    @Override // defpackage.z4
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        z4 z4Var = (z4) this.e.get(view);
        if (z4Var != null) {
            z4Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.z4
    public final void d(View view, m5 m5Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = m5Var.a;
        oid oidVar = this.d;
        RecyclerView recyclerView = oidVar.d;
        RecyclerView recyclerView2 = oidVar.d;
        boolean zX = recyclerView.X();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (zX || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().e0(view, m5Var);
        z4 z4Var = (z4) this.e.get(view);
        if (z4Var != null) {
            z4Var.d(view, m5Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.z4
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        z4 z4Var = (z4) this.e.get(view);
        if (z4Var != null) {
            z4Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.z4
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        z4 z4Var = (z4) this.e.get(viewGroup);
        return z4Var != null ? z4Var.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.z4
    public final boolean g(View view, int i, Bundle bundle) {
        oid oidVar = this.d;
        RecyclerView recyclerView = oidVar.d;
        RecyclerView recyclerView2 = oidVar.d;
        if (recyclerView.X() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        z4 z4Var = (z4) this.e.get(view);
        if (z4Var != null) {
            if (z4Var.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        did didVar = recyclerView2.getLayoutManager().b.c;
        return false;
    }

    @Override // defpackage.z4
    public final void h(View view, int i) {
        z4 z4Var = (z4) this.e.get(view);
        if (z4Var != null) {
            z4Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.z4
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        z4 z4Var = (z4) this.e.get(view);
        if (z4Var != null) {
            z4Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
