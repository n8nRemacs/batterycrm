package com.avito.android.messenger.di;

import com.avito.android.persistence.messenger.MessengerDatabase;

/* compiled from: MessengerRepoModule_ProvideMessageDao$_avito_messenger_implFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes15.dex */
public final class S1 implements dagger.internal.h<com.avito.android.persistence.messenger.Y0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f195705a;

    public S1(dagger.internal.u uVar) {
        this.f195705a = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        MessengerDatabase messengerDatabase = (MessengerDatabase) this.f195705a.get();
        L1.f195669a.getClass();
        com.avito.android.persistence.messenger.Y0 y0A = messengerDatabase.A();
        dagger.internal.t.d(y0A);
        return y0A;
    }
}
