package X80;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PeriodInfoAction.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0010\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0082\u0001\u0002\u0012\u0013¨\u0006\u0014"}, d2 = {"LX80/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "LX80/b$c;", "LX80/b$g;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: PeriodInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/b$a;", "LX80/b$c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f18656a;

        public a(@Y61.k String str) {
            this.f18656a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f18656a, ((a) obj).f18656a);
        }

        public final int hashCode() {
            return this.f18656a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("BannerClicked(bannerId="), this.f18656a, ')');
        }
    }

    /* compiled from: PeriodInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/b$b;", "LX80/b$c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: X80.b$b, reason: collision with other inner class name */
    public static final /* data */ class C1320b implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f18657a;

        public C1320b(@Y61.k String str) {
            this.f18657a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1320b) && L.f(this.f18657a, ((C1320b) obj).f18657a);
        }

        public final int hashCode() {
            return this.f18657a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("BannerClosed(bannerId="), this.f18657a, ')');
        }
    }

    /* compiled from: PeriodInfoAction.kt */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\t\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"LX80/b$c;", "LX80/b;", "LX80/b$a;", "LX80/b$b;", "LX80/b$d;", "LX80/b$e;", "LX80/b$j;", "LX80/b$k;", "LX80/b$m;", "LX80/b$n;", "LX80/b$o;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface c extends b {
    }

    /* compiled from: PeriodInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/b$d;", "LX80/b$c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final DeepLink f18658a;

        public d(@Y61.l DeepLink deepLink) {
            this.f18658a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f18658a, ((d) obj).f18658a);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f18658a;
            if (deepLink == null) {
                return 0;
            }
            return deepLink.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("EventDeepLinkClick(deepLink="), this.f18658a, ')');
        }
    }

    /* compiled from: PeriodInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/b$e;", "LX80/b$c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f18659a;

        public e(@Y61.k String str) {
            this.f18659a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f18659a, ((e) obj).f18659a);
        }

        public final int hashCode() {
            return this.f18659a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ExpandQueryItem(queryId="), this.f18659a, ')');
        }
    }

    /* compiled from: PeriodInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX80/b$f;", "LX80/b$g;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f18660a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1566622113;
        }

        @Y61.k
        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: PeriodInfoAction.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001\u0082\u0001\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"LX80/b$g;", "LX80/b;", "LX80/b$f;", "LX80/b$h;", "LX80/b$i;", "LX80/b$l;", "LX80/b$p;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface g extends b {
    }

    /* compiled from: PeriodInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX80/b$h;", "LX80/b$g;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f18661a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -283686415;
        }

        @Y61.k
        public final String toString() {
            return "NextPage";
        }
    }

    /* compiled from: PeriodInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/b$i;", "LX80/b$g;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f18662a;

        public i(@Y61.k String str) {
            this.f18662a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f18662a, ((i) obj).f18662a);
        }

        public final int hashCode() {
            return this.f18662a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("PeriodSelected(periodId="), this.f18662a, ')');
        }
    }

    /* compiled from: PeriodInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/b$j;", "LX80/b$c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f18663a;

        public j(@Y61.k DeepLink deepLink) {
            this.f18663a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f18663a, ((j) obj).f18663a);
        }

        public final int hashCode() {
            return this.f18663a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("PositionInfoDeepLinkClick(deepLink="), this.f18663a, ')');
        }
    }

    /* compiled from: PeriodInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/b$k;", "LX80/b$c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f18664a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final DeepLink f18665b;

        public k(@Y61.k String str, @Y61.k DeepLink deepLink) {
            this.f18664a = str;
            this.f18665b = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return L.f(this.f18664a, kVar.f18664a) && L.f(this.f18665b, kVar.f18665b);
        }

        public final int hashCode() {
            return this.f18665b.hashCode() + (this.f18664a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("QueryItemDeepLinkClick(queryId=");
            sb2.append(this.f18664a);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f18665b, ')');
        }
    }

    /* compiled from: PeriodInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX80/b$l;", "LX80/b$g;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final l f18666a = new l();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof l);
        }

        public final int hashCode() {
            return -2035858648;
        }

        @Y61.k
        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: PeriodInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX80/b$m;", "LX80/b$c;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f18667a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -1445178725;
        }

        @Y61.k
        public final String toString() {
            return "SortClick";
        }
    }

    /* compiled from: PeriodInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX80/b$n;", "LX80/b$c;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f18668a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 2033327510;
        }

        @Y61.k
        public final String toString() {
            return "SortDirectionClick";
        }
    }

    /* compiled from: PeriodInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/b$o;", "LX80/b$c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class o implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f18669a;

        public o(@Y61.k String str) {
            this.f18669a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof o) && L.f(this.f18669a, ((o) obj).f18669a);
        }

        public final int hashCode() {
            return this.f18669a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ToastClosed(toastId="), this.f18669a, ')');
        }
    }

    /* compiled from: PeriodInfoAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/b$p;", "LX80/b$g;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class p implements g {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f18670a;

        public p(@Y61.k String str) {
            this.f18670a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof p) && L.f(this.f18670a, ((p) obj).f18670a);
        }

        public final int hashCode() {
            return this.f18670a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ToastReload(toastId="), this.f18670a, ')');
        }
    }
}
