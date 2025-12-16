package com.avito.android.map_core.utils;

import Y61.l;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.search.map.Area;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: LatLngBounds.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito-discouraged_avito-libs_search-map-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class d {
    @l
    public static final LatLngBounds a(@l LatLng latLng, @l LatLngBounds latLngBounds) {
        if (latLng == null || latLngBounds == null) {
            return null;
        }
        double d12 = latLngBounds.h().f354407b - latLng.f354407b;
        double d13 = latLngBounds.h().f354408c - latLng.f354408c;
        LatLng latLng2 = latLngBounds.f354409b;
        LatLng latLng3 = new LatLng(latLng2.f354407b - d12, latLng2.f354408c - d13);
        LatLng latLng4 = latLngBounds.f354410c;
        return new LatLngBounds(latLng3, new LatLng(latLng4.f354407b - d12, latLng4.f354408c - d13));
    }

    @l
    public static final LatLng b(@Y61.k LatLng latLng, @l LatLngBounds latLngBounds, int i12, int i13) {
        if (latLngBounds == null) {
            return null;
        }
        double d12 = latLngBounds.f354410c.f354407b;
        double d13 = d12 - latLngBounds.f354409b.f354407b;
        if (i12 == 0) {
            return null;
        }
        return new LatLng(latLng.f354407b - ((d12 - ((d13 * i13) / i12)) - latLngBounds.h().f354407b), latLng.f354408c);
    }

    @Y61.k
    public static final List<Double> c(@Y61.k LatLngBounds latLngBounds) {
        LatLng latLng = latLngBounds.f354409b;
        Double dValueOf = Double.valueOf(latLng.f354407b);
        Double dValueOf2 = Double.valueOf(latLng.f354408c);
        LatLng latLng2 = latLngBounds.f354410c;
        return C42745f0.U(dValueOf, dValueOf2, Double.valueOf(latLng2.f354407b), Double.valueOf(latLng2.f354408c));
    }

    @Y61.k
    public static final Area d(@Y61.k LatLngBounds latLngBounds) {
        LatLng latLng = latLngBounds.f354410c;
        double d12 = latLng.f354407b;
        LatLng latLng2 = latLngBounds.f354409b;
        return new Area(new Coordinates(d12, latLng2.f354408c), new Coordinates(latLng2.f354407b, latLng.f354408c));
    }
}
