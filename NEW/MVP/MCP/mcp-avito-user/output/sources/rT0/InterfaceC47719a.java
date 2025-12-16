package rt0;

import Y61.k;
import com.avito.android.service_booking.SbDateBlock;
import com.avito.android.service_booking.SbDaysBlock;
import com.avito.android.service_booking_public.generated.api.api_2_booking_form.BookingFormResponseV3SuccessParamsItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ServiceBookingDateBlockConverter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lrt0/a;", "", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: rt0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC47719a {
    @k
    List<com.avito.conveyor_item.a> a(@k SbDateBlock sbDateBlock);

    @k
    List<com.avito.conveyor_item.a> b(@k BookingFormResponseV3SuccessParamsItem.BookingParamDateV3 bookingParamDateV3);

    @k
    List<com.avito.conveyor_item.a> c(@k BookingFormResponseV3SuccessParamsItem.BookingParamDaysV3 bookingParamDaysV3);

    @k
    List<com.avito.conveyor_item.a> d(@k SbDaysBlock sbDaysBlock);
}
