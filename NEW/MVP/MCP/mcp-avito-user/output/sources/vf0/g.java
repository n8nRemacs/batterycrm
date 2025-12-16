package vF0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.search.Header;
import com.avito.android.serp.adapter.l1;
import com.avito.android.travel_search.deeplink.TravelSearchLink;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import vF0.InterfaceC49207b;
import vF0.InterfaceC49208c;
import vF0.d;
import vF0.e;
import vF0.h;

/* compiled from: TravelSearchState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LvF0/g;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class g extends q {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final a f440605n = new a(null);

    /* renamed from: o, reason: collision with root package name */
    @k
    public static final g f440606o;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SearchParams f440607b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final TravelSearchLink.TravelSearchFlow f440608c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<l1> f440609d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f440610e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC49207b f440611f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final InterfaceC49208c f440612g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f440613h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final List<Filter> f440614i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final d f440615j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final e f440616k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final Header f440617l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final h f440618m;

    /* compiled from: TravelSearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LvF0/g$a;", "", "<init>", "()V", "_avito_travel-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        SearchParams empty = SearchParams.INSTANCE.getEMPTY();
        TravelSearchLink.TravelSearchFlow travelSearchFlow = TravelSearchLink.TravelSearchFlow.f302774d;
        h.f440619a.getClass();
        h.c cVar = h.a.f440621b;
        C42784z0 c42784z0 = C42784z0.f406748b;
        InterfaceC49207b.f440571a.getClass();
        InterfaceC49207b.c cVar2 = InterfaceC49207b.a.f440573b;
        InterfaceC49208c.f440577a.getClass();
        InterfaceC49208c.d dVar = InterfaceC49208c.a.f440579b;
        d.f440585a.getClass();
        d.c cVar3 = d.a.f440587b;
        e.f440591a.getClass();
        f440606o = new g(empty, travelSearchFlow, c42784z0, false, cVar2, dVar, true, c42784z0, cVar3, e.a.f440593b, null, cVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(@k SearchParams searchParams, @k TravelSearchLink.TravelSearchFlow travelSearchFlow, @k List<? extends l1> list, boolean z12, @k InterfaceC49207b interfaceC49207b, @k InterfaceC49208c interfaceC49208c, boolean z13, @k List<Filter> list2, @k d dVar, @k e eVar, @l Header header, @k h hVar) {
        this.f440607b = searchParams;
        this.f440608c = travelSearchFlow;
        this.f440609d = list;
        this.f440610e = z12;
        this.f440611f = interfaceC49207b;
        this.f440612g = interfaceC49208c;
        this.f440613h = z13;
        this.f440614i = list2;
        this.f440615j = dVar;
        this.f440616k = eVar;
        this.f440617l = header;
        this.f440618m = hVar;
    }

    public static g a(g gVar, SearchParams searchParams, TravelSearchLink.TravelSearchFlow travelSearchFlow, List list, boolean z12, InterfaceC49207b interfaceC49207b, InterfaceC49208c interfaceC49208c, List list2, d dVar, e eVar, Header header, h hVar, int i12) {
        SearchParams searchParams2 = (i12 & 1) != 0 ? gVar.f440607b : searchParams;
        TravelSearchLink.TravelSearchFlow travelSearchFlow2 = (i12 & 2) != 0 ? gVar.f440608c : travelSearchFlow;
        List list3 = (i12 & 4) != 0 ? gVar.f440609d : list;
        boolean z13 = (i12 & 8) != 0 ? gVar.f440610e : z12;
        InterfaceC49207b interfaceC49207b2 = (i12 & 16) != 0 ? gVar.f440611f : interfaceC49207b;
        InterfaceC49208c interfaceC49208c2 = (i12 & 32) != 0 ? gVar.f440612g : interfaceC49208c;
        boolean z14 = (i12 & 64) != 0 ? gVar.f440613h : false;
        List list4 = (i12 & 128) != 0 ? gVar.f440614i : list2;
        d dVar2 = (i12 & 256) != 0 ? gVar.f440615j : dVar;
        e eVar2 = (i12 & 512) != 0 ? gVar.f440616k : eVar;
        Header header2 = (i12 & 1024) != 0 ? gVar.f440617l : header;
        h hVar2 = (i12 & 2048) != 0 ? gVar.f440618m : hVar;
        gVar.getClass();
        return new g(searchParams2, travelSearchFlow2, list3, z13, interfaceC49207b2, interfaceC49208c2, z14, list4, dVar2, eVar2, header2, hVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return L.f(this.f440607b, gVar.f440607b) && this.f440608c == gVar.f440608c && L.f(this.f440609d, gVar.f440609d) && this.f440610e == gVar.f440610e && L.f(this.f440611f, gVar.f440611f) && L.f(this.f440612g, gVar.f440612g) && this.f440613h == gVar.f440613h && L.f(this.f440614i, gVar.f440614i) && L.f(this.f440615j, gVar.f440615j) && L.f(this.f440616k, gVar.f440616k) && L.f(this.f440617l, gVar.f440617l) && L.f(this.f440618m, gVar.f440618m);
    }

    public final int hashCode() {
        int iHashCode = (this.f440616k.hashCode() + ((this.f440615j.hashCode() + H.e(r.i((this.f440612g.hashCode() + ((this.f440611f.hashCode() + r.i(H.e((this.f440608c.hashCode() + (this.f440607b.hashCode() * 31)) * 31, 31, this.f440609d), 31, this.f440610e)) * 31)) * 31, 31, this.f440613h), 31, this.f440614i)) * 31)) * 31;
        Header header = this.f440617l;
        return this.f440618m.hashCode() + ((iHashCode + (header == null ? 0 : header.hashCode())) * 31);
    }

    @k
    public final String toString() {
        return "TravelSearchState(currentSearchParams=" + this.f440607b + ", currentFlow=" + this.f440608c + ", contentItems=" + this.f440609d + ", lastContentResponseItemsEmpty=" + this.f440610e + ", contentLoadingState=" + this.f440611f + ", contentViewState=" + this.f440612g + ", isFiltersFirstLoading=" + this.f440613h + ", filtersItems=" + this.f440614i + ", filtersLoadingState=" + this.f440615j + ", filtersViewState=" + this.f440616k + ", toolbarData=" + this.f440617l + ", toolbarViewState=" + this.f440618m + ')';
    }
}
