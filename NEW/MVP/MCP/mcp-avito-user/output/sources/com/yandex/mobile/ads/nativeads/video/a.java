package com.yandex.mobile.ads.nativeads.video;

import Y61.l;
import com.yandex.mobile.ads.impl.cm0;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, d2 = {"Lcom/yandex/mobile/ads/nativeads/video/a;", "Lcom/yandex/mobile/ads/nativeads/video/NativeAdVideoController;", "Lcom/yandex/mobile/ads/impl/cm0;", "nativeForcePauseObserver", "<init>", "(Lcom/yandex/mobile/ads/impl/cm0;)V", "Lkotlin/G0;", "pauseAd", "()V", "resumeAd", "mobileads_externalRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes8.dex */
public final class a extends NativeAdVideoController {

    /* renamed from: b, reason: collision with root package name */
    @l
    private final cm0 f392881b;

    public a(@l cm0 cm0Var) {
        super(cm0Var);
        this.f392881b = cm0Var;
    }

    @Override // com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public void pauseAd() {
        cm0 cm0Var = this.f392881b;
        if (cm0Var != null) {
            cm0Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.nativeads.video.NativeAdVideoController
    public void resumeAd() {
        cm0 cm0Var = this.f392881b;
        if (cm0Var != null) {
            cm0Var.a();
        }
    }
}
