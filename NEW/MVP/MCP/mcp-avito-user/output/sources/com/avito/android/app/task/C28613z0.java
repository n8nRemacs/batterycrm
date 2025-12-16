package com.avito.android.app.task;

import javax.inject.Provider;

/* compiled from: MessageSyncTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.app.task.z0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28613z0 implements dagger.internal.h<MessageSyncTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.messenger.conversation.mvi.sync.K> f91747a;

    public C28613z0(Provider<com.avito.android.messenger.conversation.mvi.sync.K> provider) {
        this.f91747a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new MessageSyncTask(dagger.internal.g.b(this.f91747a));
    }
}
