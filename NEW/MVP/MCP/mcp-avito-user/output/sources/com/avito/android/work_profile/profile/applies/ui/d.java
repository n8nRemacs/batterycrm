package com.avito.android.work_profile.profile.applies.ui;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy.j;
import kotlin.Metadata;

/* compiled from: AppliesToVacancyItemDecorator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "<init>", "()V", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class d extends RecyclerView.l {
    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        RecyclerView.Adapter adapter;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (!(cW2 instanceof j) || (adapter = recyclerView.getAdapter()) == null) {
            return;
        }
        int iU2 = RecyclerView.U(view) + 1;
        Integer numValueOf = iU2 < adapter.getItemCount() ? Integer.valueOf(adapter.getItemViewType(iU2)) : null;
        int iB2 = (numValueOf != null && numValueOf.intValue() == cW2.getItemViewType()) ? y6.b(0) : y6.b(24);
        rect.left = y6.b(16);
        rect.right = y6.b(16);
        rect.top = y6.b(24);
        rect.bottom = iB2;
    }
}
