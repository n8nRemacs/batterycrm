package com.avito.android.messenger.di;

import com.avito.android.persistence.messenger.MessengerDatabase;
import javax.inject.Provider;

/* compiled from: MessengerRepoModule_ProvideLastKnownUserDao$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class R1 implements dagger.internal.h<com.avito.android.persistence.messenger.S0> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<MessengerDatabase> f195704a;

    public R1(Provider<MessengerDatabase> provider) {
        this.f195704a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        MessengerDatabase messengerDatabase = this.f195704a.get();
        L1.f195669a.getClass();
        com.avito.android.persistence.messenger.S0 s0Z = messengerDatabase.z();
        dagger.internal.t.d(s0Z);
        return s0Z;
    }
}
