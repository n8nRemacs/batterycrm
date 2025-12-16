package Gy0;

import Fy0.InterfaceC13856a;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.component.accordion.s;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.StrSellerCalendarRejectInfo;
import com.avito.android.remote.model.category_parameters.GroupParameter;
import com.avito.android.str_calendar.common.models.SelectedDateRange;
import com.avito.android.str_calendar.common.models.UpdatedParametersInfo;
import com.avito.android.str_calendar.seller.warning_dialog.models.WarningDialogData;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrCalendarParametersOneTimeEvent.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"LGy0/d;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "LGy0/d$a;", "LGy0/d$b;", "LGy0/d$c;", "LGy0/d$d;", "LGy0/d$e;", "LGy0/d$f;", "LGy0/d$g;", "LGy0/d$h;", "LGy0/d$i;", "LGy0/d$j;", "LGy0/d$k;", "LGy0/d$l;", "LGy0/d$m;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public interface d {

    /* compiled from: StrCalendarParametersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LGy0/d$a;", "LGy0/d;", "<init>", "()V", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final a f6850a = new a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 314710941;
        }

        @Y61.k
        public final String toString() {
            return "CloseBottomPicker";
        }
    }

    /* compiled from: StrCalendarParametersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/d$b;", "LGy0/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f6851a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final UpdatedParametersInfo f6852b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final InterfaceC13856a f6853c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f6854d;

        public b(@Y61.k InterfaceC13856a interfaceC13856a, @Y61.l UpdatedParametersInfo updatedParametersInfo, boolean z12, boolean z13) {
            this.f6851a = z12;
            this.f6852b = updatedParametersInfo;
            this.f6853c = interfaceC13856a;
            this.f6854d = z13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f6851a == bVar.f6851a && L.f(this.f6852b, bVar.f6852b) && L.f(this.f6853c, bVar.f6853c) && this.f6854d == bVar.f6854d;
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f6851a) * 31;
            UpdatedParametersInfo updatedParametersInfo = this.f6852b;
            return Boolean.hashCode(this.f6854d) + ((this.f6853c.hashCode() + ((iHashCode + (updatedParametersInfo == null ? 0 : updatedParametersInfo.hashCode())) * 31)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseScreen(updateCalendar=");
            sb2.append(this.f6851a);
            sb2.append(", updatedParametersInfo=");
            sb2.append(this.f6852b);
            sb2.append(", uxfState=");
            sb2.append(this.f6853c);
            sb2.append(", shouldCloseFlow=");
            return r.x(sb2, this.f6854d, ')');
        }
    }

    /* compiled from: StrCalendarParametersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/d$c;", "LGy0/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6855a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Integer f6856b;

        public c(@Y61.k String str, @Y61.l Integer num) {
            this.f6855a = str;
            this.f6856b = num;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f6855a, cVar.f6855a) && L.f(this.f6856b, cVar.f6856b);
        }

        public final int hashCode() {
            int iHashCode = this.f6855a.hashCode() * 31;
            Integer num = this.f6856b;
            return iHashCode + (num == null ? 0 : num.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenBottomPicker(title=");
            sb2.append(this.f6855a);
            sb2.append(", targetPosition=");
            return s.j(sb2, this.f6856b, ')');
        }
    }

    /* compiled from: StrCalendarParametersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/d$d;", "LGy0/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Gy0.d$d, reason: collision with other inner class name */
    public static final /* data */ class C0388d implements d {

        /* renamed from: a, reason: collision with root package name */
        public final long f6857a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f6858b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f6859c;

        public C0388d(long j12, @Y61.l String str, @Y61.l String str2) {
            this.f6857a = j12;
            this.f6858b = str;
            this.f6859c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0388d)) {
                return false;
            }
            C0388d c0388d = (C0388d) obj;
            return this.f6857a == c0388d.f6857a && L.f(this.f6858b, c0388d.f6858b) && L.f(this.f6859c, c0388d.f6859c);
        }

        public final int hashCode() {
            int iHashCode = Long.hashCode(this.f6857a) * 31;
            String str = this.f6858b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f6859c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenCancellationSettings(itemId=");
            sb2.append(this.f6857a);
            sb2.append(", startDate=");
            sb2.append(this.f6858b);
            sb2.append(", endDate=");
            return C22026a.c(sb2, this.f6859c, ')');
        }
    }

    /* compiled from: StrCalendarParametersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/d$e;", "LGy0/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f6860a;

        public e(@Y61.k DeepLink deepLink) {
            this.f6860a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f6860a, ((e) obj).f6860a);
        }

        public final int hashCode() {
            return this.f6860a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeeplink(deeplink="), this.f6860a, ')');
        }
    }

    /* compiled from: StrCalendarParametersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/d$f;", "LGy0/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6861a;

        public f(@Y61.k String str) {
            this.f6861a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f6861a, ((f) obj).f6861a);
        }

        public final int hashCode() {
            return this.f6861a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OpenUrl(url="), this.f6861a, ')');
        }
    }

    /* compiled from: StrCalendarParametersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/d$g;", "LGy0/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6862a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final GroupParameter.OnboardingTooltip f6863b;

        public g(@Y61.k String str, @Y61.k GroupParameter.OnboardingTooltip onboardingTooltip) {
            this.f6862a = str;
            this.f6863b = onboardingTooltip;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f6862a, gVar.f6862a) && L.f(this.f6863b, gVar.f6863b);
        }

        public final int hashCode() {
            return this.f6863b.hashCode() + (this.f6862a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "RequestOnboardingForField(itemId=" + this.f6862a + ", tooltip=" + this.f6863b + ')';
        }
    }

    /* compiled from: StrCalendarParametersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/d$h;", "LGy0/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements d {

        /* renamed from: a, reason: collision with root package name */
        public final int f6864a;

        public h(int i12) {
            this.f6864a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f6864a == ((h) obj).f6864a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f6864a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("ScrollToPosition(position="), this.f6864a, ')');
        }
    }

    /* compiled from: StrCalendarParametersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/d$i;", "LGy0/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f6865a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final SelectedDateRange f6866b;

        public i(@Y61.k String str, @Y61.l SelectedDateRange selectedDateRange) {
            this.f6865a = str;
            this.f6866b = selectedDateRange;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f6865a, iVar.f6865a) && L.f(this.f6866b, iVar.f6866b);
        }

        public final int hashCode() {
            int iHashCode = this.f6865a.hashCode() * 31;
            SelectedDateRange selectedDateRange = this.f6866b;
            return iHashCode + (selectedDateRange == null ? 0 : selectedDateRange.hashCode());
        }

        @Y61.k
        public final String toString() {
            return "ShowLastMinuteOffer(advertId=" + this.f6865a + ", dateRange=" + this.f6866b + ')';
        }
    }

    /* compiled from: StrCalendarParametersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/d$j;", "LGy0/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final StrSellerCalendarRejectInfo f6867a;

        public j(@Y61.k StrSellerCalendarRejectInfo strSellerCalendarRejectInfo) {
            this.f6867a = strSellerCalendarRejectInfo;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f6867a, ((j) obj).f6867a);
        }

        public final int hashCode() {
            return this.f6867a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowRejectInfo(rejectInfo=" + this.f6867a + ')';
        }
    }

    /* compiled from: StrCalendarParametersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/d$k;", "LGy0/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f6868a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.component.toast.f f6869b;

        public k(@Y61.k PrintableText printableText, @Y61.k com.avito.android.component.toast.f fVar) {
            this.f6868a = printableText;
            this.f6869b = fVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f6868a, kVar.f6868a) && L.f(this.f6869b, kVar.f6869b);
        }

        public final int hashCode() {
            return this.f6869b.hashCode() + (this.f6868a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowToast(text=" + this.f6868a + ", type=" + this.f6869b + ')';
        }
    }

    /* compiled from: StrCalendarParametersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/d$l;", "LGy0/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements d {

        /* renamed from: a, reason: collision with root package name */
        public final int f6870a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final GroupParameter.OnboardingTooltip f6871b;

        public l(int i12, @Y61.k GroupParameter.OnboardingTooltip onboardingTooltip) {
            this.f6870a = i12;
            this.f6871b = onboardingTooltip;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return this.f6870a == lVar.f6870a && L.f(this.f6871b, lVar.f6871b);
        }

        public final int hashCode() {
            return this.f6871b.hashCode() + (Integer.hashCode(this.f6870a) * 31);
        }

        @Y61.k
        public final String toString() {
            return "ShowTooltipAtPosition(position=" + this.f6870a + ", tooltip=" + this.f6871b + ')';
        }
    }

    /* compiled from: StrCalendarParametersOneTimeEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LGy0/d$m;", "LGy0/d;", "_avito_str-calendar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final WarningDialogData f6872a;

        public m(@Y61.k WarningDialogData warningDialogData) {
            this.f6872a = warningDialogData;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f6872a, ((m) obj).f6872a);
        }

        public final int hashCode() {
            return this.f6872a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ShowWarningDialog(warningDialog=" + this.f6872a + ')';
        }
    }
}
