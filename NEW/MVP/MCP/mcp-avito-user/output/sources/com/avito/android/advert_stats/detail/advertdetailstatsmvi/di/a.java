package com.avito.android.advert_stats.detail.advertdetailstatsmvi.di;

import Y61.k;
import Y61.l;
import android.content.res.Resources;
import com.avito.android.advert_stats.detail.advertdetailstatsmvi.AdvertDetailStatsMVIFragment;
import com.avito.android.advert_stats.detail.di.r;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.di.B;
import cv.InterfaceC39417a;
import h31.d;
import javax.inject.Named;
import kotlin.Metadata;

/* compiled from: AdvertDetailStatsMVIComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/di/a;", "Lcom/avito/android/advert_stats/detail/di/r;", "a", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes10.dex */
public interface a extends r {

    /* compiled from: AdvertDetailStatsMVIComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_stats/detail/advertdetailstatsmvi/di/a$a;", "", "_avito_advert-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_stats.detail.advertdetailstatsmvi.di.a$a, reason: collision with other inner class name */
    public interface InterfaceC2567a {
        @k
        a a(@h31.b @k AdvertDetailStatsMVIFragment advertDetailStatsMVIFragment, @h31.b @k String str, @h31.b @l @Named("ITEM_SLUG") String str2, @h31.b @k com.avito.android.analytics.screens.r rVar, @h31.b @k C28478k c28478k, @h31.b @k Y41.l lVar, @h31.b @k Resources resources, @k InterfaceC39417a interfaceC39417a, @k c cVar);
    }

    void O8(@k AdvertDetailStatsMVIFragment advertDetailStatsMVIFragment);
}
