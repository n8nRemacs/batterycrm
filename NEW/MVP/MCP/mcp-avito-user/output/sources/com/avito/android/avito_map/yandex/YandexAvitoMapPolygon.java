package com.avito.android.avito_map.yandex;

import Y61.k;
import com.yandex.mapkit.map.PolygonMapObject;
import kotlin.Metadata;

/* compiled from: YandexAvitoMapPolygon.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/avito_map/yandex/YandexAvitoMapPolygon;", "Lcom/avito/android/avito_map/yandex/AvitoMapPolygon;", "polygon", "Lcom/yandex/mapkit/map/PolygonMapObject;", "(Lcom/yandex/mapkit/map/PolygonMapObject;)V", "getPolygon", "()Lcom/yandex/mapkit/map/PolygonMapObject;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class YandexAvitoMapPolygon implements AvitoMapPolygon {

    @k
    private final PolygonMapObject polygon;

    public YandexAvitoMapPolygon(@k PolygonMapObject polygonMapObject) {
        this.polygon = polygonMapObject;
    }

    @k
    public final PolygonMapObject getPolygon() {
        return this.polygon;
    }
}
