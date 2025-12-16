package com.avito.android.comfortable_deal.client_room.mvi;

import android.content.Context;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientRoomReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class r implements dagger.internal.h<q> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Context> f119929a;

    public r(Provider<Context> provider) {
        this.f119929a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new q(this.f119929a.get());
    }
}
