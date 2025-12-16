package zw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.GetClientListRequestStage;
import com.avito.android.developments_agency_search.domain.GetClientListResponse;
import com.avito.android.util.P2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: DealCabinetState.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: zw.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C50636a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final P2<GetClientListResponse> f444342a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<GetClientListResponse> f444343b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f444344c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f444345d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final GetClientListRequestStage f444346e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final GetClientListResponse.Counters f444347f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ArrayList f444348g;

    /* JADX WARN: Multi-variable type inference failed */
    public C50636a(@k P2<? super GetClientListResponse> p22, @k List<GetClientListResponse> list, @k String str, boolean z12, @k GetClientListRequestStage getClientListRequestStage) {
        this.f444342a = p22;
        this.f444343b = list;
        this.f444344c = str;
        this.f444345d = z12;
        this.f444346e = getClientListRequestStage;
        GetClientListResponse getClientListResponse = (GetClientListResponse) C42745f0.S(list);
        this.f444347f = getClientListResponse != null ? getClientListResponse.getCounters() : null;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C42745f0.h(((GetClientListResponse) it.next()).getClients(), arrayList);
        }
        this.f444348g = arrayList;
    }

    public static C50636a a(C50636a c50636a, P2 p22, List list, String str, boolean z12, GetClientListRequestStage getClientListRequestStage, int i12) {
        if ((i12 & 1) != 0) {
            p22 = c50636a.f444342a;
        }
        P2 p23 = p22;
        if ((i12 & 4) != 0) {
            str = c50636a.f444344c;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            z12 = c50636a.f444345d;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            getClientListRequestStage = c50636a.f444346e;
        }
        c50636a.getClass();
        return new C50636a(p23, list, str2, z13, getClientListRequestStage);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C50636a)) {
            return false;
        }
        C50636a c50636a = (C50636a) obj;
        return L.f(this.f444342a, c50636a.f444342a) && L.f(this.f444343b, c50636a.f444343b) && L.f(this.f444344c, c50636a.f444344c) && this.f444345d == c50636a.f444345d && this.f444346e == c50636a.f444346e;
    }

    public final int hashCode() {
        return this.f444346e.hashCode() + r.i(H.d(H.e(this.f444342a.hashCode() * 31, 31, this.f444343b), 31, this.f444344c), 31, this.f444345d);
    }

    @k
    public final String toString() {
        return "ClientsData(lastClientListPageLoading=" + this.f444342a + ", loadedClientListPages=" + this.f444343b + ", searchBarQuery=" + this.f444344c + ", isFirstLoadingFinished=" + this.f444345d + ", clientListFilter=" + this.f444346e + ')';
    }
}
