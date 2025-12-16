package ht0;

import Y61.k;
import Y61.l;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import kotlin.Metadata;

/* compiled from: CalendarDataOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lht0/b;", "", "a", "Lht0/b$a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ht0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC40985b {

    /* compiled from: CalendarDataOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lht0/b$a;", "Lht0/b;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ht0.b$a */
    public static final /* data */ class a implements InterfaceC40985b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BookingSettingsStatus f397446a;

        public a(@k BookingSettingsStatus bookingSettingsStatus) {
            this.f397446a = bookingSettingsStatus;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f397446a == ((a) obj).f397446a;
        }

        public final int hashCode() {
            return this.f397446a.hashCode();
        }

        @k
        public final String toString() {
            return "Finish(settingsStatus=" + this.f397446a + ')';
        }
    }
}
