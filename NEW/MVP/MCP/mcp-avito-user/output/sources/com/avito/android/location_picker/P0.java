package com.avito.android.location_picker;

import com.avito.android.avito_map.AvitoMapBounds;
import com.avito.android.avito_map.AvitoMapPoint;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: MapTransformationsProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/location_picker/P0;", "Lcom/avito/android/location_picker/O0;", "<init>", "()V", "_avito_location-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class P0 implements O0 {
    @Inject
    public P0() {
    }

    @Override // com.avito.android.location_picker.O0
    public final double a(@Y61.l AvitoMapPoint avitoMapPoint, @Y61.l AvitoMapPoint avitoMapPoint2) {
        if (avitoMapPoint == null || avitoMapPoint2 == null) {
            return 0.0d;
        }
        double latitude = avitoMapPoint.getLatitude();
        double latitude2 = avitoMapPoint.getLatitude();
        double longitude = avitoMapPoint.getLongitude();
        double longitude2 = avitoMapPoint2.getLongitude();
        double radians = Math.toRadians(latitude2 - latitude);
        double radians2 = Math.toRadians(longitude2 - longitude);
        double d12 = 2;
        double d13 = radians / d12;
        double d14 = radians2 / d12;
        double dB2 = androidx.appcompat.app.r.b(d14, Math.sin(d14) * Math.cos(Math.toRadians(latitude2)) * Math.cos(Math.toRadians(latitude)), Math.sin(d13) * Math.sin(d13));
        return Math.atan2(Math.sqrt(dB2), Math.sqrt(1 - dB2)) * d12 * 6378.137d * 1000.0d;
    }

    @Override // com.avito.android.location_picker.O0
    @Y61.l
    public final AvitoMapBounds b(@Y61.l AvitoMapPoint avitoMapPoint, long j12) {
        if (avitoMapPoint == null) {
            return null;
        }
        double dCos = (j12 * ((1 / (((2 * 3.141592653589793d) / 360) * 6378.137d)) / 1000)) / Math.cos((3.141592653589793d / 180) * avitoMapPoint.getLatitude());
        return new AvitoMapBounds(new AvitoMapPoint(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude() - dCos, null, 4, null), new AvitoMapPoint(avitoMapPoint.getLatitude(), avitoMapPoint.getLongitude() + dCos, null, 4, null));
    }
}
