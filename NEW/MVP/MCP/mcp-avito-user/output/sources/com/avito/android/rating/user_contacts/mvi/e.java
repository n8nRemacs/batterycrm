package com.avito.android.rating.user_contacts.mvi;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: UserContactsActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class e implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<n> f247783a;

    public e(Provider<n> provider) {
        this.f247783a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new d(this.f247783a.get());
    }
}
