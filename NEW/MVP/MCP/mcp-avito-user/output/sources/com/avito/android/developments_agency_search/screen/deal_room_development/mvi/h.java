package com.avito.android.developments_agency_search.screen.deal_room_development.mvi;

import com.avito.android.developments_agency_search.screen.deal_room_development.DealRoomDevelopmentArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DealRoomDevelopmentBootstrap_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class h implements dagger.internal.h<g> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f137941a;

    public h(dagger.internal.l lVar) {
        this.f137941a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new g((DealRoomDevelopmentArguments) this.f137941a.f393949a);
    }
}
