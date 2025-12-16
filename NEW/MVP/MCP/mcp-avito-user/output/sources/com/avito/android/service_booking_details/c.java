package com.avito.android.service_booking_details;

import android.content.Context;
import android.content.Intent;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingDetailsIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_details/c;", "Lcom/avito/android/service_booking_details/b;", "_avito_service-booking-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class c implements b {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f277212a;

    @Inject
    public c(@Y61.k Context context) {
        this.f277212a = context;
    }

    @Override // com.avito.android.service_booking_details.b
    @Y61.k
    public final Intent a(@Y61.k String str) {
        ServiceBookingItemDetailsActivity.f277175C.getClass();
        return new Intent(this.f277212a, (Class<?>) ServiceBookingItemDetailsActivity.class).putExtra("key_booking_id", str);
    }
}
