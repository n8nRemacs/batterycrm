package com.avito.android.user_advert.advert.items;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertReviewsScoreItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/T;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class T extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f308986b;

    /* renamed from: c, reason: collision with root package name */
    public final int f308987c;

    /* renamed from: d, reason: collision with root package name */
    public final int f308988d;

    @Inject
    public T(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f308986b = resources.getDimensionPixelSize(R.dimen.my_advert_reviews_score_top_margin);
        this.f308987c = resources.getDimensionPixelSize(R.dimen.my_advert_reviews_score_bottom_margin);
        this.f308988d = aVar.Y(com.avito.android.rating_ui.badge_score.d.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        } else if (cW2.getItemViewType() == this.f308988d) {
            rect.set(0, this.f308986b, 0, this.f308987c);
        } else {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        }
    }
}
