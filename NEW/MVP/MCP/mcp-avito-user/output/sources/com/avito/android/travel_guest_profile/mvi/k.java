package com.avito.android.travel_guest_profile.mvi;

import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelGuestProfileReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final m f302198a;

    public k(m mVar) {
        this.f302198a = mVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j((l) this.f302198a.get());
    }
}
