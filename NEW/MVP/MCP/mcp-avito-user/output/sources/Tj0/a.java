package TJ0;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.user_stats.extended_user_stats.StatsConfig;
import com.avito.android.user_stats.extended_user_stats.tabs.reports_constructor.split.SplitListDialogItem;
import com.avito.user_stats.model.extended_user_stats.Hint;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ConstructorTabOneTimeEvent.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u000e\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0082\u0001\u000e\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, d2 = {"LTJ0/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "LTJ0/a$a;", "LTJ0/a$b;", "LTJ0/a$c;", "LTJ0/a$d;", "LTJ0/a$e;", "LTJ0/a$f;", "LTJ0/a$g;", "LTJ0/a$h;", "LTJ0/a$i;", "LTJ0/a$j;", "LTJ0/a$k;", "LTJ0/a$l;", "LTJ0/a$m;", "LTJ0/a$n;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a {

    /* compiled from: ConstructorTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTJ0/a$a;", "LTJ0/a;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: TJ0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C1061a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f15576a;

        public C1061a(@Y61.k DeepLink deepLink) {
            this.f15576a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1061a) && L.f(this.f15576a, ((C1061a) obj).f15576a);
        }

        public final int hashCode() {
            return this.f15576a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("HandleDeeplink(deepLink="), this.f15576a, ')');
        }
    }

    /* compiled from: ConstructorTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTJ0/a$b;", "LTJ0/a;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final Hint f15577a;

        public b(@Y61.k Hint hint) {
            this.f15577a = hint;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && L.f(this.f15577a, ((b) obj).f15577a);
        }

        public final int hashCode() {
            return this.f15577a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OnMetricHintClick(hint=" + this.f15577a + ')';
        }
    }

    /* compiled from: ConstructorTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTJ0/a$c;", "LTJ0/a;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final List<SplitListDialogItem> f15578a;

        public c(@Y61.l List<SplitListDialogItem> list) {
            this.f15578a = list;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f15578a, ((c) obj).f15578a);
        }

        public final int hashCode() {
            List<SplitListDialogItem> list = this.f15578a;
            if (list == null) {
                return 0;
            }
            return list.hashCode();
        }

        @Y61.k
        public final String toString() {
            return H.p(new StringBuilder("OpenSplit(items="), this.f15578a, ')');
        }
    }

    /* compiled from: ConstructorTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTJ0/a$d;", "LTJ0/a;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f15579a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 2017407157;
        }

        @Y61.k
        public final String toString() {
            return "ReloadWeekItems";
        }
    }

    /* compiled from: ConstructorTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTJ0/a$e;", "LTJ0/a;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f15580a;

        public e(@Y61.l String str) {
            this.f15580a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f15580a, ((e) obj).f15580a);
        }

        public final int hashCode() {
            String str = this.f15580a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("SelectedPeriod(period="), this.f15580a, ')');
        }
    }

    /* compiled from: ConstructorTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTJ0/a$f;", "LTJ0/a;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final StatsConfig f15581a;

        public f(@Y61.l StatsConfig statsConfig) {
            this.f15581a = statsConfig;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f15581a, ((f) obj).f15581a);
        }

        public final int hashCode() {
            StatsConfig statsConfig = this.f15581a;
            if (statsConfig == null) {
                return 0;
            }
            return statsConfig.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "SendConfig(config=" + this.f15581a + ')';
        }
    }

    /* compiled from: ConstructorTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTJ0/a$g;", "LTJ0/a;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f15582a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return 1369726948;
        }

        @Y61.k
        public final String toString() {
            return "ShowABUxFeedback";
        }
    }

    /* compiled from: ConstructorTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTJ0/a$h;", "LTJ0/a;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f15583a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 1455813880;
        }

        @Y61.k
        public final String toString() {
            return "ShowEmptyTodayToast";
        }
    }

    /* compiled from: ConstructorTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTJ0/a$i;", "LTJ0/a;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final AttributedText f15584a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final AttributedText f15585b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final DeepLink f15586c;

        public i(@Y61.l DeepLink deepLink, @Y61.l AttributedText attributedText, @Y61.l AttributedText attributedText2) {
            this.f15584a = attributedText;
            this.f15585b = attributedText2;
            this.f15586c = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f15584a, iVar.f15584a) && L.f(this.f15585b, iVar.f15585b) && L.f(this.f15586c, iVar.f15586c);
        }

        public final int hashCode() {
            AttributedText attributedText = this.f15584a;
            int iHashCode = (attributedText == null ? 0 : attributedText.hashCode()) * 31;
            AttributedText attributedText2 = this.f15585b;
            int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
            DeepLink deepLink = this.f15586c;
            return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowErrorToastBar(title=");
            sb2.append(this.f15584a);
            sb2.append(", textButton=");
            sb2.append(this.f15585b);
            sb2.append(", deepLink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f15586c, ')');
        }
    }

    /* compiled from: ConstructorTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTJ0/a$j;", "LTJ0/a;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f15587a;

        public j(@Y61.k String str) {
            this.f15587a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && L.f(this.f15587a, ((j) obj).f15587a);
        }

        public final int hashCode() {
            return this.f15587a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowHintDialog(text="), this.f15587a, ')');
        }
    }

    /* compiled from: ConstructorTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTJ0/a$k;", "LTJ0/a;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final k f15588a = new k();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof k);
        }

        public final int hashCode() {
            return 2028377958;
        }

        @Y61.k
        public final String toString() {
            return "ShowOneStatsOpenUxFeedback";
        }
    }

    /* compiled from: ConstructorTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LTJ0/a$l;", "LTJ0/a;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f15589a;

        public l(@Y61.l String str) {
            this.f15589a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && L.f(this.f15589a, ((l) obj).f15589a);
        }

        public final int hashCode() {
            String str = this.f15589a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ShowSplitUxFeedback(type="), this.f15589a, ')');
        }
    }

    /* compiled from: ConstructorTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTJ0/a$m;", "LTJ0/a;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final m f15590a = new m();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof m);
        }

        public final int hashCode() {
            return -850085817;
        }

        @Y61.k
        public final String toString() {
            return "ShowUxFbSpaces";
        }
    }

    /* compiled from: ConstructorTabOneTimeEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LTJ0/a$n;", "LTJ0/a;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class n implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final n f15591a = new n();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof n);
        }

        public final int hashCode() {
            return 99744600;
        }

        @Y61.k
        public final String toString() {
            return "ShowVisitUxFeedback";
        }
    }
}
