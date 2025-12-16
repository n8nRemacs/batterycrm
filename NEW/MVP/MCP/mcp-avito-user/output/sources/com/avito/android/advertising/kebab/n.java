package com.avito.android.advertising.kebab;

import com.avito.android.advertising.analytics.events.BannerPageSource;
import com.avito.android.advertising.loaders.BannerInfo;
import kotlin.Metadata;

/* compiled from: HideableAdItemInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/kebab/n;", "", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface n {
    void a(@Y61.k com.avito.android.advertising.i iVar, int i12, @Y61.k String str, @Y61.k BannerInfo bannerInfo, @Y61.k BannerPageSource bannerPageSource);

    @Y61.k
    com.jakewharton.rxrelay3.c b();

    void c(@Y61.k com.avito.android.advertising.i iVar, @Y61.k BannerInfo bannerInfo, @Y61.k BannerPageSource bannerPageSource);

    void d(@Y61.k String str);

    boolean e(@Y61.k com.avito.android.advertising.i iVar);
}
