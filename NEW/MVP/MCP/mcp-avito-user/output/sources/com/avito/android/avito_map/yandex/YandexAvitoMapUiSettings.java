package com.avito.android.avito_map.yandex;

import Y61.k;
import com.avito.android.avito_map.AvitoMapUiSettings;
import com.yandex.mapkit.map.Map;
import kotlin.Metadata;

/* compiled from: YandexAvitoMapUiSettings.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\nJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\nJ\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\nJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\nJ\u0017\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/avito_map/yandex/YandexAvitoMapUiSettings;", "Lcom/avito/android/avito_map/AvitoMapUiSettings;", "Lcom/yandex/mapkit/map/Map;", "map", "<init>", "(Lcom/yandex/mapkit/map/Map;)V", "", "enable", "Lkotlin/G0;", "isMapToolbarEnabled", "(Z)V", "isRotateGesturesEnabled", "isZoomControlsEnabled", "isZoomGesturesEnabled", "isFastTapEnabled", "isMyLocationButtonEnabled", "isCompassEnabled", "isTiltGesturesEnabled", "isMoveGesturesEnabled", "isDarkModeEnabled", "Lcom/yandex/mapkit/map/Map;", "getMap", "()Lcom/yandex/mapkit/map/Map;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class YandexAvitoMapUiSettings implements AvitoMapUiSettings {

    @k
    private final Map map;

    public YandexAvitoMapUiSettings(@k Map map) {
        this.map = map;
    }

    @k
    public final Map getMap() {
        return this.map;
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isDarkModeEnabled(boolean enable) {
        this.map.setNightModeEnabled(enable);
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isFastTapEnabled(boolean enable) {
        this.map.setFastTapEnabled(enable);
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isMoveGesturesEnabled(boolean enable) {
        this.map.setScrollGesturesEnabled(enable);
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isRotateGesturesEnabled(boolean enable) {
        this.map.setRotateGesturesEnabled(enable);
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isTiltGesturesEnabled(boolean enable) {
        this.map.setTiltGesturesEnabled(enable);
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isZoomGesturesEnabled(boolean enable) {
        this.map.setZoomGesturesEnabled(enable);
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isCompassEnabled(boolean enable) {
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isMapToolbarEnabled(boolean enable) {
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isMyLocationButtonEnabled(boolean enable) {
    }

    @Override // com.avito.android.avito_map.AvitoMapUiSettings
    public void isZoomControlsEnabled(boolean enable) {
    }
}
