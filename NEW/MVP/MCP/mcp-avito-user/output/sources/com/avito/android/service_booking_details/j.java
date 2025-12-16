package com.avito.android.service_booking_details;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingItemDetailsDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/j;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f277357b;

    /* renamed from: c, reason: collision with root package name */
    public final int f277358c;

    @Inject
    public j(@Y61.k Resources resources) {
        this.f277357b = resources.getDimensionPixelOffset(R.dimen.sb_items_list_top_margin);
        this.f277358c = resources.getDimensionPixelOffset(R.dimen.sb_items_list_bottom_margin);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        int i12 = this.f277357b;
        if (layoutManager == null) {
            rect.set(0, i12, 0, 0);
            return;
        }
        int iU2 = RecyclerView.U(view);
        boolean z12 = iU2 == layoutManager.o0() - 1;
        boolean z13 = iU2 == 0;
        int i13 = z12 ? this.f277358c : 0;
        if (!z13) {
            i12 = 0;
        }
        rect.set(0, i12, 0, i13);
    }
}
