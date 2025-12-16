package V80;

import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriod;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoPeriodResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LV80/j;", "", "a", "b", "LV80/j$a;", "LV80/j$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface j {

    /* compiled from: PositionInfoPeriodResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/j$a;", "LV80/j;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f16979a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Throwable f16980b;

        public a(@Y61.k ApiError apiError, @Y61.l Throwable th2) {
            this.f16979a = apiError;
            this.f16980b = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f16979a, aVar.f16979a) && L.f(this.f16980b, aVar.f16980b);
        }

        public final int hashCode() {
            int iHashCode = this.f16979a.hashCode() * 31;
            Throwable th2 = this.f16980b;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(error=");
            sb2.append(this.f16979a);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f16980b, ')');
        }
    }

    /* compiled from: PositionInfoPeriodResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/j$b;", "LV80/j;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements j {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final PositionInfoPeriod f16981a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final c f16982b;

        public b(@Y61.k PositionInfoPeriod positionInfoPeriod, @Y61.k c cVar) {
            this.f16981a = positionInfoPeriod;
            this.f16982b = cVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f16981a, bVar.f16981a) && L.f(this.f16982b, bVar.f16982b);
        }

        public final int hashCode() {
            return this.f16982b.hashCode() + (this.f16981a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "Success(info=" + this.f16981a + ", closedBanners=" + this.f16982b + ')';
        }
    }
}
