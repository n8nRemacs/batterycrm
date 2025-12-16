package com.avito.android.extended_profile.behavior;

import Y61.k;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BottomMergedBehavior.kt */
@s0
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/extended_profile/behavior/BottomMergedBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Landroid/view/View;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class BottomMergedBehavior extends CoordinatorLayout.c<View> {
    public BottomMergedBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(@k View view, @k View view2) {
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        CoordinatorLayout.g gVar = layoutParams instanceof CoordinatorLayout.g ? (CoordinatorLayout.g) layoutParams : null;
        return (gVar != null ? gVar.f44447a : null) instanceof TopMergedFrameLayoutBehavior;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean j(@k CoordinatorLayout coordinatorLayout, @k View view, int i12) {
        coordinatorLayout.onLayoutChild(view, i12);
        int iIndexOfChild = coordinatorLayout.indexOfChild(view);
        View childAt = iIndexOfChild > 0 ? coordinatorLayout.getChildAt(iIndexOfChild - 1) : null;
        if (childAt != null) {
            view.offsetTopAndBottom(childAt.getBottom());
        }
        return true;
    }

    public BottomMergedBehavior(@k Context context, @k AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
