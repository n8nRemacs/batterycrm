package com.avito.android.messenger.channels.mvi.data;

import com.avito.android.messenger.di.N1;
import com.avito.android.persistence.messenger.InterfaceC33043a0;

/* compiled from: ChannelMetaInfoRepoImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.messenger.channels.mvi.data.m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31705m implements dagger.internal.h<C31704l> {

    /* renamed from: a, reason: collision with root package name */
    public final N1 f187237a;

    public C31705m(N1 n12) {
        this.f187237a = n12;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C31704l((InterfaceC33043a0) this.f187237a.get());
    }
}
