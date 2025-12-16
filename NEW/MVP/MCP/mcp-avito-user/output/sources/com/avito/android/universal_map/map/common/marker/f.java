package com.avito.android.universal_map.map.common.marker;

import com.avito.android.universal_map.map.common.marker.d;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ClusterRadiusCalculator.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/f;", "Lcom/avito/android/universal_map/map/common/marker/d;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class f implements d {
    @Inject
    public f() {
    }

    @Override // com.avito.android.universal_map.map.common.marker.d
    @Y61.l
    public final Float a(int i12, double d12, float f12) {
        return d.a.a(this, i12, d12, f12);
    }

    @Override // com.avito.android.universal_map.map.common.marker.d
    public final float b() {
        return 20.0f;
    }

    @Override // com.avito.android.universal_map.map.common.marker.d
    public final float c() {
        return 2.05f;
    }

    @Override // com.avito.android.universal_map.map.common.marker.d
    public final float d() {
        return 0.0f;
    }

    @Override // com.avito.android.universal_map.map.common.marker.d
    public final float e(float f12) {
        return d.a.b(this, f12);
    }

    @Override // com.avito.android.universal_map.map.common.marker.d
    public final float f() {
        return 300.0f;
    }

    @Override // com.avito.android.universal_map.map.common.marker.d
    public final float g() {
        return 1.0f;
    }
}
