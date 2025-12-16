package X80;

import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoPeriod;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PeriodInfoState.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LX80/l;", "", "a", "b", "LX80/l$a;", "LX80/l$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface l {

    /* compiled from: PeriodInfoState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/l$a;", "LX80/l;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f18718a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ApiError f18719b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Throwable f18720c;

        public a(@Y61.k ApiError apiError, @Y61.k String str, @Y61.l Throwable th2) {
            this.f18718a = str;
            this.f18719b = apiError;
            this.f18720c = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f18718a, aVar.f18718a) && L.f(this.f18719b, aVar.f18719b) && L.f(this.f18720c, aVar.f18720c);
        }

        @Override // X80.l
        @Y61.k
        /* renamed from: getId, reason: from getter */
        public final String getF18721a() {
            return this.f18718a;
        }

        public final int hashCode() {
            int iHashCode = (this.f18719b.hashCode() + (this.f18718a.hashCode() * 31)) * 31;
            Throwable th2 = this.f18720c;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(id=");
            sb2.append(this.f18718a);
            sb2.append(", error=");
            sb2.append(this.f18719b);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f18720c, ')');
        }
    }

    /* compiled from: PeriodInfoState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/l$b;", "LX80/l;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements l {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f18721a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final PositionInfoPeriod.AdditionalToast f18722b;

        public b(@Y61.k String str, @Y61.k PositionInfoPeriod.AdditionalToast additionalToast) {
            this.f18721a = str;
            this.f18722b = additionalToast;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f18721a, bVar.f18721a) && L.f(this.f18722b, bVar.f18722b);
        }

        @Override // X80.l
        @Y61.k
        /* renamed from: getId, reason: from getter */
        public final String getF18721a() {
            return this.f18721a;
        }

        public final int hashCode() {
            return this.f18722b.hashCode() + (this.f18721a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            return "Info(id=" + this.f18721a + ", info=" + this.f18722b + ')';
        }
    }

    @Y61.k
    /* renamed from: getId */
    String getF18721a();
}
