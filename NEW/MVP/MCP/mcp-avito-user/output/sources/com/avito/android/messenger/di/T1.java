package com.avito.android.messenger.di;

import com.avito.android.persistence.messenger.MessengerDatabase;
import javax.inject.Provider;

/* compiled from: MessengerRepoModule_ProvideMessageMetaInfoDao$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class T1 implements dagger.internal.h<com.avito.android.persistence.messenger.R1> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<MessengerDatabase> f195712a;

    public T1(Provider<MessengerDatabase> provider) {
        this.f195712a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        MessengerDatabase messengerDatabase = this.f195712a.get();
        L1.f195669a.getClass();
        com.avito.android.persistence.messenger.R1 r1B = messengerDatabase.B();
        dagger.internal.t.d(r1B);
        return r1B;
    }
}
