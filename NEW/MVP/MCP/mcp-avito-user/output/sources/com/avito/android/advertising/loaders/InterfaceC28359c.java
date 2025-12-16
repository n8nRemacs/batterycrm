package com.avito.android.advertising.loaders;

import com.avito.android.advertising.CommercialBanner;
import com.avito.android.remote.model.advertising.AdNetworkBannerItem;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: CommercialBannersInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/loaders/c;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advertising.loaders.c, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC28359c {

    /* compiled from: CommercialBannersInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advertising.loaders.c$a */
    public static final class a {
    }

    @Y61.k
    BannerInfo a(@Y61.k CommercialBanner commercialBanner, @Y61.l com.avito.android.advertising.b bVar, @Y61.l Integer num);

    @Y61.k
    BannerInfo b(@Y61.k String str, @Y61.k AdNetworkBannerItem<?> adNetworkBannerItem, long j12, @Y61.l Integer num, int i12, boolean z12, long j13, @Y61.l Map<String, ? extends Object> map);
}
