package com.avito.android.lib.design.map.state;

import Y41.p;
import Y61.k;
import Y61.l;
import android.graphics.Bitmap;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.avito_map.AvitoMapMarker;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.lib.design.map.state.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import nV.InterfaceC44339c;

/* compiled from: MapState.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/lib/design/map/state/MapState;", "", "DrawingMode", "a", "b", "c", "d", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MapState {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final List<a> f179615a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final List<c> f179616b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final b f179617c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final com.avito.android.lib.design.map.state.a f179618d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final InterfaceC44339c f179619e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Y41.l<MoveReason, G0> f179620f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Y41.l<a.c, G0> f179621g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final p<AvitoMapPoint, Float, G0> f179622h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Y41.l<a, G0> f179623i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final Y41.l<AvitoMapPoint, G0> f179624j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final Y41.a<G0> f179625k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final DrawingMode f179626l;

    /* renamed from: m, reason: collision with root package name */
    @k
    public final d f179627m;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MapState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/map/state/MapState$DrawingMode;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DrawingMode {

        /* renamed from: b, reason: collision with root package name */
        public static final DrawingMode f179628b;

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ DrawingMode[] f179629c;

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f179630d;

        static {
            DrawingMode drawingMode = new DrawingMode("DISABLE", 0);
            f179628b = drawingMode;
            DrawingMode[] drawingModeArr = {drawingMode, new DrawingMode("ENABLE", 1)};
            f179629c = drawingModeArr;
            f179630d = kotlin.enums.c.a(drawingModeArr);
        }

        public DrawingMode() {
            throw null;
        }

        public static DrawingMode valueOf(String str) {
            return (DrawingMode) Enum.valueOf(DrawingMode.class, str);
        }

        public static DrawingMode[] values() {
            return (DrawingMode[]) f179629c.clone();
        }
    }

    /* compiled from: MapState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/map/state/MapState$b;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final ArrayList f179638a;

        public b(@k ArrayList arrayList) {
            this.f179638a = arrayList;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                return this.f179638a.equals(((b) obj).f179638a) && Float.compare(0.0f, 0.0f) == 0;
            }
            return false;
        }

        public final int hashCode() {
            return Float.hashCode(0.0f) + (this.f179638a.hashCode() * 31);
        }

        @k
        public final String toString() {
            return "Polygon(avitoMapPoints=" + this.f179638a + ", zIndex=0.0)";
        }
    }

    /* compiled from: MapState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/map/state/MapState$c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f179639a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final List<AvitoMapPoint> f179640b;

        public c(@k String str, @k List list) {
            this.f179639a = str;
            this.f179640b = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return L.f(this.f179639a, cVar.f179639a) && this.f179640b.equals(cVar.f179640b) && Float.compare(3.0f, 3.0f) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(3.0f) + H.e(this.f179639a.hashCode() * 31, 31, this.f179640b);
        }

        @k
        public final String toString() {
            return "Polyline(id=" + this.f179639a + ", avitoMapPoints=" + this.f179640b + ", zIndex=3.0)";
        }
    }

    /* compiled from: MapState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/map/state/MapState$d;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f179641a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f179642b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f179643c;

        public d() {
            this(false, false, false, 7, null);
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f179641a == dVar.f179641a && this.f179642b == dVar.f179642b && this.f179643c == dVar.f179643c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f179643c) + r.i(Boolean.hashCode(this.f179641a) * 31, 31, this.f179642b);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("UiSettings(isZoomGesturesEnabled=");
            sb2.append(this.f179641a);
            sb2.append(", isMoveGesturesEnabled=");
            sb2.append(this.f179642b);
            sb2.append(", isTiltGesturesEnabled=");
            return r.x(sb2, this.f179643c, ')');
        }

        public d(boolean z12, boolean z13, boolean z14, int i12, C42822w c42822w) {
            z12 = (i12 & 1) != 0 ? true : z12;
            z13 = (i12 & 2) != 0 ? true : z13;
            z14 = (i12 & 4) != 0 ? false : z14;
            this.f179641a = z12;
            this.f179642b = z13;
            this.f179643c = z14;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MapState(@l List<a> list, @l List<c> list2, @l b bVar, @l com.avito.android.lib.design.map.state.a aVar, @l InterfaceC44339c interfaceC44339c, @l Y41.l<? super MoveReason, G0> lVar, @k Y41.l<? super a.c, G0> lVar2, @l p<? super AvitoMapPoint, ? super Float, G0> pVar, @l Y41.l<? super a, G0> lVar3, @l Y41.l<? super AvitoMapPoint, G0> lVar4, @l Y41.a<G0> aVar2, @k DrawingMode drawingMode, @k d dVar) {
        this.f179615a = list;
        this.f179616b = list2;
        this.f179617c = bVar;
        this.f179618d = aVar;
        this.f179619e = interfaceC44339c;
        this.f179620f = lVar;
        this.f179621g = lVar2;
        this.f179622h = pVar;
        this.f179623i = lVar3;
        this.f179624j = lVar4;
        this.f179625k = aVar2;
        this.f179626l = drawingMode;
        this.f179627m = dVar;
    }

    public static MapState a(MapState mapState, List list, com.avito.android.lib.design.map.state.a aVar, int i12) {
        List list2 = (i12 & 1) != 0 ? mapState.f179615a : list;
        List<c> list3 = mapState.f179616b;
        b bVar = mapState.f179617c;
        com.avito.android.lib.design.map.state.a aVar2 = (i12 & 8) != 0 ? mapState.f179618d : aVar;
        InterfaceC44339c interfaceC44339c = mapState.f179619e;
        Y41.l<MoveReason, G0> lVar = mapState.f179620f;
        Y41.l<a.c, G0> lVar2 = mapState.f179621g;
        p<AvitoMapPoint, Float, G0> pVar = mapState.f179622h;
        Y41.l<a, G0> lVar3 = mapState.f179623i;
        Y41.l<AvitoMapPoint, G0> lVar4 = mapState.f179624j;
        Y41.a<G0> aVar3 = mapState.f179625k;
        DrawingMode drawingMode = mapState.f179626l;
        d dVar = mapState.f179627m;
        mapState.getClass();
        return new MapState(list2, list3, bVar, aVar2, interfaceC44339c, lVar, lVar2, pVar, lVar3, lVar4, aVar3, drawingMode, dVar);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MapState)) {
            return false;
        }
        MapState mapState = (MapState) obj;
        return L.f(this.f179615a, mapState.f179615a) && L.f(this.f179616b, mapState.f179616b) && L.f(this.f179617c, mapState.f179617c) && L.f(this.f179618d, mapState.f179618d) && L.f(this.f179619e, mapState.f179619e) && L.f(this.f179620f, mapState.f179620f) && L.f(this.f179621g, mapState.f179621g) && L.f(this.f179622h, mapState.f179622h) && L.f(this.f179623i, mapState.f179623i) && L.f(this.f179624j, mapState.f179624j) && L.f(this.f179625k, mapState.f179625k) && this.f179626l == mapState.f179626l && L.f(this.f179627m, mapState.f179627m);
    }

    public final int hashCode() {
        List<a> list = this.f179615a;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<c> list2 = this.f179616b;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        b bVar = this.f179617c;
        int iHashCode3 = (iHashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        com.avito.android.lib.design.map.state.a aVar = this.f179618d;
        int iHashCode4 = (iHashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        InterfaceC44339c interfaceC44339c = this.f179619e;
        int iHashCode5 = (iHashCode4 + (interfaceC44339c == null ? 0 : interfaceC44339c.hashCode())) * 31;
        Y41.l<MoveReason, G0> lVar = this.f179620f;
        int iHashCode6 = (this.f179621g.hashCode() + ((iHashCode5 + (lVar == null ? 0 : lVar.hashCode())) * 31)) * 31;
        p<AvitoMapPoint, Float, G0> pVar = this.f179622h;
        int iHashCode7 = (iHashCode6 + (pVar == null ? 0 : pVar.hashCode())) * 31;
        Y41.l<a, G0> lVar2 = this.f179623i;
        int iHashCode8 = (iHashCode7 + (lVar2 == null ? 0 : lVar2.hashCode())) * 31;
        Y41.l<AvitoMapPoint, G0> lVar3 = this.f179624j;
        int iHashCode9 = (iHashCode8 + (lVar3 == null ? 0 : lVar3.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f179625k;
        return this.f179627m.hashCode() + ((this.f179626l.hashCode() + ((iHashCode9 + (aVar2 != null ? aVar2.hashCode() : 0)) * 31)) * 31);
    }

    @k
    public final String toString() {
        return "MapState(markers=" + this.f179615a + ", listOfPolyline=" + this.f179616b + ", polygon=" + this.f179617c + ", moveTo=" + this.f179618d + ", userLocationState=" + this.f179619e + ", onMapMoveStart=" + this.f179620f + ", onMapMoveEnd=" + this.f179621g + ", onClick=" + this.f179622h + ", onMarkerClick=" + this.f179623i + ", onDrawingMoving=" + this.f179624j + ", onDrawingMoveEnd=" + this.f179625k + ", onDrawingMode=" + this.f179626l + ", uiSettings=" + this.f179627m + ')';
    }

    /* compiled from: MapState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/map/state/MapState$a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final String f179631a;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final AvitoMapPoint f179632b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Bitmap f179633c;

        /* renamed from: d, reason: collision with root package name */
        @k
        public final AvitoMapMarker.AvitoMapAnchor f179634d;

        /* renamed from: e, reason: collision with root package name */
        public final float f179635e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f179636f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f179637g;

        public a(@k String str, @k AvitoMapPoint avitoMapPoint, @k Bitmap bitmap, @k AvitoMapMarker.AvitoMapAnchor avitoMapAnchor, float f12, @k String str2, boolean z12) {
            this.f179631a = str;
            this.f179632b = avitoMapPoint;
            this.f179633c = bitmap;
            this.f179634d = avitoMapAnchor;
            this.f179635e = f12;
            this.f179636f = str2;
            this.f179637g = z12;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return L.f(this.f179631a, aVar.f179631a) && L.f(this.f179632b, aVar.f179632b) && L.f(this.f179633c, aVar.f179633c) && L.f(this.f179634d, aVar.f179634d) && Float.compare(this.f179635e, aVar.f179635e) == 0 && L.f(this.f179636f, aVar.f179636f) && this.f179637g == aVar.f179637g;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f179637g) + H.d(r.d(this.f179635e, (this.f179634d.hashCode() + ((this.f179633c.hashCode() + ((this.f179632b.hashCode() + (this.f179631a.hashCode() * 31)) * 31)) * 31)) * 31, 31), 31, this.f179636f);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Marker(id=");
            sb2.append(this.f179631a);
            sb2.append(", point=");
            sb2.append(this.f179632b);
            sb2.append(", bitmap=");
            sb2.append(this.f179633c);
            sb2.append(", anchor=");
            sb2.append(this.f179634d);
            sb2.append(", zIndex=");
            sb2.append(this.f179635e);
            sb2.append(", bitmapId=");
            sb2.append(this.f179636f);
            sb2.append(", withAnimation=");
            return r.x(sb2, this.f179637g, ')');
        }

        public /* synthetic */ a(String str, AvitoMapPoint avitoMapPoint, Bitmap bitmap, AvitoMapMarker.AvitoMapAnchor avitoMapAnchor, float f12, String str2, boolean z12, int i12, C42822w c42822w) {
            this(str, avitoMapPoint, bitmap, (i12 & 8) != 0 ? AvitoMapMarker.Anchor.CENTER : avitoMapAnchor, f12, str2, (i12 & 64) != 0 ? false : z12);
        }
    }

    public /* synthetic */ MapState(List list, List list2, b bVar, com.avito.android.lib.design.map.state.a aVar, InterfaceC44339c interfaceC44339c, Y41.l lVar, Y41.l lVar2, p pVar, Y41.l lVar3, Y41.l lVar4, Y41.a aVar2, DrawingMode drawingMode, d dVar, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : list, (i12 & 2) != 0 ? null : list2, (i12 & 4) != 0 ? null : bVar, (i12 & 8) != 0 ? null : aVar, (i12 & 16) != 0 ? null : interfaceC44339c, (i12 & 32) != 0 ? null : lVar, lVar2, (i12 & 128) != 0 ? null : pVar, (i12 & 256) != 0 ? null : lVar3, (i12 & 512) != 0 ? null : lVar4, (i12 & 1024) != 0 ? null : aVar2, (i12 & 2048) != 0 ? DrawingMode.f179628b : drawingMode, (i12 & 4096) != 0 ? new d(false, false, false, 7, null) : dVar);
    }
}
