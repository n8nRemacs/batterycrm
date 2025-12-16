package com.avito.android.favorite_sellers.adapter.recommendation;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

/* compiled from: RecommendationItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorite_sellers/adapter/recommendation/g;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_favorite-sellers-items_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f155649b;

    public g(int i12) {
        this.f155649b = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        super.getItemOffsets(rect, view, recyclerView, zVar);
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        boolean z12 = iU2 == 0;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        boolean z13 = adapter != null && iU2 == adapter.getItemCount() - 1;
        int i12 = this.f155649b;
        rect.left = z12 ? 0 : i12 / 2;
        rect.right = z13 ? 0 : i12 / 2;
    }
}
