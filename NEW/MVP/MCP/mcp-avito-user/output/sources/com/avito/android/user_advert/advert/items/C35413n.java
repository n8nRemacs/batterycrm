package com.avito.android.user_advert.advert.items;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsActionsBlockItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/n;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.items.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35413n extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f309745b;

    /* renamed from: c, reason: collision with root package name */
    public final int f309746c;

    /* renamed from: d, reason: collision with root package name */
    public final int f309747d;

    /* renamed from: e, reason: collision with root package name */
    public final int f309748e;

    @Inject
    public C35413n(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f309745b = resources.getDimensionPixelOffset(R.dimen.my_advert_actions_block_item_top_margin);
        this.f309746c = resources.getDimensionPixelOffset(R.dimen.my_advert_actions_block_item_bottom_margin);
        this.f309747d = aVar.Y(com.avito.android.user_advert.advert.items.activation_info.b.class);
        this.f309748e = aVar.Y(com.avito.android.user_advert.advert.items.actions_item.a.class);
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
        if (bindingAdapterPosition <= -1) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int itemViewType = cW2.getItemViewType();
        int i12 = this.f309745b;
        int i13 = this.f309747d;
        if (itemViewType == i13) {
            rect.set(0, i12, 0, 0);
            return;
        }
        if (itemViewType != this.f309748e) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int i14 = bindingAdapterPosition - 1;
        if (i14 >= 0) {
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            if (i14 < (adapter2 != null ? adapter2.getItemCount() : 0) && (adapter = recyclerView.getAdapter()) != null && adapter.getItemViewType(i14) == i13) {
                i12 = 0;
            }
        }
        rect.set(0, i12, 0, this.f309746c);
    }
}
