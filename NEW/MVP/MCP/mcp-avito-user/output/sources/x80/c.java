package X80;

import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.position_in_search.stats.screen.old_position_in_search.domain.model.PositionInfoBanner;
import com.avito.android.remote.error.ApiError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: PeriodInfoState.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0005\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"LX80/c;", "", "a", "b", "c", "d", "e", "LX80/c$a;", "LX80/c$b;", "LX80/c$c;", "LX80/c$d;", "LX80/c$e;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface c {

    /* compiled from: PeriodInfoState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/c$a;", "LX80/c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f18671a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final f f18672b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final X80.a f18673c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final g f18674d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final i f18675e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final List<h> f18676f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.l
        public final X80.e f18677g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.l
        public final PositionInfoBanner f18678h;

        /* renamed from: i, reason: collision with root package name */
        @Y61.l
        public final l f18679i;

        public a(@Y61.k String str, @Y61.k f fVar, @Y61.l X80.a aVar, @Y61.l g gVar, @Y61.l i iVar, @Y61.k List<h> list, @Y61.l X80.e eVar, @Y61.l PositionInfoBanner positionInfoBanner, @Y61.l l lVar) {
            this.f18671a = str;
            this.f18672b = fVar;
            this.f18673c = aVar;
            this.f18674d = gVar;
            this.f18675e = iVar;
            this.f18676f = list;
            this.f18677g = eVar;
            this.f18678h = positionInfoBanner;
            this.f18679i = lVar;
        }

        public static a a(a aVar, g gVar, i iVar, ArrayList arrayList, X80.e eVar, l lVar, int i12) {
            String str = aVar.f18671a;
            f fVar = aVar.f18672b;
            X80.a aVar2 = aVar.f18673c;
            g gVar2 = (i12 & 8) != 0 ? aVar.f18674d : gVar;
            i iVar2 = (i12 & 16) != 0 ? aVar.f18675e : iVar;
            List<h> list = (i12 & 32) != 0 ? aVar.f18676f : arrayList;
            X80.e eVar2 = (i12 & 64) != 0 ? aVar.f18677g : eVar;
            PositionInfoBanner positionInfoBanner = (i12 & 128) != 0 ? aVar.f18678h : null;
            l lVar2 = (i12 & 256) != 0 ? aVar.f18679i : lVar;
            aVar.getClass();
            return new a(str, fVar, aVar2, gVar2, iVar2, list, eVar2, positionInfoBanner, lVar2);
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f18671a, aVar.f18671a) && L.f(this.f18672b, aVar.f18672b) && L.f(this.f18673c, aVar.f18673c) && L.f(this.f18674d, aVar.f18674d) && L.f(this.f18675e, aVar.f18675e) && L.f(this.f18676f, aVar.f18676f) && L.f(this.f18677g, aVar.f18677g) && L.f(this.f18678h, aVar.f18678h) && L.f(this.f18679i, aVar.f18679i);
        }

        public final int hashCode() {
            int iHashCode = (this.f18672b.hashCode() + (this.f18671a.hashCode() * 31)) * 31;
            X80.a aVar = this.f18673c;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            g gVar = this.f18674d;
            int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            i iVar = this.f18675e;
            int iE2 = H.e((iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31, 31, this.f18676f);
            X80.e eVar = this.f18677g;
            int iHashCode4 = (iE2 + (eVar == null ? 0 : eVar.hashCode())) * 31;
            PositionInfoBanner positionInfoBanner = this.f18678h;
            int iHashCode5 = (iHashCode4 + (positionInfoBanner == null ? 0 : positionInfoBanner.hashCode())) * 31;
            l lVar = this.f18679i;
            return iHashCode5 + (lVar != null ? lVar.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            return "Content(periodTitle=" + this.f18671a + ", positionData=" + this.f18672b + ", chartDynamicData=" + this.f18673c + ", queriesHeader=" + this.f18674d + ", sortingControl=" + this.f18675e + ", queryItems=" + this.f18676f + ", nextPageBlock=" + this.f18677g + ", adviceBanner=" + this.f18678h + ", toastBlock=" + this.f18679i + ')';
        }
    }

    /* compiled from: PeriodInfoState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/c$b;", "LX80/c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f18680a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final ApiError f18681b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final Throwable f18682c;

        public b(@Y61.k ApiError apiError, @Y61.k String str, @Y61.l Throwable th2) {
            this.f18680a = str;
            this.f18681b = apiError;
            this.f18682c = th2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f18680a, bVar.f18680a) && L.f(this.f18681b, bVar.f18681b) && L.f(this.f18682c, bVar.f18682c);
        }

        public final int hashCode() {
            int iHashCode = (this.f18681b.hashCode() + (this.f18680a.hashCode() * 31)) * 31;
            Throwable th2 = this.f18682c;
            return iHashCode + (th2 == null ? 0 : th2.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(errorId=");
            sb2.append(this.f18680a);
            sb2.append(", error=");
            sb2.append(this.f18681b);
            sb2.append(", cause=");
            return com.avito.android.advert.item.delivery_suggests.l.t(sb2, this.f18682c, ')');
        }
    }

    /* compiled from: PeriodInfoState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/c$c;", "LX80/c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: X80.c$c, reason: collision with other inner class name */
    public static final /* data */ class C1321c implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f18683a;

        public C1321c(@Y61.k String str) {
            this.f18683a = str;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1321c) && L.f(this.f18683a, ((C1321c) obj).f18683a);
        }

        public final int hashCode() {
            return this.f18683a.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("Loading(loadingId="), this.f18683a, ')');
        }
    }

    /* compiled from: PeriodInfoState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LX80/c$d;", "LX80/c;", "<init>", "()V", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public static final d f18684a = new d();

        public final boolean equals(@Y61.l Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -819687085;
        }

        @Y61.k
        public final String toString() {
            return "None";
        }
    }

    /* compiled from: PeriodInfoState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LX80/c$e;", "LX80/c;", "_avito_position-in-search_stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e implements c {

        /* renamed from: a, reason: collision with root package name */
        @Y61.l
        public final String f18685a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final f f18686b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final X80.a f18687c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final g f18688d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final i f18689e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final PositionInfoBanner f18690f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final String f18691g;

        public e(@Y61.l String str, @Y61.k f fVar, @Y61.l X80.a aVar, @Y61.l g gVar, @Y61.l i iVar, @Y61.l PositionInfoBanner positionInfoBanner, @Y61.k String str2) {
            this.f18685a = str;
            this.f18686b = fVar;
            this.f18687c = aVar;
            this.f18688d = gVar;
            this.f18689e = iVar;
            this.f18690f = positionInfoBanner;
            this.f18691g = str2;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f18685a, eVar.f18685a) && L.f(this.f18686b, eVar.f18686b) && L.f(this.f18687c, eVar.f18687c) && L.f(this.f18688d, eVar.f18688d) && L.f(this.f18689e, eVar.f18689e) && L.f(this.f18690f, eVar.f18690f) && L.f(this.f18691g, eVar.f18691g);
        }

        public final int hashCode() {
            String str = this.f18685a;
            int iHashCode = (this.f18686b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            X80.a aVar = this.f18687c;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            g gVar = this.f18688d;
            int iHashCode3 = (iHashCode2 + (gVar == null ? 0 : gVar.hashCode())) * 31;
            i iVar = this.f18689e;
            int iHashCode4 = (iHashCode3 + (iVar == null ? 0 : iVar.hashCode())) * 31;
            PositionInfoBanner positionInfoBanner = this.f18690f;
            return this.f18691g.hashCode() + ((iHashCode4 + (positionInfoBanner != null ? positionInfoBanner.hashCode() : 0)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("PeriodLoading(periodTitle=");
            sb2.append(this.f18685a);
            sb2.append(", positionData=");
            sb2.append(this.f18686b);
            sb2.append(", chartDynamicData=");
            sb2.append(this.f18687c);
            sb2.append(", queriesHeader=");
            sb2.append(this.f18688d);
            sb2.append(", sortingControl=");
            sb2.append(this.f18689e);
            sb2.append(", adviceBanner=");
            sb2.append(this.f18690f);
            sb2.append(", loadingId=");
            return C22026a.c(sb2, this.f18691g, ')');
        }

        public /* synthetic */ e(String str, f fVar, X80.a aVar, g gVar, i iVar, PositionInfoBanner positionInfoBanner, String str2, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : str, fVar, aVar, gVar, iVar, positionInfoBanner, str2);
        }
    }
}
