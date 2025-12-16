package eb;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.advert_stats.detail.tab.AdvertDetailStatsTabItem;
import com.avito.android.advert_stats.detail.tab.items.chart.StatsBarItem;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StatsItemTabAction.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t\u0082\u0001\b\n\u000b\f\r\u000e\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Leb/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "Leb/a$a;", "Leb/a$b;", "Leb/a$c;", "Leb/a$d;", "Leb/a$e;", "Leb/a$f;", "Leb/a$g;", "Leb/a$h;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eb.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC40078a {

    /* compiled from: StatsItemTabAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leb/a$a;", "Leb/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eb.a$a, reason: collision with other inner class name */
    public static final /* data */ class C11090a implements InterfaceC40078a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final StatsBarItem f395234a;

        public C11090a(@k StatsBarItem statsBarItem) {
            this.f395234a = statsBarItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C11090a) && L.f(this.f395234a, ((C11090a) obj).f395234a);
        }

        public final int hashCode() {
            return this.f395234a.hashCode();
        }

        @k
        public final String toString() {
            return "BarSelected(barItem=" + this.f395234a + ')';
        }
    }

    /* compiled from: StatsItemTabAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leb/a$b;", "Leb/a;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eb.a$b */
    public static final /* data */ class b implements InterfaceC40078a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final b f395235a = new b();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 467743114;
        }

        @k
        public final String toString() {
            return "DialogClick";
        }
    }

    /* compiled from: StatsItemTabAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leb/a$c;", "Leb/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eb.a$c */
    public static final /* data */ class c implements InterfaceC40078a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DeepLink f395236a;

        public c(@k DeepLink deepLink) {
            this.f395236a = deepLink;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f395236a, ((c) obj).f395236a);
        }

        public final int hashCode() {
            return this.f395236a.hashCode();
        }

        @k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DialogLinkClick(deeplink="), this.f395236a, ')');
        }
    }

    /* compiled from: StatsItemTabAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leb/a$d;", "Leb/a;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eb.a$d */
    public static final /* data */ class d implements InterfaceC40078a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final d f395237a = new d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 132238300;
        }

        @k
        public final String toString() {
            return "FunnelClick";
        }
    }

    /* compiled from: StatsItemTabAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leb/a$e;", "Leb/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eb.a$e */
    public static final /* data */ class e implements InterfaceC40078a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final AdvertDetailStatsTabItem f395238a;

        public e(@l AdvertDetailStatsTabItem advertDetailStatsTabItem) {
            this.f395238a = advertDetailStatsTabItem;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f395238a, ((e) obj).f395238a);
        }

        public final int hashCode() {
            AdvertDetailStatsTabItem advertDetailStatsTabItem = this.f395238a;
            if (advertDetailStatsTabItem == null) {
                return 0;
            }
            return advertDetailStatsTabItem.hashCode();
        }

        @k
        public final String toString() {
            return "SetTabData(item=" + this.f395238a + ')';
        }
    }

    /* compiled from: StatsItemTabAction.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Leb/a$f;", "Leb/a;", "<init>", "()V", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eb.a$f */
    public static final /* data */ class f implements InterfaceC40078a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final f f395239a = new f();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -2026643144;
        }

        @k
        public final String toString() {
            return "UnselectBarItems";
        }
    }

    /* compiled from: StatsItemTabAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leb/a$g;", "Leb/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eb.a$g */
    public static final /* data */ class g implements InterfaceC40078a {

        /* renamed from: a, reason: collision with root package name */
        public final long f395240a;

        public g(long j12) {
            this.f395240a = j12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.f395240a == ((g) obj).f395240a;
        }

        public final int hashCode() {
            return Long.hashCode(this.f395240a);
        }

        @k
        public final String toString() {
            return r.u(new StringBuilder("UpdatePeriodSelection(fromPeriod="), this.f395240a, ')');
        }
    }

    /* compiled from: StatsItemTabAction.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Leb/a$h;", "Leb/a;", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: eb.a$h */
    public static final /* data */ class h implements InterfaceC40078a {

        /* renamed from: a, reason: collision with root package name */
        public final int f395241a;

        public h(int i12) {
            this.f395241a = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.f395241a == ((h) obj).f395241a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f395241a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("WeekSelected(week="), this.f395241a, ')');
        }
    }
}
