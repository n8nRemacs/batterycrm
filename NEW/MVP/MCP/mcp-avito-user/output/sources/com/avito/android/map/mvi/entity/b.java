package com.avito.android.map.mvi.entity;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.avito_map.marker.MarkerItem;
import com.avito.android.map.mvi.entity.a;
import com.avito.android.map_core.view.draw_button.DrawingState;
import com.avito.android.remote.model.CloseMapButton;
import com.avito.android.remote.model.Counter;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.UniversalColor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MapViewState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/map/mvi/entity/b;", "", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class b {

    /* renamed from: g, reason: collision with root package name */
    @k
    public static final c f185205g = new c(null);

    /* renamed from: a, reason: collision with root package name */
    @k
    public final j f185206a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final i f185207b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final d f185208c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final g f185209d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final a f185210e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final C5439b f185211f;

    /* compiled from: MapViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/b$a;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final a.C5436a f185212a;

        /* renamed from: b, reason: collision with root package name */
        public final int f185213b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f185214c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f185215d;

        public a(@k a.C5436a c5436a, int i12, boolean z12, boolean z13) {
            this.f185212a = c5436a;
            this.f185213b = i12;
            this.f185214c = z12;
            this.f185215d = z13;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f185212a, aVar.f185212a) && this.f185213b == aVar.f185213b && this.f185214c == aVar.f185214c && this.f185215d == aVar.f185215d;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f185215d) + r.i(r.e(this.f185213b, this.f185212a.hashCode() * 31, 31), 31, this.f185214c);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertsInPinViewState(state=");
            sb2.append(this.f185212a);
            sb2.append(", panelPaddingTop=");
            sb2.append(this.f185213b);
            sb2.append(", isNewSerpMapAvailable=");
            sb2.append(this.f185214c);
            sb2.append(", isVisible=");
            return r.x(sb2, this.f185215d, ')');
        }
    }

    /* compiled from: MapViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/b$b;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.map.mvi.entity.b$b, reason: collision with other inner class name */
    public static final /* data */ class C5439b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f185216a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f185217b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f185218c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final DrawingState f185219d;

        /* renamed from: e, reason: collision with root package name */
        public final int f185220e;

        public C5439b(boolean z12, boolean z13, boolean z14, @k DrawingState drawingState, int i12) {
            this.f185216a = z12;
            this.f185217b = z13;
            this.f185218c = z14;
            this.f185219d = drawingState;
            this.f185220e = i12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C5439b)) {
                return false;
            }
            C5439b c5439b = (C5439b) obj;
            return this.f185216a == c5439b.f185216a && this.f185217b == c5439b.f185217b && this.f185218c == c5439b.f185218c && this.f185219d == c5439b.f185219d && this.f185220e == c5439b.f185220e;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f185220e) + ((this.f185219d.hashCode() + r.i(r.i(Boolean.hashCode(this.f185216a) * 31, 31, this.f185217b), 31, this.f185218c)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ButtonState(isVisible=");
            sb2.append(this.f185216a);
            sb2.append(", isLoading=");
            sb2.append(this.f185217b);
            sb2.append(", isNewSerpMapAvailable=");
            sb2.append(this.f185218c);
            sb2.append(", drawingState=");
            sb2.append(this.f185219d);
            sb2.append(", bottomSheetPaddingTop=");
            return r.t(sb2, this.f185220e, ')');
        }
    }

    /* compiled from: MapViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/b$c;", "", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: MapViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/b$d;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final LoadState f185221a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<MarkerItem> f185222b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final LatLngBounds f185223c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final Float f185224d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f185225e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final SearchParams f185226f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final DrawingState f185227g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final List<AvitoMapPoint> f185228h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Counter f185229i;

        /* renamed from: j, reason: collision with root package name */
        @k
        public final a.c f185230j;

        /* renamed from: k, reason: collision with root package name */
        @l
        public final CloseMapButton f185231k;

        /* renamed from: l, reason: collision with root package name */
        @l
        public final LatLng f185232l;

        /* renamed from: m, reason: collision with root package name */
        public final int f185233m;

        /* renamed from: n, reason: collision with root package name */
        public final boolean f185234n;

        /* renamed from: o, reason: collision with root package name */
        @l
        public final h f185235o;

        /* renamed from: p, reason: collision with root package name */
        @k
        public final e f185236p;

        /* renamed from: q, reason: collision with root package name */
        @k
        public final f f185237q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f185238r;

        /* JADX WARN: Multi-variable type inference failed */
        public d(@k LoadState loadState, @k List<? extends MarkerItem> list, @l LatLngBounds latLngBounds, @l Float f12, boolean z12, @k SearchParams searchParams, @k DrawingState drawingState, @l List<AvitoMapPoint> list2, @l Counter counter, @k a.c cVar, @l CloseMapButton closeMapButton, @l LatLng latLng, int i12, boolean z13, @l h hVar, @k e eVar, @k f fVar, boolean z14) {
            this.f185221a = loadState;
            this.f185222b = list;
            this.f185223c = latLngBounds;
            this.f185224d = f12;
            this.f185225e = z12;
            this.f185226f = searchParams;
            this.f185227g = drawingState;
            this.f185228h = list2;
            this.f185229i = counter;
            this.f185230j = cVar;
            this.f185231k = closeMapButton;
            this.f185232l = latLng;
            this.f185233m = i12;
            this.f185234n = z13;
            this.f185235o = hVar;
            this.f185236p = eVar;
            this.f185237q = fVar;
            this.f185238r = z14;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f185221a == dVar.f185221a && L.f(this.f185222b, dVar.f185222b) && L.f(this.f185223c, dVar.f185223c) && L.f(this.f185224d, dVar.f185224d) && this.f185225e == dVar.f185225e && L.f(this.f185226f, dVar.f185226f) && this.f185227g == dVar.f185227g && L.f(this.f185228h, dVar.f185228h) && L.f(this.f185229i, dVar.f185229i) && L.f(this.f185230j, dVar.f185230j) && L.f(this.f185231k, dVar.f185231k) && L.f(this.f185232l, dVar.f185232l) && this.f185233m == dVar.f185233m && this.f185234n == dVar.f185234n && L.f(this.f185235o, dVar.f185235o) && L.f(this.f185236p, dVar.f185236p) && L.f(this.f185237q, dVar.f185237q) && this.f185238r == dVar.f185238r;
        }

        public final int hashCode() {
            int iE2 = H.e(this.f185221a.hashCode() * 31, 31, this.f185222b);
            LatLngBounds latLngBounds = this.f185223c;
            int iHashCode = (iE2 + (latLngBounds == null ? 0 : latLngBounds.hashCode())) * 31;
            Float f12 = this.f185224d;
            int iHashCode2 = (this.f185227g.hashCode() + ((this.f185226f.hashCode() + r.i((iHashCode + (f12 == null ? 0 : f12.hashCode())) * 31, 31, this.f185225e)) * 31)) * 31;
            List<AvitoMapPoint> list = this.f185228h;
            int iHashCode3 = (iHashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            Counter counter = this.f185229i;
            int iHashCode4 = (this.f185230j.hashCode() + ((iHashCode3 + (counter == null ? 0 : counter.hashCode())) * 31)) * 31;
            CloseMapButton closeMapButton = this.f185231k;
            int iHashCode5 = (iHashCode4 + (closeMapButton == null ? 0 : closeMapButton.hashCode())) * 31;
            LatLng latLng = this.f185232l;
            int i12 = r.i(r.e(this.f185233m, (iHashCode5 + (latLng == null ? 0 : latLng.hashCode())) * 31, 31), 31, this.f185234n);
            h hVar = this.f185235o;
            return Boolean.hashCode(this.f185238r) + r.i(r.i((i12 + (hVar != null ? hVar.hashCode() : 0)) * 31, 31, this.f185236p.f185239a), 31, this.f185237q.f185240a);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentState(markersState=");
            sb2.append(this.f185221a);
            sb2.append(", markerItems=");
            sb2.append(this.f185222b);
            sb2.append(", bounds=");
            sb2.append(this.f185223c);
            sb2.append(", zoom=");
            sb2.append(this.f185224d);
            sb2.append(", animate=");
            sb2.append(this.f185225e);
            sb2.append(", searchParams=");
            sb2.append(this.f185226f);
            sb2.append(", drawingState=");
            sb2.append(this.f185227g);
            sb2.append(", drawArea=");
            sb2.append(this.f185228h);
            sb2.append(", counter=");
            sb2.append(this.f185229i);
            sb2.append(", mapOnboardingState=");
            sb2.append(this.f185230j);
            sb2.append(", closeButton=");
            sb2.append(this.f185231k);
            sb2.append(", forcedCenterCoordinates=");
            sb2.append(this.f185232l);
            sb2.append(", bottomSheetPaddingTop=");
            sb2.append(this.f185233m);
            sb2.append(", isNewSerpMapAvailable=");
            sb2.append(this.f185234n);
            sb2.append(", showListButtonState=");
            sb2.append(this.f185235o);
            sb2.append(", errorMessageState=");
            sb2.append(this.f185236p);
            sb2.append(", loaderState=");
            sb2.append(this.f185237q);
            sb2.append(", resetArea=");
            return r.x(sb2, this.f185238r, ')');
        }
    }

    /* compiled from: MapViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/b$e;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class e {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f185239a;

        public e(boolean z12) {
            this.f185239a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.f185239a == ((e) obj).f185239a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f185239a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("ErrorMessageState(isVisible="), this.f185239a, ')');
        }
    }

    /* compiled from: MapViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/b$f;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class f {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f185240a;

        public f(boolean z12) {
            this.f185240a = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && this.f185240a == ((f) obj).f185240a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f185240a);
        }

        @k
        public final String toString() {
            return r.x(new StringBuilder("LoaderState(isVisible="), this.f185240a, ')');
        }
    }

    /* compiled from: MapViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/b$g;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class g {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final a.d f185241a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f185242b;

        public g(@k a.d dVar, boolean z12) {
            this.f185241a = dVar;
            this.f185242b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return L.f(this.f185241a, gVar.f185241a) && this.f185242b == gVar.f185242b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f185242b) + (this.f185241a.hashCode() * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("LocationState(location=");
            sb2.append(this.f185241a);
            sb2.append(", isNewSerpMapAvailable=");
            return r.x(sb2, this.f185242b, ')');
        }
    }

    /* compiled from: MapViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/map/mvi/entity/b$h;", "", "a", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class h {

        /* renamed from: d, reason: collision with root package name */
        @k
        public static final a f185243d = new a(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final String f185244a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final Boolean f185245b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f185246c;

        /* compiled from: MapViewState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/b$h$a;", "", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        public h(@l String str, boolean z12, @l Boolean bool) {
            this.f185244a = str;
            this.f185245b = bool;
            this.f185246c = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return L.f(this.f185244a, hVar.f185244a) && L.f(this.f185245b, hVar.f185245b) && this.f185246c == hVar.f185246c;
        }

        public final int hashCode() {
            String str = this.f185244a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.f185245b;
            return Boolean.hashCode(this.f185246c) + ((iHashCode + (bool != null ? bool.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ShowListButtonState(count=");
            sb2.append(this.f185244a);
            sb2.append(", isEnabled=");
            sb2.append(this.f185245b);
            sb2.append(", isVisible=");
            return r.x(sb2, this.f185246c, ')');
        }
    }

    /* compiled from: MapViewState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/map/mvi/entity/b$i;", "", "a", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class i {

        /* renamed from: c, reason: collision with root package name */
        @k
        public static final a f185247c = new a(null);

        /* renamed from: a, reason: collision with root package name */
        @l
        public final ToolbarConfig f185248a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f185249b;

        /* compiled from: MapViewState.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/map/mvi/entity/b$i$a;", "", "<init>", "()V", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            @k
            public static i a(@k String str) {
                return new i(new ToolbarConfig(new ToolbarConfig.ToolbarText(str, ToolbarConfig.DisplayMode.ALIGN_TO_UP_BUTTON), new UniversalColor("white", null, null), new UniversalColor(AvitoMapMarkerKt.AMENITY_TYPE_BLACK, null, null), null, null, null, null, null), false);
            }

            public a() {
            }
        }

        public i(@l ToolbarConfig toolbarConfig, boolean z12) {
            this.f185248a = toolbarConfig;
            this.f185249b = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return L.f(this.f185248a, iVar.f185248a) && this.f185249b == iVar.f185249b;
        }

        public final int hashCode() {
            ToolbarConfig toolbarConfig = this.f185248a;
            return Boolean.hashCode(this.f185249b) + ((toolbarConfig == null ? 0 : toolbarConfig.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ToolbarState(config=");
            sb2.append(this.f185248a);
            sb2.append(", userMovedMapSinceLastLocationUpdate=");
            return r.x(sb2, this.f185249b, ')');
        }
    }

    /* compiled from: MapViewState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/map/mvi/entity/b$j;", "", "_avito_search-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class j {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final PresentationType f185250a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final SerpSpaceType f185251b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final SearchParams f185252c;

        public j(@k PresentationType presentationType, @k SerpSpaceType serpSpaceType, @k SearchParams searchParams) {
            this.f185250a = presentationType;
            this.f185251b = serpSpaceType;
            this.f185252c = searchParams;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.f185250a == jVar.f185250a && this.f185251b == jVar.f185251b && L.f(this.f185252c, jVar.f185252c);
        }

        public final int hashCode() {
            return this.f185252c.hashCode() + ((this.f185251b.hashCode() + (this.f185250a.hashCode() * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UtilsState(presentationType=");
            sb2.append(this.f185250a);
            sb2.append(", serpSpaceType=");
            sb2.append(this.f185251b);
            sb2.append(", searchParams=");
            return com.avito.android.bxcontent.mvi.entity.f.m(sb2, this.f185252c, ')');
        }
    }

    public b(@k j jVar, @l i iVar, @k d dVar, @l g gVar, @k a aVar, @k C5439b c5439b) {
        this.f185206a = jVar;
        this.f185207b = iVar;
        this.f185208c = dVar;
        this.f185209d = gVar;
        this.f185210e = aVar;
        this.f185211f = c5439b;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return L.f(this.f185206a, bVar.f185206a) && L.f(this.f185207b, bVar.f185207b) && L.f(this.f185208c, bVar.f185208c) && L.f(this.f185209d, bVar.f185209d) && L.f(this.f185210e, bVar.f185210e) && L.f(this.f185211f, bVar.f185211f);
    }

    public final int hashCode() {
        int iHashCode = this.f185206a.hashCode() * 31;
        i iVar = this.f185207b;
        int iHashCode2 = (this.f185208c.hashCode() + ((iHashCode + (iVar == null ? 0 : iVar.hashCode())) * 31)) * 31;
        g gVar = this.f185209d;
        return this.f185211f.hashCode() + ((this.f185210e.hashCode() + ((iHashCode2 + (gVar != null ? gVar.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "MapViewState(utils=" + this.f185206a + ", toolbarState=" + this.f185207b + ", contentState=" + this.f185208c + ", locationState=" + this.f185209d + ", advertsInPinState=" + this.f185210e + ", buttonState=" + this.f185211f + ')';
    }
}
