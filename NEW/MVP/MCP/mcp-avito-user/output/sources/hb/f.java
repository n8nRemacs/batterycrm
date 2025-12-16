package Hb;

import Y61.k;
import Y61.l;
import com.yandex.mobile.ads.common.ImpressionData;
import com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener;
import java.lang.ref.SoftReference;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: YandexAdListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LHb/f;", "Lcom/yandex/mobile/ads/nativeads/ClosableNativeAdEventListener;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class f implements ClosableNativeAdEventListener {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SoftReference<Y41.a<G0>> f7330a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final SoftReference<Y41.a<G0>> f7331b;

    public f(@k Y41.a<G0> aVar, @k Y41.a<G0> aVar2) {
        this.f7330a = new SoftReference<>(aVar);
        this.f7331b = new SoftReference<>(aVar2);
    }

    @Override // com.yandex.mobile.ads.nativeads.ClosableNativeAdEventListener
    public final void closeNativeAd() {
        Y41.a<G0> aVar = this.f7331b.get();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onAdClicked() {
        Y41.a<G0> aVar = this.f7330a.get();
        if (aVar != null) {
            aVar.invoke();
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onLeftApplication() {
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onReturnedToApplication() {
    }

    @Override // com.yandex.mobile.ads.nativeads.NativeAdEventListener
    public final void onImpression(@l ImpressionData impressionData) {
    }
}
