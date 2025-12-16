package com.avito.android.hotel_booking.konveyor.spacing;

import Y61.k;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: BookingFormSpacingView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/konveyor/spacing/g;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/hotel_booking/konveyor/spacing/f;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class g extends com.avito.konveyor.adapter.b implements f {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f163782b;

    public g(@k View view) {
        super(view);
        View viewFindViewById = view.findViewById(R.id.spacing);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
        }
        this.f163782b = viewFindViewById;
    }

    @Override // com.avito.android.hotel_booking.konveyor.spacing.f
    public final void N(int i12) {
        Integer numValueOf = Integer.valueOf(i12);
        View view = this.f163782b;
        view.setTag(numValueOf);
        if (view.getHeight() == i12) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = i12;
        view.setLayoutParams(layoutParams);
    }
}
