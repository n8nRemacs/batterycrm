package com.avito.android.user_advert.advert.items;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsShortTermRentItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/x;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.items.x, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35422x extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f310410b;

    /* renamed from: c, reason: collision with root package name */
    public final int f310411c;

    @Inject
    public C35422x(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f310410b = aVar.Y(com.avito.android.user_advert.advert.items.short_term_rent.parameter.a.class);
        this.f310411c = resources.getDimensionPixelSize(R.dimen.my_advert_short_term_rent_param_block_margin);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.Adapter adapter;
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int bindingAdapterPosition = cW2.getBindingAdapterPosition();
        if (bindingAdapterPosition > -1) {
            int itemViewType = cW2.getItemViewType();
            int i12 = this.f310410b;
            if (itemViewType == i12) {
                int i13 = bindingAdapterPosition + 1;
                RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                rect.set(0, 0, 0, (i13 < 0 || i13 >= (adapter2 != null ? adapter2.getItemCount() : 0) || (adapter = recyclerView.getAdapter()) == null || adapter.getItemViewType(i13) != i12) ? this.f310411c : 0);
                return;
            }
        }
        super.getItemOffsets(rect, view, recyclerView, zVar);
    }
}
