package com.avito.android.item_map.geo_zones;

import android.graphics.drawable.Drawable;
import com.avito.android.R;
import com.avito.android.avito_map.AvitoMap;
import com.avito.android.item_map.geo_zones.GeoZonesPoints;
import com.avito.android.item_map.view.ItemMapState;
import com.avito.android.item_map.view.L;
import com.avito.android.item_map.view.V;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.Kundle;
import com.avito.android.util.V0;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: GeoZonesPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/item_map/geo_zones/j;", "Lcom/avito/android/item_map/geo_zones/g;", "_avito_item-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final a f173357a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f173358b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public V f173359c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f173360d = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public GeoZonesPresenterState f173361e;

    @Inject
    public j(@Y61.k a aVar, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f173357a = aVar;
        this.f173358b = interfaceC35745a5;
    }

    @Override // com.avito.android.item_map.geo_zones.g
    public final void I() {
        this.f173360d.e();
        this.f173359c = null;
    }

    @Override // com.avito.android.item_map.geo_zones.g
    public final void a(@Y61.l V v12) {
        this.f173359c = v12;
    }

    @Override // com.avito.android.item_map.geo_zones.g
    public final void b(@Y61.k ItemMapState.GeoZonesRequest geoZonesRequest) {
        GeoZonesPresenterState geoZonesPresenterState = this.f173361e;
        if (geoZonesPresenterState != null) {
            c(geoZonesPresenterState);
            return;
        }
        this.f173360d.b(this.f173357a.a(geoZonesRequest.f173470b, geoZonesRequest.f173471c, geoZonesRequest.f173472d).j0(this.f173358b.e()).v0(new com.avito.android.api.a(19, new h(this)), new com.avito.android.api.a(20, i.f173356l), io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    public final void c(GeoZonesPresenterState geoZonesPresenterState) {
        V v12;
        GeoZonesPoints geoZonesPoints = geoZonesPresenterState.f173342c;
        if (geoZonesPoints instanceof GeoZonesPoints.Markers) {
            V v13 = this.f173359c;
            if (v13 != null) {
                ArrayList arrayList = ((GeoZonesPoints.Markers) geoZonesPoints).f173339b;
                Drawable drawable = androidx.core.content.d.getDrawable(new androidx.appcompat.view.d(v13.f173555K, R.style.Theme_DesignSystem_Legacy), com.avito.android.avito_map.R.drawable.ic_geo_zones_metro_marker);
                AvitoMap avitoMap = v13.f173582q;
                if (avitoMap != null) {
                    AvitoMap.DefaultImpls.addSameMarkers$default(avitoMap, arrayList, drawable != null ? V0.b(drawable) : null, null, Float.valueOf(2.0f), false, 20, null);
                }
            }
        } else if ((geoZonesPoints instanceof GeoZonesPoints.Polygons) && (v12 = this.f173359c) != null) {
            ArrayList<List> arrayList2 = ((GeoZonesPoints.Polygons) geoZonesPoints).f173340b;
            L l12 = v12.f173568c;
            int iA2 = l12.a();
            int iB2 = l12.b();
            for (List list : arrayList2) {
                AvitoMap avitoMap2 = v12.f173582q;
                if (avitoMap2 != null) {
                    AvitoMap.DefaultImpls.addPolygon$default(avitoMap2, list, iA2, iB2, 2.0f, 0.0f, false, 32, null);
                }
            }
        }
        V v14 = this.f173359c;
        if (v14 != null) {
            v14.e(geoZonesPresenterState.f173341b, false);
        }
    }

    @Override // com.avito.android.item_map.geo_zones.g
    @Y61.k
    public final Kundle d0() {
        Kundle kundle = new Kundle();
        kundle.j(this.f173361e, "geoZonesPresenterState");
        return kundle;
    }

    @Override // com.avito.android.item_map.geo_zones.g
    public final void f0(@Y61.l Kundle kundle) {
        GeoZonesPresenterState geoZonesPresenterState;
        if (kundle == null || (geoZonesPresenterState = (GeoZonesPresenterState) kundle.d("geoZonesPresenterState")) == null) {
            return;
        }
        this.f173361e = geoZonesPresenterState;
    }
}
