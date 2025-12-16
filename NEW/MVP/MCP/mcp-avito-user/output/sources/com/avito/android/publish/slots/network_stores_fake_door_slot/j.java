package com.avito.android.publish.slots.network_stores_fake_door_slot;

import javax.inject.Provider;

/* compiled from: NetworkStoresFakeDoorSlotItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<k> f244633a;

    public j(Provider<k> provider) {
        this.f244633a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f244633a.get());
    }
}
