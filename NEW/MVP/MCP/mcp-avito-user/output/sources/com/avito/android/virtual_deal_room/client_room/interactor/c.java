package com.avito.android.virtual_deal_room.client_room.interactor;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.virtual_deal_room.client_room.model.ClientRoomArguments;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ClientRoomAnalyticsInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f326291a;

    /* renamed from: b, reason: collision with root package name */
    public final l f326292b;

    public c(l lVar, Provider provider) {
        this.f326291a = provider;
        this.f326292b = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f326291a.get(), (ClientRoomArguments) this.f326292b.f393949a);
    }
}
