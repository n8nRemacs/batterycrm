package com.avito.android.map.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.avito_map.marker.MarkerWithCount;
import com.avito.android.map.MapArguments;
import com.avito.android.map.analytics.ParentType;
import com.avito.android.map_core.view.draw_button.DrawingState;
import com.avito.android.remote.model.CloseMapButton;
import com.avito.android.remote.model.Counter;
import com.avito.android.remote.model.MapOnboarding;
import com.avito.android.remote.model.MarkersFeatures;
import com.avito.android.remote.model.PinFloatingContainer;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.category_parameters.HiddenParameter;
import com.avito.android.remote.model.serp_floating_container.SerpFloatingContainerState;
import com.avito.android.serp.adapter.l1;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.shortcut_navigation_bar.PinnedItem;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import okhttp3.internal.http2.Http2;

/* compiled from: MapState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/map/mvi/entity/a;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "b", "c", "d", "e", "f", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a extends q {

    /* renamed from: E, reason: collision with root package name */
    @k
    public static final b f185146E = new b(null);

    /* renamed from: A, reason: collision with root package name */
    @l
    public final Integer f185147A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f185148B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f185149C;

    /* renamed from: D, reason: collision with root package name */
    @k
    public final com.avito.android.map.mvi.entity.b f185150D;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SearchParams f185151b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<MarkerItem> f185152c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final MarkersFeatures f185153d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LoadState f185154e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Counter f185155f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Float f185156g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final LatLngBounds f185157h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f185158i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final d f185159j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f185160k;

    /* renamed from: l, reason: collision with root package name */
    @l
    public final CloseMapButton f185161l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final List<AvitoMapPoint> f185162m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final DrawingState f185163n;

    /* renamed from: o, reason: collision with root package name */
    @k
    public final C5436a f185164o;

    /* renamed from: p, reason: collision with root package name */
    @l
    public final ParentType f185165p;

    /* renamed from: q, reason: collision with root package name */
    @k
    public final String f185166q;

    /* renamed from: r, reason: collision with root package name */
    @k
    public final f f185167r;

    /* renamed from: s, reason: collision with root package name */
    @k
    public final c f185168s;

    /* renamed from: t, reason: collision with root package name */
    @k
    public final PresentationType f185169t;

    /* renamed from: u, reason: collision with root package name */
    @l
    public final LatLng f185170u;

    /* renamed from: v, reason: collision with root package name */
    @k
    public final e f185171v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f185172w;

    /* renamed from: x, reason: collision with root package name */
    @k
    public final SerpSpaceType f185173x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f185174y;

    /* renamed from: z, reason: collision with root package name */
    @l
    public final String f185175z;

    /* compiled from: MapState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/map/mvi/entity/a$a;", "", "a", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map.mvi.entity.a$a, reason: collision with other inner class name */
    public static final /* data */ class C5436a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final List<l1> f185176a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SerpDisplayType f185177b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final LoadState f185178c;

        /* renamed from: d, reason: collision with root package name */
        public final int f185179d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final C5437a f185180e;

        /* renamed from: f, reason: collision with root package name */
        public final int f185181f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final List<String> f185182g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final String f185183h;

        /* renamed from: i, reason: collision with root package name */
        public final int f185184i;

        /* renamed from: j, reason: collision with root package name */
        public final boolean f185185j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final PinnedItem f185186k;

        /* renamed from: l, reason: collision with root package name */
        @k
        public final SerpFloatingContainerState f185187l;

        /* renamed from: m, reason: collision with root package name */
        @l
        public final PinFloatingContainer f185188m;

        /* compiled from: MapState.kt */
        @s0
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/a$a$a;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.map.mvi.entity.a$a$a, reason: collision with other inner class name */
        public static final /* data */ class C5437a {

            /* renamed from: a, reason: collision with root package name */
            @l
            public final String f185189a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final List<String> f185190b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final String f185191c;

            /* renamed from: d, reason: collision with root package name */
            @k
            public final LatLng f185192d;

            /* renamed from: e, reason: collision with root package name */
            @l
            public final List<String> f185193e;

            public C5437a() {
                throw null;
            }

            public C5437a(String str, List list, String str2, LatLng latLng, List list2, int i12, C42822w c42822w) {
                str = (i12 & 1) != 0 ? null : str;
                list = (i12 & 2) != 0 ? C42784z0.f406748b : list;
                str2 = (i12 & 4) != 0 ? null : str2;
                list2 = (i12 & 16) != 0 ? C42784z0.f406748b : list2;
                this.f185189a = str;
                this.f185190b = list;
                this.f185191c = str2;
                this.f185192d = latLng;
                this.f185193e = list2;
                if (list.isEmpty()) {
                    this.f185190b = str != null ? C43066x.f0(str, new String[]{","}, 0, 6) : C42784z0.f406748b;
                }
            }

            @k
            /* renamed from: a, reason: from getter */
            public final LatLng getF185192d() {
                return this.f185192d;
            }

            @l
            public final List<String> b() {
                return this.f185193e;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C5437a)) {
                    return false;
                }
                C5437a c5437a = (C5437a) obj;
                return L.f(this.f185189a, c5437a.f185189a) && L.f(this.f185190b, c5437a.f185190b) && L.f(this.f185191c, c5437a.f185191c) && L.f(this.f185192d, c5437a.f185192d) && L.f(this.f185193e, c5437a.f185193e);
            }

            public final int hashCode() {
                String str = this.f185189a;
                int iE2 = H.e((str == null ? 0 : str.hashCode()) * 31, 31, this.f185190b);
                String str2 = this.f185191c;
                int iHashCode = (this.f185192d.hashCode() + ((iE2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
                List<String> list = this.f185193e;
                return iHashCode + (list != null ? list.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Pin(pinId=");
                sb2.append(this.f185189a);
                sb2.append(", advertIds=");
                sb2.append(this.f185190b);
                sb2.append(", context=");
                sb2.append(this.f185191c);
                sb2.append(", coordinates=");
                sb2.append(this.f185192d);
                sb2.append(", favouriteAdverts=");
                return H.p(sb2, this.f185193e, ')');
            }
        }

        public C5436a() {
            this(null, null, null, 0, null, 0, null, null, 0, false, null, null, null, 8191, null);
        }

        public static C5436a a(C5436a c5436a, List list, LoadState loadState, int i12, C5437a c5437a, int i13, String str, int i14, boolean z12, PinnedItem pinnedItem, SerpFloatingContainerState serpFloatingContainerState, PinFloatingContainer pinFloatingContainer, int i15) {
            List list2 = (i15 & 1) != 0 ? c5436a.f185176a : list;
            SerpDisplayType serpDisplayType = c5436a.f185177b;
            LoadState loadState2 = (i15 & 4) != 0 ? c5436a.f185178c : loadState;
            int i16 = (i15 & 8) != 0 ? c5436a.f185179d : i12;
            C5437a c5437a2 = (i15 & 16) != 0 ? c5436a.f185180e : c5437a;
            int i17 = (i15 & 32) != 0 ? c5436a.f185181f : i13;
            List<String> list3 = c5436a.f185182g;
            String str2 = (i15 & 128) != 0 ? c5436a.f185183h : str;
            int i18 = (i15 & 256) != 0 ? c5436a.f185184i : i14;
            boolean z13 = (i15 & 512) != 0 ? c5436a.f185185j : z12;
            PinnedItem pinnedItem2 = (i15 & 1024) != 0 ? c5436a.f185186k : pinnedItem;
            SerpFloatingContainerState serpFloatingContainerState2 = (i15 & 2048) != 0 ? c5436a.f185187l : serpFloatingContainerState;
            PinFloatingContainer pinFloatingContainer2 = (i15 & 4096) != 0 ? c5436a.f185188m : pinFloatingContainer;
            c5436a.getClass();
            return new C5436a(list2, serpDisplayType, loadState2, i16, c5437a2, i17, list3, str2, i18, z13, pinnedItem2, serpFloatingContainerState2, pinFloatingContainer2);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5436a)) {
                return false;
            }
            C5436a c5436a = (C5436a) obj;
            return L.f(this.f185176a, c5436a.f185176a) && this.f185177b == c5436a.f185177b && this.f185178c == c5436a.f185178c && this.f185179d == c5436a.f185179d && L.f(this.f185180e, c5436a.f185180e) && this.f185181f == c5436a.f185181f && L.f(this.f185182g, c5436a.f185182g) && L.f(this.f185183h, c5436a.f185183h) && this.f185184i == c5436a.f185184i && this.f185185j == c5436a.f185185j && L.f(this.f185186k, c5436a.f185186k) && L.f(this.f185187l, c5436a.f185187l) && L.f(this.f185188m, c5436a.f185188m);
        }

        public final int hashCode() {
            List<l1> list = this.f185176a;
            int iE2 = r.e(this.f185179d, (this.f185178c.hashCode() + com.avito.android.actions_sheet.a.h(this.f185177b, (list == null ? 0 : list.hashCode()) * 31, 31)) * 31, 31);
            C5437a c5437a = this.f185180e;
            int iE3 = r.e(this.f185181f, (iE2 + (c5437a == null ? 0 : c5437a.hashCode())) * 31, 31);
            List<String> list2 = this.f185182g;
            int i12 = r.i(r.e(this.f185184i, H.d((iE3 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f185183h), 31), 31, this.f185185j);
            PinnedItem pinnedItem = this.f185186k;
            int iHashCode = (this.f185187l.hashCode() + ((i12 + (pinnedItem == null ? 0 : pinnedItem.hashCode())) * 31)) * 31;
            PinFloatingContainer pinFloatingContainer = this.f185188m;
            return iHashCode + (pinFloatingContainer != null ? pinFloatingContainer.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "AdvertsInPinState(adverts=" + this.f185176a + ", displayType=" + this.f185177b + ", loadState=" + this.f185178c + ", currentAdvertsCount=" + this.f185179d + ", pin=" + this.f185180e + ", actualCount=" + this.f185181f + ", favouriteAdverts=" + this.f185182g + ", panelState=" + this.f185183h + ", scrollToTopPaddingTop=" + this.f185184i + ", isScrollToTopVisible=" + this.f185185j + ", pinnedItem=" + this.f185186k + ", serpFloatingContainerState=" + this.f185187l + ", pinFloatingContainer=" + this.f185188m + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public C5436a(@l List<? extends l1> list, @k SerpDisplayType serpDisplayType, @k LoadState loadState, int i12, @l C5437a c5437a, int i13, @l List<String> list2, @k String str, int i14, boolean z12, @l PinnedItem pinnedItem, @k SerpFloatingContainerState serpFloatingContainerState, @l PinFloatingContainer pinFloatingContainer) {
            this.f185176a = list;
            this.f185177b = serpDisplayType;
            this.f185178c = loadState;
            this.f185179d = i12;
            this.f185180e = c5437a;
            this.f185181f = i13;
            this.f185182g = list2;
            this.f185183h = str;
            this.f185184i = i14;
            this.f185185j = z12;
            this.f185186k = pinnedItem;
            this.f185187l = serpFloatingContainerState;
            this.f185188m = pinFloatingContainer;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public /* synthetic */ C5436a(List list, SerpDisplayType serpDisplayType, LoadState loadState, int i12, C5437a c5437a, int i13, List list2, String str, int i14, boolean z12, PinnedItem pinnedItem, SerpFloatingContainerState serpFloatingContainerState, PinFloatingContainer pinFloatingContainer, int i15, C42822w c42822w) {
            PinnedItem pinnedItem2;
            SerpFloatingContainerState serpFloatingContainerState2;
            Object[] objArr = 0;
            List list3 = (i15 & 1) != 0 ? null : list;
            SerpDisplayType serpDisplayType2 = (i15 & 2) != 0 ? SerpDisplayType.Grid : serpDisplayType;
            LoadState loadState2 = (i15 & 4) != 0 ? LoadState.f185047b : loadState;
            boolean z13 = false;
            int i16 = (i15 & 8) != 0 ? 0 : i12;
            C5437a c5437a2 = (i15 & 16) != 0 ? null : c5437a;
            int i17 = (i15 & 32) != 0 ? 0 : i13;
            List list4 = (i15 & 64) != 0 ? null : list2;
            String str2 = (i15 & 128) != 0 ? HiddenParameter.TYPE : str;
            int i18 = (i15 & 256) != 0 ? 0 : i14;
            boolean z14 = (i15 & 512) != 0 ? false : z12;
            PinnedItem pinnedItem3 = (i15 & 1024) != 0 ? null : pinnedItem;
            if ((i15 & 2048) != 0) {
                pinnedItem2 = pinnedItem3;
                serpFloatingContainerState2 = new SerpFloatingContainerState(0.0f, z13, 3, objArr == true ? 1 : 0);
            } else {
                pinnedItem2 = pinnedItem3;
                serpFloatingContainerState2 = serpFloatingContainerState;
            }
            this(list3, serpDisplayType2, loadState2, i16, c5437a2, i17, list4, str2, i18, z14, pinnedItem2, serpFloatingContainerState2, (i15 & 4096) == 0 ? pinFloatingContainer : null);
        }
    }

    /* compiled from: MapState.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/map/mvi/entity/a$b;", "", "<init>", "()V", "", "REALTY_VERTICAL_ID", "I", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:18:0x00f0  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x00f4  */
        /* JADX WARN: Removed duplicated region for block: B:25:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x015a  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0167  */
        @Y61.k
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static com.avito.android.map.mvi.entity.a a(@Y61.k com.avito.android.map.MapArguments r72) {
            /*
                Method dump skipped, instructions count: 446
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.map.mvi.entity.a.b.a(com.avito.android.map.MapArguments):com.avito.android.map.mvi.entity.a");
        }

        public b() {
        }
    }

    /* compiled from: MapState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/a$c;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final MapOnboarding f185194a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f185195b;

        /* JADX WARN: Multi-variable type inference failed */
        public c() {
            this(null, false, 3, 0 == true ? 1 : 0);
        }

        @k
        public static c a(@l MapOnboarding mapOnboarding) {
            return new c(mapOnboarding, true);
        }

        public static c b(c cVar, boolean z12) {
            MapOnboarding mapOnboarding = cVar.f185194a;
            cVar.getClass();
            return new c(mapOnboarding, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f185194a, cVar.f185194a) && this.f185195b == cVar.f185195b;
        }

        public final int hashCode() {
            MapOnboarding mapOnboarding = this.f185194a;
            return Boolean.hashCode(this.f185195b) + ((mapOnboarding == null ? 0 : mapOnboarding.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MapOnboardingState(onboarding=");
            sb2.append(this.f185194a);
            sb2.append(", isVisible=");
            return r.x(sb2, this.f185195b, ')');
        }

        public c(@l MapOnboarding mapOnboarding, boolean z12) {
            this.f185194a = mapOnboarding;
            this.f185195b = z12;
        }

        public /* synthetic */ c(MapOnboarding mapOnboarding, boolean z12, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : mapOnboarding, (i12 & 2) != 0 ? false : z12);
        }
    }

    /* compiled from: MapState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/map/mvi/entity/a$d;", "", "a", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final C5438a f185196d = new C5438a(null);

        /* renamed from: e, reason: collision with root package name */
        @k
        public static final d f185197e = new d(null, true, true);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final MarkerItem.MyLocation f185198a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f185199b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f185200c;

        /* compiled from: MapState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/a$d$a;", "", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.map.mvi.entity.a$d$a, reason: collision with other inner class name */
        public static final class C5438a {
            public /* synthetic */ C5438a(C42822w c42822w) {
                this();
            }

            public C5438a() {
            }
        }

        public d() {
            this(null, false, false, 7, null);
        }

        @k
        public static d a(@l MarkerItem.MyLocation myLocation) {
            return new d(myLocation, true, true);
        }

        public static d b(d dVar, boolean z12, int i12) {
            MarkerItem.MyLocation myLocation = dVar.f185198a;
            boolean z13 = (i12 & 2) != 0 ? dVar.f185199b : false;
            if ((i12 & 4) != 0) {
                z12 = dVar.f185200c;
            }
            dVar.getClass();
            return new d(myLocation, z13, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return L.f(this.f185198a, dVar.f185198a) && this.f185199b == dVar.f185199b && this.f185200c == dVar.f185200c;
        }

        public final int hashCode() {
            MarkerItem.MyLocation myLocation = this.f185198a;
            return Boolean.hashCode(this.f185200c) + r.i((myLocation == null ? 0 : myLocation.hashCode()) * 31, 31, this.f185199b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MyLocationState(myCoords=");
            sb2.append(this.f185198a);
            sb2.append(", isGpsEnabled=");
            sb2.append(this.f185199b);
            sb2.append(", isLocationPermissionEnabled=");
            return r.x(sb2, this.f185200c, ')');
        }

        public d(@l MarkerItem.MyLocation myLocation, boolean z12, boolean z13) {
            this.f185198a = myLocation;
            this.f185199b = z12;
            this.f185200c = z13;
        }

        public /* synthetic */ d(MarkerItem.MyLocation myLocation, boolean z12, boolean z13, int i12, C42822w c42822w) {
            this((i12 & 1) != 0 ? null : myLocation, (i12 & 2) != 0 ? true : z12, (i12 & 4) != 0 ? true : z13);
        }
    }

    /* compiled from: MapState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/a$e;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f185201a;

        public e() {
            this(0, 1, null);
        }

        @k
        public static e a(int i12) {
            return new e(i12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f185201a == ((e) obj).f185201a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f185201a);
        }

        @k
        public final String toString() {
            return r.t(new StringBuilder("ShortcutsState(height="), this.f185201a, ')');
        }

        public e(int i12) {
            this.f185201a = i12;
        }

        public /* synthetic */ e(int i12, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? 0 : i12);
        }
    }

    /* compiled from: MapState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/a$f;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f185202a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f185203b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final InlineAction.Predefined.State f185204c;

        public f() {
            this(null, false, null, 7, null);
        }

        @k
        public static f a(@k InlineAction.Predefined.State state, @l String str, boolean z12) {
            return new f(state, str, z12);
        }

        public static f b(f fVar) {
            InlineAction.Predefined.State state = InlineAction.Predefined.State.f283120d;
            String str = fVar.f185202a;
            boolean z12 = fVar.f185203b;
            fVar.getClass();
            return new f(state, str, z12);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return L.f(this.f185202a, fVar.f185202a) && this.f185203b == fVar.f185203b && this.f185204c == fVar.f185204c;
        }

        public final int hashCode() {
            String str = this.f185202a;
            return this.f185204c.hashCode() + r.i((str == null ? 0 : str.hashCode()) * 31, 31, this.f185203b);
        }

        @k
        public final String toString() {
            return "SubscriptionState(subscriptionId=" + this.f185202a + ", isSubscribed=" + this.f185203b + ", actionState=" + this.f185204c + ')';
        }

        public f(@k InlineAction.Predefined.State state, @l String str, boolean z12) {
            this.f185202a = str;
            this.f185203b = z12;
            this.f185204c = state;
        }

        public /* synthetic */ f(String str, boolean z12, InlineAction.Predefined.State state, int i12, C42822w c42822w) {
            this((i12 & 4) != 0 ? InlineAction.Predefined.State.f283119c : state, (i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? false : z12);
        }
    }

    static {
        b.a(new MapArguments(null, null, null, null, null, null, null, null, PresentationType.SIMPLE_MAP, null, null, 1791, null));
    }

    public /* synthetic */ a(SearchParams searchParams, List list, MarkersFeatures markersFeatures, LoadState loadState, Counter counter, Float f12, LatLngBounds latLngBounds, boolean z12, d dVar, String str, CloseMapButton closeMapButton, List list2, DrawingState drawingState, C5436a c5436a, ParentType parentType, String str2, f fVar, c cVar, PresentationType presentationType, LatLng latLng, e eVar, boolean z13, SerpSpaceType serpSpaceType, boolean z14, String str3, Integer num, boolean z15, boolean z16, com.avito.android.map.mvi.entity.b bVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null) : searchParams, list, markersFeatures, loadState, (i12 & 16) != 0 ? null : counter, (i12 & 32) != 0 ? null : f12, (i12 & 64) != 0 ? null : latLngBounds, (i12 & 128) != 0 ? true : z12, (i12 & 256) != 0 ? new d(null, false, false, 7, null) : dVar, (i12 & 512) != 0 ? null : str, (i12 & 1024) != 0 ? null : closeMapButton, (i12 & 2048) != 0 ? null : list2, drawingState, (i12 & 8192) != 0 ? new C5436a(null, null, null, 0, null, 0, null, null, 0, false, null, null, null, 8191, null) : c5436a, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : parentType, str2, (65536 & i12) != 0 ? new f(null, false, null, 7, null) : fVar, cVar, presentationType, latLng, (1048576 & i12) != 0 ? new e(0, 1, null) : eVar, z13, serpSpaceType, z14, str3, (33554432 & i12) != 0 ? null : num, (67108864 & i12) != 0 ? false : z15, (i12 & 134217728) != 0 ? false : z16, bVar);
    }

    public static a a(a aVar, SearchParams searchParams, List list, MarkersFeatures markersFeatures, LoadState loadState, Counter counter, Float f12, LatLngBounds latLngBounds, boolean z12, d dVar, String str, CloseMapButton closeMapButton, List list2, DrawingState drawingState, C5436a c5436a, ParentType parentType, String str2, f fVar, c cVar, LatLng latLng, e eVar, boolean z13, boolean z14, String str3, Integer num, boolean z15, boolean z16, com.avito.android.map.mvi.entity.b bVar, int i12) {
        SerpSpaceType serpSpaceType;
        boolean z17;
        SearchParams searchParams2 = (i12 & 1) != 0 ? aVar.f185151b : searchParams;
        List list3 = (i12 & 2) != 0 ? aVar.f185152c : list;
        MarkersFeatures markersFeatures2 = (i12 & 4) != 0 ? aVar.f185153d : markersFeatures;
        LoadState loadState2 = (i12 & 8) != 0 ? aVar.f185154e : loadState;
        Counter counter2 = (i12 & 16) != 0 ? aVar.f185155f : counter;
        Float f13 = (i12 & 32) != 0 ? aVar.f185156g : f12;
        LatLngBounds latLngBounds2 = (i12 & 64) != 0 ? aVar.f185157h : latLngBounds;
        boolean z18 = (i12 & 128) != 0 ? aVar.f185158i : z12;
        d dVar2 = (i12 & 256) != 0 ? aVar.f185159j : dVar;
        String str4 = (i12 & 512) != 0 ? aVar.f185160k : str;
        CloseMapButton closeMapButton2 = (i12 & 1024) != 0 ? aVar.f185161l : closeMapButton;
        List list4 = (i12 & 2048) != 0 ? aVar.f185162m : list2;
        DrawingState drawingState2 = (i12 & 4096) != 0 ? aVar.f185163n : drawingState;
        C5436a c5436a2 = (i12 & 8192) != 0 ? aVar.f185164o : c5436a;
        ParentType parentType2 = (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? aVar.f185165p : parentType;
        String str5 = (32768 & i12) != 0 ? aVar.f185166q : str2;
        f fVar2 = (65536 & i12) != 0 ? aVar.f185167r : fVar;
        c cVar2 = (131072 & i12) != 0 ? aVar.f185168s : cVar;
        PresentationType presentationType = aVar.f185169t;
        LatLng latLng2 = (524288 & i12) != 0 ? aVar.f185170u : latLng;
        e eVar2 = (1048576 & i12) != 0 ? aVar.f185171v : eVar;
        boolean z19 = (2097152 & i12) != 0 ? aVar.f185172w : z13;
        SerpSpaceType serpSpaceType2 = aVar.f185173x;
        if ((i12 & 8388608) != 0) {
            serpSpaceType = serpSpaceType2;
            z17 = aVar.f185174y;
        } else {
            serpSpaceType = serpSpaceType2;
            z17 = z14;
        }
        String str6 = (16777216 & i12) != 0 ? aVar.f185175z : str3;
        Integer num2 = (33554432 & i12) != 0 ? aVar.f185147A : num;
        boolean z22 = (67108864 & i12) != 0 ? aVar.f185148B : z15;
        boolean z23 = (134217728 & i12) != 0 ? aVar.f185149C : z16;
        com.avito.android.map.mvi.entity.b bVar2 = (i12 & 268435456) != 0 ? aVar.f185150D : bVar;
        aVar.getClass();
        return new a(searchParams2, list3, markersFeatures2, loadState2, counter2, f13, latLngBounds2, z18, dVar2, str4, closeMapButton2, list4, drawingState2, c5436a2, parentType2, str5, fVar2, cVar2, presentationType, latLng2, eVar2, z19, serpSpaceType, z17, str6, num2, z22, z23, bVar2);
    }

    @k
    /* renamed from: c, reason: from getter */
    public final C5436a getF185164o() {
        return this.f185164o;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final String getF185166q() {
        return this.f185166q;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final c getF185168s() {
        return this.f185168s;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f185151b, aVar.f185151b) && L.f(this.f185152c, aVar.f185152c) && L.f(this.f185153d, aVar.f185153d) && this.f185154e == aVar.f185154e && L.f(this.f185155f, aVar.f185155f) && L.f(this.f185156g, aVar.f185156g) && L.f(this.f185157h, aVar.f185157h) && this.f185158i == aVar.f185158i && L.f(this.f185159j, aVar.f185159j) && L.f(this.f185160k, aVar.f185160k) && L.f(this.f185161l, aVar.f185161l) && L.f(this.f185162m, aVar.f185162m) && this.f185163n == aVar.f185163n && L.f(this.f185164o, aVar.f185164o) && this.f185165p == aVar.f185165p && L.f(this.f185166q, aVar.f185166q) && L.f(this.f185167r, aVar.f185167r) && L.f(this.f185168s, aVar.f185168s) && this.f185169t == aVar.f185169t && L.f(this.f185170u, aVar.f185170u) && L.f(this.f185171v, aVar.f185171v) && this.f185172w == aVar.f185172w && this.f185173x == aVar.f185173x && this.f185174y == aVar.f185174y && L.f(this.f185175z, aVar.f185175z) && L.f(this.f185147A, aVar.f185147A) && this.f185148B == aVar.f185148B && this.f185149C == aVar.f185149C && L.f(this.f185150D, aVar.f185150D);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final PresentationType getF185169t() {
        return this.f185169t;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getF185149C() {
        return this.f185149C;
    }

    @k
    /* renamed from: h, reason: from getter */
    public final SearchParams getF185151b() {
        return this.f185151b;
    }

    public final int hashCode() {
        int iE2 = H.e(this.f185151b.hashCode() * 31, 31, this.f185152c);
        MarkersFeatures markersFeatures = this.f185153d;
        int iHashCode = (this.f185154e.hashCode() + ((iE2 + (markersFeatures == null ? 0 : markersFeatures.hashCode())) * 31)) * 31;
        Counter counter = this.f185155f;
        int iHashCode2 = (iHashCode + (counter == null ? 0 : counter.hashCode())) * 31;
        Float f12 = this.f185156g;
        int iHashCode3 = (iHashCode2 + (f12 == null ? 0 : f12.hashCode())) * 31;
        LatLngBounds latLngBounds = this.f185157h;
        int iHashCode4 = (this.f185159j.hashCode() + r.i((iHashCode3 + (latLngBounds == null ? 0 : latLngBounds.hashCode())) * 31, 31, this.f185158i)) * 31;
        String str = this.f185160k;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        CloseMapButton closeMapButton = this.f185161l;
        int iHashCode6 = (iHashCode5 + (closeMapButton == null ? 0 : closeMapButton.hashCode())) * 31;
        List<AvitoMapPoint> list = this.f185162m;
        int iHashCode7 = (this.f185164o.hashCode() + ((this.f185163n.hashCode() + ((iHashCode6 + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31;
        ParentType parentType = this.f185165p;
        int iHashCode8 = (this.f185169t.hashCode() + ((this.f185168s.hashCode() + ((this.f185167r.hashCode() + H.d((iHashCode7 + (parentType == null ? 0 : parentType.hashCode())) * 31, 31, this.f185166q)) * 31)) * 31)) * 31;
        LatLng latLng = this.f185170u;
        int i12 = r.i((this.f185173x.hashCode() + r.i(r.e(this.f185171v.f185201a, (iHashCode8 + (latLng == null ? 0 : latLng.hashCode())) * 31, 31), 31, this.f185172w)) * 31, 31, this.f185174y);
        String str2 = this.f185175z;
        int iHashCode9 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.f185147A;
        return this.f185150D.hashCode() + r.i(r.i((iHashCode9 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f185148B), 31, this.f185149C);
    }

    @k
    /* renamed from: i, reason: from getter */
    public final e getF185171v() {
        return this.f185171v;
    }

    public final long j() {
        List<MarkerItem> list = this.f185152c;
        long count = 0;
        if (!list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((MarkerItem) it.next()) instanceof MarkerWithCount) {
                    count += ((MarkerWithCount) r1).getCount();
                }
            }
        }
        return count;
    }

    @k
    public final String toString() {
        return "MapState(searchParams=" + this.f185151b + ", markerItems=" + this.f185152c + ", markerFeatures=" + this.f185153d + ", markersState=" + this.f185154e + ", counter=" + this.f185155f + ", zoom=" + this.f185156g + ", bounds=" + this.f185157h + ", animate=" + this.f185158i + ", locationState=" + this.f185159j + ", selectedPinId=" + this.f185160k + ", closeButton=" + this.f185161l + ", drawArea=" + this.f185162m + ", drawingState=" + this.f185163n + ", advertsInPinState=" + this.f185164o + ", analyticsParentType=" + this.f185165p + ", analyticsSerpState=" + this.f185166q + ", subscriptionState=" + this.f185167r + ", mapOnboardingState=" + this.f185168s + ", presentationType=" + this.f185169t + ", forcedCenterCoordinates=" + this.f185170u + ", shortcutsState=" + this.f185171v + ", isButtonsVisible=" + this.f185172w + ", serpSpaceType=" + this.f185173x + ", userMovedMapSinceLastLocationUpdate=" + this.f185174y + ", newSerpMapInteraction=" + this.f185175z + ", verticalId=" + this.f185147A + ", userInteractedWithMap=" + this.f185148B + ", resetArea=" + this.f185149C + ", viewState=" + this.f185150D + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k SearchParams searchParams, @k List<? extends MarkerItem> list, @l MarkersFeatures markersFeatures, @k LoadState loadState, @l Counter counter, @l Float f12, @l LatLngBounds latLngBounds, boolean z12, @k d dVar, @l String str, @l CloseMapButton closeMapButton, @l List<AvitoMapPoint> list2, @k DrawingState drawingState, @k C5436a c5436a, @l ParentType parentType, @k String str2, @k f fVar, @k c cVar, @k PresentationType presentationType, @l LatLng latLng, @k e eVar, boolean z13, @k SerpSpaceType serpSpaceType, boolean z14, @l String str3, @l Integer num, boolean z15, boolean z16, @k com.avito.android.map.mvi.entity.b bVar) {
        this.f185151b = searchParams;
        this.f185152c = list;
        this.f185153d = markersFeatures;
        this.f185154e = loadState;
        this.f185155f = counter;
        this.f185156g = f12;
        this.f185157h = latLngBounds;
        this.f185158i = z12;
        this.f185159j = dVar;
        this.f185160k = str;
        this.f185161l = closeMapButton;
        this.f185162m = list2;
        this.f185163n = drawingState;
        this.f185164o = c5436a;
        this.f185165p = parentType;
        this.f185166q = str2;
        this.f185167r = fVar;
        this.f185168s = cVar;
        this.f185169t = presentationType;
        this.f185170u = latLng;
        this.f185171v = eVar;
        this.f185172w = z13;
        this.f185173x = serpSpaceType;
        this.f185174y = z14;
        this.f185175z = str3;
        this.f185147A = num;
        this.f185148B = z15;
        this.f185149C = z16;
        this.f185150D = bVar;
    }
}
