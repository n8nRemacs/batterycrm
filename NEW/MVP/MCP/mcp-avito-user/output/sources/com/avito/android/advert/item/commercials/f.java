package com.avito.android.advert.item.commercials;

import Y61.k;
import Y61.l;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.util.Kundle;
import kotlin.Metadata;
import kotlinx.coroutines.flow.e2;

/* compiled from: CommercialsPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/commercials/f;", "", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public interface f {
    @k
    e2 a();

    boolean b(@k BannerInfo bannerInfo);

    boolean c(@k BannerInfo bannerInfo);

    void d();

    @k
    Kundle d0();

    void e(@k BannerInfo bannerInfo);

    void f(@k BannerInfo bannerInfo);

    void f0(@l Kundle kundle);

    void onCleared();
}
