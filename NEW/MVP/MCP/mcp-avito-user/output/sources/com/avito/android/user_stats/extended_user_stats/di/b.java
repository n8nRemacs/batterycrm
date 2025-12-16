package com.avito.android.user_stats.extended_user_stats.di;

import android.content.res.Resources;
import com.avito.android.analytics.screens.r;
import com.avito.android.di.B;
import com.avito.android.user_stats.extended_user_stats.ExtendedUserStatsFragment;
import cv.InterfaceC39417a;
import h31.d;
import kotlin.Metadata;

/* compiled from: ExtendedUserStatsComponent.kt */
@B
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/di/b;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/basic_indicators/di/b;", "Lcom/avito/android/user_stats/extended_user_stats/tabs/expenses/di/c;", "a", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@h31.d
/* loaded from: classes5.dex */
public interface b extends com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.di.b, com.avito.android.user_stats.extended_user_stats.tabs.expenses.di.c {

    /* compiled from: ExtendedUserStatsComponent.kt */
    @d.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_stats/extended_user_stats/di/b$a;", "", "_avito_user-stats_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.k
        b a(@Y61.k InterfaceC39417a interfaceC39417a, @h31.b @Y61.k ExtendedUserStatsFragment extendedUserStatsFragment, @h31.b @Y61.k r rVar, @h31.b @Y61.k Resources resources, @Y61.k c cVar);
    }

    void ha(@Y61.k ExtendedUserStatsFragment extendedUserStatsFragment);
}
