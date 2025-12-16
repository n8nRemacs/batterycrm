package com.avito.android.passport.profile_add.create_flow.select_specific.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: SelectSpecificOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f211760a;

    public k(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f211760a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f211760a.get());
    }
}
