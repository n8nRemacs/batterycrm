package com.avito.android.universal_map.map.common.marker;

import com.avito.android.avito_map.AvitoMapMarkerResourceProvider;
import com.avito.android.avito_map.R;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: UniversalMapMarkerResourceProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/universal_map/map/common/marker/r;", "Lcom/avito/android/avito_map/AvitoMapMarkerResourceProvider;", "<init>", "()V", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class r implements AvitoMapMarkerResourceProvider {

    /* renamed from: a, reason: collision with root package name */
    public final int f305003a = R.drawable.my_location_pin;

    /* renamed from: b, reason: collision with root package name */
    public final int f305004b = R.drawable.ic_blue_pin;

    /* renamed from: c, reason: collision with root package name */
    public final int f305005c = R.drawable.ic_red_pin;

    /* renamed from: d, reason: collision with root package name */
    public final int f305006d = R.drawable.ic_blue_post_pin;

    /* renamed from: e, reason: collision with root package name */
    public final int f305007e = R.drawable.ic_red_post_pin;

    /* renamed from: f, reason: collision with root package name */
    public final int f305008f = R.drawable.ic_blue_avito_pin;

    /* renamed from: g, reason: collision with root package name */
    public final int f305009g = R.drawable.ic_red_avito_pin;

    /* renamed from: h, reason: collision with root package name */
    public final int f305010h = R.drawable.ic_blue_pvz_with_try_on;

    /* renamed from: i, reason: collision with root package name */
    public final int f305011i = R.drawable.ic_red_pvz_with_try_on;

    @Inject
    public r() {
    }

    @Override // com.avito.android.avito_map.AvitoMapMarkerResourceProvider
    public final int getClusterIconResId() {
        throw new UnsupportedOperationException("Cluster icon not implemented yet");
    }

    @Override // com.avito.android.avito_map.AvitoMapMarkerResourceProvider
    /* renamed from: getPinAvitoIconResId, reason: from getter */
    public final int getF305008f() {
        return this.f305008f;
    }

    @Override // com.avito.android.avito_map.AvitoMapMarkerResourceProvider
    /* renamed from: getPinAvitoSelectedIconResId, reason: from getter */
    public final int getF305009g() {
        return this.f305009g;
    }

    @Override // com.avito.android.avito_map.AvitoMapMarkerResourceProvider
    /* renamed from: getPinIconResId, reason: from getter */
    public final int getF305004b() {
        return this.f305004b;
    }

    @Override // com.avito.android.avito_map.AvitoMapMarkerResourceProvider
    /* renamed from: getPinPostamatIconResId, reason: from getter */
    public final int getF305006d() {
        return this.f305006d;
    }

    @Override // com.avito.android.avito_map.AvitoMapMarkerResourceProvider
    /* renamed from: getPinPostamatSelectedIconResId, reason: from getter */
    public final int getF305007e() {
        return this.f305007e;
    }

    @Override // com.avito.android.avito_map.AvitoMapMarkerResourceProvider
    /* renamed from: getPinPvzWithTryOnIconResId, reason: from getter */
    public final int getF305010h() {
        return this.f305010h;
    }

    @Override // com.avito.android.avito_map.AvitoMapMarkerResourceProvider
    /* renamed from: getPinPvzWithTryOnSelectedIconResId, reason: from getter */
    public final int getF305011i() {
        return this.f305011i;
    }

    @Override // com.avito.android.avito_map.AvitoMapMarkerResourceProvider
    /* renamed from: getPinSelectedIconResId, reason: from getter */
    public final int getF305005c() {
        return this.f305005c;
    }

    @Override // com.avito.android.avito_map.AvitoMapMarkerResourceProvider
    /* renamed from: getUserIconResId, reason: from getter */
    public final int getF305003a() {
        return this.f305003a;
    }
}
