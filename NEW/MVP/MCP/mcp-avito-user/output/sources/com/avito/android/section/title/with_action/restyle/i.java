package com.avito.android.section.title.with_action.restyle;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SectionTitleWithActionRestylePresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f264914a;

    public i(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f264914a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f264914a.get());
    }
}
