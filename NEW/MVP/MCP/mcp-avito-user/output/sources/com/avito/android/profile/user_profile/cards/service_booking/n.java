package com.avito.android.profile.user_profile.cards.service_booking;

import android.view.View;
import com.avito.android.R;
import com.avito.android.profile.horizontal_scroll_widget.HorizontalScrollView;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingCardView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/n;", "Lcom/avito/android/profile/user_profile/cards/service_booking/m;", "Lcom/avito/konveyor/adapter/b;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class n extends com.avito.konveyor.adapter.b implements m {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final View f225485b;

    public n(@Y61.k View view) {
        super(view);
        this.f225485b = view;
    }

    @Override // com.avito.android.profile.user_profile.cards.service_booking.m
    @Y61.k
    public final HorizontalScrollView getWidget() {
        View viewFindViewById = this.f225485b.findViewById(R.id.service_booking_orders_widget);
        if (viewFindViewById != null) {
            return (HorizontalScrollView) viewFindViewById;
        }
        throw new NullPointerException("null cannot be cast to non-null type com.avito.android.profile.horizontal_scroll_widget.HorizontalScrollView");
    }

    @Override // com.avito.konveyor.adapter.b, TV0.e
    public final void j5() {
        getWidget().setOnActionButtonClickListener(null);
    }
}
