package com.avito.android.user_advert.advert.items;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import com.avito.android.user_advert.di.InterfaceC35538q;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertPriceListItemDecorator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/O;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class O extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f308973b;

    /* renamed from: c, reason: collision with root package name */
    public final int f308974c;

    /* renamed from: d, reason: collision with root package name */
    public final int f308975d;

    /* renamed from: e, reason: collision with root package name */
    public final int f308976e;

    /* renamed from: f, reason: collision with root package name */
    public final int f308977f;

    /* renamed from: g, reason: collision with root package name */
    public final int f308978g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Rect f308979h = new Rect();

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Drawable f308980i;

    @Inject
    public O(@InterfaceC35538q @Y61.k Context context, @Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f308973b = resources.getDimensionPixelOffset(R.dimen.my_advert_price_list_last_item_bottom_offset);
        this.f308974c = resources.getDimensionPixelSize(R.dimen.my_advert_price_list_header_margin_top);
        this.f308975d = resources.getDimensionPixelSize(R.dimen.my_advert_price_list_divider_margin_top);
        this.f308976e = aVar.Y(com.avito.android.advert_core.price_list.header.a.class);
        this.f308977f = aVar.Y(com.avito.android.advert_core.price_list.a.class);
        this.f308978g = aVar.Y(com.avito.android.advert_core.price_list.group_title.a.class);
        this.f308980i = androidx.core.content.d.getDrawable(context, R.drawable.recycler_view_divider);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int bindingAdapterPosition = cW2.getBindingAdapterPosition();
        int itemViewType = cW2.getItemViewType();
        if (itemViewType == this.f308976e) {
            D6.c(view, null, Integer.valueOf(this.f308974c), null, null, 13);
            return;
        }
        int i12 = this.f308977f;
        if (itemViewType != i12) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int i13 = bindingAdapterPosition + 1;
        RecyclerView.Adapter adapter = recyclerView.getAdapter();
        int itemCount = adapter != null ? adapter.getItemCount() : 0;
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        Integer numValueOf = adapter2 != null ? Integer.valueOf(adapter2.getItemViewType(i13)) : null;
        rect.set(0, 0, 0, (i13 < 0 || i13 >= itemCount || ((numValueOf == null || numValueOf.intValue() != i12) && (numValueOf == null || numValueOf.intValue() != this.f308978g))) ? this.f308973b : 0);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@Y61.k Canvas canvas, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int childCount;
        RecyclerView.Adapter adapter;
        Drawable drawable = this.f308980i;
        if (drawable == null || recyclerView.getChildCount() - 1 < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            View childAt = recyclerView.getChildAt(i12);
            RecyclerView.C cW2 = recyclerView.W(childAt);
            int itemViewType = cW2.getItemViewType();
            int i13 = this.f308976e;
            if (itemViewType == i13) {
                int bindingAdapterPosition = cW2.getBindingAdapterPosition() - 1;
                RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
                int itemCount = adapter2 != null ? adapter2.getItemCount() : 0;
                if (bindingAdapterPosition < 0 || bindingAdapterPosition >= itemCount || (adapter = recyclerView.getAdapter()) == null || adapter.getItemViewType(bindingAdapterPosition) != i13) {
                    Rect rect = this.f308979h;
                    RecyclerView.Y(childAt, rect);
                    int i14 = rect.top + this.f308975d;
                    drawable.setBounds(0, i14, rect.width(), drawable.getIntrinsicHeight() + i14);
                    drawable.draw(canvas);
                }
            }
            if (i12 == childCount) {
                return;
            } else {
                i12++;
            }
        }
    }
}
