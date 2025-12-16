package com.avito.android.advertising.loaders.avito_targeting;

import com.avito.android.remote.model.advertising.AvitoNetworkBannerItem;
import com.avito.android.remote.model.advertising.CreativeNetworkBannerItem;
import io.reactivex.rxjava3.internal.operators.observable.O;
import io.reactivex.rxjava3.internal.operators.single.C42019q;
import io.reactivex.rxjava3.internal.operators.single.W;
import kotlin.Metadata;

/* compiled from: AvitoTargetingBannerLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/avito_targeting/g;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface g {
    @Y61.k
    W a(int i12, int i13);

    @Y61.k
    C42019q b(@Y61.k AvitoNetworkBannerItem avitoNetworkBannerItem, boolean z12);

    @Y61.k
    O c(@Y61.k CreativeNetworkBannerItem creativeNetworkBannerItem);
}
