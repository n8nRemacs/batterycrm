package com.avito.android.advert.item.amenities.screen.items;

import Y61.k;
import android.graphics.Rect;
import android.view.View;
import androidx.compose.runtime.internal.P;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.util.y6;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AmenitiesItemDecoration.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/amenities/screen/items/c;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class c extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f72780b;

    /* renamed from: c, reason: collision with root package name */
    public final int f72781c;

    /* renamed from: d, reason: collision with root package name */
    public final int f72782d = y6.b(16);

    /* renamed from: e, reason: collision with root package name */
    public final int f72783e = y6.b(12);

    /* renamed from: f, reason: collision with root package name */
    public final int f72784f = y6.b(6);

    /* renamed from: g, reason: collision with root package name */
    public final int f72785g = y6.b(28);

    @Inject
    public c(@k com.avito.konveyor.a aVar) {
        this.f72780b = aVar.Y(com.avito.android.advert.item.amenities.screen.items.header.a.class);
        this.f72781c = aVar.Y(com.avito.android.advert.item.amenities.screen.items.amenity_row.a.class);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@k Rect rect, @k View view, @k RecyclerView recyclerView, @k RecyclerView.z zVar) {
        recyclerView.getClass();
        int iU2 = RecyclerView.U(view);
        Integer numValueOf = Integer.valueOf(iU2);
        int itemViewType = -1;
        if (iU2 == -1) {
            numValueOf = null;
        }
        if (numValueOf != null) {
            int iIntValue = numValueOf.intValue();
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            int itemViewType2 = (adapter != null && iIntValue >= 0 && iIntValue < adapter.getItemCount()) ? adapter.getItemViewType(iIntValue) : -1;
            int i12 = iIntValue + 1;
            RecyclerView.Adapter adapter2 = recyclerView.getAdapter();
            if (adapter2 != null && i12 >= 0 && i12 < adapter2.getItemCount()) {
                itemViewType = adapter2.getItemViewType(i12);
            }
            int i13 = this.f72781c;
            int i14 = this.f72780b;
            int i15 = (itemViewType2 == i14 && itemViewType == i13) ? this.f72783e : (itemViewType2 == i13 && itemViewType == i13) ? this.f72784f : (itemViewType2 == i13 && itemViewType == i14) ? this.f72785g : 0;
            int i16 = this.f72782d;
            rect.set(i16, 0, i16, i15);
        }
    }
}
