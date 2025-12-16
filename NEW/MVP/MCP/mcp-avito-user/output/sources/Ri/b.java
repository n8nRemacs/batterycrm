package RI;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ParametrizedEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kv.C43501a;

/* compiled from: HotelBookingAction.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000f\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0082\u0001\u000f\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u001e\u001f¨\u0006 "}, d2 = {"LRI/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "LRI/b$a;", "LRI/b$b;", "LRI/b$c;", "LRI/b$d;", "LRI/b$e;", "LRI/b$f;", "LRI/b$g;", "LRI/b$h;", "LRI/b$i;", "LRI/b$j;", "LRI/b$k;", "LRI/b$l;", "LRI/b$m;", "LRI/b$n;", "LRI/b$o;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface b {

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/b$a;", "LRI/b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ParametrizedEvent f14267a;

        public a(@Y61.k ParametrizedEvent parametrizedEvent) {
            this.f14267a = parametrizedEvent;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f14267a, ((a) obj).f14267a);
        }

        public final int hashCode() {
            return this.f14267a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.advert.item.delivery_suggests.l.q(new StringBuilder("AnalyticsShowItemVisible(onShowEvent="), this.f14267a, ')');
        }
    }

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRI/b$b;", "LRI/b;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: RI.b$b, reason: collision with other inner class name */
    public static final /* data */ class C0948b implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C0948b f14268a = new C0948b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C0948b);
        }

        public final int hashCode() {
            return 1408169408;
        }

        @Y61.k
        public final String toString() {
            return "BackClick";
        }
    }

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRI/b$c;", "LRI/b;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f14269a = new c();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 511413290;
        }

        @Y61.k
        public final String toString() {
            return "BookingFloatingDescriptionClick";
        }
    }

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/b$d;", "LRI/b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f14270a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Boolean f14271b;

        public d(@Y61.l String str, @Y61.l Boolean bool) {
            this.f14270a = str;
            this.f14271b = bool;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f14270a, dVar.f14270a) && L.f(this.f14271b, dVar.f14271b);
        }

        public final int hashCode() {
            String str = this.f14270a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f14271b;
            return iHashCode + (bool != null ? bool.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CheckboxClick(parameterId=");
            sb2.append(this.f14270a);
            sb2.append(", newValue=");
            return C0.g(sb2, this.f14271b, ')');
        }
    }

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRI/b$e;", "LRI/b;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final e f14272a = new e();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 1892308428;
        }

        @Y61.k
        public final String toString() {
            return "CreateBookingClick";
        }
    }

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/b$f;", "LRI/b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f14273a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f14274b;

        public f(@Y61.k DeepLink deepLink, @Y61.l String str) {
            this.f14273a = deepLink;
            this.f14274b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f14273a, fVar.f14273a) && L.f(this.f14274b, fVar.f14274b);
        }

        public final int hashCode() {
            int iHashCode = this.f14273a.hashCode() * 31;
            String str = this.f14274b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DeeplinkClick(deeplink=");
            sb2.append(this.f14273a);
            sb2.append(", parameterId=");
            return C22026a.c(sb2, this.f14274b, ')');
        }

        public /* synthetic */ f(DeepLink deepLink, String str, int i12, C42822w c42822w) {
            this(deepLink, (i12 & 2) != 0 ? null : str);
        }
    }

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/b$g;", "LRI/b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C43501a f14275a;

        public g(@Y61.k C43501a c43501a) {
            this.f14275a = c43501a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f14275a, ((g) obj).f14275a);
        }

        public final int hashCode() {
            return this.f14275a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "DeeplinkResultEventHandle(event=" + this.f14275a + ')';
        }
    }

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/b$h;", "LRI/b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f14276a;

        public h(@Y61.l String str) {
            this.f14276a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f14276a, ((h) obj).f14276a);
        }

        public final int hashCode() {
            String str = this.f14276a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("InputFocusCleared(parameterId="), this.f14276a, ')');
        }
    }

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/b$i;", "LRI/b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f14277a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f14278b;

        public i(@Y61.l String str, @Y61.l String str2) {
            this.f14277a = str;
            this.f14278b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f14277a, iVar.f14277a) && L.f(this.f14278b, iVar.f14278b);
        }

        public final int hashCode() {
            String str = this.f14277a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f14278b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InputTextChange(parameterId=");
            sb2.append(this.f14277a);
            sb2.append(", newValue=");
            return C22026a.c(sb2, this.f14278b, ')');
        }
    }

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/b$j;", "LRI/b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f14279a;

        public j(boolean z12) {
            this.f14279a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f14279a == ((j) obj).f14279a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f14279a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("KeyboardVisibilityChanged(isVisible="), this.f14279a, ')');
        }
    }

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/b$k;", "LRI/b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f14280a;

        public k(@Y61.l String str) {
            this.f14280a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && L.f(this.f14280a, ((k) obj).f14280a);
        }

        public final int hashCode() {
            String str = this.f14280a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("PaymentPlanAttached(parameterId="), this.f14280a, ')');
        }
    }

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/b$l;", "LRI/b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f14281a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f14282b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f14283c;

        public l(@Y61.l String str, @Y61.l String str2, @Y61.k String str3) {
            this.f14281a = str;
            this.f14282b = str2;
            this.f14283c = str3;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return L.f(this.f14281a, lVar.f14281a) && L.f(this.f14282b, lVar.f14282b) && L.f(this.f14283c, lVar.f14283c);
        }

        public final int hashCode() {
            String str = this.f14281a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f14282b;
            return this.f14283c.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PaymentPlanSelected(parameterId=");
            sb2.append(this.f14281a);
            sb2.append(", buttonName=");
            sb2.append(this.f14282b);
            sb2.append(", planId=");
            return C22026a.c(sb2, this.f14283c, ')');
        }
    }

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/b$m;", "LRI/b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f14284a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f14285b;

        public m(@Y61.l String str, @Y61.k String str2) {
            this.f14284a = str;
            this.f14285b = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof m)) {
                return false;
            }
            m mVar = (m) obj;
            return L.f(this.f14284a, mVar.f14284a) && L.f(this.f14285b, mVar.f14285b);
        }

        public final int hashCode() {
            String str = this.f14284a;
            return this.f14285b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("RadioOptionClick(parameterId=");
            sb2.append(this.f14284a);
            sb2.append(", valueId=");
            return C22026a.c(sb2, this.f14285b, ')');
        }
    }

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LRI/b$n;", "LRI/b;", "<init>", "()V", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f14286a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 1908247233;
        }

        @Y61.k
        public final String toString() {
            return "RetryClick";
        }
    }

    /* compiled from: HotelBookingAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LRI/b$o;", "LRI/b;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f14287a;

        public o(@Y61.k DeepLink deepLink) {
            this.f14287a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f14287a, ((o) obj).f14287a);
        }

        public final int hashCode() {
            return this.f14287a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("UnavailableActionClick(deeplink="), this.f14287a, ')');
        }
    }
}
