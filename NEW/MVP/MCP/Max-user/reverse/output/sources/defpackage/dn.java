package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;

/* loaded from: classes.dex */
public final class dn extends z4 {
    public final /* synthetic */ in d;
    public final /* synthetic */ CoordinatorLayout e;
    public final /* synthetic */ AppBarLayout$BaseBehavior f;

    public dn(AppBarLayout$BaseBehavior appBarLayout$BaseBehavior, in inVar, CoordinatorLayout coordinatorLayout) {
        this.f = appBarLayout$BaseBehavior;
        this.d = inVar;
        this.e = coordinatorLayout;
    }

    @Override // defpackage.z4
    public final void d(View view, m5 m5Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, m5Var.a);
        m5Var.h(ScrollView.class.getName());
        in inVar = this.d;
        if (inVar.getTotalScrollRange() == 0) {
            return;
        }
        CoordinatorLayout coordinatorLayout = this.e;
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.f;
        View viewA = AppBarLayout$BaseBehavior.A(appBarLayout$BaseBehavior, coordinatorLayout);
        if (viewA == null) {
            return;
        }
        int childCount = inVar.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (((gn) inVar.getChildAt(i).getLayoutParams()).a != 0) {
                if (appBarLayout$BaseBehavior.D() != (-inVar.getTotalScrollRange())) {
                    m5Var.b(g5.f);
                    m5Var.j(true);
                }
                if (appBarLayout$BaseBehavior.D() != 0) {
                    if (!viewA.canScrollVertically(-1)) {
                        m5Var.b(g5.g);
                        m5Var.j(true);
                        return;
                    } else {
                        if ((-inVar.getDownNestedPreScrollRange()) != 0) {
                            m5Var.b(g5.g);
                            m5Var.j(true);
                            return;
                        }
                        return;
                    }
                }
                return;
            }
        }
    }

    @Override // defpackage.z4
    public final boolean g(View view, int i, Bundle bundle) {
        in inVar = this.d;
        if (i == 4096) {
            inVar.setExpanded(false);
            return true;
        }
        if (i != 8192) {
            return super.g(view, i, bundle);
        }
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = this.f;
        if (appBarLayout$BaseBehavior.D() != 0) {
            CoordinatorLayout coordinatorLayout = this.e;
            View viewA = AppBarLayout$BaseBehavior.A(appBarLayout$BaseBehavior, coordinatorLayout);
            if (!viewA.canScrollVertically(-1)) {
                inVar.setExpanded(true);
                return true;
            }
            int i2 = -inVar.getDownNestedPreScrollRange();
            if (i2 != 0) {
                appBarLayout$BaseBehavior.o(coordinatorLayout, this.d, viewA, 0, i2, new int[]{0, 0}, 1);
                return true;
            }
        }
        return false;
    }
}
