package com.google.android.material.bottomnavigation;

import android.view.View;
import com.google.android.material.navigation.NavigationBarView;
import j.P;

/* compiled from: BottomNavigationView.java */
/* loaded from: classes6.dex */
public class d extends NavigationBarView {

    /* compiled from: BottomNavigationView.java */
    @Deprecated
    public interface a extends NavigationBarView.b {
    }

    /* compiled from: BottomNavigationView.java */
    @Deprecated
    public interface b extends NavigationBarView.c {
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i13) != 1073741824 && suggestedMinimumHeight > 0) {
            i13 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i13), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i12, i13);
    }

    public void setItemHorizontalTranslationEnabled(boolean z12) {
        com.google.android.material.bottomnavigation.b bVar = (com.google.android.material.bottomnavigation.b) getMenuView();
        if (bVar.f355962t == z12) {
            return;
        }
        bVar.setItemHorizontalTranslationEnabled(z12);
        getPresenter().getClass();
        throw null;
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(@P a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(@P b bVar) {
        setOnItemSelectedListener(bVar);
    }
}
