package com.avito.android.serp.adapter.gig_promo_snippet;

import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GigPromoSnippetPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class g implements h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f270096a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f270097b;

    public g(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<com.avito.android.serp.analytics.widgets_tracker.g> provider2) {
        this.f270096a = provider;
        this.f270097b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f270096a.get(), this.f270097b.get());
    }
}
