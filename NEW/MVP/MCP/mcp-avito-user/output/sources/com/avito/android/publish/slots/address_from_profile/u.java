package com.avito.android.publish.slots.address_from_profile;

import javax.inject.Provider;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Y1;
import kotlinx.coroutines.flow.d2;

/* compiled from: SelectAddressInListModule_ProvideSelectAddressClickFlowFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class u implements dagger.internal.h<d2<com.avito.android.publish.slots.address_from_profile.publish_item.k>> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<Y1<com.avito.android.publish.slots.address_from_profile.publish_item.k>> f242958a;

    public u(Provider<Y1<com.avito.android.publish.slots.address_from_profile.publish_item.k>> provider) {
        this.f242958a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        Y1<com.avito.android.publish.slots.address_from_profile.publish_item.k> y12 = this.f242958a.get();
        q.f242954a.getClass();
        return C43175k.a(y12);
    }
}
