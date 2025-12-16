package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import androidx.viewpager2.widget.ViewPager2;

/* loaded from: classes.dex */
public final class vgh extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 E;

    public vgh(ViewPager2 viewPager2) {
        this.E = viewPager2;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void M0(iid iidVar, int[] iArr) {
        ViewPager2 viewPager2 = this.E;
        int offscreenPageLimit = viewPager2.getOffscreenPageLimit();
        if (offscreenPageLimit == -1) {
            super.M0(iidVar, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * offscreenPageLimit;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    @Override // androidx.recyclerview.widget.a
    public final void c0(did didVar, iid iidVar, m5 m5Var) {
        super.c0(didVar, iidVar, m5Var);
        this.E.G0.getClass();
    }

    @Override // androidx.recyclerview.widget.a
    public final void d0(did didVar, iid iidVar, View view, m5 m5Var) {
        int iN;
        int iN2;
        ViewPager2 viewPager2 = (ViewPager2) this.E.G0.o;
        if (viewPager2.getOrientation() == 1) {
            viewPager2.t0.getClass();
            iN = a.N(view);
        } else {
            iN = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            viewPager2.t0.getClass();
            iN2 = a.N(view);
        } else {
            iN2 = 0;
        }
        m5Var.i(l5.a(false, iN, 1, iN2, 1));
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean r0(did didVar, iid iidVar, int i, Bundle bundle) {
        this.E.G0.getClass();
        return super.r0(didVar, iidVar, i, bundle);
    }

    @Override // androidx.recyclerview.widget.a
    public final boolean w0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        return false;
    }
}
