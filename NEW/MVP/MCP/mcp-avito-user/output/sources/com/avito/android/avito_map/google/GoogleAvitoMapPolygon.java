package com.avito.android.avito_map.google;

import Y61.k;
import com.avito.android.avito_map.yandex.AvitoMapPolygon;
import com.google.android.gms.maps.model.C36825i;
import kotlin.Metadata;

/* compiled from: GoogleAvitoMapPolygon.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/avito_map/google/GoogleAvitoMapPolygon;", "Lcom/avito/android/avito_map/yandex/AvitoMapPolygon;", "Lcom/google/android/gms/maps/model/i;", "polygon", "<init>", "(Lcom/google/android/gms/maps/model/i;)V", "Lcom/google/android/gms/maps/model/i;", "getPolygon", "()Lcom/google/android/gms/maps/model/i;", "_avito_avito-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class GoogleAvitoMapPolygon implements AvitoMapPolygon {

    @k
    private final C36825i polygon;

    public GoogleAvitoMapPolygon(@k C36825i c36825i) {
        this.polygon = c36825i;
    }

    @k
    public final C36825i getPolygon() {
        return this.polygon;
    }
}
