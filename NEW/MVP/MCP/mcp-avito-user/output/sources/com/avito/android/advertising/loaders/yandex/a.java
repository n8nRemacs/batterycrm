package com.avito.android.advertising.loaders.yandex;

import Y61.k;
import Y61.l;
import com.yandex.mobile.ads.nativeads.NativeAd;
import kotlin.Metadata;

/* compiled from: YandexBanner.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0016\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/yandex/a;", "Lcom/avito/android/advertising/b;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class a implements com.avito.android.advertising.b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final NativeAd f88499b;

    public a(@k NativeAd nativeAd) {
        this.f88499b = nativeAd;
    }

    @Override // com.avito.android.advertising.b
    @l
    public final Integer T() {
        return null;
    }

    @Override // com.avito.android.advertising.b
    @l
    public final String W() {
        return this.f88499b.getAdAssets().getDomain();
    }

    @Override // com.avito.android.advertising.b
    @l
    /* renamed from: g0 */
    public final String getF88260e() {
        return this.f88499b.getAdAssets().getWarning();
    }

    @Override // com.avito.android.advertising.b
    @l
    /* renamed from: h0 */
    public final String getF88258c() {
        return this.f88499b.getAdAssets().getBody();
    }

    @Override // com.avito.android.advertising.b
    @l
    /* renamed from: j0 */
    public final String getF88257b() {
        return this.f88499b.getAdAssets().getTitle();
    }
}
