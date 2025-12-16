package com.avito.android.universal_map.map.mvi.entity;

import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.media3.exoplayer.analytics.m;
import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.map_core.beduin.BeduinShowSpecificLocationAction;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.universal_map.map.common.marker.Marker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qG0.C47290a;

/* compiled from: UniversalMapState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/MapState;", "", "Diff", "a", "b", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MapState {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f305448a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Coordinates f305449b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final rG0.c f305450c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final AvitoMapBounds f305451d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final BeduinShowSpecificLocationAction f305452e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a f305453f;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: UniversalMapState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/MapState$Diff;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Diff {

        /* renamed from: b, reason: collision with root package name */
        public static final Diff f305454b;

        /* renamed from: c, reason: collision with root package name */
        public static final Diff f305455c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ Diff[] f305456d;

        /* renamed from: e, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f305457e;

        static {
            Diff diff = new Diff("ADDED", 0);
            f305454b = diff;
            Diff diff2 = new Diff("OUTDATED", 1);
            f305455c = diff2;
            Diff[] diffArr = {diff, diff2};
            f305456d = diffArr;
            f305457e = kotlin.enums.c.a(diffArr);
        }

        public Diff() {
            throw null;
        }

        public static Diff valueOf(String str) {
            return (Diff) Enum.valueOf(Diff.class, str);
        }

        public static Diff[] values() {
            return (Diff[]) f305456d.clone();
        }
    }

    /* compiled from: UniversalMapState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/MapState$b;", "", "a", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f305467a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AvitoMapPoint f305468b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final a f305469c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AvitoMapMarker.Anchor f305470d;

        /* renamed from: e, reason: collision with root package name */
        public final float f305471e;

        /* compiled from: UniversalMapState.kt */
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/MapState$b$a;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a {

            /* renamed from: a, reason: collision with root package name */
            @k
            public final Bitmap f305472a;

            /* renamed from: b, reason: collision with root package name */
            @k
            public final String f305473b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f305474c;

            public /* synthetic */ a(Bitmap bitmap, String str, boolean z12, int i12, C42822w c42822w) {
                this(bitmap, (i12 & 4) != 0 ? false : z12, str);
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return L.f(this.f305472a, aVar.f305472a) && L.f(this.f305473b, aVar.f305473b) && this.f305474c == aVar.f305474c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.f305474c) + H.d(this.f305472a.hashCode() * 31, 31, this.f305473b);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("Bitmap(value=");
                sb2.append(this.f305472a);
                sb2.append(", mapIconUniqueId=");
                sb2.append(this.f305473b);
                sb2.append(", selected=");
                return r.x(sb2, this.f305474c, ')');
            }

            public a(@k Bitmap bitmap, boolean z12, @k String str) {
                this.f305472a = bitmap;
                this.f305473b = str;
                this.f305474c = z12;
            }
        }

        public b(@k String str, @k AvitoMapPoint avitoMapPoint, @k a aVar, @k AvitoMapMarker.Anchor anchor, float f12) {
            this.f305467a = str;
            this.f305468b = avitoMapPoint;
            this.f305469c = aVar;
            this.f305470d = anchor;
            this.f305471e = f12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f305467a, bVar.f305467a) && L.f(this.f305468b, bVar.f305468b) && L.f(this.f305469c, bVar.f305469c) && this.f305470d == bVar.f305470d && Float.compare(this.f305471e, bVar.f305471e) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.f305471e) + ((this.f305470d.hashCode() + ((this.f305469c.hashCode() + ((this.f305468b.hashCode() + (this.f305467a.hashCode() * 31)) * 31)) * 31)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MarkerViewState(id=");
            sb2.append(this.f305467a);
            sb2.append(", latLng=");
            sb2.append(this.f305468b);
            sb2.append(", bitmap=");
            sb2.append(this.f305469c);
            sb2.append(", anchor=");
            sb2.append(this.f305470d);
            sb2.append(", zIndex=");
            return r.k(')', this.f305471e, sb2);
        }
    }

    public MapState() {
        this(false, null, null, null, null, null, 63, null);
    }

    public static MapState a(MapState mapState, Coordinates coordinates, rG0.c cVar, AvitoMapBounds avitoMapBounds, BeduinShowSpecificLocationAction beduinShowSpecificLocationAction, a aVar, int i12) {
        boolean z12 = (i12 & 1) != 0 ? mapState.f305448a : false;
        if ((i12 & 2) != 0) {
            coordinates = mapState.f305449b;
        }
        Coordinates coordinates2 = coordinates;
        if ((i12 & 4) != 0) {
            cVar = mapState.f305450c;
        }
        rG0.c cVar2 = cVar;
        if ((i12 & 8) != 0) {
            avitoMapBounds = mapState.f305451d;
        }
        AvitoMapBounds avitoMapBounds2 = avitoMapBounds;
        if ((i12 & 16) != 0) {
            beduinShowSpecificLocationAction = mapState.f305452e;
        }
        BeduinShowSpecificLocationAction beduinShowSpecificLocationAction2 = beduinShowSpecificLocationAction;
        if ((i12 & 32) != 0) {
            aVar = mapState.f305453f;
        }
        mapState.getClass();
        return new MapState(z12, coordinates2, cVar2, avitoMapBounds2, beduinShowSpecificLocationAction2, aVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapState)) {
            return false;
        }
        MapState mapState = (MapState) obj;
        return this.f305448a == mapState.f305448a && L.f(this.f305449b, mapState.f305449b) && L.f(this.f305450c, mapState.f305450c) && L.f(this.f305451d, mapState.f305451d) && L.f(this.f305452e, mapState.f305452e) && L.f(this.f305453f, mapState.f305453f);
    }

    public final int hashCode() {
        int iHashCode = (this.f305449b.hashCode() + (Boolean.hashCode(this.f305448a) * 31)) * 31;
        rG0.c cVar = this.f305450c;
        int iHashCode2 = (iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31;
        AvitoMapBounds avitoMapBounds = this.f305451d;
        int iHashCode3 = (iHashCode2 + (avitoMapBounds == null ? 0 : avitoMapBounds.hashCode())) * 31;
        BeduinShowSpecificLocationAction beduinShowSpecificLocationAction = this.f305452e;
        return this.f305453f.hashCode() + ((iHashCode3 + (beduinShowSpecificLocationAction != null ? beduinShowSpecificLocationAction.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "MapState(moveToUserLocationIfFirst=" + this.f305448a + ", defaultLocation=" + this.f305449b + ", userLocation=" + this.f305450c + ", focusOnRegionBounds=" + this.f305451d + ", specificLocationRequestParams=" + this.f305452e + ", mapViewState=" + this.f305453f + ')';
    }

    /* compiled from: UniversalMapState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map/mvi/entity/MapState$a;", "", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final Set<b> f305458a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final Set<Marker> f305459b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Map<Diff, Set<b>> f305460c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f305461d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final C47290a f305462e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final Marker.Pin.IconType f305463f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final Marker.Pin f305464g;

        /* renamed from: h, reason: collision with root package name */
        @k
        public final Set<String> f305465h;

        /* renamed from: i, reason: collision with root package name */
        @l
        public final Marker.b f305466i;

        public a(Set set, Set set2, Map map, boolean z12, C47290a c47290a, Marker.Pin.IconType iconType, Marker.Pin pin, Set set3, Marker.b bVar, int i12, C42822w c42822w) {
            this(set, set2, map, z12, (i12 & 16) != 0 ? null : c47290a, (i12 & 32) != 0 ? null : iconType, (i12 & 64) != 0 ? null : pin, (i12 & 128) != 0 ? B0.f406639b : set3, (i12 & 256) != 0 ? null : bVar);
        }

        public static a a(a aVar, HashSet hashSet, Set set, Map map, C47290a c47290a, Marker.Pin.IconType iconType, Marker.Pin pin, Set set2, Marker.b bVar, int i12) {
            Set<b> set3 = (i12 & 1) != 0 ? aVar.f305458a : hashSet;
            Set set4 = (i12 & 2) != 0 ? aVar.f305459b : set;
            Map map2 = (i12 & 4) != 0 ? aVar.f305460c : map;
            C47290a c47290a2 = (i12 & 16) != 0 ? aVar.f305462e : c47290a;
            Marker.Pin.IconType iconType2 = (i12 & 32) != 0 ? aVar.f305463f : iconType;
            Marker.Pin pin2 = (i12 & 64) != 0 ? aVar.f305464g : pin;
            Set set5 = (i12 & 128) != 0 ? aVar.f305465h : set2;
            Marker.b bVar2 = (i12 & 256) != 0 ? aVar.f305466i : bVar;
            aVar.getClass();
            return new a(set3, set4, map2, false, c47290a2, iconType2, pin2, set5, bVar2);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f305458a, aVar.f305458a) && L.f(this.f305459b, aVar.f305459b) && L.f(this.f305460c, aVar.f305460c) && this.f305461d == aVar.f305461d && L.f(this.f305462e, aVar.f305462e) && this.f305463f == aVar.f305463f && L.f(this.f305464g, aVar.f305464g) && L.f(this.f305465h, aVar.f305465h) && L.f(this.f305466i, aVar.f305466i);
        }

        public final int hashCode() {
            int i12 = r.i(AK.c.c(m.g(this.f305459b, this.f305458a.hashCode() * 31, 31), 31, this.f305460c), 31, this.f305461d);
            C47290a c47290a = this.f305462e;
            int iHashCode = (i12 + (c47290a == null ? 0 : c47290a.hashCode())) * 31;
            Marker.Pin.IconType iconType = this.f305463f;
            int iHashCode2 = (iHashCode + (iconType == null ? 0 : iconType.hashCode())) * 31;
            Marker.Pin pin = this.f305464g;
            int iG2 = m.g(this.f305465h, (iHashCode2 + (pin == null ? 0 : pin.hashCode())) * 31, 31);
            Marker.b bVar = this.f305466i;
            return iG2 + (bVar != null ? bVar.hashCode() : 0);
        }

        @k
        public final String toString() {
            return "MapViewState(markers=" + this.f305458a + ", markersBackendModels=" + this.f305459b + ", markersDiff=" + this.f305460c + ", showProgress=" + this.f305461d + ", cameraCoordinatesEvent=" + this.f305462e + ", currentMultiPinIcon=" + this.f305463f + ", selectedPin=" + this.f305464g + ", labeledMarkerIds=" + this.f305465h + ", userMarker=" + this.f305466i + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(@k Set<b> set, @k Set<? extends Marker> set2, @k Map<Diff, ? extends Set<b>> map, boolean z12, @l C47290a c47290a, @l Marker.Pin.IconType iconType, @l Marker.Pin pin, @k Set<String> set3, @l Marker.b bVar) {
            this.f305458a = set;
            this.f305459b = set2;
            this.f305460c = map;
            this.f305461d = z12;
            this.f305462e = c47290a;
            this.f305463f = iconType;
            this.f305464g = pin;
            this.f305465h = set3;
            this.f305466i = bVar;
        }
    }

    public MapState(boolean z12, @k Coordinates coordinates, @l rG0.c cVar, @l AvitoMapBounds avitoMapBounds, @l BeduinShowSpecificLocationAction beduinShowSpecificLocationAction, @k a aVar) {
        this.f305448a = z12;
        this.f305449b = coordinates;
        this.f305450c = cVar;
        this.f305451d = avitoMapBounds;
        this.f305452e = beduinShowSpecificLocationAction;
        this.f305453f = aVar;
    }

    public MapState(boolean z12, Coordinates coordinates, rG0.c cVar, AvitoMapBounds avitoMapBounds, BeduinShowSpecificLocationAction beduinShowSpecificLocationAction, a aVar, int i12, C42822w c42822w) {
        a aVar2;
        boolean z13 = (i12 & 1) != 0 ? true : z12;
        Coordinates coordinates2 = (i12 & 2) != 0 ? new Coordinates(55.7522d, 37.6156d) : coordinates;
        rG0.c cVar2 = (i12 & 4) != 0 ? null : cVar;
        AvitoMapBounds avitoMapBounds2 = (i12 & 8) != 0 ? null : avitoMapBounds;
        BeduinShowSpecificLocationAction beduinShowSpecificLocationAction2 = (i12 & 16) == 0 ? beduinShowSpecificLocationAction : null;
        if ((i12 & 32) != 0) {
            B0 b02 = B0.f406639b;
            aVar2 = new a(b02, b02, P0.c(), true, null, null, null, null, null, 496, null);
        } else {
            aVar2 = aVar;
        }
        this(z13, coordinates2, cVar2, avitoMapBounds2, beduinShowSpecificLocationAction2, aVar2);
    }
}
