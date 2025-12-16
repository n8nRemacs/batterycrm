package com.avito.android.competitor_analytics.mvi.entity;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.competitor_analytics.domain.model.StateType;
import com.avito.android.competitor_analytics.mvi.entity.b;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CompetitorAnalyticsAction.kt */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/a;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "Lcom/avito/android/competitor_analytics/mvi/entity/a$a;", "Lcom/avito/android/competitor_analytics/mvi/entity/a$b;", "Lcom/avito/android/competitor_analytics/mvi/entity/a$c;", "Lcom/avito/android/competitor_analytics/mvi/entity/a$d;", "Lcom/avito/android/competitor_analytics/mvi/entity/a$e;", "Lcom/avito/android/competitor_analytics/mvi/entity/a$f;", "Lcom/avito/android/competitor_analytics/mvi/entity/a$g;", "Lcom/avito/android/competitor_analytics/mvi/entity/a$h;", "Lcom/avito/android/competitor_analytics/mvi/entity/a$i;", "Lcom/avito/android/competitor_analytics/mvi/entity/a$j;", "Lcom/avito/android/competitor_analytics/mvi/entity/a$k;", "Lcom/avito/android/competitor_analytics/mvi/entity/a$l;", "Lcom/avito/android/competitor_analytics/mvi/entity/a$m;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CompetitorAnalyticsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/a$a;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "<init>", "()V", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.competitor_analytics.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3711a implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final C3711a f124456a = new C3711a();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof C3711a);
        }

        public final int hashCode() {
            return -2131395822;
        }

        @Y61.k
        public final String toString() {
            return "Back";
        }
    }

    /* compiled from: CompetitorAnalyticsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/a$b;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "<init>", "()V", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f124457a = new b();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1346886181;
        }

        @Y61.k
        public final String toString() {
            return "BannerActionClick";
        }
    }

    /* compiled from: CompetitorAnalyticsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/a$c;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final b.g f124458a;

        public c(@Y61.k b.g gVar) {
            this.f124458a = gVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f124458a, ((c) obj).f124458a);
        }

        public final int hashCode() {
            return this.f124458a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "ChartMetricClick(metrics=" + this.f124458a + ')';
        }
    }

    /* compiled from: CompetitorAnalyticsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/a$d;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f124459a;

        public d(@Y61.k String str) {
            this.f124459a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f124459a, ((d) obj).f124459a);
        }

        public final int hashCode() {
            return this.f124459a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChartOpen(slug="), this.f124459a, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/a$e;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f124460a;

        public e(@Y61.k String str) {
            this.f124460a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f124460a, ((e) obj).f124460a);
        }

        public final int hashCode() {
            return this.f124460a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("ChartPeriodClick(slug="), this.f124460a, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/a$f;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "<init>", "()V", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final f f124461a = new f();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1647497939;
        }

        @Y61.k
        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: CompetitorAnalyticsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/a$g;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "<init>", "()V", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final g f124462a = new g();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof g);
        }

        public final int hashCode() {
            return -1961213255;
        }

        @Y61.k
        public final String toString() {
            return "CloseBanner";
        }
    }

    /* compiled from: CompetitorAnalyticsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/a$h;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "<init>", "()V", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f124463a = new h();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 40831042;
        }

        @Y61.k
        public final String toString() {
            return "CompetitorAnalyticsShown";
        }
    }

    /* compiled from: CompetitorAnalyticsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/a$i;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f124464a;

        public i(@Y61.k DeepLink deepLink) {
            this.f124464a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && L.f(this.f124464a, ((i) obj).f124464a);
        }

        public final int hashCode() {
            return this.f124464a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("DeepLinkClick(deeplink="), this.f124464a, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/a$j;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f124465a;

        public j(int i12) {
            this.f124465a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.f124465a == ((j) obj).f124465a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f124465a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("DisabledPeriodClick(position="), this.f124465a, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/a$k;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class k implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f124466a;

        public k(int i12) {
            this.f124466a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.f124466a == ((k) obj).f124466a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f124466a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("PeriodClick(position="), this.f124466a, ')');
        }
    }

    /* compiled from: CompetitorAnalyticsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/a$l;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class l implements a {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final StateType f124467a;

        public l(@Y61.l StateType stateType) {
            this.f124467a = stateType;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && this.f124467a == ((l) obj).f124467a;
        }

        public final int hashCode() {
            StateType stateType = this.f124467a;
            if (stateType == null) {
                return 0;
            }
            return stateType.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "Retry(stateType=" + this.f124467a + ')';
        }
    }

    /* compiled from: CompetitorAnalyticsAction.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/competitor_analytics/mvi/entity/a$m;", "Lcom/avito/android/competitor_analytics/mvi/entity/a;", "_avito_competitor-analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class m implements a {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f124468a;

        public m(boolean z12) {
            this.f124468a = z12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && this.f124468a == ((m) obj).f124468a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f124468a);
        }

        @Y61.k
        public final String toString() {
            return r.x(new StringBuilder("SuggestsBlockClick(isExpanded="), this.f124468a, ')');
        }
    }
}
