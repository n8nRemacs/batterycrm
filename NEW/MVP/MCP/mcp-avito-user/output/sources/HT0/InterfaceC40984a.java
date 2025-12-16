package ht0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: CalendarDataAction.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lht0/a;", "Lcom/avito/android/service_booking_calendar/flexible/d;", "a", "b", "c", "d", "Lht0/a$a;", "Lht0/a$b;", "Lht0/a$c;", "Lht0/a$d;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: ht0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC40984a extends com.avito.android.service_booking_calendar.flexible.d {

    /* compiled from: CalendarDataAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lht0/a$a;", "Lht0/a;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ht0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11282a implements InterfaceC40984a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C11282a f397442a = new C11282a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C11282a);
        }

        public final int hashCode() {
            return -2048538117;
        }

        @k
        public final String toString() {
            return "OnFinish";
        }
    }

    /* compiled from: CalendarDataAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lht0/a$b;", "Lht0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ht0.a$b */
    public static final /* data */ class b implements InterfaceC40984a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final BookingSettingsStatus f397443a;

        public b(@l BookingSettingsStatus bookingSettingsStatus) {
            this.f397443a = bookingSettingsStatus;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f397443a == ((b) obj).f397443a;
        }

        public final int hashCode() {
            BookingSettingsStatus bookingSettingsStatus = this.f397443a;
            if (bookingSettingsStatus == null) {
                return 0;
            }
            return bookingSettingsStatus.hashCode();
        }

        @k
        public final String toString() {
            return "OnSettingsCanceled(settingsStatus=" + this.f397443a + ')';
        }
    }

    /* compiled from: CalendarDataAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lht0/a$c;", "Lht0/a;", "<init>", "()V", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ht0.a$c */
    public static final /* data */ class c implements InterfaceC40984a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final c f397444a = new c();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1427848636;
        }

        @k
        public final String toString() {
            return "OnSettingsSaved";
        }
    }

    /* compiled from: CalendarDataAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lht0/a$d;", "Lht0/a;", "_avito_service-booking-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ht0.a$d */
    public static final /* data */ class d implements InterfaceC40984a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f397445a;

        public d() {
            this(false, 1, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f397445a == ((d) obj).f397445a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f397445a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("RefreshData(isDataInvalidated="), this.f397445a, ')');
        }

        public d(boolean z12) {
            this.f397445a = z12;
        }

        public /* synthetic */ d(boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? false : z12);
        }
    }
}
