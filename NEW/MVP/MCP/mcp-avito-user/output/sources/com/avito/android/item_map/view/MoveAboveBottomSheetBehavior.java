package com.avito.android.item_map.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.avito.android.lib.design.bottom_sheet.BoundedFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;

/* compiled from: MoveAboveBottomSheetBehavior.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0003\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0003\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/item_map/view/MoveAboveBottomSheetBehavior;", "Landroidx/coordinatorlayout/widget/CoordinatorLayout$c;", "Landroid/view/View;", "<init>", "()V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class MoveAboveBottomSheetBehavior extends CoordinatorLayout.c<View> {
    public MoveAboveBottomSheetBehavior() {
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(@Y61.k View view, @Y61.k View view2) {
        return view2 instanceof BoundedFrameLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean f(@Y61.k CoordinatorLayout coordinatorLayout, @Y61.k View view, @Y61.k View view2) {
        int iE2;
        CoordinatorLayout.c cVar = ((CoordinatorLayout.g) view2.getLayoutParams()).f44447a;
        BottomSheetBehavior bottomSheetBehavior = cVar instanceof BottomSheetBehavior ? (BottomSheetBehavior) cVar : null;
        if (bottomSheetBehavior == null || (iE2 = bottomSheetBehavior.E()) < 0 || view2.getTop() < iE2) {
            return false;
        }
        view.setTranslationY(view2.getTop() - coordinatorLayout.getHeight());
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final void g(@Y61.k CoordinatorLayout coordinatorLayout, @Y61.k View view, @Y61.k View view2) {
        view.setTranslationY(0.0f);
    }

    public MoveAboveBottomSheetBehavior(@Y61.k Context context, @Y61.k AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
