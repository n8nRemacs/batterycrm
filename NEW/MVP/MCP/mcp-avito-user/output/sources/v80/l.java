package V80;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.error.ApiError;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LV80/l;", "", "a", "b", "LV80/l$a;", "LV80/l$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface l {

    /* compiled from: PositionInfoResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/l$a;", "LV80/l;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ApiError f16985a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final Throwable f16986b;

        public a(@Y61.k ApiError apiError, @Y61.l Throwable th2) {
            this.f16985a = apiError;
            this.f16986b = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f16985a, aVar.f16985a) && L.f(this.f16986b, aVar.f16986b);
        }

        public final int hashCode() {
            int iHashCode = this.f16985a.hashCode() * 31;
            Throwable th2 = this.f16986b;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(error=");
            sb2.append(this.f16985a);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f16986b, ')');
        }
    }

    /* compiled from: PositionInfoResponse.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LV80/l$b;", "LV80/l;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final h f16987a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Set<String> f16988b;

        public b(@Y61.k h hVar, @Y61.k Set<String> set) {
            this.f16987a = hVar;
            this.f16988b = set;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f16987a, bVar.f16987a) && L.f(this.f16988b, bVar.f16988b);
        }

        public final int hashCode() {
            return this.f16988b.hashCode() + (this.f16987a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Success(info=");
            sb2.append(this.f16987a);
            sb2.append(", closedBanners=");
            return AK.c.u(sb2, this.f16988b, ')');
        }
    }
}
