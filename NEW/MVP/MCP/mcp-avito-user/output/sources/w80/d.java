package W80;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoBanner;
import com.avito.android.remote.error.ApiError;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PositionInfoState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LW80/d;", "", "a", "b", "c", "d", "LW80/d$a;", "LW80/d$b;", "LW80/d$c;", "LW80/d$d;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface d {

    /* compiled from: PositionInfoState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW80/d$a;", "LW80/d;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17779a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final PositionInfoBanner f17780b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final g f17781c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final O80.a f17782d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final W80.b f17783e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final j f17784f;

        public a(@k String str, @l PositionInfoBanner positionInfoBanner, @k g gVar, @l O80.a aVar, @l W80.b bVar, @l j jVar) {
            this.f17779a = str;
            this.f17780b = positionInfoBanner;
            this.f17781c = gVar;
            this.f17782d = aVar;
            this.f17783e = bVar;
            this.f17784f = jVar;
        }

        public static a a(a aVar, g gVar, j jVar, int i12) {
            PositionInfoBanner positionInfoBanner = (i12 & 2) != 0 ? aVar.f17780b : null;
            if ((i12 & 4) != 0) {
                gVar = aVar.f17781c;
            }
            g gVar2 = gVar;
            if ((i12 & 32) != 0) {
                jVar = aVar.f17784f;
            }
            return new a(aVar.f17779a, positionInfoBanner, gVar2, aVar.f17782d, aVar.f17783e, jVar);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f17779a, aVar.f17779a) && L.f(this.f17780b, aVar.f17780b) && L.f(this.f17781c, aVar.f17781c) && L.f(this.f17782d, aVar.f17782d) && L.f(this.f17783e, aVar.f17783e) && L.f(this.f17784f, aVar.f17784f);
        }

        public final int hashCode() {
            int iHashCode = this.f17779a.hashCode() * 31;
            PositionInfoBanner positionInfoBanner = this.f17780b;
            int iHashCode2 = (this.f17781c.hashCode() + ((iHashCode + (positionInfoBanner == null ? 0 : positionInfoBanner.hashCode())) * 31)) * 31;
            O80.a aVar = this.f17782d;
            int iHashCode3 = (iHashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            W80.b bVar = this.f17783e;
            int iHashCode4 = (iHashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            j jVar = this.f17784f;
            return iHashCode4 + (jVar != null ? jVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "Content(screenName=" + this.f17779a + ", banner=" + this.f17780b + ", periods=" + this.f17781c + ", competitorsInfo=" + this.f17782d + ", bottomInfo=" + this.f17783e + ", toastBlock=" + this.f17784f + ')';
        }
    }

    /* compiled from: PositionInfoState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW80/d$b;", "LW80/d;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17785a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f17786b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Throwable f17787c;

        public b(@k ApiError apiError, @k String str, @l Throwable th2) {
            this.f17785a = str;
            this.f17786b = apiError;
            this.f17787c = th2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f17785a, bVar.f17785a) && L.f(this.f17786b, bVar.f17786b) && L.f(this.f17787c, bVar.f17787c);
        }

        public final int hashCode() {
            int iHashCode = (this.f17786b.hashCode() + (this.f17785a.hashCode() * 31)) * 31;
            Throwable th2 = this.f17787c;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(errorId=");
            sb2.append(this.f17785a);
            sb2.append(", error=");
            sb2.append(this.f17786b);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f17787c, ')');
        }
    }

    /* compiled from: PositionInfoState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LW80/d$c;", "LW80/d;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f17788a;

        public c(@k String str) {
            this.f17788a = str;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && L.f(this.f17788a, ((c) obj).f17788a);
        }

        public final int hashCode() {
            return this.f17788a.hashCode();
        }

        @k
        public final String toString() {
            return C22026a.c(new StringBuilder("Loading(loadingId="), this.f17788a, ')');
        }
    }

    /* compiled from: PositionInfoState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LW80/d$d;", "LW80/d;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: W80.d$d, reason: collision with other inner class name */
    public static final /* data */ class C1254d implements d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public static final C1254d f17789a = new C1254d();

        public final boolean equals(@l Object obj) {
            return this == obj || (obj instanceof C1254d);
        }

        public final int hashCode() {
            return -900003170;
        }

        @k
        public final String toString() {
            return "None";
        }
    }
}
