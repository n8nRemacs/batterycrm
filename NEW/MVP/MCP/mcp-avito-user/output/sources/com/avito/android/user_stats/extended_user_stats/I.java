package com.avito.android.user_stats.extended_user_stats;

import androidx.compose.runtime.C22026a;
import com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsViewModel;
import com.avito.android.user_stats.extended_user_stats.metrics.item.DataMetrics;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RouteConfigEvent.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\n\u0004\u0005\u0006\u0007\b\t\n\u000b\f\rB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/I;", "", "<init>", "()V", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "Lcom/avito/android/user_stats/extended_user_stats/I$a;", "Lcom/avito/android/user_stats/extended_user_stats/I$b;", "Lcom/avito/android/user_stats/extended_user_stats/I$c;", "Lcom/avito/android/user_stats/extended_user_stats/I$d;", "Lcom/avito/android/user_stats/extended_user_stats/I$e;", "Lcom/avito/android/user_stats/extended_user_stats/I$f;", "Lcom/avito/android/user_stats/extended_user_stats/I$g;", "Lcom/avito/android/user_stats/extended_user_stats/I$h;", "Lcom/avito/android/user_stats/extended_user_stats/I$i;", "Lcom/avito/android/user_stats/extended_user_stats/I$j;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class I {

    /* compiled from: RouteConfigEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/I$a;", "Lcom/avito/android/user_stats/extended_user_stats/I;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a extends I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final StatsConfig f317134a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f317135b;

        public a(@Y61.k StatsConfig statsConfig, @Y61.l String str) {
            super(null);
            this.f317134a = statsConfig;
            this.f317135b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f317134a, aVar.f317134a) && L.f(this.f317135b, aVar.f317135b);
        }

        public final int hashCode() {
            int iHashCode = this.f317134a.hashCode() * 31;
            String str = this.f317135b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ChangeConfig(config=");
            sb2.append(this.f317134a);
            sb2.append(", reqKey=");
            return C22026a.c(sb2, this.f317135b, ')');
        }
    }

    /* compiled from: RouteConfigEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/I$b;", "Lcom/avito/android/user_stats/extended_user_stats/I;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b extends I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final b f317136a = new b();

        public b() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -327359928;
        }

        @Y61.k
        public final String toString() {
            return "CleanDateExpenses";
        }
    }

    /* compiled from: RouteConfigEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/I$c;", "Lcom/avito/android/user_stats/extended_user_stats/I;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c extends I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final c f317137a = new c();

        public c() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 414742141;
        }

        @Y61.k
        public final String toString() {
            return "NeedShowMetricsToolTip";
        }
    }

    /* compiled from: RouteConfigEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/I$d;", "Lcom/avito/android/user_stats/extended_user_stats/I;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d extends I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ExtendedUserStatsViewModel.a f317138a;

        public d(@Y61.k ExtendedUserStatsViewModel.a aVar) {
            super(null);
            this.f317138a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && L.f(this.f317138a, ((d) obj).f317138a);
        }

        public final int hashCode() {
            return this.f317138a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenCalendar(calendarState=" + this.f317138a + ')';
        }
    }

    /* compiled from: RouteConfigEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/I$e;", "Lcom/avito/android/user_stats/extended_user_stats/I;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e extends I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final com.avito.android.user_stats.extended_user_stats.list_search_dialog.a f317139a;

        public e(@Y61.k com.avito.android.user_stats.extended_user_stats.list_search_dialog.a aVar) {
            super(null);
            this.f317139a = aVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && L.f(this.f317139a, ((e) obj).f317139a);
        }

        public final int hashCode() {
            return this.f317139a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenExtendedBottomSheet(data=" + this.f317139a + ')';
        }
    }

    /* compiled from: RouteConfigEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/I$f;", "Lcom/avito/android/user_stats/extended_user_stats/I;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f extends I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DataMetrics f317140a;

        public f(@Y61.k DataMetrics dataMetrics) {
            super(null);
            this.f317140a = dataMetrics;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && L.f(this.f317140a, ((f) obj).f317140a);
        }

        public final int hashCode() {
            return this.f317140a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return "OpenMetricBottomSheet(data=" + this.f317140a + ')';
        }
    }

    /* compiled from: RouteConfigEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/I$g;", "Lcom/avito/android/user_stats/extended_user_stats/I;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g extends I {
        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            ((g) obj).getClass();
            return L.f(null, null);
        }

        public final int hashCode() {
            throw null;
        }

        @Y61.k
        public final String toString() {
            return "OpenSelectBottomSheet(arguments=null, reqKey=0)";
        }
    }

    /* compiled from: RouteConfigEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/I$h;", "Lcom/avito/android/user_stats/extended_user_stats/I;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h extends I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final h f317141a = new h();

        public h() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return -574576318;
        }

        @Y61.k
        public final String toString() {
            return "OpenSpacesToolTip";
        }
    }

    /* compiled from: RouteConfigEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/I$i;", "Lcom/avito/android/user_stats/extended_user_stats/I;", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i extends I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ArrayList f317142a;

        /* renamed from: b, reason: collision with root package name */
        public final int f317143b;

        public i(int i12, @Y61.k ArrayList arrayList) {
            super(null);
            this.f317142a = arrayList;
            this.f317143b = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f317142a, iVar.f317142a) && this.f317143b == iVar.f317143b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f317143b) + (this.f317142a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSpendingsBottomSheet(items=");
            sb2.append(this.f317142a);
            sb2.append(", dialogType=");
            return androidx.appcompat.app.r.t(sb2, this.f317143b, ')');
        }
    }

    /* compiled from: RouteConfigEvent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/I$j;", "Lcom/avito/android/user_stats/extended_user_stats/I;", "<init>", "()V", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j extends I {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final j f317144a = new j();

        public j() {
            super(null);
        }

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof j);
        }

        public final int hashCode() {
            return 1457784623;
        }

        @Y61.k
        public final String toString() {
            return "OpenToolTip";
        }
    }

    public /* synthetic */ I(C42822w c42822w) {
        this();
    }

    public I() {
    }
}
