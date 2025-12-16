package Ut0;

import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.select.Arguments;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingWorkHoursOneTimeEvent.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"LUt0/i;", "", "a", "b", "c", "d", "e", "f", "LUt0/i$a;", "LUt0/i$b;", "LUt0/i$c;", "LUt0/i$d;", "LUt0/i$e;", "LUt0/i$f;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface i {

    /* compiled from: ServiceBookingWorkHoursOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUt0/i$a;", "LUt0/i;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements i {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(R.string.service_booking_working_hours_save_success);
        }

        @Y61.k
        public final String toString() {
            return "CloseAfterSave(messageResId=2131957223)";
        }
    }

    /* compiled from: ServiceBookingWorkHoursOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUt0/i$b;", "LUt0/i;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final BookingSettingsStatus f16754a;

        public b(@Y61.k BookingSettingsStatus bookingSettingsStatus) {
            this.f16754a = bookingSettingsStatus;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f16754a == ((b) obj).f16754a;
        }

        public final int hashCode() {
            return this.f16754a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnActivityBackClicked(status=" + this.f16754a + ')';
        }
    }

    /* compiled from: ServiceBookingWorkHoursOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUt0/i$c;", "LUt0/i;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Arguments f16755a;

        public c(@Y61.k Arguments arguments) {
            this.f16755a = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f16755a, ((c) obj).f16755a);
        }

        public final int hashCode() {
            return this.f16755a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.p(new StringBuilder("OnOpenSelectSheet(selectArguments="), this.f16755a, ')');
        }
    }

    /* compiled from: ServiceBookingWorkHoursOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUt0/i$d;", "LUt0/i;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements i {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f16756a;

        public d(@Y61.k DeepLink deepLink) {
            this.f16756a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof d) {
                return L.f(this.f16756a, ((d) obj).f16756a);
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(R.string.service_booking_working_hours_save_success) + (this.f16756a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "RedirectAfterSave(uri=" + this.f16756a + ", messageResId=2131957223)";
        }
    }

    /* compiled from: ServiceBookingWorkHoursOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUt0/i$e;", "LUt0/i;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements i {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f16757a;

        public e(@l String str) {
            this.f16757a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f16757a, ((e) obj).f16757a);
        }

        public final int hashCode() {
            String str = this.f16757a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorSave(message="), this.f16757a, ')');
        }
    }

    /* compiled from: ServiceBookingWorkHoursOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LUt0/i$f;", "LUt0/i;", "_avito_service-booking-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements i {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        @Y61.k
        public final String toString() {
            return "ShowSuccessSave(messageResId=0)";
        }
    }
}
