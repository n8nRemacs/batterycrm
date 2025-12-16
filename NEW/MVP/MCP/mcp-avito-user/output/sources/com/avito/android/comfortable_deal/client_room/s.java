package com.avito.android.comfortable_deal.client_room;

import android.content.Context;
import javax.inject.Provider;

/* compiled from: ClientRoomMapperImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes12.dex */
public final class s implements dagger.internal.h<r> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f119932a;

    public s(Provider<Context> provider) {
        this.f119932a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new r(this.f119932a.get());
    }
}
