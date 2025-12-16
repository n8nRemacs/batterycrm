package tz0;

import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.str_seller_orders.orders_filters.StrOrdersFiltersResult;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kv.C43501a;

/* compiled from: StrSellerOrdersAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Ltz0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Ltz0/a$a;", "Ltz0/a$b;", "Ltz0/a$c;", "Ltz0/a$d;", "Ltz0/a$e;", "Ltz0/a$f;", "Ltz0/a$g;", "Ltz0/a$h;", "Ltz0/a$i;", "Ltz0/a$j;", "Ltz0/a$k;", "Ltz0/a$l;", "Ltz0/a$m;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC48745a {

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltz0/a$a;", "Ltz0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12697a implements InterfaceC48745a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C12697a f439699a = new C12697a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C12697a);
        }

        public final int hashCode() {
            return 1222585111;
        }

        @Y61.k
        public final String toString() {
            return "BackClicked";
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltz0/a$b;", "Ltz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.a$b */
    public static final /* data */ class b implements InterfaceC48745a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f439700a;

        public b(@Y61.k DeepLink deepLink) {
            this.f439700a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f439700a, ((b) obj).f439700a);
        }

        public final int hashCode() {
            return this.f439700a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("BannerClicked(deepLink="), this.f439700a, ')');
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltz0/a$c;", "Ltz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.a$c */
    public static final /* data */ class c implements InterfaceC48745a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f439701a;

        public c(@Y61.k DeepLink deepLink) {
            this.f439701a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f439701a, ((c) obj).f439701a);
        }

        public final int hashCode() {
            return this.f439701a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("BookingInfoClicked(deepLink="), this.f439701a, ')');
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltz0/a$d;", "Ltz0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.a$d */
    public static final /* data */ class d implements InterfaceC48745a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f439702a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 1840181947;
        }

        @Y61.k
        public final String toString() {
            return "DeeplinkClosed";
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltz0/a$e;", "Ltz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.a$e */
    public static final /* data */ class e implements InterfaceC48745a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f439703a;

        public e(@Y61.k String str) {
            this.f439703a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f439703a, ((e) obj).f439703a);
        }

        public final int hashCode() {
            return this.f439703a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("FilterClicked(filterId="), this.f439703a, ')');
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltz0/a$f;", "Ltz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.a$f */
    public static final /* data */ class f implements InterfaceC48745a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final StrOrdersFiltersResult f439704a;

        public f(@Y61.l StrOrdersFiltersResult strOrdersFiltersResult) {
            this.f439704a = strOrdersFiltersResult;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f439704a, ((f) obj).f439704a);
        }

        public final int hashCode() {
            StrOrdersFiltersResult strOrdersFiltersResult = this.f439704a;
            if (strOrdersFiltersResult == null) {
                return 0;
            }
            return strOrdersFiltersResult.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "FiltersFragmentResultReceived(result=" + this.f439704a + ')';
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltz0/a$g;", "Ltz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.a$g */
    public static final /* data */ class g implements InterfaceC48745a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final C43501a f439705a;

        public g(@Y61.k C43501a c43501a) {
            this.f439705a = c43501a;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && L.f(this.f439705a, ((g) obj).f439705a);
        }

        public final int hashCode() {
            return this.f439705a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "HandleDeepLinkResult(result=" + this.f439705a + ')';
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltz0/a$h;", "Ltz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.a$h */
    public static final /* data */ class h implements InterfaceC48745a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f439706a;

        public h(@Y61.k DeepLink deepLink) {
            this.f439706a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && L.f(this.f439706a, ((h) obj).f439706a);
        }

        public final int hashCode() {
            return this.f439706a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("InfoBlockClicked(deepLink="), this.f439706a, ')');
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltz0/a$i;", "Ltz0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.a$i */
    public static final /* data */ class i implements InterfaceC48745a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final i f439707a = new i();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 975062844;
        }

        @Y61.k
        public final String toString() {
            return "RefreshSwiped";
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltz0/a$j;", "Ltz0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.a$j */
    public static final /* data */ class j implements InterfaceC48745a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f439708a = new j();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return -1160247018;
        }

        @Y61.k
        public final String toString() {
            return "RetryButtonClicked";
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltz0/a$k;", "Ltz0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.a$k */
    public static final /* data */ class k implements InterfaceC48745a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f439709a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 862946389;
        }

        @Y61.k
        public final String toString() {
            return "ScrolledToStubs";
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Ltz0/a$l;", "Ltz0/a;", "<init>", "()V", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.a$l */
    public static final /* data */ class l implements InterfaceC48745a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f439710a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return 2003515132;
        }

        @Y61.k
        public final String toString() {
            return "WebViewClosed";
        }
    }

    /* compiled from: StrSellerOrdersAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Ltz0/a$m;", "Ltz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: tz0.a$m */
    public static final /* data */ class m implements InterfaceC48745a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f439711a;

        public m(@Y61.k DeepLink deepLink) {
            this.f439711a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && L.f(this.f439711a, ((m) obj).f439711a);
        }

        public final int hashCode() {
            return this.f439711a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("WidgetClicked(deepLink="), this.f439711a, ')');
        }
    }
}
