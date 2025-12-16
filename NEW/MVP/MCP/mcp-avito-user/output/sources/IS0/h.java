package is0;

import Y61.k;
import Y61.l;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.konveyor.item_visibility_tracker.b;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VerticalWidgetVisibilityTrackerItem.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lis0/h;", "Lcom/avito/konveyor/item_visibility_tracker/b$b;", "b", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface h extends b.InterfaceC10495b {

    /* compiled from: VerticalWidgetVisibilityTrackerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    /* compiled from: VerticalWidgetVisibilityTrackerItem.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lis0/h$b;", "", "_avito-discouraged_avito-libs_serp-core_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f405336a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f405337b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f405338c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Long f405339d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Map<String, String> f405340e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Analytics f405341f;

        public b() {
            this(null, null, null, null, null, null, 63, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f405336a, bVar.f405336a) && L.f(this.f405337b, bVar.f405337b) && L.f(this.f405338c, bVar.f405338c) && L.f(this.f405339d, bVar.f405339d) && L.f(this.f405340e, bVar.f405340e) && L.f(this.f405341f, bVar.f405341f);
        }

        public final int hashCode() {
            String str = this.f405336a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f405337b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f405338c;
            int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Long l12 = this.f405339d;
            int iHashCode4 = (iHashCode3 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Map<String, String> map = this.f405340e;
            int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            Analytics analytics = this.f405341f;
            return iHashCode5 + (analytics != null ? analytics.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Params(fromPage=" + this.f405336a + ", targetPage=" + this.f405337b + ", promoId=" + this.f405338c + ", mcid=" + this.f405339d + ", additionalParams=" + this.f405340e + ", customWidgetAnalytics=" + this.f405341f + ')';
        }

        public b(String str, String str2, String str3, Long l12, Map map, Analytics analytics, int i12, C42822w c42822w) {
            str = (i12 & 1) != 0 ? null : str;
            str2 = (i12 & 2) != 0 ? null : str2;
            str3 = (i12 & 4) != 0 ? null : str3;
            l12 = (i12 & 8) != 0 ? null : l12;
            map = (i12 & 16) != 0 ? null : map;
            analytics = (i12 & 32) != 0 ? null : analytics;
            this.f405336a = str;
            this.f405337b = str2;
            this.f405338c = str3;
            this.f405339d = l12;
            this.f405340e = map;
            this.f405341f = analytics;
        }
    }

    boolean L();

    @k
    /* renamed from: q1 */
    b getF273287h();
}
