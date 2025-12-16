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
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: MyAdvertJobListItemDecorator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/K;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class K extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f308966b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Rect f308967c = new Rect();

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final Drawable f308968d;

    /* renamed from: e, reason: collision with root package name */
    public final int f308969e;

    @Inject
    public K(@InterfaceC35538q @Y61.k Context context, @Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f308966b = aVar.Y(com.avito.android.user_advert.advert.items.job_list_item.b.class);
        this.f308968d = androidx.core.content.d.getDrawable(context, R.drawable.recycler_view_divider);
        this.f308969e = resources.getDimensionPixelOffset(R.dimen.my_advert_job_list_items_block_vertical_padding);
    }

    public final boolean c(int i12, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter;
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        return i12 >= 0 && i12 < (adapter2 != null ? adapter2.getItemCount() : 0) && (adapter = recyclerView.getAdapter()) != null && adapter.getItemViewType(i12) == this.f308966b;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        int bindingAdapterPosition = cW2.getBindingAdapterPosition();
        int itemViewType = cW2.getItemViewType();
        int i12 = this.f308969e;
        int i13 = this.f308966b;
        if (itemViewType == i13 && !c(bindingAdapterPosition - 1, recyclerView)) {
            rect.top = i12;
        }
        if (cW2.getItemViewType() != i13 || c(bindingAdapterPosition + 1, recyclerView)) {
            return;
        }
        rect.bottom = i12;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void onDraw(@Y61.k Canvas canvas, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        int childCount;
        Drawable drawable = this.f308968d;
        if (drawable == null || recyclerView.getChildCount() - 1 < 0) {
            return;
        }
        int i12 = 0;
        while (true) {
            View childAt = recyclerView.getChildAt(i12);
            RecyclerView.C cW2 = recyclerView.W(childAt);
            int bindingAdapterPosition = cW2.getBindingAdapterPosition();
            int itemViewType = cW2.getItemViewType();
            int i13 = this.f308966b;
            Rect rect = this.f308967c;
            if (itemViewType == i13 && !c(bindingAdapterPosition - 1, recyclerView)) {
                RecyclerView.Y(childAt, rect);
                drawable.setBounds(0, rect.top, rect.width(), drawable.getIntrinsicHeight() + rect.top);
                drawable.draw(canvas);
            }
            if (cW2.getItemViewType() == i13 && !c(bindingAdapterPosition + 1, recyclerView)) {
                RecyclerView.Y(childAt, rect);
                drawable.setBounds(0, rect.bottom - drawable.getIntrinsicHeight(), rect.width(), rect.bottom);
                drawable.draw(canvas);
            }
            if (i12 == childCount) {
                return;
            } else {
                i12++;
            }
        }
    }
}
