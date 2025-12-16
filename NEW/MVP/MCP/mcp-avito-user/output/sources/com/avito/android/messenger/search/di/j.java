package com.avito.android.messenger.search.di;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ChannelsSearchModule_ProvideSupportChannelItemBlueprintFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class j implements dagger.internal.h<TV0.b<?, ?>> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.messenger.search.adapter.supportchannel.d f197076a;

    public j(com.avito.android.messenger.search.adapter.supportchannel.d dVar) {
        this.f197076a = dVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.messenger.search.adapter.supportchannel.b bVar = (com.avito.android.messenger.search.adapter.supportchannel.b) this.f197076a.get();
        int i12 = c.f197067a;
        return new com.avito.android.messenger.search.adapter.supportchannel.a(bVar);
    }
}
