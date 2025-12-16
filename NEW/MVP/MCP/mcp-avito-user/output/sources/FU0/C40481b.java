package fu0;

import Y61.k;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import kotlin.Metadata;

/* compiled from: BookingSettingsStatus.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_service-booking-utils_utils"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: fu0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C40481b {
    @k
    public static final BookingSettingsStatus a(@k BookingSettingsStatus bookingSettingsStatus, @k BookingSettingsStatus bookingSettingsStatus2) {
        int i12 = bookingSettingsStatus2.f278282b | bookingSettingsStatus.f278282b;
        BookingSettingsStatus bookingSettingsStatus3 = BookingSettingsStatus.f278277c;
        if (i12 != 3) {
            bookingSettingsStatus3 = BookingSettingsStatus.f278278d;
            if (i12 != 1) {
                bookingSettingsStatus3 = BookingSettingsStatus.f278279e;
                if (i12 != 0) {
                    return bookingSettingsStatus;
                }
            }
        }
        return bookingSettingsStatus3;
    }
}
