package com.avito.android.developments_agency_search.screen.deal_room_development.mvi;

import com.avito.android.developments_agency_search.screen.deal_room_development.DealRoomDevelopmentArguments;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: DealRoomDevelopmentActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class f implements dagger.internal.h<d> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.l f137935a;

    public f(dagger.internal.l lVar) {
        this.f137935a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new d((DealRoomDevelopmentArguments) this.f137935a.f393949a);
    }
}
