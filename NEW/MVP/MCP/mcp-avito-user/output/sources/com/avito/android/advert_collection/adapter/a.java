package com.avito.android.advert_collection.adapter;

import Y61.k;
import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertCollectionDecorator.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_collection/adapter/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-collection_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f81238b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81239c;

    /* renamed from: d, reason: collision with root package name */
    public final int f81240d;

    /* renamed from: e, reason: collision with root package name */
    public final int f81241e;

    /* renamed from: f, reason: collision with root package name */
    public final int f81242f;

    /* renamed from: g, reason: collision with root package name */
    public final int f81243g;

    /* renamed from: h, reason: collision with root package name */
    public final int f81244h;

    /* renamed from: i, reason: collision with root package name */
    public final int f81245i;

    /* renamed from: j, reason: collision with root package name */
    public final int f81246j;

    /* renamed from: k, reason: collision with root package name */
    public final int f81247k;

    /* renamed from: l, reason: collision with root package name */
    public final int f81248l;

    @Inject
    public a(@k Resources resources, @k com.avito.konveyor.a aVar) {
        this.f81238b = aVar.Y(com.avito.android.advert_collection.adapter.author.a.class);
        this.f81239c = aVar.Y(com.avito.android.advert_collection.adapter.order.a.class);
        this.f81240d = aVar.Y(com.avito.android.advert_collection.adapter.title.a.class);
        this.f81241e = aVar.Y(com.avito.android.favorites.adapter.advert.a.class);
        this.f81242f = aVar.Y(com.avito.android.favorites.adapter.advert.skeleton.a.class);
        this.f81243g = resources.getDimensionPixelSize(R.dimen.advert_collection_title_between_offset);
        this.f81244h = resources.getDimensionPixelSize(R.dimen.advert_collection_order_item_top_offset);
        this.f81245i = resources.getDimensionPixelSize(R.dimen.advert_collection_order_item_bottom_offset);
        this.f81246j = resources.getDimensionPixelSize(R.dimen.advert_collection_advert_item_horizontal_padding);
        this.f81247k = resources.getDimensionPixelSize(R.dimen.advert_collection_advert_skeleton_offset);
        this.f81248l = resources.getDimensionPixelSize(R.dimen.advert_collection_advert_item_last_offset);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        Integer numValueOf;
        RecyclerView.C cW2 = recyclerView.W(view);
        int itemViewType = cW2.getItemViewType();
        int i12 = this.f81239c;
        if (itemViewType == i12) {
            rect.set(0, this.f81244h, 0, this.f81245i);
            return;
        }
        if (itemViewType == this.f81240d) {
            int adapterPosition = cW2.getAdapterPosition();
            numValueOf = adapterPosition > 0 ? Integer.valueOf(adapterPosition) : null;
            int iIntValue = (numValueOf != null ? numValueOf.intValue() : cW2.getOldPosition()) - 1;
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            rect.set(0, (adapter != null && iIntValue >= 0 && iIntValue < adapter.getItemCount() && adapter.getItemViewType(iIntValue) == this.f81238b) ? this.f81243g : 0, 0, 0);
            return;
        }
        if (itemViewType == this.f81241e) {
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            numValueOf = adapter2 != null ? Integer.valueOf(adapter2.getItemCount()) : null;
            int i13 = (numValueOf != null && cW2.getAbsoluteAdapterPosition() == numValueOf.intValue() + (-1)) ? this.f81248l : 0;
            int i14 = this.f81246j;
            rect.set(i14, 0, i14, i13);
            return;
        }
        if (itemViewType != this.f81242f) {
            super.getItemOffsets(rect, view, recyclerView, zVar);
            return;
        }
        int adapterPosition2 = cW2.getAdapterPosition();
        numValueOf = adapterPosition2 > 0 ? Integer.valueOf(adapterPosition2) : null;
        int iIntValue2 = (numValueOf != null ? numValueOf.intValue() : cW2.getOldPosition()) - 1;
        RecyclerView.Adapter adapter3 = recyclerView.getAdapter();
        rect.set(0, (adapter3 != null && iIntValue2 >= 0 && iIntValue2 < adapter3.getItemCount() && adapter3.getItemViewType(iIntValue2) == i12) ? 0 : this.f81247k, 0, 0);
    }
}
