package com.avito.android.service_booking.mvi.step;

import android.content.res.Resources;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingItemDecorator.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking/mvi/step/a;", "Landroidx/recyclerview/widget/RecyclerView$l;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.service_booking.mvi.step.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34907a extends RecyclerView.l {

    /* renamed from: b, reason: collision with root package name */
    public final int f274517b;

    /* renamed from: c, reason: collision with root package name */
    public final int f274518c;

    @Inject
    public C34907a(@Y61.k Resources resources) {
        this.f274517b = resources.getDimensionPixelOffset(R.dimen.sb_items_list_top_margin);
        this.f274518c = resources.getDimensionPixelOffset(R.dimen.sb_items_list_bottom_margin);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.l
    public final void getItemOffsets(@Y61.k Rect rect, @Y61.k View view, @Y61.k RecyclerView recyclerView, @Y61.k RecyclerView.z zVar) {
        RecyclerView.m layoutManager = recyclerView.getLayoutManager();
        int i12 = this.f274517b;
        if (layoutManager == null) {
            rect.set(0, i12, 0, 0);
            return;
        }
        int iT02 = RecyclerView.m.t0(view);
        boolean z12 = iT02 == layoutManager.o0() - 1;
        boolean z13 = iT02 == 0;
        int i13 = z12 ? this.f274518c : 0;
        if (!z13) {
            i12 = 0;
        }
        rect.set(0, i12, 0, i13);
    }
}
