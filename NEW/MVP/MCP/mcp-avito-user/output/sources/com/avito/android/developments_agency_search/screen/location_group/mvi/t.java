package com.avito.android.developments_agency_search.screen.location_group.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: LocationGroupReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class t implements dagger.internal.h<s> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.developments_agency_search.screen.location_group.di.f f138217a;

    public t(com.avito.android.developments_agency_search.screen.location_group.di.f fVar) {
        this.f138217a = fVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new s((com.avito.android.developments_agency_search.screen.big_filters.converter.e) this.f138217a.get());
    }
}
