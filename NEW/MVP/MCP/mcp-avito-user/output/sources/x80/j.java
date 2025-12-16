package X80;

import X80.c;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriodAction;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PeriodInfoState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LX80/j;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class j extends q {

    /* renamed from: b, reason: collision with root package name */
    public final long f18710b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f18711c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PositionInfoPeriodAction f18712d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final a f18713e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final c f18714f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Set<String> f18715g;

    /* compiled from: PeriodInfoState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LX80/j$a;", "", "a", "b", "LX80/j$a$a;", "LX80/j$a$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {

        /* compiled from: PeriodInfoState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX80/j$a$a;", "LX80/j$a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: X80.j$a$a, reason: collision with other inner class name */
        public static final /* data */ class C1322a implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final C1322a f18716a = new C1322a();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof C1322a);
            }

            public final int hashCode() {
                return 598639813;
            }

            @Y61.k
            public final String toString() {
                return "ByDefault";
            }
        }

        /* compiled from: PeriodInfoState.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX80/j$a$b;", "LX80/j$a;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* renamed from: a, reason: collision with root package name */
            @Y61.k
            public static final b f18717a = new b();

            public final boolean equals(@Y61.l Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 240396022;
            }

            @Y61.k
            public final String toString() {
                return "ByLazyInitAction";
            }
        }
    }

    public j(long j12, String str, PositionInfoPeriodAction positionInfoPeriodAction, a aVar, c cVar, Set set, int i12, C42822w c42822w) {
        this(j12, str, (i12 & 4) != 0 ? PositionInfoPeriodAction.f220478b : positionInfoPeriodAction, (i12 & 8) != 0 ? a.C1322a.f18716a : aVar, (i12 & 16) != 0 ? c.d.f18684a : cVar, (i12 & 32) != 0 ? B0.f406639b : set);
    }

    public static j a(j jVar, String str, PositionInfoPeriodAction positionInfoPeriodAction, c cVar, Set set, int i12) {
        long j12 = jVar.f18710b;
        if ((i12 & 2) != 0) {
            str = jVar.f18711c;
        }
        String str2 = str;
        if ((i12 & 4) != 0) {
            positionInfoPeriodAction = jVar.f18712d;
        }
        PositionInfoPeriodAction positionInfoPeriodAction2 = positionInfoPeriodAction;
        a aVar = jVar.f18713e;
        if ((i12 & 16) != 0) {
            cVar = jVar.f18714f;
        }
        c cVar2 = cVar;
        if ((i12 & 32) != 0) {
            set = jVar.f18715g;
        }
        jVar.getClass();
        return new j(j12, str2, positionInfoPeriodAction2, aVar, cVar2, set);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f18710b == jVar.f18710b && L.f(this.f18711c, jVar.f18711c) && this.f18712d == jVar.f18712d && L.f(this.f18713e, jVar.f18713e) && L.f(this.f18714f, jVar.f18714f) && L.f(this.f18715g, jVar.f18715g);
    }

    public final int hashCode() {
        return this.f18715g.hashCode() + ((this.f18714f.hashCode() + ((this.f18713e.hashCode() + ((this.f18712d.hashCode() + H.d(Long.hashCode(this.f18710b) * 31, 31, this.f18711c)) * 31)) * 31)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PeriodInfoState(itemId=");
        sb2.append(this.f18710b);
        sb2.append(", periodId=");
        sb2.append(this.f18711c);
        sb2.append(", lastActionType=");
        sb2.append(this.f18712d);
        sb2.append(", initStrategy=");
        sb2.append(this.f18713e);
        sb2.append(", infoData=");
        sb2.append(this.f18714f);
        sb2.append(", closedBanners=");
        return AK.c.u(sb2, this.f18715g, ')');
    }

    public j(long j12, @Y61.k String str, @Y61.k PositionInfoPeriodAction positionInfoPeriodAction, @Y61.k a aVar, @Y61.k c cVar, @Y61.k Set<String> set) {
        this.f18710b = j12;
        this.f18711c = str;
        this.f18712d = positionInfoPeriodAction;
        this.f18713e = aVar;
        this.f18714f = cVar;
        this.f18715g = set;
    }
}
