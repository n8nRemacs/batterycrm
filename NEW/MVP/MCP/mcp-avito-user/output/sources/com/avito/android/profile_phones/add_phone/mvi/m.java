package com.avito.android.profile_phones.add_phone.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AddPhoneOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class m implements dagger.internal.h<l> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f226942a;

    public m(Provider<com.avito.android.deeplink_handler.handler.composite.a> provider) {
        this.f226942a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new l(this.f226942a.get());
    }
}
