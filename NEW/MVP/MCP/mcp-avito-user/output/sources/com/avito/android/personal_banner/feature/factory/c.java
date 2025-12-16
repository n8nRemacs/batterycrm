package com.avito.android.personal_banner.feature.factory;

import Y61.k;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.personal_banner.feature.factory.a;
import com.avito.android.personal_banner.feature.factory.b;
import com.avito.android.personal_banner.feature.factory.i;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;

/* compiled from: BannerFeatureComponent.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/personal_banner/feature/factory/c;", "Lcom/avito/android/personal_banner/feature/factory/b$b;", "<init>", "()V", "_avito_personal-banner_feature_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class c implements b.InterfaceC6452b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ a.InterfaceC6451a f215598a = new i.c();

    @Inject
    public c() {
    }

    @Override // com.avito.android.personal_banner.feature.factory.b.InterfaceC6452b
    @k
    public final b a(@k W60.a aVar, @k InterfaceC42726C interfaceC42726C, @k ScreenPerformanceTracker screenPerformanceTracker, @k com.avito.android.personal_banner.feature.domain.a aVar2, @k b.a aVar3, @k H h12) {
        ((i.c) this.f215598a).getClass();
        screenPerformanceTracker.getClass();
        aVar2.getClass();
        h12.getClass();
        return new i.b(aVar3, h12, aVar, interfaceC42726C, screenPerformanceTracker, aVar2, null);
    }
}
