package X80;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PeriodInfoEvent.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"LX80/d;", "", "a", "b", "LX80/d$a;", "LX80/d$b;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d {

    /* compiled from: PeriodInfoEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/d$a;", "LX80/d;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f18692a;

        public a(@Y61.k DeepLink deepLink) {
            this.f18692a = deepLink;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f18692a, ((a) obj).f18692a);
        }

        public final int hashCode() {
            return this.f18692a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return com.avito.android.actions_sheet.a.v(new StringBuilder("OpenDeepLink(deepLink="), this.f18692a, ')');
        }
    }

    /* compiled from: PeriodInfoEvent.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/d$b;", "LX80/d;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final DeepLink f18693a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f18694b;

        public b(@Y61.k DeepLink deepLink, @Y61.k String str) {
            this.f18693a = deepLink;
            this.f18694b = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f18693a, bVar.f18693a) && L.f(this.f18694b, bVar.f18694b);
        }

        public final int hashCode() {
            return this.f18694b.hashCode() + (this.f18693a.hashCode() * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("OpenSortDeepLink(deepLink=");
            sb2.append(this.f18693a);
            sb2.append(", slug=");
            return C22026a.c(sb2, this.f18694b, ')');
        }
    }
}
