package com.avito.android.user_advert.advert.items;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsRejectReasonItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_advert/advert/items/v;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.user_advert.advert.items.v, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C35420v extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f310342b;

    /* renamed from: c, reason: collision with root package name */
    public final int f310343c;

    /* renamed from: d, reason: collision with root package name */
    public final int f310344d;

    /* renamed from: e, reason: collision with root package name */
    public final int f310345e;

    /* renamed from: f, reason: collision with root package name */
    public final int f310346f;

    @Inject
    public C35420v(@Y61.k Resources resources, @Y61.k com.avito.konveyor.a aVar) {
        this.f310342b = resources.getDimensionPixelSize(R.dimen.my_advert_reject_reason_item_first_item_margin);
        this.f310343c = resources.getDimensionPixelSize(R.dimen.my_advert_reject_reason_item_between_item_margin);
        this.f310344d = resources.getDimensionPixelOffset(R.dimen.my_advert_reject_reason_item_last_item_margin);
        this.f310345e = aVar.Y(com.avito.android.user_advert.advert.items.reject.f.class);
        this.f310346f = aVar.Y(com.avito.android.user_advert.advert.items.reject.b.class);
    }

    public final boolean c(int i12, RecyclerView recyclerView) {
        RecyclerView.Adapter adapter;
        RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
        int itemCount = adapter2 != null ? adapter2.getItemCount() : 0;
        if (i12 < 0 || i12 >= itemCount) {
            return false;
        }
        RecyclerView.Adapter adapter3 = recyclerView.getAdapter();
        return (adapter3 != null && adapter3.getItemViewType(i12) == this.f310345e) || ((adapter = recyclerView.getAdapter()) != null && adapter.getItemViewType(i12) == this.f310346f);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.C cW2 = recyclerView.W(view);
        if (cW2 == null) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int bindingAdapterPosition = cW2.getBindingAdapterPosition();
        if (bindingAdapterPosition <= -1 || !(cW2.getItemViewType() == this.f310345e || cW2.getItemViewType() == this.f310346f)) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
        } else {
            rect.set(0, c(bindingAdapterPosition + (-1), recyclerView) ? this.f310343c : this.f310342b, 0, c(bindingAdapterPosition + 1, recyclerView) ? 0 : this.f310344d);
        }
    }
}
