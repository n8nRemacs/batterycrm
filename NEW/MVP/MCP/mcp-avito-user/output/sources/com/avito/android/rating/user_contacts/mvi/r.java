package com.avito.android.rating.user_contacts.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserContactsOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f247866a;

    public r(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f247866a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f247866a.get());
    }
}
