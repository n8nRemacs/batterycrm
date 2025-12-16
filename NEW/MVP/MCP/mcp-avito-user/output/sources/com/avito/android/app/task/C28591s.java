package com.avito.android.app.task;

import com.avito.android.messenger.channels.mvi.sync.ChannelSyncAgent;
import javax.inject.Provider;

/* compiled from: ChannelSyncTask_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.app.task.s, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C28591s implements dagger.internal.h<ChannelSyncTask> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ChannelSyncAgent> f91731a;

    public C28591s(Provider<ChannelSyncAgent> provider) {
        this.f91731a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new ChannelSyncTask(dagger.internal.g.b(this.f91731a));
    }
}
