package com.avito.android.publish.slots.delivery_all_toggles.item;

import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeliveryAllTogglesItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<g> f243498a;

    public f(Provider<g> provider) {
        this.f243498a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new e(this.f243498a.get());
    }
}
