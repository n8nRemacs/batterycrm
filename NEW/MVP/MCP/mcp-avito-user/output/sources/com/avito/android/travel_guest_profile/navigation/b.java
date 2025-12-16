package com.avito.android.travel_guest_profile.navigation;

import android.app.Application;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;

/* compiled from: TravelGuestProfileIntentFactoryImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes4.dex */
public final class b implements dagger.internal.h<a> {

    /* renamed from: a, reason: collision with root package name */
    public final l f302206a;

    public b(l lVar) {
        this.f302206a = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new a((Application) this.f302206a.f393949a);
    }
}
