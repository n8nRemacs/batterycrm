package Dw;

import Dw.e;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.developments_agency_search.domain.GetDealRoomInfoResponse;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DealRoomDevelopmentState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LDw/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d extends q {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f3548d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final d f3549e = new d(P2.c.f318721a, e.b.f3554a);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final P2<GetDealRoomInfoResponse.Deal.SelectionHistory.Item> f3550b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final e f3551c;

    /* compiled from: DealRoomDevelopmentState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LDw/d$a;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k P2<? super GetDealRoomInfoResponse.Deal.SelectionHistory.Item> p22, @k e eVar) {
        this.f3550b = p22;
        this.f3551c = eVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f3550b, dVar.f3550b) && L.f(this.f3551c, dVar.f3551c);
    }

    public final int hashCode() {
        return this.f3551c.hashCode() + (this.f3550b.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "DealRoomDevelopmentState(dealHistoryItem=" + this.f3550b + ", viewState=" + this.f3551c + ')';
    }
}
