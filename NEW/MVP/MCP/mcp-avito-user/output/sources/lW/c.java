package Lw;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.developments_agency_search.domain.GetDevelopmentTooltipInfo;
import com.avito.android.developments_agency_search.domain.GetMapMarkersResponse;
import com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.tab_layout.Tab;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.DevelopmentSort;
import com.avito.android.developments_agency_search.screen.realty_agency_search.model.LotSort;
import com.avito.android.lib.design.map.state.MapState;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.util.P2;
import dx.C39813a;
import ex.C40174a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.B0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: RealtyAgencySearchState.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0080\b\u0018\u00002\u00020\u0001:\b\u0002\u0003\u0004\u0005\u0006\u0007\b\t¨\u0006\n"}, d2 = {"LLw/c;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "f", "g", "h", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c extends q {

    /* renamed from: n, reason: collision with root package name */
    @k
    public static final b f10237n = new b(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SearchParams f10238b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final com.avito.android.developments_agency_search.adapter.commission_promo_banner.a f10239c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final d f10240d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final g f10241e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a f10242f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final C0649c f10243g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final e f10244h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f10245i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final f f10246j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final h f10247k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final Tab f10248l;

    /* renamed from: m, reason: collision with root package name */
    public final int f10249m;

    /* compiled from: RealtyAgencySearchState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLw/c$a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final DevelopmentSort f10250a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final LotSort f10251b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f10252c;

        public a(@k DevelopmentSort developmentSort, @k LotSort lotSort, boolean z12) {
            this.f10250a = developmentSort;
            this.f10251b = lotSort;
            this.f10252c = z12;
        }

        public static a a(a aVar, DevelopmentSort developmentSort, LotSort lotSort, boolean z12, int i12) {
            if ((i12 & 1) != 0) {
                developmentSort = aVar.f10250a;
            }
            if ((i12 & 2) != 0) {
                lotSort = aVar.f10251b;
            }
            if ((i12 & 4) != 0) {
                z12 = aVar.f10252c;
            }
            aVar.getClass();
            return new a(developmentSort, lotSort, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f10250a == aVar.f10250a && this.f10251b == aVar.f10251b && this.f10252c == aVar.f10252c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f10252c) + ((this.f10251b.hashCode() + (this.f10250a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ActionsBlockState(developmentSort=");
            sb2.append(this.f10250a);
            sb2.append(", lotSort=");
            sb2.append(this.f10251b);
            sb2.append(", isClientMode=");
            return r.x(sb2, this.f10252c, ')');
        }
    }

    /* compiled from: RealtyAgencySearchState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"LLw/c$b;", "", "<init>", "()V", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: RealtyAgencySearchState.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLw/c$c;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: Lw.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0649c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final P2<C39813a> f10253a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<C39813a> f10254b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final ArrayList f10255c;

        /* JADX WARN: Multi-variable type inference failed */
        public C0649c(@k P2<? super C39813a> p22, @k List<C39813a> list) {
            this.f10253a = p22;
            this.f10254b = list;
            List<C39813a> list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator<T> it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C39813a) it.next()).a());
            }
            this.f10255c = C42745f0.H(arrayList);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0649c)) {
                return false;
            }
            C0649c c0649c = (C0649c) obj;
            return L.f(this.f10253a, c0649c.f10253a) && L.f(this.f10254b, c0649c.f10254b);
        }

        public final int hashCode() {
            return this.f10254b.hashCode() + (this.f10253a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DevelopmentsData(lastPageLoading=");
            sb2.append(this.f10253a);
            sb2.append(", loadedPages=");
            return H.p(sb2, this.f10254b, ')');
        }
    }

    /* compiled from: RealtyAgencySearchState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLw/c$d;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f10256a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f10257b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f10258c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f10259d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f10260e;

        public d(boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
            this.f10256a = z12;
            this.f10257b = z13;
            this.f10258c = z14;
            this.f10259d = z15;
            this.f10260e = z16;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f10256a == dVar.f10256a && this.f10257b == dVar.f10257b && this.f10258c == dVar.f10258c && this.f10259d == dVar.f10259d && this.f10260e == dVar.f10260e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f10260e) + r.i(r.i(r.i(Boolean.hashCode(this.f10256a) * 31, 31, this.f10257b), 31, this.f10258c), 31, this.f10259d);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InlineFiltersViewState(isLoaded=");
            sb2.append(this.f10256a);
            sb2.append(", showInlineFilters=");
            sb2.append(this.f10257b);
            sb2.append(", showBigFiltersBadge=");
            sb2.append(this.f10258c);
            sb2.append(", showShortcutBar=");
            sb2.append(this.f10259d);
            sb2.append(", showUpperBlock=");
            return r.x(sb2, this.f10260e, ')');
        }
    }

    /* compiled from: RealtyAgencySearchState.kt */
    @P
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLw/c$e;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final P2<C40174a> f10261a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<C40174a> f10262b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final B0 f10263c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final ArrayList f10264d;

        public e(@k P2 p22, @k List list, @k B0 b02) {
            this.f10261a = p22;
            this.f10262b = list;
            this.f10263c = b02;
            List list2 = list;
            ArrayList arrayList = new ArrayList(C42745f0.q(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((C40174a) it.next()).b());
            }
            this.f10264d = C42745f0.H(arrayList);
        }

        public static e a(e eVar, P2 p22, List list, int i12) {
            if ((i12 & 2) != 0) {
                list = eVar.f10262b;
            }
            B0 b02 = eVar.f10263c;
            eVar.getClass();
            return new e(p22, list, b02);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return L.f(this.f10261a, eVar.f10261a) && L.f(this.f10262b, eVar.f10262b) && L.f(this.f10263c, eVar.f10263c);
        }

        public final int hashCode() {
            int iE2 = H.e(this.f10261a.hashCode() * 31, 31, this.f10262b);
            this.f10263c.getClass();
            return iE2;
        }

        @k
        public final String toString() {
            return "LotsData(lastPageLoading=" + this.f10261a + ", loadedPages=" + this.f10262b + ", addToSelection=" + this.f10263c + ')';
        }
    }

    /* compiled from: RealtyAgencySearchState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLw/c$f;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final GetMapMarkersResponse f10265a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final P2<GetDevelopmentTooltipInfo> f10266b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final String f10267c;

        /* renamed from: d, reason: collision with root package name */
        public final int f10268d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final AvitoMapBounds f10269e;

        /* JADX WARN: Multi-variable type inference failed */
        public f(@l GetMapMarkersResponse getMapMarkersResponse, @l P2<? super GetDevelopmentTooltipInfo> p22, @l String str, int i12, @l AvitoMapBounds avitoMapBounds) {
            this.f10265a = getMapMarkersResponse;
            this.f10266b = p22;
            this.f10267c = str;
            this.f10268d = i12;
            this.f10269e = avitoMapBounds;
        }

        public static f a(f fVar, GetMapMarkersResponse getMapMarkersResponse, P2 p22, String str, int i12, AvitoMapBounds avitoMapBounds, int i13) {
            if ((i13 & 1) != 0) {
                getMapMarkersResponse = fVar.f10265a;
            }
            GetMapMarkersResponse getMapMarkersResponse2 = getMapMarkersResponse;
            if ((i13 & 2) != 0) {
                p22 = fVar.f10266b;
            }
            P2 p23 = p22;
            if ((i13 & 4) != 0) {
                str = fVar.f10267c;
            }
            String str2 = str;
            if ((i13 & 8) != 0) {
                i12 = fVar.f10268d;
            }
            int i14 = i12;
            if ((i13 & 16) != 0) {
                avitoMapBounds = fVar.f10269e;
            }
            fVar.getClass();
            return new f(getMapMarkersResponse2, p23, str2, i14, avitoMapBounds);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f10265a, fVar.f10265a) && L.f(this.f10266b, fVar.f10266b) && L.f(this.f10267c, fVar.f10267c) && this.f10268d == fVar.f10268d && L.f(this.f10269e, fVar.f10269e);
        }

        public final int hashCode() {
            GetMapMarkersResponse getMapMarkersResponse = this.f10265a;
            int iHashCode = (getMapMarkersResponse == null ? 0 : getMapMarkersResponse.hashCode()) * 31;
            P2<GetDevelopmentTooltipInfo> p22 = this.f10266b;
            int iHashCode2 = (iHashCode + (p22 == null ? 0 : p22.hashCode())) * 31;
            String str = this.f10267c;
            int iE2 = r.e(this.f10268d, (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31);
            AvitoMapBounds avitoMapBounds = this.f10269e;
            return iE2 + (avitoMapBounds != null ? avitoMapBounds.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "MapData(markersResponse=" + this.f10265a + ", selectedDevelopmentResponse=" + this.f10266b + ", selectedMarkerId=" + this.f10267c + ", zoomLevel=" + this.f10268d + ", bounds=" + this.f10269e + ')';
        }
    }

    /* compiled from: RealtyAgencySearchState.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLw/c$g;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Tab f10270a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f10271b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final Long f10272c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Long f10273d;

        public g(@k Tab tab, boolean z12, @l Long l12, @l Long l13) {
            this.f10270a = tab;
            this.f10271b = z12;
            this.f10272c = l12;
            this.f10273d = l13;
        }

        public static g a(g gVar, Tab tab, Long l12, Long l13, int i12) {
            boolean z12 = gVar.f10271b;
            if ((i12 & 4) != 0) {
                l12 = gVar.f10272c;
            }
            if ((i12 & 8) != 0) {
                l13 = gVar.f10273d;
            }
            gVar.getClass();
            return new g(tab, z12, l12, l13);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.f10270a == gVar.f10270a && this.f10271b == gVar.f10271b && L.f(this.f10272c, gVar.f10272c) && L.f(this.f10273d, gVar.f10273d);
        }

        public final int hashCode() {
            int i12 = r.i(this.f10270a.hashCode() * 31, 31, this.f10271b);
            Long l12 = this.f10272c;
            int iHashCode = (i12 + (l12 == null ? 0 : l12.hashCode())) * 31;
            Long l13 = this.f10273d;
            return iHashCode + (l13 != null ? l13.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("TabLayoutState(selectedTab=");
            sb2.append(this.f10270a);
            sb2.append(", isHidden=");
            sb2.append(this.f10271b);
            sb2.append(", developmentsTabCount=");
            sb2.append(this.f10272c);
            sb2.append(", lotsTabCount=");
            return m.m(sb2, this.f10273d, ')');
        }
    }

    /* compiled from: RealtyAgencySearchState.kt */
    @P
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"LLw/c$h;", "", "a", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final List<MapState.a> f10274a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final a f10275b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final List<com.avito.conveyor_item.a> f10276c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final List<com.avito.conveyor_item.a> f10277d;

        /* compiled from: RealtyAgencySearchState.kt */
        @P
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LLw/c$h$a;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            public final boolean f10278a;

            /* renamed from: b, reason: collision with root package name */
            public final boolean f10279b;

            public a(boolean z12, boolean z13) {
                this.f10278a = z12;
                this.f10279b = z13;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return this.f10278a == aVar.f10278a && this.f10279b == aVar.f10279b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f10279b) + (Boolean.hashCode(this.f10278a) * 31);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("MapButtons(showPanel=");
                sb2.append(this.f10278a);
                sb2.append(", showFineMeButton=");
                return r.x(sb2, this.f10279b, ')');
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public h(@k List<MapState.a> list, @k a aVar, @k List<? extends com.avito.conveyor_item.a> list2, @l List<? extends com.avito.conveyor_item.a> list3) {
            this.f10274a = list;
            this.f10275b = aVar;
            this.f10276c = list2;
            this.f10277d = list3;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f10274a, hVar.f10274a) && L.f(this.f10275b, hVar.f10275b) && L.f(this.f10276c, hVar.f10276c) && L.f(this.f10277d, hVar.f10277d);
        }

        public final int hashCode() {
            int iE2 = H.e((this.f10275b.hashCode() + (this.f10274a.hashCode() * 31)) * 31, 31, this.f10276c);
            List<com.avito.conveyor_item.a> list = this.f10277d;
            return iE2 + (list == null ? 0 : list.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ViewState(mapMarkers=");
            sb2.append(this.f10274a);
            sb2.append(", mapButtons=");
            sb2.append(this.f10275b);
            sb2.append(", searchResultContent=");
            sb2.append(this.f10276c);
            sb2.append(", mapDevelopmentTooltipContent=");
            return H.p(sb2, this.f10277d, ')');
        }
    }

    /* compiled from: RealtyAgencySearchState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class i {
        static {
            int[] iArr = new int[Tab.values().length];
            try {
                iArr[Tab.f138450c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Tab.f138451d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(@k SearchParams searchParams, @l com.avito.android.developments_agency_search.adapter.commission_promo_banner.a aVar, @k d dVar, @k g gVar, @k a aVar2, @k C0649c c0649c, @k e eVar, boolean z12, @k f fVar, @k h hVar) {
        int size;
        this.f10238b = searchParams;
        this.f10239c = aVar;
        this.f10240d = dVar;
        this.f10241e = gVar;
        this.f10242f = aVar2;
        this.f10243g = c0649c;
        this.f10244h = eVar;
        this.f10245i = z12;
        this.f10246j = fVar;
        this.f10247k = hVar;
        Tab tab = gVar.f10270a;
        this.f10248l = tab;
        int iOrdinal = tab.ordinal();
        if (iOrdinal == 0) {
            size = c0649c.f10254b.size();
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            size = eVar.f10262b.size();
        }
        this.f10249m = size;
    }

    public static c a(c cVar, SearchParams searchParams, com.avito.android.developments_agency_search.adapter.commission_promo_banner.a aVar, d dVar, g gVar, a aVar2, C0649c c0649c, e eVar, boolean z12, f fVar, h hVar, int i12) {
        SearchParams searchParams2 = (i12 & 1) != 0 ? cVar.f10238b : searchParams;
        com.avito.android.developments_agency_search.adapter.commission_promo_banner.a aVar3 = (i12 & 2) != 0 ? cVar.f10239c : aVar;
        d dVar2 = (i12 & 4) != 0 ? cVar.f10240d : dVar;
        g gVar2 = (i12 & 8) != 0 ? cVar.f10241e : gVar;
        a aVar4 = (i12 & 16) != 0 ? cVar.f10242f : aVar2;
        C0649c c0649c2 = (i12 & 32) != 0 ? cVar.f10243g : c0649c;
        e eVar2 = (i12 & 64) != 0 ? cVar.f10244h : eVar;
        boolean z13 = (i12 & 128) != 0 ? cVar.f10245i : z12;
        f fVar2 = (i12 & 256) != 0 ? cVar.f10246j : fVar;
        h hVar2 = (i12 & 512) != 0 ? cVar.f10247k : hVar;
        cVar.getClass();
        return new c(searchParams2, aVar3, dVar2, gVar2, aVar4, c0649c2, eVar2, z13, fVar2, hVar2);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f10238b, cVar.f10238b) && L.f(this.f10239c, cVar.f10239c) && L.f(this.f10240d, cVar.f10240d) && L.f(this.f10241e, cVar.f10241e) && L.f(this.f10242f, cVar.f10242f) && L.f(this.f10243g, cVar.f10243g) && L.f(this.f10244h, cVar.f10244h) && this.f10245i == cVar.f10245i && L.f(this.f10246j, cVar.f10246j) && L.f(this.f10247k, cVar.f10247k);
    }

    public final int hashCode() {
        int iHashCode = this.f10238b.hashCode() * 31;
        com.avito.android.developments_agency_search.adapter.commission_promo_banner.a aVar = this.f10239c;
        return this.f10247k.hashCode() + ((this.f10246j.hashCode() + r.i((this.f10244h.hashCode() + ((this.f10243g.hashCode() + ((this.f10242f.hashCode() + ((this.f10241e.hashCode() + ((this.f10240d.hashCode() + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, this.f10245i)) * 31);
    }

    @k
    public final String toString() {
        return "RealtyAgencySearchState(searchParams=" + this.f10238b + ", commissionPromoBannerItem=" + this.f10239c + ", inlineFiltersViewState=" + this.f10240d + ", tabLayoutState=" + this.f10241e + ", actionsBlockState=" + this.f10242f + ", developmentsData=" + this.f10243g + ", lotsData=" + this.f10244h + ", isContentBottomSheetCollapsed=" + this.f10245i + ", mapData=" + this.f10246j + ", viewState=" + this.f10247k + ')';
    }
}
