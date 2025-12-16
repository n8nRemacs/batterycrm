package com.avito.android.personal_banner.feature.factory;

import W60.b;
import Y61.k;
import b70.InterfaceC25423a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.util.R0;
import d70.C39526b;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: BannerFeatureProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/personal_banner/feature/factory/b;", "", "a", "b", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public interface b {

    /* compiled from: BannerFeatureProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_banner/feature/factory/b$a;", "", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @k
        InterfaceC25423a U6();

        @k
        R0 c();

        @k
        com.avito.android.lib.beduin_v2.beduin_item.stateless.c h4();
    }

    /* compiled from: BannerFeatureProvider.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/personal_banner/feature/factory/b$b;", "", "_avito_personal-banner_feature_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.personal_banner.feature.factory.b$b, reason: collision with other inner class name */
    public interface InterfaceC6452b {
        @k
        b a(@k W60.a aVar, @k InterfaceC42726C interfaceC42726C, @k ScreenPerformanceTracker screenPerformanceTracker, @k com.avito.android.personal_banner.feature.domain.a aVar2, @k a aVar3, @k H h12);
    }

    @k
    b.a a();

    @k
    C39526b b();
}
