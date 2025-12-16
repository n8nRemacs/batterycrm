package com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.di;

import dagger.internal.t;
import dagger.internal.x;
import dagger.internal.y;
import java.util.Set;
import javax.inject.Provider;
import kotlin.collections.C42756l;

/* compiled from: BasicIndicatorsTabModule_ProvideItemPresentersSetFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class i implements dagger.internal.h<Set<TV0.d<?, ?>>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.f> f317369a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.indicator.e> f317370b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.d> f317371c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.title_indicator.d> f317372d;

    public i(Provider<com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.f> provider, Provider<com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.indicator.e> provider2, Provider<com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.d> provider3, Provider<com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.title_indicator.d> provider4) {
        this.f317369a = provider;
        this.f317370b = provider2;
        this.f317371c = provider3;
        this.f317372d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.funnel.f fVar = this.f317369a.get();
        com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.indicator.e eVar = this.f317370b.get();
        com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.common_indicator.d dVar = this.f317371c.get();
        com.avito.android.user_stats.extended_user_stats.tabs.basic_indicators.items.title_indicator.d dVar2 = this.f317372d.get();
        c.f317356a.getClass();
        Set setL0 = C42756l.l0(new TV0.d[]{fVar, eVar, dVar, dVar2});
        t.d(setL0);
        return setL0;
    }
}
