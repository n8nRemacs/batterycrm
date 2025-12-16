package com.avito.android.app.task;

import javax.inject.Provider;

/* compiled from: MessengerReadStatusSyncTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes11.dex */
public final class L0 implements dagger.internal.h<MessengerReadStatusSyncTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.channels.mvi.sync.G0> f91480a;

    public L0(Provider<com.avito.android.messenger.channels.mvi.sync.G0> provider) {
        this.f91480a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new MessengerReadStatusSyncTask(dagger.internal.g.b(this.f91480a));
    }
}
