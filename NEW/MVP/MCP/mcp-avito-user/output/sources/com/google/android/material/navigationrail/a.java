package com.google.android.material.navigationrail;

import android.view.View;
import androidx.annotation.RestrictTo;
import com.google.android.material.R;
import j.I;
import j.InterfaceC42161q;

/* compiled from: NavigationRailItemView.java */
@RestrictTo
/* loaded from: classes6.dex */
final class a extends com.google.android.material.navigation.b {
    @Override // com.google.android.material.navigation.b
    @InterfaceC42161q
    public final int getItemDefaultMarginResId() {
        return R.dimen.mtrl_navigation_rail_icon_margin;
    }

    @Override // com.google.android.material.navigation.b
    @I
    public final int getItemLayoutResId() {
        return R.layout.mtrl_navigation_rail_item;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i12, int i13) {
        super.onMeasure(i12, i13);
        if (View.MeasureSpec.getMode(i13) == 0) {
            setMeasuredDimension(getMeasuredWidthAndState(), Math.max(getMeasuredHeight(), View.MeasureSpec.getSize(i13)));
        }
    }
}
