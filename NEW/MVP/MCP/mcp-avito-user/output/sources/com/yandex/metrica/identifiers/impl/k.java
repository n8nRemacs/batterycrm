package com.yandex.metrica.identifiers.impl;

import android.content.Context;
import androidx.camera.camera2.internal.G;
import com.adjust.sdk.Constants;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;

/* loaded from: classes7.dex */
public final class k implements i {
    @Override // com.yandex.metrica.identifiers.impl.i
    @Y61.k
    public final g a(@Y61.k Context context) {
        try {
            AdvertisingIdClient.Info advertisingIdInfo = AdvertisingIdClient.getAdvertisingIdInfo(context);
            return new g(l.f377729c, new f(Constants.REFERRER_API_GOOGLE, advertisingIdInfo.getId(), Boolean.valueOf(advertisingIdInfo.isLimitAdTrackingEnabled())), null, 4);
        } catch (GooglePlayServicesNotAvailableException unused) {
            return new g(l.f377730d, null, "could not resolve google services", 2);
        } catch (Throwable th2) {
            return new g(l.f377731e, null, G.i(th2, new StringBuilder("exception while fetching google adv_id: ")), 2);
        }
    }
}
