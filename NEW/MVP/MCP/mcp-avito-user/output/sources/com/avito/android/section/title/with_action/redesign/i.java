package com.avito.android.section.title.with_action.redesign;

import com.avito.android.section.title.with_action.redesign.f;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionTitleWithActionRedesignPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f264903a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<f.b> f264904b;

    public i(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider, Provider<f.b> provider2) {
        this.f264903a = provider;
        this.f264904b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f264903a.get(), this.f264904b.get());
    }
}
