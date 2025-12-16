package com.google.android.material.navigationrail;

import android.view.View;
import com.google.android.material.navigation.NavigationBarView;
import j.P;
import j.U;

/* compiled from: NavigationRailView.java */
/* loaded from: classes6.dex */
public class d extends NavigationBarView {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f356887d = 0;

    private b getNavigationRailMenuView() {
        return (b) getMenuView();
    }

    @P
    public View getHeaderView() {
        return null;
    }

    public int getItemMinimumHeight() {
        return ((b) getMenuView()).getItemMinimumHeight();
    }

    @Override // com.google.android.material.navigation.NavigationBarView
    public int getMaxItemCount() {
        return 7;
    }

    public int getMenuGravity() {
        return getNavigationRailMenuView().getMenuGravity();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        super.onLayout(z12, i12, i13, i14, i15);
        getNavigationRailMenuView().getClass();
        throw null;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        int suggestedMinimumWidth = getSuggestedMinimumWidth();
        if (View.MeasureSpec.getMode(i12) != 1073741824 && suggestedMinimumWidth > 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i12), getPaddingRight() + getPaddingLeft() + suggestedMinimumWidth), 1073741824);
        }
        super.onMeasure(i12, i13);
    }

    public void setItemMinimumHeight(@U int i12) {
        ((b) getMenuView()).setItemMinimumHeight(i12);
    }

    public void setMenuGravity(int i12) {
        getNavigationRailMenuView().setMenuGravity(i12);
    }
}
