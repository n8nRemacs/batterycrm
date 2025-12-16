package Os0;

import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.select.Arguments;
import com.avito.android.service_booking_additional_settings.additionalsettings.domain.BookingToggleToast;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingAdditionalSettingsOneTimeEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LOs0/b;", "", "a", "b", "c", "d", "e", "LOs0/b$a;", "LOs0/b$b;", "LOs0/b$c;", "LOs0/b$d;", "LOs0/b$e;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface b {

    /* compiled from: ServiceBookingAdditionalSettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOs0/b$a;", "LOs0/b;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final a f12644a = new a();
    }

    /* compiled from: ServiceBookingAdditionalSettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOs0/b$b;", "LOs0/b;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Os0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0816b implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f12645a;

        public C0816b(@k DeepLink deepLink) {
            this.f12645a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0816b) && L.f(this.f12645a, ((C0816b) obj).f12645a);
        }

        public final int hashCode() {
            return this.f12645a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnOpenDeeplink(avitoDomainLink="), this.f12645a, ')');
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOs0/b$c;", "LOs0/b;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Arguments f12646a;

        public c(@k Arguments arguments) {
            this.f12646a = arguments;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f12646a, ((c) obj).f12646a);
        }

        public final int hashCode() {
            return this.f12646a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.p(new StringBuilder("OnShowSelectSheet(arguments="), this.f12646a, ')');
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOs0/b$d;", "LOs0/b;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PrintableText f12647a;

        public d(@k PrintableText printableText) {
            this.f12647a = printableText;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f12647a, ((d) obj).f12647a);
        }

        public final int hashCode() {
            return this.f12647a.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.m(new StringBuilder("ShowErrorToast(message="), this.f12647a, ')');
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOs0/b$e;", "LOs0/b;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final BookingToggleToast f12648a;

        public e(@k BookingToggleToast bookingToggleToast) {
            this.f12648a = bookingToggleToast;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f12648a, ((e) obj).f12648a);
        }

        public final int hashCode() {
            return this.f12648a.hashCode();
        }

        @k
        public final String toString() {
            return "ShowSuccessToast(bookingToggleToast=" + this.f12648a + ')';
        }
    }
}
