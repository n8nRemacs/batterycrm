package com.avito.android.messenger.di;

import com.avito.android.persistence.messenger.MessengerDatabase;
import javax.inject.Provider;

/* compiled from: MessengerRepoModule_ProvideDraftDao$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class Q1 implements dagger.internal.h<com.avito.android.persistence.messenger.G0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<MessengerDatabase> f195699a;

    public Q1(Provider<MessengerDatabase> provider) {
        this.f195699a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        MessengerDatabase messengerDatabase = this.f195699a.get();
        L1.f195669a.getClass();
        com.avito.android.persistence.messenger.G0 g0Y = messengerDatabase.y();
        dagger.internal.t.d(g0Y);
        return g0Y;
    }
}
