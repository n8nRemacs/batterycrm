package com.avito.android.beduin.common.component.bar_chart;

import com.avito.android.avito_map.AvitoMapMarkerKt;
import com.avito.android.remote.model.UniversalColor;
import kotlin.Metadata;

/* compiled from: BeduinBarChartModel.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_beduin_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class j {
    @Y61.k
    public static final UniversalColor a(@Y61.l BarChartTextSettings barChartTextSettings) {
        UniversalColor color;
        return (barChartTextSettings == null || (color = barChartTextSettings.getColor()) == null) ? new UniversalColor(AvitoMapMarkerKt.AMENITY_TYPE_BLACK, null, null) : color;
    }
}
