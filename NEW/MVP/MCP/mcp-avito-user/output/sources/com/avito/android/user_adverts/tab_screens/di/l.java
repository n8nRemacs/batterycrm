package com.avito.android.user_adverts.tab_screens.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.B;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.user_adverts.tab_screens.UserAdvertsListData;
import com.avito.android.user_adverts.tab_screens.adverts.UserAdvertsListMviFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: UserAdvertsListMviComponent.kt */
@B
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/di/l;", "", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes5.dex */
public interface l {

    /* compiled from: UserAdvertsListMviComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/tab_screens/di/l$a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        l a(@h31.b @Y61.k UserAdvertsListData userAdvertsListData, @h31.b @Y61.k UserAdvertsListMviFragment userAdvertsListMviFragment, @h31.b @Y61.k Resources resources, @h31.b @Y61.k C28478k c28478k, @h31.b @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k m mVar, @Y61.k InterfaceC39417a interfaceC39417a, @Y61.k com.avito.android.position_in_search.storage.provider.c cVar, @Y61.k com.avito.android.personal_banner.feature.factory.b bVar, @Y61.k H h12, @Y61.k com.avito.android.personal_selections.di.c cVar2);
    }

    void a(@Y61.k UserAdvertsListMviFragment userAdvertsListMviFragment);
}
