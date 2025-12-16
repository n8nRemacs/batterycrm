package D90;

import B90.a;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.UserAddressLink;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.profile.pro.impl.interactor.ProfileProWidgetsParams;
import com.avito.android.service_booking_user_profile.view.model.ServiceBookingBlockParams;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProfileProOneTimeEvent.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"LD90/c;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "LD90/c$a;", "LD90/c$b;", "LD90/c$c;", "LD90/c$d;", "LD90/c$e;", "LD90/c$f;", "LD90/c$g;", "LD90/c$h;", "LD90/c$i;", "LD90/c$j;", "LD90/c$k;", "LD90/c$l;", "LD90/c$m;", "LD90/c$n;", "LD90/c$o;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public interface c {

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/c$a;", "LD90/c;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f3043a;

        public a(@Y61.k PrintableText printableText) {
            this.f3043a = printableText;
        }
    }

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/c$b;", "LD90/c;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final ServiceBookingBlockParams f3044a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final List<DeepLink> f3045b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final DeepLink f3046c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final ProfileProWidgetsParams.AvitoFinanceParams f3047d;

        /* JADX WARN: Multi-variable type inference failed */
        public b(@Y61.l ServiceBookingBlockParams serviceBookingBlockParams, @Y61.k List<? extends DeepLink> list, @Y61.l DeepLink deepLink, @Y61.l ProfileProWidgetsParams.AvitoFinanceParams avitoFinanceParams) {
            this.f3044a = serviceBookingBlockParams;
            this.f3045b = list;
            this.f3046c = deepLink;
            this.f3047d = avitoFinanceParams;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f3044a, bVar.f3044a) && L.f(this.f3045b, bVar.f3045b) && L.f(this.f3046c, bVar.f3046c) && L.f(this.f3047d, bVar.f3047d);
        }

        public final int hashCode() {
            int i12 = 0;
            ServiceBookingBlockParams serviceBookingBlockParams = this.f3044a;
            int iE2 = H.e((serviceBookingBlockParams == null ? 0 : serviceBookingBlockParams.hashCode()) * 31, 31, this.f3045b);
            DeepLink deepLink = this.f3046c;
            int iHashCode = (iE2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            ProfileProWidgetsParams.AvitoFinanceParams avitoFinanceParams = this.f3047d;
            if (avitoFinanceParams != null) {
                avitoFinanceParams.getClass();
                i12 = 1931230246;
            }
            return iHashCode + i12;
        }

        @Y61.k
        public final String toString() {
            return "LoadContent(sbParams=" + this.f3044a + ", uxFeedbackDeepLinks=" + this.f3045b + ", proDeclarationSuccessDeepLink=" + this.f3046c + ", avitoFinanceParams=" + this.f3047d + ')';
        }
    }

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/c$c;", "LD90/c;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: D90.c$c, reason: collision with other inner class name */
    public static final class C0154c implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f3048a;

        public C0154c(@Y61.k String str) {
            this.f3048a = str;
        }
    }

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/c$d;", "LD90/c;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f3049a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -463771119;
        }

        @Y61.k
        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/c$e;", "LD90/c;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f3050a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return -1623516553;
        }

        @Y61.k
        public final String toString() {
            return "LoadingError";
        }
    }

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/c$f;", "LD90/c;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class f implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f3051a;

        public f(@Y61.k DeepLink deepLink) {
            this.f3051a = deepLink;
        }
    }

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/c$g;", "LD90/c;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f3052a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 451634495;
        }

        @Y61.k
        public final String toString() {
            return "OpenEdit";
        }
    }

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/c$h;", "LD90/c;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f3053a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 911610072;
        }

        @Y61.k
        public final String toString() {
            return "OpenSettings";
        }
    }

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/c$i;", "LD90/c;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class i implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final a.c f3054a;

        public i(@Y61.k a.c cVar) {
            this.f3054a = cVar;
        }
    }

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/c$j;", "LD90/c;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f3055a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -2063747939;
        }

        @Y61.k
        public final String toString() {
            return "OpenTfaSettings";
        }
    }

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/c$k;", "LD90/c;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f3056a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 741691886;
        }

        @Y61.k
        public final String toString() {
            return "OpenWallet";
        }
    }

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/c$l;", "LD90/c;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f3057a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 661574284;
        }

        @Y61.k
        public final String toString() {
            return "ShowCallAnswerDialog";
        }
    }

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LD90/c$m;", "LD90/c;", "<init>", "()V", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f3058a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1279281232;
        }

        @Y61.k
        public final String toString() {
            return "ShowUxFeedback";
        }
    }

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/c$n;", "LD90/c;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final UserAddressLink.Result.Success f3059a;

        public n(@Y61.k UserAddressLink.Result.Success success) {
            this.f3059a = success;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof n) && L.f(this.f3059a, ((n) obj).f3059a);
        }

        public final int hashCode() {
            return this.f3059a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SuccessAddressToast(event=" + this.f3059a + ')';
        }
    }

    /* compiled from: ProfileProOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LD90/c$o;", "LD90/c;", "_avito_profile-pro_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PrintableText f3060a;

        public o(@Y61.k PrintableText printableText) {
            this.f3060a = printableText;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f3060a, ((o) obj).f3060a);
        }

        public final int hashCode() {
            return this.f3060a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return AK.c.m(new StringBuilder("SuccessToast(message="), this.f3060a, ')');
        }
    }
}
