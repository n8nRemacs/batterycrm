package com.avito.android.advert_stats.detail.tab.items.chart;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: StatsBarDecoration.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/tab/items/chart/d;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class d extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f86298b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86299c;

    public d(@Y61.k Resources resources) throws Resources.NotFoundException {
        this.f86298b = resources.getDimensionPixelSize(R.dimen.gap_between_bars_small);
        this.f86299c = resources.getDimensionPixelSize(R.dimen.card_view_padding) + resources.getDimensionPixelSize(R.dimen.shadow_padding);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        boolean z12 = cW2 instanceof j;
        int i12 = this.f86298b;
        if (!z12 || !((j) cW2).f86318i) {
            rect.left = i12;
            rect.right = i12;
        } else {
            int i13 = this.f86299c;
            rect.left = i12 - i13;
            rect.right = i12 - i13;
        }
    }
}
