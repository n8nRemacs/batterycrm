package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class xbg implements mg9 {
    public vf9 a;
    public zf9 b;
    public final /* synthetic */ Toolbar c;

    public xbg(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.mg9
    public final boolean b(qnf qnfVar) {
        return false;
    }

    @Override // defpackage.mg9
    public final boolean c() {
        return false;
    }

    @Override // defpackage.mg9
    public final boolean d(zf9 zf9Var) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.v0;
        if (callback instanceof me3) {
            ((me3) callback).onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.v0);
        toolbar.removeView(toolbar.u0);
        toolbar.v0 = null;
        ArrayList arrayList = toolbar.R0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        zf9Var.M0 = false;
        zf9Var.x0.p(false);
        toolbar.x();
        return true;
    }

    @Override // defpackage.mg9
    public final void f(vf9 vf9Var, boolean z) {
    }

    @Override // defpackage.mg9
    public final boolean h(zf9 zf9Var) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.u0.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.u0);
            }
            toolbar.addView(toolbar.u0);
        }
        View actionView = zf9Var.getActionView();
        toolbar.v0 = actionView;
        this.b = zf9Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.v0);
            }
            ybg ybgVarH = Toolbar.h();
            ybgVarH.a = (toolbar.A0 & 112) | 8388611;
            ybgVarH.b = 2;
            toolbar.v0.setLayoutParams(ybgVarH);
            toolbar.addView(toolbar.v0);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((ybg) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.R0.add(childAt);
            }
        }
        toolbar.requestLayout();
        zf9Var.M0 = true;
        zf9Var.x0.p(false);
        KeyEvent.Callback callback = toolbar.v0;
        if (callback instanceof me3) {
            ((me3) callback).onActionViewExpanded();
        }
        toolbar.x();
        return true;
    }

    @Override // defpackage.mg9
    public final void i() {
        if (this.b != null) {
            vf9 vf9Var = this.a;
            if (vf9Var != null) {
                int size = vf9Var.X.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            d(this.b);
        }
    }

    @Override // defpackage.mg9
    public final void k(Context context, vf9 vf9Var) {
        zf9 zf9Var;
        vf9 vf9Var2 = this.a;
        if (vf9Var2 != null && (zf9Var = this.b) != null) {
            vf9Var2.d(zf9Var);
        }
        this.a = vf9Var;
    }
}
