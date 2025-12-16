package yt0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DaySettingsOneTimeEvent.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u0082\u0001\t\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013¨\u0006\u0014"}, d2 = {"Lyt0/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "Lyt0/b$a;", "Lyt0/b$b;", "Lyt0/b$c;", "Lyt0/b$d;", "Lyt0/b$e;", "Lyt0/b$f;", "Lyt0/b$g;", "Lyt0/b$h;", "Lyt0/b$i;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: yt0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC50301b {

    /* compiled from: DaySettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyt0/b$a;", "Lyt0/b;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yt0.b$a */
    public static final /* data */ class a implements InterfaceC50301b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f443585a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final BookingSettingsStatus f443586b;

        public a(boolean z12, @k BookingSettingsStatus bookingSettingsStatus) {
            this.f443585a = z12;
            this.f443586b = bookingSettingsStatus;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f443585a == aVar.f443585a && this.f443586b == aVar.f443586b;
        }

        public final int hashCode() {
            return this.f443586b.hashCode() + (Boolean.hashCode(this.f443585a) * 31);
        }

        @k
        public final String toString() {
            return "Finish(isSettingsChanged=" + this.f443585a + ", settingsStatus=" + this.f443586b + ')';
        }
    }

    /* compiled from: DaySettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyt0/b$b;", "Lyt0/b;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yt0.b$b, reason: collision with other inner class name */
    public static final /* data */ class C12930b implements InterfaceC50301b {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12930b)) {
                return false;
            }
            ((C12930b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return -1335681739;
        }

        @k
        public final String toString() {
            return "OnOpenAvitoUrl(url=https://support.avito.ru/articles/2796)";
        }
    }

    /* compiled from: DaySettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyt0/b$c;", "Lyt0/b;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yt0.b$c */
    public static final /* data */ class c implements InterfaceC50301b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443587a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final org.threeten.bp.f f443588b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final org.threeten.bp.f f443589c;

        public c(@k String str, @k org.threeten.bp.f fVar, @k org.threeten.bp.f fVar2) {
            this.f443587a = str;
            this.f443588b = fVar;
            this.f443589c = fVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f443587a, cVar.f443587a) && L.f(this.f443588b, cVar.f443588b) && L.f(this.f443589c, cVar.f443589c);
        }

        public final int hashCode() {
            return this.f443589c.hashCode() + ((this.f443588b.hashCode() + (this.f443587a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "OpenBreakEndTimePicker(selectId=" + this.f443587a + ", selectedDate=" + this.f443588b + ", minDate=" + this.f443589c + ')';
        }
    }

    /* compiled from: DaySettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyt0/b$d;", "Lyt0/b;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yt0.b$d */
    public static final /* data */ class d implements InterfaceC50301b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443590a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final org.threeten.bp.f f443591b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final org.threeten.bp.f f443592c;

        public d(@k String str, @k org.threeten.bp.f fVar, @k org.threeten.bp.f fVar2) {
            this.f443590a = str;
            this.f443591b = fVar;
            this.f443592c = fVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f443590a, dVar.f443590a) && L.f(this.f443591b, dVar.f443591b) && L.f(this.f443592c, dVar.f443592c);
        }

        public final int hashCode() {
            return this.f443592c.hashCode() + ((this.f443591b.hashCode() + (this.f443590a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            return "OpenBreakStartTimePicker(selectId=" + this.f443590a + ", selectedDate=" + this.f443591b + ", maxDate=" + this.f443592c + ')';
        }
    }

    /* compiled from: DaySettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyt0/b$e;", "Lyt0/b;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yt0.b$e */
    public static final /* data */ class e implements InterfaceC50301b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f443593a;

        public e(@k DeepLink deepLink) {
            this.f443593a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f443593a, ((e) obj).f443593a);
        }

        public final int hashCode() {
            return this.f443593a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deepLink="), this.f443593a, ')');
        }
    }

    /* compiled from: DaySettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyt0/b$f;", "Lyt0/b;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yt0.b$f */
    public static final /* data */ class f implements InterfaceC50301b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final org.threeten.bp.f f443594a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final org.threeten.bp.f f443595b;

        public f(@k org.threeten.bp.f fVar, @k org.threeten.bp.f fVar2) {
            this.f443594a = fVar;
            this.f443595b = fVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f443594a, fVar.f443594a) && L.f(this.f443595b, fVar.f443595b);
        }

        public final int hashCode() {
            return this.f443595b.hashCode() + (this.f443594a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OpenTimePickerFrom(initialDateTime=" + this.f443594a + ", maxDate=" + this.f443595b + ')';
        }
    }

    /* compiled from: DaySettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyt0/b$g;", "Lyt0/b;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yt0.b$g */
    public static final /* data */ class g implements InterfaceC50301b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final org.threeten.bp.f f443596a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final org.threeten.bp.f f443597b;

        public g(@k org.threeten.bp.f fVar, @k org.threeten.bp.f fVar2) {
            this.f443596a = fVar;
            this.f443597b = fVar2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f443596a, gVar.f443596a) && L.f(this.f443597b, gVar.f443597b);
        }

        public final int hashCode() {
            return this.f443597b.hashCode() + (this.f443596a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "OpenTimePickerTo(initialDateTime=" + this.f443596a + ", minDate=" + this.f443597b + ')';
        }
    }

    /* compiled from: DaySettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyt0/b$h;", "Lyt0/b;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yt0.b$h */
    public static final /* data */ class h implements InterfaceC50301b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443598a;

        public h(@k String str) {
            this.f443598a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f443598a, ((h) obj).f443598a);
        }

        public final int hashCode() {
            return this.f443598a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowErrorToast(message="), this.f443598a, ')');
        }
    }

    /* compiled from: DaySettingsOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lyt0/b$i;", "Lyt0/b;", "_avito_service-booking-day-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: yt0.b$i */
    public static final /* data */ class i implements InterfaceC50301b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f443599a;

        public i(@k String str) {
            this.f443599a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f443599a, ((i) obj).f443599a);
        }

        public final int hashCode() {
            return this.f443599a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSuccessToast(message="), this.f443599a, ')');
        }
    }
}
