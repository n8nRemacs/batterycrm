package ys0;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.Intent;
import com.avito.android.service_booking.BookingFlow;
import com.avito.android.service_booking.BookingFlowSource;
import com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory;
import com.avito.android.service_booking.mvi.ServiceBookingMviActivity;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ServiceBookingFlowIntentFactoryImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lys0/g;", "Lcom/avito/android/service_booking/deeplinks/ServiceBookingFlowIntentFactory;", "_avito_service-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ys0.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C50296g implements ServiceBookingFlowIntentFactory {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Context f443552b;

    @Inject
    public C50296g(@k Context context) {
        this.f443552b = context;
    }

    @Override // com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory
    @k
    public final Intent a(@k String str, @k String str2, @l String str3, @l String str4) {
        ServiceBookingMviActivity.f274297t.getClass();
        Intent intent = new Intent(this.f443552b, (Class<?>) ServiceBookingMviActivity.class);
        intent.putExtra("key.advert_id", str);
        intent.putExtra("key.step_id", str2);
        intent.putExtra("key.mc_id", str3);
        intent.putExtra("key.location_id", str4);
        intent.putExtra("key.booking_flow", BookingFlow.f274120b);
        return intent;
    }

    @Override // com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory
    @k
    public final Intent b(@k String str) {
        ServiceBookingMviActivity.f274297t.getClass();
        Intent intent = new Intent(this.f443552b, (Class<?>) ServiceBookingMviActivity.class);
        intent.putExtra("key.step_id", str);
        intent.putExtra("key.booking_flow", BookingFlow.f274122d);
        return intent;
    }

    @Override // com.avito.android.service_booking.deeplinks.ServiceBookingFlowIntentFactory
    @k
    public final Intent c(@l String str, @k String str2, @k String str3, @l String str4, @l BookingFlowSource bookingFlowSource) {
        ServiceBookingMviActivity.f274297t.getClass();
        Intent intent = new Intent(this.f443552b, (Class<?>) ServiceBookingMviActivity.class);
        intent.putExtra("key.advert_id", str);
        intent.putExtra("key.step_id", str2);
        intent.putExtra("key.booking_id", str3);
        intent.putExtra("key.booking_flow", BookingFlow.f274121c);
        intent.putExtra("key.mc_id", str4);
        intent.putExtra("key.booking_flow_source", bookingFlowSource);
        return intent;
    }
}
