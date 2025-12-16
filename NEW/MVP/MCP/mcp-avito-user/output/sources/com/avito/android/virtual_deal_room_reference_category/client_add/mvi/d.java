package com.avito.android.virtual_deal_room_reference_category.client_add.mvi;

import com.avito.android.util.R0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import tO0.InterfaceC48588a;

/* compiled from: ClientAddActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes5.dex */
public final class d implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC48588a> f327195a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<R0> f327196b;

    public d(Provider<InterfaceC48588a> provider, Provider<R0> provider2) {
        this.f327195a = provider;
        this.f327196b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f327195a.get(), this.f327196b.get());
    }
}
