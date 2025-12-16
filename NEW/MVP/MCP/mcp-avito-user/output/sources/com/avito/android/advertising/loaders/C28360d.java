package com.avito.android.advertising.loaders;

import com.avito.android.advertising.CommercialBanner;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.remote.model.advertising.AdNetworkBannerItem;
import java.util.Map;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CommercialBannersInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advertising/loaders/d;", "Lcom/avito/android/advertising/loaders/c;", "<init>", "()V", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advertising.loaders.d, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28360d implements InterfaceC28359c {
    @Inject
    public C28360d() {
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28359c
    @Y61.k
    public final BannerInfo a(@Y61.k CommercialBanner commercialBanner, @Y61.l com.avito.android.advertising.b bVar, @Y61.l Integer num) {
        return BannerInfo.f87863F.a(commercialBanner, bVar, num);
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28359c
    @Y61.k
    public final BannerInfo b(@Y61.k String str, @Y61.k AdNetworkBannerItem<?> adNetworkBannerItem, long j12, @Y61.l Integer num, int i12, boolean z12, long j13, @Y61.l Map<String, ? extends Object> map) {
        return BannerInfo.a.c(BannerInfo.f87863F, str, adNetworkBannerItem, j12, num, i12, z12, 0L, false, false, j13, null, map, null, null, null, 30144);
    }
}
