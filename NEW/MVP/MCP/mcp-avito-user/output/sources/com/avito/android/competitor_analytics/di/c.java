package com.avito.android.competitor_analytics.di;

import ar.C23659b;
import ar.C23660c;
import com.avito.android.competitor_analytics.deeplink.CompetitorAnalyticsDeepLink;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import lv.C43834a;

/* compiled from: CompetitorAnalyticsDeeplinkMappingsModule_ProvideCompetitorAnalyticsDeeplinkMappingFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class c implements h<C43834a> {

    /* renamed from: a, reason: collision with root package name */
    public final C23659b f124249a;

    public c(C23659b c23659b) {
        this.f124249a = c23659b;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        C23659b c23659b = this.f124249a;
        b.f124248a.getClass();
        C43834a.C11807a c11807a = C43834a.f414235d;
        return new C43834a(CompetitorAnalyticsDeepLink.class, new C23660c(), new C43834a.b.C11809b(c23659b));
    }
}
