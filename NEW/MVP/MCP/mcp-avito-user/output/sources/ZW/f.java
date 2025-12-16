package zw;

import Xw.C17054a;
import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.GetMortgageListRequestStatus;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lzw/f;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final P2<C17054a> f444391a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<C17054a> f444392b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f444393c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f444394d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final GetMortgageListRequestStatus f444395e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Integer f444396f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final ArrayList f444397g;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k P2<? super C17054a> p22, @k List<C17054a> list, @k String str, boolean z12, @k GetMortgageListRequestStatus getMortgageListRequestStatus) {
        Xw.f pageSummary;
        Long totalCount;
        this.f444391a = p22;
        this.f444392b = list;
        this.f444393c = str;
        this.f444394d = z12;
        this.f444395e = getMortgageListRequestStatus;
        C17054a c17054a = (C17054a) C42745f0.S(list);
        this.f444396f = (c17054a == null || (pageSummary = c17054a.getPageSummary()) == null || (totalCount = pageSummary.getTotalCount()) == null) ? null : Integer.valueOf((int) totalCount.longValue());
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            C42745f0.h(((C17054a) it.next()).a(), arrayList);
        }
        this.f444397g = arrayList;
    }

    public static f a(f fVar, P2 p22, List list, String str, boolean z12, GetMortgageListRequestStatus getMortgageListRequestStatus, int i12) {
        if ((i12 & 1) != 0) {
            p22 = fVar.f444391a;
        }
        P2 p23 = p22;
        if ((i12 & 4) != 0) {
            str = fVar.f444393c;
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            z12 = fVar.f444394d;
        }
        boolean z13 = z12;
        if ((i12 & 16) != 0) {
            getMortgageListRequestStatus = fVar.f444395e;
        }
        fVar.getClass();
        return new f(p23, list, str2, z13, getMortgageListRequestStatus);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f444391a, fVar.f444391a) && L.f(this.f444392b, fVar.f444392b) && L.f(this.f444393c, fVar.f444393c) && this.f444394d == fVar.f444394d && this.f444395e == fVar.f444395e;
    }

    public final int hashCode() {
        return this.f444395e.hashCode() + r.i(H.d(H.e(this.f444391a.hashCode() * 31, 31, this.f444392b), 31, this.f444393c), 31, this.f444394d);
    }

    @k
    public final String toString() {
        return "MortgageData(lastMortgageListPageLoading=" + this.f444391a + ", loadedMortgageListPages=" + this.f444392b + ", searchBarQuery=" + this.f444393c + ", isFirstLoadingFinished=" + this.f444394d + ", mortgageListFilter=" + this.f444395e + ')';
    }
}
