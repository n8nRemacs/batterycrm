package Os0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.service_booking_additional_settings.additionalsettings.recyclerview.item.AdditionalSettingsElementsContentItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceBookingAdditionalSettingsAction.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"LOs0/a;", "", "a", "b", "c", "d", "e", "f", "g", "LOs0/a$a;", "LOs0/a$b;", "LOs0/a$c;", "LOs0/a$d;", "LOs0/a$e;", "LOs0/a$f;", "LOs0/a$g;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Os0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14732a {

    /* compiled from: ServiceBookingAdditionalSettingsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOs0/a$a;", "LOs0/a;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Os0.a$a, reason: collision with other inner class name */
    public static final class C0814a implements InterfaceC14732a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C0814a f12631a = new C0814a();
    }

    /* compiled from: ServiceBookingAdditionalSettingsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LOs0/a$b;", "LOs0/a;", "<init>", "()V", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Os0.a$b */
    public static final class b implements InterfaceC14732a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f12632a = new b();
    }

    /* compiled from: ServiceBookingAdditionalSettingsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOs0/a$d;", "LOs0/a;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Os0.a$d */
    public static final /* data */ class d implements InterfaceC14732a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f12640a;

        public d(boolean z12) {
            this.f12640a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.f12640a == ((d) obj).f12640a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f12640a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("OnClickToggle(isChecked="), this.f12640a, ')');
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOs0/a$e;", "LOs0/a;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Os0.a$e */
    public static final /* data */ class e implements InterfaceC14732a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f12641a;

        public e(@l String str) {
            this.f12641a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f12641a, ((e) obj).f12641a);
        }

        public final int hashCode() {
            String str = this.f12641a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnTechBreakItemSelected(techBreakId="), this.f12641a, ')');
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOs0/a$f;", "LOs0/a;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Os0.a$f */
    public static final /* data */ class f implements InterfaceC14732a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f12642a;

        public f(@l String str) {
            this.f12642a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f12642a, ((f) obj).f12642a);
        }

        public final int hashCode() {
            String str = this.f12642a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnTimeGapItemSelected(timeGapId="), this.f12642a, ')');
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOs0/a$g;", "LOs0/a;", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Os0.a$g */
    public static final /* data */ class g implements InterfaceC14732a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final WebViewLink.OnlyAvitoDomain f12643a;

        public g(@k WebViewLink.OnlyAvitoDomain onlyAvitoDomain) {
            this.f12643a = onlyAvitoDomain;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f12643a, ((g) obj).f12643a);
        }

        public final int hashCode() {
            return this.f12643a.hashCode();
        }

        @k
        public final String toString() {
            return "OnWebLinkClicked(avitoDomainLink=" + this.f12643a + ')';
        }
    }

    /* compiled from: ServiceBookingAdditionalSettingsAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LOs0/a$c;", "LOs0/a;", "a", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Os0.a$c */
    public static final /* data */ class c implements InterfaceC14732a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final C0815a f12633a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f12634b;

        public c(@k C0815a c0815a, @k String str) {
            this.f12633a = c0815a;
            this.f12634b = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f12633a, cVar.f12633a) && L.f(this.f12634b, cVar.f12634b);
        }

        public final int hashCode() {
            return this.f12634b.hashCode() + (this.f12633a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OnClickShowSelectSheet(args=");
            sb2.append(this.f12633a);
            sb2.append(", requestId=");
            return C22026a.c(sb2, this.f12634b, ')');
        }

        /* compiled from: ServiceBookingAdditionalSettingsAction.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LOs0/a$c$a;", "", "_avito_service-booking-additional-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: Os0.a$c$a, reason: collision with other inner class name */
        public static final /* data */ class C0815a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final List<AdditionalSettingsElementsContentItem.AdditionalSettingsElementSheetTimeGap.AdditionalSettingsElementOption> f12635a;

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f12636b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f12637c;

            /* renamed from: d, reason: collision with root package name */
            public final boolean f12638d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final String f12639e;

            public C0815a(@l String str, @l String str2, @l String str3, @l List list, boolean z12) {
                this.f12635a = list;
                this.f12636b = str;
                this.f12637c = str2;
                this.f12638d = z12;
                this.f12639e = str3;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0815a)) {
                    return false;
                }
                C0815a c0815a = (C0815a) obj;
                return L.f(this.f12635a, c0815a.f12635a) && L.f(this.f12636b, c0815a.f12636b) && L.f(this.f12637c, c0815a.f12637c) && this.f12638d == c0815a.f12638d && L.f(this.f12639e, c0815a.f12639e);
            }

            public final int hashCode() {
                List<AdditionalSettingsElementsContentItem.AdditionalSettingsElementSheetTimeGap.AdditionalSettingsElementOption> list = this.f12635a;
                int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
                String str = this.f12636b;
                int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.f12637c;
                int i12 = r.i((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f12638d);
                String str3 = this.f12639e;
                return i12 + (str3 != null ? str3.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("SelectSheetArgs(options=");
                sb2.append(this.f12635a);
                sb2.append(", value=");
                sb2.append(this.f12636b);
                sb2.append(", title=");
                sb2.append(this.f12637c);
                sb2.append(", canClear=");
                sb2.append(this.f12638d);
                sb2.append(", description=");
                return C22026a.c(sb2, this.f12639e, ')');
            }

            public /* synthetic */ C0815a(List list, String str, String str2, boolean z12, String str3, int i12, C42822w c42822w) {
                this(str, str2, (i12 & 16) != 0 ? null : str3, list, z12);
            }
        }
    }
}
