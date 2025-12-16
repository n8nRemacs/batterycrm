package c90;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PositionInSearchAction.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lc90/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Lc90/a$a;", "Lc90/a$b;", "Lc90/a$c;", "Lc90/a$d;", "Lc90/a$e;", "Lc90/a$f;", "Lc90/a$g;", "Lc90/a$h;", "Lc90/a$i;", "Lc90/a$j;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: c90.a, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public interface InterfaceC26960a {

    /* compiled from: PositionInSearchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc90/a$a;", "Lc90/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.a$a, reason: collision with other inner class name */
    public static final /* data */ class C2032a implements InterfaceC26960a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C2032a f57687a = new C2032a();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C2032a);
        }

        public final int hashCode() {
            return -412769413;
        }

        @k
        public final String toString() {
            return "BannerActionClick";
        }
    }

    /* compiled from: PositionInSearchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc90/a$b;", "Lc90/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.a$b */
    public static final /* data */ class b implements InterfaceC26960a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f57688a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 2089949901;
        }

        @k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: PositionInSearchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/a$d;", "Lc90/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.a$d */
    public static final /* data */ class d implements InterfaceC26960a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f57691a;

        public d(@k DeepLink deepLink) {
            this.f57691a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f57691a, ((d) obj).f57691a);
        }

        public final int hashCode() {
            return this.f57691a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeepLinkClick(deeplink="), this.f57691a, ')');
        }
    }

    /* compiled from: PositionInSearchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/a$e;", "Lc90/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.a$e */
    public static final /* data */ class e implements InterfaceC26960a {

        /* renamed from: a, reason: collision with root package name */
        public final int f57692a;

        public e(int i12) {
            this.f57692a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f57692a == ((e) obj).f57692a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57692a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("DisabledPeriodClick(position="), this.f57692a, ')');
        }
    }

    /* compiled from: PositionInSearchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/a$f;", "Lc90/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.a$f */
    public static final /* data */ class f implements InterfaceC26960a {
        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @k
        public final String toString() {
            return "ExpandQueryItem(deeplink=null)";
        }
    }

    /* compiled from: PositionInSearchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/a$g;", "Lc90/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.a$g */
    public static final /* data */ class g implements InterfaceC26960a {

        /* renamed from: a, reason: collision with root package name */
        public final long f57693a;

        public g(long j12) {
            this.f57693a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f57693a == ((g) obj).f57693a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f57693a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("NextPage(nextPageOffset="), this.f57693a, ')');
        }
    }

    /* compiled from: PositionInSearchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/a$h;", "Lc90/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.a$h */
    public static final /* data */ class h implements InterfaceC26960a {

        /* renamed from: a, reason: collision with root package name */
        public final int f57694a;

        public h(int i12) {
            this.f57694a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f57694a == ((h) obj).f57694a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f57694a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("PeriodClick(position="), this.f57694a, ')');
        }
    }

    /* compiled from: PositionInSearchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc90/a$i;", "Lc90/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.a$i */
    public static final /* data */ class i implements InterfaceC26960a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final i f57695a = new i();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 2103598973;
        }

        @k
        public final String toString() {
            return "Retry";
        }
    }

    /* compiled from: PositionInSearchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lc90/a$j;", "Lc90/a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.a$j */
    public static final /* data */ class j implements InterfaceC26960a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final j f57696a = new j();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1049784222;
        }

        @k
        public final String toString() {
            return "RetryPeriod";
        }
    }

    /* compiled from: PositionInSearchAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc90/a$c;", "Lc90/a;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: c90.a$c */
    public static final /* data */ class c implements InterfaceC26960a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f57689a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f57690b;

        public c(@k String str, boolean z12) {
            this.f57689a = str;
            this.f57690b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f57689a, cVar.f57689a) && this.f57690b == cVar.f57690b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f57690b) + (this.f57689a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CloseBanner(bannerId=");
            sb2.append(this.f57689a);
            sb2.append(", isAdviceBanner=");
            return r.x(sb2, this.f57690b, ')');
        }

        public /* synthetic */ c(String str, boolean z12, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? false : z12);
        }
    }
}
