package com.avito.android.messenger.di;

import com.avito.android.persistence.messenger.MessengerDatabase;
import com.avito.android.persistence.messenger.Q2;
import javax.inject.Provider;

/* compiled from: MessengerRepoModule_ProvideUserDao$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class V1 implements dagger.internal.h<Q2> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<MessengerDatabase> f195721a;

    public V1(Provider<MessengerDatabase> provider) {
        this.f195721a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        MessengerDatabase messengerDatabase = this.f195721a.get();
        L1.f195669a.getClass();
        Q2 q2D = messengerDatabase.D();
        dagger.internal.t.d(q2D);
        return q2D;
    }
}
