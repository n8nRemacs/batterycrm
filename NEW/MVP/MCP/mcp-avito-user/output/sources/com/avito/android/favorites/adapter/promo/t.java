package com.avito.android.favorites.adapter.promo;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: PromoItemOnMapDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/favorites/adapter/promo/t;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class t extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f156671b;

    /* renamed from: c, reason: collision with root package name */
    public final int f156672c;

    public t(@Y61.k Resources resources) {
        this.f156671b = resources.getDimensionPixelSize(R.dimen.serp_horizontal_padding);
        this.f156672c = resources.getDimensionPixelSize(R.dimen.serp_vertical_margin_for_widget_with_background);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        if (recyclerView.W(view) instanceof u) {
            int i12 = this.f156671b;
            rect.left = -i12;
            rect.right = -i12;
            int i13 = this.f156672c;
            rect.top = i13;
            rect.bottom = i13;
        }
    }
}
