package com.avito.android.developments_agency_search.screen.realty_agency_search.view;

import X41.j;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.avito.android.R;
import com.google.android.material.appbar.AppBarLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AgencySearchAppBarLayoutBehavior.kt */
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B!\b\u0007\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/realty_agency_search/view/AgencySearchAppBarLayoutBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$Behavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AgencySearchAppBarLayoutBehavior extends AppBarLayout.Behavior {
    /* JADX WARN: Multi-variable type inference failed */
    @j
    public AgencySearchAppBarLayoutBehavior() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    /* renamed from: J */
    public final void n(@k CoordinatorLayout coordinatorLayout, @k AppBarLayout appBarLayout, @k View view, int i12, int i13, @k int[] iArr, int i14) {
        int id2 = view.getId();
        if (id2 == R.id.searchResultsRecyclerView) {
            if (i13 < 0) {
                super.n(coordinatorLayout, appBarLayout, view, i12, i13, iArr, i14);
                return;
            } else {
                if (i13 <= 0 || appBarLayout.getBottom() < view.getTop() - i13) {
                    return;
                }
                super.n(coordinatorLayout, appBarLayout, view, i12, i13, iArr, i14);
                return;
            }
        }
        if (id2 == R.id.developmentTooltipRecyclerView) {
            if (i13 > 0) {
                appBarLayout.g(false, true, true);
            } else {
                if (i13 >= 0 || view.getTop() - i13 <= appBarLayout.getHeight()) {
                    return;
                }
                appBarLayout.g(true, true, true);
            }
        }
    }

    @Override // com.google.android.material.appbar.i, androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final /* bridge */ /* synthetic */ boolean i(CoordinatorLayout coordinatorLayout, View view, MotionEvent motionEvent) {
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public final boolean m(View view, View view2, float f12) {
        AppBarLayout appBarLayout = (AppBarLayout) view;
        if (view2.getId() != R.id.developmentTooltipRecyclerView || f12 == 0.0f) {
            return false;
        }
        if (f12 > 0.0f) {
            appBarLayout.g(false, true, true);
        } else {
            appBarLayout.g(true, true, true);
        }
        return true;
    }

    public /* synthetic */ AgencySearchAppBarLayoutBehavior(Context context, AttributeSet attributeSet, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : context, (i12 & 2) != 0 ? null : attributeSet);
    }

    @j
    public AgencySearchAppBarLayoutBehavior(@l Context context, @l AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
