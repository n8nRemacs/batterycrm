package com.avito.android.lib.util.layout;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.Metadata;

/* compiled from: InverseLinearLayout.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u001d\b\u0016\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/lib/util/layout/InverseLinearLayout;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class InverseLinearLayout extends ViewGroup {
    public InverseLinearLayout(@l Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // android.view.ViewGroup
    @k
    public final ViewGroup.LayoutParams generateLayoutParams(@l AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        int i16;
        int i17;
        int i18 = i15 - i13;
        int childCount = getChildCount();
        int i19 = 0;
        for (int i22 = 0; i22 < childCount; i22++) {
            View childAt = getChildAt(i22);
            if (childAt.getVisibility() != 8) {
                int size = View.MeasureSpec.getSize(childAt.getMeasuredWidth());
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i17 = marginLayoutParams.leftMargin;
                    i16 = marginLayoutParams.rightMargin;
                } else {
                    i16 = 0;
                    i17 = 0;
                }
                int i23 = i19 + i17;
                int i24 = size + i23;
                childAt.layout(i23, 0, i24, i18);
                i19 = i24 + i16;
            }
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        int i14;
        int size = View.MeasureSpec.getSize(i12);
        int iMax = 0;
        int iMin = 0;
        for (int childCount = getChildCount() - 1; -1 < childCount; childCount--) {
            View childAt = getChildAt(childCount);
            if (childAt.getVisibility() != 8) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                    ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                    i14 = marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                } else {
                    i14 = 0;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max((size - i14) - iMin, 0), BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(0, 0));
                iMin = Math.min(View.MeasureSpec.getSize(childAt.getMeasuredWidth()) + iMin + i14, size);
            }
            if (childAt.getVisibility() != 8) {
                iMax = Math.max(iMax, View.MeasureSpec.getSize(childAt.getMeasuredHeight()));
            }
        }
        super.onMeasure(i12, View.MeasureSpec.makeMeasureSpec(iMax, 1073741824));
    }
}
