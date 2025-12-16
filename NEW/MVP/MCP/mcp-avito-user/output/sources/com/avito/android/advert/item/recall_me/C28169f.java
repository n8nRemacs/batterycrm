package com.avito.android.advert.item.recall_me;

import com.avito.android.analytics.InterfaceC28373a;
import javax.inject.Provider;

/* compiled from: RecallMeAnalyticsInteractorV2Impl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.advert.item.recall_me.f, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C28169f implements dagger.internal.h<C28168e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f78474a;

    public C28169f(Provider<InterfaceC28373a> provider) {
        this.f78474a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C28168e(this.f78474a.get());
    }
}
