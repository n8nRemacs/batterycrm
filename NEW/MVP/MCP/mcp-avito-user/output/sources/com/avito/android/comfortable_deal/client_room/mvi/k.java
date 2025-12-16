package com.avito.android.comfortable_deal.client_room.mvi;

import com.avito.android.comfortable_deal.client_room.model.ClientRoomArguments;
import com.avito.android.comfortable_deal.client_room.s;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import ep.InterfaceC40139a;
import javax.inject.Provider;

/* compiled from: ClientRoomBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes12.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final u f119915a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.review.data_source.a> f119916b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.l f119917c;

    /* renamed from: d, reason: collision with root package name */
    public final s f119918d;

    public k(u uVar, Provider provider, dagger.internal.l lVar, s sVar) {
        this.f119915a = uVar;
        this.f119916b = provider;
        this.f119917c = lVar;
        this.f119918d = sVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new j((InterfaceC40139a) this.f119915a.get(), this.f119916b.get(), (ClientRoomArguments) this.f119917c.f393949a, (com.avito.android.comfortable_deal.client_room.q) this.f119918d.get());
    }
}
