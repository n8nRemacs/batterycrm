package com.avito.android.avito_map.clustering;

import IZ0.b;
import Y61.k;
import com.avito.android.avito_map.AvitoMapPoint;
import kotlin.Metadata;

/* compiled from: SphericalMercatorProjection.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/avito_map/clustering/SphericalMercatorProjection;", "", "", "mWorldWidth", "<init>", "(D)V", "Lcom/avito/android/avito_map/AvitoMapPoint;", "latLng", "LIZ0/b;", "latLngToPoint", "(Lcom/avito/android/avito_map/AvitoMapPoint;)LIZ0/b;", "D", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SphericalMercatorProjection {
    private final double mWorldWidth;

    public SphericalMercatorProjection(double d12) {
        this.mWorldWidth = d12;
    }

    @k
    public final b latLngToPoint(@k AvitoMapPoint latLng) {
        double longitude = (latLng.getLongitude() / 360.0d) + 0.5d;
        double dSin = Math.sin(Math.toRadians(latLng.getLatitude()));
        double dLog = ((Math.log((dSin + 1.0d) / (1.0d - dSin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d12 = this.mWorldWidth;
        return new b(longitude * d12, dLog * d12);
    }
}
