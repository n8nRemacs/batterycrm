package com.avito.android.user_advert.advert.items;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsBadgeBarItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/p;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.items.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35415p extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f309764b;

    /* renamed from: c, reason: collision with root package name */
    public final int f309765c;

    @Inject
    public C35415p(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f309764b = resources.getDimensionPixelSize(R.dimen.my_advert_badge_bar_block_vertical_margin);
        this.f309765c = aVar.Y(com.avito.android.advert_core.advert_badge_bar.a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        } else if (cW2.getItemViewType() != this.f309765c) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        } else {
            int i12 = this.f309764b;
            rect.set(0, i12, 0, i12);
        }
    }
}
