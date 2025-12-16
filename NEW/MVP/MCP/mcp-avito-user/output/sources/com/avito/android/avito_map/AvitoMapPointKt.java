package com.avito.android.avito_map;

import Y61.k;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import kotlin.Metadata;

/* compiled from: AvitoMapPoint.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a\u0012\u0010\u0002\u001a\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004\u001a\r\u0010\u0006\u001a\u00020\u0007*\u00020\u0004H\u0086\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"THRESHOLD", "", "almostEqual", "", "Lcom/avito/android/avito_map/AvitoMapPoint;", PluralsKeys.OTHER, "toValue", "", "_avito_avito-map_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AvitoMapPointKt {
    private static final double THRESHOLD = 1.0E-4d;

    public static final boolean almostEqual(@k AvitoMapPoint avitoMapPoint, @k AvitoMapPoint avitoMapPoint2) {
        return Math.abs(avitoMapPoint.getLatitude() - avitoMapPoint2.getLatitude()) < THRESHOLD && Math.abs(avitoMapPoint.getLongitude() - avitoMapPoint2.getLongitude()) < THRESHOLD;
    }

    @k
    public static final String toValue(@k AvitoMapPoint avitoMapPoint) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(avitoMapPoint.getLatitude());
        sb2.append(',');
        sb2.append(avitoMapPoint.getLongitude());
        return sb2.toString();
    }
}
