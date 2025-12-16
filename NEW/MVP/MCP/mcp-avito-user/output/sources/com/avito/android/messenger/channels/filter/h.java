package com.avito.android.messenger.channels.filter;

import android.content.Context;
import com.avito.android.di.module.C30102l3;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: ChannelsFilterResourceProviderImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final C30102l3 f187158a;

    public h(C30102l3 c30102l3) {
        this.f187158a = c30102l3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new g((Context) this.f187158a.get());
    }
}
