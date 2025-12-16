package zw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.developments_agency_search.domain.GetClientListRequestStage;
import com.avito.android.developments_agency_search.domain.GetDealCabinetHeader;
import com.avito.android.developments_agency_search.domain.GetDealUpdatesResponse;
import com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus;
import com.avito.android.developments_agency_search.screen.deal_cabinet.adapter.tabs.Tab;
import com.avito.android.util.P2;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import zw.e;

/* compiled from: DealCabinetState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lzw/d;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class d extends q {

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f444379i = new a(null);

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final d f444380j;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final P2<GetDealCabinetHeader> f444381b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final P2<GetDealUpdatesResponse> f444382c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Tab f444383d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final C50636a f444384e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final f f444385f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f444386g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final e f444387h;

    /* compiled from: DealCabinetState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lzw/d$a;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        P2.c cVar = P2.c.f318721a;
        Tab tab = Tab.f136879c;
        C42784z0 c42784z0 = C42784z0.f406748b;
        f444380j = new d(cVar, cVar, tab, new C50636a(cVar, c42784z0, "", false, GetClientListRequestStage.f136497c), new f(cVar, c42784z0, "", false, GetMortgageListRequestStatus.f136528d), false, e.b.f444390a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(@k P2<? super GetDealCabinetHeader> p22, @k P2<? super GetDealUpdatesResponse> p23, @k Tab tab, @k C50636a c50636a, @k f fVar, boolean z12, @k e eVar) {
        this.f444381b = p22;
        this.f444382c = p23;
        this.f444383d = tab;
        this.f444384e = c50636a;
        this.f444385f = fVar;
        this.f444386g = z12;
        this.f444387h = eVar;
    }

    public static d a(d dVar, P2 p22, P2 p23, Tab tab, C50636a c50636a, f fVar, e eVar, int i12) {
        if ((i12 & 1) != 0) {
            p22 = dVar.f444381b;
        }
        P2 p24 = p22;
        if ((i12 & 2) != 0) {
            p23 = dVar.f444382c;
        }
        P2 p25 = p23;
        if ((i12 & 4) != 0) {
            tab = dVar.f444383d;
        }
        Tab tab2 = tab;
        if ((i12 & 8) != 0) {
            c50636a = dVar.f444384e;
        }
        C50636a c50636a2 = c50636a;
        if ((i12 & 16) != 0) {
            fVar = dVar.f444385f;
        }
        f fVar2 = fVar;
        boolean z12 = dVar.f444386g;
        if ((i12 & 64) != 0) {
            eVar = dVar.f444387h;
        }
        dVar.getClass();
        return new d(p24, p25, tab2, c50636a2, fVar2, z12, eVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f444381b, dVar.f444381b) && L.f(this.f444382c, dVar.f444382c) && this.f444383d == dVar.f444383d && L.f(this.f444384e, dVar.f444384e) && L.f(this.f444385f, dVar.f444385f) && this.f444386g == dVar.f444386g && L.f(this.f444387h, dVar.f444387h);
    }

    public final int hashCode() {
        return this.f444387h.hashCode() + r.i((this.f444385f.hashCode() + ((this.f444384e.hashCode() + ((this.f444383d.hashCode() + ((this.f444382c.hashCode() + (this.f444381b.hashCode() * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f444386g);
    }

    @k
    public final String toString() {
        return "DealCabinetState(banners=" + this.f444381b + ", dealUpdates=" + this.f444382c + ", currentTab=" + this.f444383d + ", clientsData=" + this.f444384e + ", mortgageData=" + this.f444385f + ", screenShownAnalyticsEventWasSent=" + this.f444386g + ", viewState=" + this.f444387h + ')';
    }
}
