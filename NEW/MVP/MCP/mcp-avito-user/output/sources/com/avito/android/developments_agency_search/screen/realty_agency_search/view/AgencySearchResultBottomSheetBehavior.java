package com.avito.android.developments_agency_search.screen.realty_agency_search.view;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AgencySearchResultBottomSheetBehavior.kt */
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/view/AgencySearchResultBottomSheetBehavior;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AgencySearchResultBottomSheetBehavior extends BottomSheetBehavior<RecyclerView> {
    public /* synthetic */ AgencySearchResultBottomSheetBehavior(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this(context, (i12 & 2) != 0 ? null : attributeSet);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean d(View view, View view2) {
        return view2 instanceof AppBarLayout;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean f(CoordinatorLayout coordinatorLayout, View view, View view2) {
        RecyclerView recyclerView = (RecyclerView) view;
        if (D() == view2.getBottom()) {
            return false;
        }
        J(view2.getBottom());
        recyclerView.requestLayout();
        return true;
    }

    @j
    public AgencySearchResultBottomSheetBehavior(@k Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
