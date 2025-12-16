package D90;

import B90.a;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile.pro.impl.ProfileTabUserType;
import com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams;
import com.avito.android.profile.pro.impl.network.response.ProDashboardResponse;
import com.avito.android.profile.pro.impl.screen.item.geo_banner.ProfileProGeoBannerItem;
import com.avito.android.remote.error.ApiError;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProInternalAction.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0017\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0082\u0001\u0017\u0019\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./¨\u00060"}, d2 = {"LD90/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "LD90/b$a;", "LD90/b$b;", "LD90/b$c;", "LD90/b$d;", "LD90/b$e;", "LD90/b$f;", "LD90/b$g;", "LD90/b$h;", "LD90/b$i;", "LD90/b$j;", "LD90/b$k;", "LD90/b$l;", "LD90/b$m;", "LD90/b$n;", "LD90/b$o;", "LD90/b$p;", "LD90/b$q;", "LD90/b$r;", "LD90/b$s;", "LD90/b$t;", "LD90/b$u;", "LD90/b$v;", "LD90/b$w;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface b {

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/b$a;", "LD90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final B90.a f3009a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<com.avito.conveyor_item.a> f3010b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final ProDashboardResponse f3011c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Boolean f3012d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final ServiceBookingBlockParams f3013e;

        /* renamed from: f, reason: collision with root package name */
        public final int f3014f;

        /* renamed from: g, reason: collision with root package name */
        public final int f3015g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final ProfileProWidgetsParams f3016h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.k
        public final List<DeepLink> f3017i;

        /* renamed from: j, reason: collision with root package name */
        @Y61.l
        public final DeepLink f3018j;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@Y61.k B90.a aVar, @Y61.k List<? extends com.avito.conveyor_item.a> list, @Y61.l ProDashboardResponse proDashboardResponse, @Y61.l Boolean bool, @Y61.l ServiceBookingBlockParams serviceBookingBlockParams, int i12, int i13, @Y61.k ProfileProWidgetsParams profileProWidgetsParams, @Y61.k List<? extends DeepLink> list2, @Y61.l DeepLink deepLink) {
            this.f3009a = aVar;
            this.f3010b = list;
            this.f3011c = proDashboardResponse;
            this.f3012d = bool;
            this.f3013e = serviceBookingBlockParams;
            this.f3014f = i12;
            this.f3015g = i13;
            this.f3016h = profileProWidgetsParams;
            this.f3017i = list2;
            this.f3018j = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f3009a, aVar.f3009a) && L.f(this.f3010b, aVar.f3010b) && L.f(this.f3011c, aVar.f3011c) && L.f(this.f3012d, aVar.f3012d) && L.f(this.f3013e, aVar.f3013e) && this.f3014f == aVar.f3014f && this.f3015g == aVar.f3015g && L.f(this.f3016h, aVar.f3016h) && L.f(this.f3017i, aVar.f3017i) && L.f(this.f3018j, aVar.f3018j);
        }

        public final int hashCode() {
            int iE2 = H.e(this.f3009a.hashCode() * 31, 31, this.f3010b);
            ProDashboardResponse proDashboardResponse = this.f3011c;
            int iHashCode = (iE2 + (proDashboardResponse == null ? 0 : proDashboardResponse.hashCode())) * 31;
            Boolean bool = this.f3012d;
            int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            ServiceBookingBlockParams serviceBookingBlockParams = this.f3013e;
            int iE3 = H.e((this.f3016h.hashCode() + androidx.appcompat.app.r.e(this.f3015g, androidx.appcompat.app.r.e(this.f3014f, (iHashCode2 + (serviceBookingBlockParams == null ? 0 : serviceBookingBlockParams.hashCode())) * 31, 31), 31)) * 31, 31, this.f3017i);
            DeepLink deepLink = this.f3018j;
            return iE3 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Content(profileTabContent=");
            sb2.append(this.f3009a);
            sb2.append(", items=");
            sb2.append(this.f3010b);
            sb2.append(", dashboard=");
            sb2.append(this.f3011c);
            sb2.append(", hideNotifications=");
            sb2.append(this.f3012d);
            sb2.append(", serviceBookingBlockParams=");
            sb2.append(this.f3013e);
            sb2.append(", callsHistoryUnreadCounter=");
            sb2.append(this.f3014f);
            sb2.append(", callsTrackingUnreadCounter=");
            sb2.append(this.f3015g);
            sb2.append(", widgetsParams=");
            sb2.append(this.f3016h);
            sb2.append(", uxFeedbackDeepLinks=");
            sb2.append(this.f3017i);
            sb2.append(", proDeclarationDeeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f3018j, ')');
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/b$b;", "LD90/b;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: D90.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0153b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C0153b f3019a = new C0153b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C0153b);
        }

        public final int hashCode() {
            return -1285799628;
        }

        @Y61.k
        public final String toString() {
            return "DashboardQualityOpenError";
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/b$c;", "LD90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f3020a;

        public c(@Y61.k ApiError apiError) {
            this.f3020a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f3020a, ((c) obj).f3020a);
        }

        public final int hashCode() {
            return this.f3020a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(apiError="), this.f3020a, ')');
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/b$d;", "LD90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f3021a;

        public d(@Y61.k ApiError apiError) {
            this.f3021a = apiError;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f3021a, ((d) obj).f3021a);
        }

        public final int hashCode() {
            return this.f3021a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.n(new StringBuilder("ErrorToast(apiError="), this.f3021a, ')');
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/b$e;", "LD90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ProfileProGeoBannerItem f3022a;

        public e(@Y61.k ProfileProGeoBannerItem profileProGeoBannerItem) {
            this.f3022a = profileProGeoBannerItem;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f3022a, ((e) obj).f3022a);
        }

        public final int hashCode() {
            return this.f3022a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "GeoBannerClosed(item=" + this.f3022a + ')';
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/b$f;", "LD90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f3023a;

        public f(@Y61.k String str) {
            this.f3023a = str;
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/b$g;", "LD90/b;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f3024a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -299492771;
        }

        @Y61.k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/b$h;", "LD90/b;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f3025a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1935860688;
        }

        @Y61.k
        public final String toString() {
            return "NoChange";
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/b$i;", "LD90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f3026a;

        public i(@Y61.k DeepLink deepLink) {
            this.f3026a = deepLink;
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/b$j;", "LD90/b;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f3027a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1249295987;
        }

        @Y61.k
        public final String toString() {
            return "OpenEdit";
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/b$k;", "LD90/b;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f3028a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return -1855344628;
        }

        @Y61.k
        public final String toString() {
            return "OpenSettings";
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/b$l;", "LD90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class l implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final a.c f3029a;

        public l(@Y61.k a.c cVar) {
            this.f3029a = cVar;
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/b$m;", "LD90/b;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f3030a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return 896096489;
        }

        @Y61.k
        public final String toString() {
            return "OpenTfaSettings";
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/b$n;", "LD90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f3031a;

        public n(@Y61.l DeepLink deepLink) {
            this.f3031a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f3031a, ((n) obj).f3031a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f3031a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenWallet(deepLink="), this.f3031a, ')');
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/b$o;", "LD90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final ServiceBookingBlockParams f3032a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final ProfileProWidgetsParams.AvitoFinanceParams f3033b;

        public o(@Y61.l ServiceBookingBlockParams serviceBookingBlockParams, @Y61.l ProfileProWidgetsParams.AvitoFinanceParams avitoFinanceParams) {
            this.f3032a = serviceBookingBlockParams;
            this.f3033b = avitoFinanceParams;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof o)) {
                return false;
            }
            o oVar = (o) obj;
            return L.f(this.f3032a, oVar.f3032a) && L.f(this.f3033b, oVar.f3033b);
        }

        public final int hashCode() {
            int i12 = 0;
            ServiceBookingBlockParams serviceBookingBlockParams = this.f3032a;
            int iHashCode = (serviceBookingBlockParams == null ? 0 : serviceBookingBlockParams.hashCode()) * 31;
            ProfileProWidgetsParams.AvitoFinanceParams avitoFinanceParams = this.f3033b;
            if (avitoFinanceParams != null) {
                avitoFinanceParams.getClass();
                i12 = 1931230246;
            }
            return iHashCode + i12;
        }

        @Y61.k
        public final String toString() {
            return "RemoveLoading(previousSbBlockParams=" + this.f3032a + ", previousAvitoFinanceParams=" + this.f3033b + ')';
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/b$p;", "LD90/b;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final p f3034a = new p();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof p);
        }

        public final int hashCode() {
            return 897445263;
        }

        @Y61.k
        public final String toString() {
            return "ShowAllDashboard";
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/b$q;", "LD90/b;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class q implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final q f3035a = new q();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof q);
        }

        public final int hashCode() {
            return 1582955968;
        }

        @Y61.k
        public final String toString() {
            return "ShowCallAnswerDialog";
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/b$r;", "LD90/b;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class r implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final r f3036a = new r();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof r);
        }

        public final int hashCode() {
            return -1737991708;
        }

        @Y61.k
        public final String toString() {
            return "ShowUxFeedback";
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/b$s;", "LD90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class s implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UserAddressLink.Result.Success f3037a;

        public s(@Y61.k UserAddressLink.Result.Success success) {
            this.f3037a = success;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof s) && L.f(this.f3037a, ((s) obj).f3037a);
        }

        public final int hashCode() {
            return this.f3037a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SuccessAddressToast(event=" + this.f3037a + ')';
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/b$t;", "LD90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class t implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f3038a;

        public t(@Y61.k PrintableText printableText) {
            this.f3038a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof t) && L.f(this.f3038a, ((t) obj).f3038a);
        }

        public final int hashCode() {
            return this.f3038a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("SuccessToast(message="), this.f3038a, ')');
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/b$u;", "LD90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class u implements b {

        /* renamed from: a, reason: collision with root package name */
        public final int f3039a;

        /* renamed from: b, reason: collision with root package name */
        public final int f3040b;

        public u(int i12, int i13) {
            this.f3039a = i12;
            this.f3040b = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof u)) {
                return false;
            }
            u uVar = (u) obj;
            return this.f3039a == uVar.f3039a && this.f3040b == uVar.f3040b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f3040b) + (Integer.hashCode(this.f3039a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UpdateCallsCount(callsHistoryUnreadCounter=");
            sb2.append(this.f3039a);
            sb2.append(", callsTrackingUnreadCounter=");
            return androidx.appcompat.app.r.t(sb2, this.f3040b, ')');
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/b$v;", "LD90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class v implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f3041a;

        public v(@Y61.l String str) {
            this.f3041a = str;
        }
    }

    /* compiled from: ProfileProInternalAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/b$w;", "LD90/b;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class w implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ProfileTabUserType f3042a;

        public w(@Y61.k ProfileTabUserType profileTabUserType) {
            this.f3042a = profileTabUserType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof w) && this.f3042a == ((w) obj).f3042a;
        }

        public final int hashCode() {
            return this.f3042a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "UpdateUserType(userType=" + this.f3042a + ')';
        }
    }
}
