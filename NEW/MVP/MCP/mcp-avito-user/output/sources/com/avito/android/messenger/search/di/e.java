package com.avito.android.messenger.search.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ChannelsSearchModule_ProvideChannelItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class e implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.messenger.search.adapter.channel.d f197069a;

    public e(com.avito.android.messenger.search.adapter.channel.d dVar) {
        this.f197069a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.search.adapter.channel.b bVar = (com.avito.android.messenger.search.adapter.channel.b) this.f197069a.get();
        int i12 = c.f197067a;
        return new com.avito.android.messenger.search.adapter.channel.a(bVar);
    }
}
