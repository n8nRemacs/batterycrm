package com.avito.android.universal_map.map.util;

import X41.i;
import Y61.k;
import com.avito.android.avito_map.AvitoMapPoint;
import com.avito.android.remote.model.Coordinates;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import qG0.C47290a;

/* compiled from: Map.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_avito_universal-map_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
@i
/* loaded from: classes4.dex */
public final class b {
    @k
    public static final Map a(@k C47290a c47290a) {
        String strConcat = "userMapParams[viewport]".concat("[topLeft][lat]");
        AvitoMapPoint avitoMapPoint = c47290a.f429136c;
        Q q12 = new Q(strConcat, Double.valueOf(avitoMapPoint.getLatitude()));
        Q q13 = new Q("userMapParams[viewport]".concat("[topLeft][lng]"), Double.valueOf(avitoMapPoint.getLongitude()));
        String strConcat2 = "userMapParams[viewport]".concat("[bottomRight][lat]");
        AvitoMapPoint avitoMapPoint2 = c47290a.f429137d;
        return P0.g(q12, q13, new Q(strConcat2, Double.valueOf(avitoMapPoint2.getLatitude())), new Q("userMapParams[viewport]".concat("[bottomRight][lng]"), Double.valueOf(avitoMapPoint2.getLongitude())));
    }

    @k
    public static final AvitoMapPoint b(@k Coordinates coordinates) {
        return new AvitoMapPoint(coordinates.getLatitude(), coordinates.getLongitude(), null, 4, null);
    }
}
