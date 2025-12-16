package com.avito.android.publish.slots.address_from_profile.publish_item.address_list_item;

import com.avito.android.publish.analytics.InterfaceC33535v;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.Y1;

/* compiled from: SelectAddressItemPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final u f242869a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<Y1<com.avito.android.publish.slots.address_from_profile.publish_item.k>> f242870b;

    public i(u uVar, Provider provider) {
        this.f242869a = uVar;
        this.f242870b = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h((InterfaceC33535v) this.f242869a.get(), this.f242870b.get());
    }
}
