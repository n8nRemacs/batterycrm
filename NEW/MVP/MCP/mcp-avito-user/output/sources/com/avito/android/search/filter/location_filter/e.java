package com.avito.android.search.filter.location_filter;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: LocationFiltersItemsDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/filter/location_filter/e;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class e extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f263634b;

    /* renamed from: c, reason: collision with root package name */
    public final int f263635c;

    public e(@Y61.k Resources resources) {
        this.f263634b = resources.getDimensionPixelSize(R.dimen.location_filter_select_vertical_offset);
        this.f263635c = resources.getDimensionPixelSize(R.dimen.location_filter_chips_vertical_offset);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 instanceof com.avito.android.search.filter.adapter.select.l) {
            int i12 = this.f263634b;
            rect.top = i12;
            rect.bottom = i12;
        } else if (cW2 instanceof com.avito.android.search.filter.adapter.chips.b) {
            int i13 = this.f263635c;
            rect.top = i13;
            rect.bottom = i13;
        }
    }
}
