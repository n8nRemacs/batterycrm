package Mu0;

import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking_utils.BookingSettingsStatus;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersBannerItem;
import com.avito.android.service_orders.list.blueprints.ServiceOrdersListSnippetItem;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ServiceOrdersListAction.kt */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0015\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0082\u0001\u0015\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+¨\u0006,"}, d2 = {"LMu0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "LMu0/a$a;", "LMu0/a$b;", "LMu0/a$c;", "LMu0/a$d;", "LMu0/a$e;", "LMu0/a$f;", "LMu0/a$g;", "LMu0/a$h;", "LMu0/a$i;", "LMu0/a$j;", "LMu0/a$k;", "LMu0/a$l;", "LMu0/a$m;", "LMu0/a$n;", "LMu0/a$o;", "LMu0/a$p;", "LMu0/a$q;", "LMu0/a$r;", "LMu0/a$s;", "LMu0/a$t;", "LMu0/a$u;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Mu0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public interface InterfaceC14531a {

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$a;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C0704a implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f11050a;

        public C0704a(@Y61.k String str) {
            this.f11050a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C0704a) && L.f(this.f11050a, ((C0704a) obj).f11050a);
        }

        public final int hashCode() {
            return this.f11050a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("BindSnippetItem(id="), this.f11050a, ')');
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMu0/a$b;", "LMu0/a;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$b */
    public static final class b implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f11051a = new b();
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$c;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$c */
    public static final /* data */ class c implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f11052a;

        public c(@Y61.k DeepLink deepLink) {
            this.f11052a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f11052a, ((c) obj).f11052a);
        }

        public final int hashCode() {
            return this.f11052a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ClickCalendarBtn(deepLink="), this.f11052a, ')');
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$d;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$d */
    public static final /* data */ class d implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ServiceOrdersBannerItem f11053a;

        public d(@Y61.k ServiceOrdersBannerItem serviceOrdersBannerItem) {
            this.f11053a = serviceOrdersBannerItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f11053a, ((d) obj).f11053a);
        }

        public final int hashCode() {
            return this.f11053a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ClickCloseReminderBanner(item=" + this.f11053a + ')';
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$e;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$e */
    public static final /* data */ class e implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f11054a;

        public e(@Y61.k DeepLink deepLink) {
            this.f11054a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f11054a, ((e) obj).f11054a);
        }

        public final int hashCode() {
            return this.f11054a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ClickEmptyButton(deepLink="), this.f11054a, ')');
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$f;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$f */
    public static final /* data */ class f implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f11055a;

        public f(@Y61.l DeepLink deepLink) {
            this.f11055a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f11055a, ((f) obj).f11055a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f11055a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ClickPanelPlate(deepLink="), this.f11055a, ')');
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$g;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$g */
    public static final /* data */ class g implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f11056a;

        public g(@Y61.k DeepLink deepLink) {
            this.f11056a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f11056a, ((g) obj).f11056a);
        }

        public final int hashCode() {
            return this.f11056a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ClickSettingsReminderBanner(deepLink="), this.f11056a, ')');
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$h;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$h */
    public static final /* data */ class h implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f11057a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f11058b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f11059c;

        public h(@Y61.k DeepLink deepLink, @Y61.l String str, @Y61.l String str2) {
            this.f11057a = deepLink;
            this.f11058b = str;
            this.f11059c = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f11057a, hVar.f11057a) && L.f(this.f11058b, hVar.f11058b) && L.f(this.f11059c, hVar.f11059c);
        }

        public final int hashCode() {
            int iHashCode = this.f11057a.hashCode() * 31;
            String str = this.f11058b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.f11059c;
            return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ClickSnippetActionBtn(deepLink=");
            sb2.append(this.f11057a);
            sb2.append(", actionTitle=");
            sb2.append(this.f11058b);
            sb2.append(", orderId=");
            return C22026a.c(sb2, this.f11059c, ')');
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$i;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$i */
    public static final /* data */ class i implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f11060a;

        public i(@Y61.l DeepLink deepLink) {
            this.f11060a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f11060a, ((i) obj).f11060a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f11060a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("ClickSnippetBody(deepLink="), this.f11060a, ')');
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$j;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$j */
    public static final /* data */ class j implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f11061a;

        public j(@Y61.l String str) {
            this.f11061a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            jVar.getClass();
            return L.f(null, null) && L.f(this.f11061a, jVar.f11061a);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ClickSnippetMoreActionsBtn(deepLink=null, orderId="), this.f11061a, ')');
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMu0/a$k;", "LMu0/a;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$k */
    public static final class k implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f11062a = new k();
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$l;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$l */
    public static final /* data */ class l implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f11063a;

        /* JADX WARN: Multi-variable type inference failed */
        public l() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f11063a, ((l) obj).f11063a);
        }

        public final int hashCode() {
            String str = this.f11063a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnActionFailure(message="), this.f11063a, ')');
        }

        public l(@Y61.l String str) {
            this.f11063a = str;
        }

        public /* synthetic */ l(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$m;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$m */
    public static final /* data */ class m implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f11064a;

        /* JADX WARN: Multi-variable type inference failed */
        public m() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f11064a, ((m) obj).f11064a);
        }

        public final int hashCode() {
            String str = this.f11064a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnActionSuccess(message="), this.f11064a, ')');
        }

        public m(@Y61.l String str) {
            this.f11064a = str;
        }

        public /* synthetic */ m(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMu0/a$n;", "LMu0/a;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$n */
    public static final class n implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f11065a = new n();
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$o;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$o */
    public static final /* data */ class o implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final BookingSettingsStatus f11066a;

        /* JADX WARN: Multi-variable type inference failed */
        public o() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && this.f11066a == ((o) obj).f11066a;
        }

        public final int hashCode() {
            BookingSettingsStatus bookingSettingsStatus = this.f11066a;
            if (bookingSettingsStatus == null) {
                return 0;
            }
            return bookingSettingsStatus.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnCancelSettingsSave(status=" + this.f11066a + ')';
        }

        public o(@Y61.l BookingSettingsStatus bookingSettingsStatus) {
            this.f11066a = bookingSettingsStatus;
        }

        public /* synthetic */ o(BookingSettingsStatus bookingSettingsStatus, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : bookingSettingsStatus);
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$p;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$p */
    public static final /* data */ class p implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f11067a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ServiceOrdersListSnippetItem.a f11068b;

        public p(@Y61.l String str, @Y61.k ServiceOrdersListSnippetItem.a aVar) {
            this.f11067a = str;
            this.f11068b = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof p)) {
                return false;
            }
            p pVar = (p) obj;
            return L.f(this.f11067a, pVar.f11067a) && L.f(this.f11068b, pVar.f11068b);
        }

        public final int hashCode() {
            String str = this.f11067a;
            return this.f11068b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            return "OnContactBlockClicked(orderId=" + this.f11067a + ", contact=" + this.f11068b + ')';
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$q;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$q */
    public static final /* data */ class q implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f11069a;

        public q(@Y61.k DeepLink deepLink) {
            this.f11069a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof q) && L.f(this.f11069a, ((q) obj).f11069a);
        }

        public final int hashCode() {
            return this.f11069a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OnDeeplinkClicked(deepLink="), this.f11069a, ')');
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMu0/a$r;", "LMu0/a;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$r */
    public static final class r implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final r f11070a = new r();
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LMu0/a$s;", "LMu0/a;", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$s */
    public static final /* data */ class s implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f11071a;

        /* JADX WARN: Multi-variable type inference failed */
        public s() {
            this(null, 1, 0 == true ? 1 : 0);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && L.f(this.f11071a, ((s) obj).f11071a);
        }

        public final int hashCode() {
            String str = this.f11071a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("OnSaveSettings(message="), this.f11071a, ')');
        }

        public s(@Y61.l String str) {
            this.f11071a = str;
        }

        public /* synthetic */ s(String str, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str);
        }
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMu0/a$t;", "LMu0/a;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$t */
    public static final class t implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final t f11072a = new t();
    }

    /* compiled from: ServiceOrdersListAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LMu0/a$u;", "LMu0/a;", "<init>", "()V", "_avito_service-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Mu0.a$u */
    public static final class u implements InterfaceC14531a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final u f11073a = new u();
    }
}
