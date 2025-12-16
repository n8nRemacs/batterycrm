package com.avito.android.remote.model;

import Y61.k;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SerpBannerContainer.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"getAdSize", "Lcom/avito/android/remote/model/AdSize;", "Lcom/avito/android/remote/model/SerpBannerContainer;", "_avito-discouraged_api-models_models"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SerpBannerContainerKt {
    @k
    public static final AdSize getAdSize(@k SerpBannerContainer serpBannerContainer) {
        for (AdSize adSize : AdSize.values()) {
            if (L.f(adSize.getServerName(), serpBannerContainer.getSize())) {
                return adSize;
            }
        }
        return AdSize.SMALL;
    }
}
