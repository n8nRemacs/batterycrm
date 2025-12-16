package com.google.android.material.navigationrail;

import android.view.View;
import androidx.annotation.RestrictTo;
import com.google.android.material.navigation.f;
import j.U;

/* compiled from: NavigationRailMenuView.java */
@RestrictTo
/* loaded from: classes6.dex */
public class b extends f {

    /* renamed from: t, reason: collision with root package name */
    @U
    public int f356886t;

    public final int a(int i12, int i13, int i14, View view) {
        int iMakeMeasureSpec;
        int measuredHeight;
        if (view == null) {
            int iMax = i13 / Math.max(1, i14);
            int size = this.f356886t;
            if (size == -1) {
                size = View.MeasureSpec.getSize(i12);
            }
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size, iMax), 0);
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 0);
        }
        int childCount = getChildCount();
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt != view) {
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i12, iMakeMeasureSpec);
                    measuredHeight = childAt.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                i15 += measuredHeight;
            }
        }
        return i15;
    }

    @U
    public int getItemMinimumHeight() {
        return this.f356886t;
    }

    public int getMenuGravity() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int childCount = getChildCount();
        int i16 = i14 - i12;
        int i17 = 0;
        for (int i18 = 0; i18 < childCount; i18++) {
            View childAt = getChildAt(i18);
            if (childAt.getVisibility() != 8) {
                int measuredHeight = childAt.getMeasuredHeight() + i17;
                childAt.layout(0, i17, i16, measuredHeight);
                i17 = measuredHeight;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int iA2;
        int labelVisibilityMode;
        int measuredHeight;
        int size = View.MeasureSpec.getSize(i13);
        int size2 = getMenu().l().size();
        if (size2 <= 1 || ((labelVisibilityMode = getLabelVisibilityMode()) != -1 ? labelVisibilityMode != 0 : size2 <= 3)) {
            iA2 = a(i12, size, size2, null);
        } else {
            View childAt = getChildAt(getSelectedItemPosition());
            if (childAt != null) {
                int iMax = size / Math.max(1, size2);
                int size3 = this.f356886t;
                if (size3 == -1) {
                    size3 = View.MeasureSpec.getSize(i12);
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.min(size3, iMax), 0);
                if (childAt.getVisibility() != 8) {
                    childAt.measure(i12, iMakeMeasureSpec);
                    measuredHeight = childAt.getMeasuredHeight();
                } else {
                    measuredHeight = 0;
                }
                size -= measuredHeight;
                size2--;
            } else {
                measuredHeight = 0;
            }
            iA2 = a(i12, size, size2, childAt) + measuredHeight;
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i12), View.resolveSizeAndState(iA2, i13, 0));
    }

    public void setItemMinimumHeight(@U int i12) {
        if (this.f356886t != i12) {
            this.f356886t = i12;
            requestLayout();
        }
    }

    public void setMenuGravity(int i12) {
        throw null;
    }
}
