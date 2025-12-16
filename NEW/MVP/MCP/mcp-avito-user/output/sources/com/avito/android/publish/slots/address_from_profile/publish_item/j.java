package com.avito.android.publish.slots.address_from_profile.publish_item;

import com.avito.android.publish.slots.address_from_profile.InterfaceC34118b;
import com.avito.android.util.R0;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlinx.coroutines.flow.d2;

/* compiled from: AddressListPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class j implements dagger.internal.h<i> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d2<k>> f242917a;

    /* renamed from: b, reason: collision with root package name */
    public final u f242918b;

    /* renamed from: c, reason: collision with root package name */
    public final u f242919c;

    /* renamed from: d, reason: collision with root package name */
    public final u f242920d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.details.a> f242921e;

    public j(u uVar, u uVar2, u uVar3, Provider provider, Provider provider2) {
        this.f242917a = provider;
        this.f242918b = uVar;
        this.f242919c = uVar2;
        this.f242920d = uVar3;
        this.f242921e = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new i(this.f242917a.get(), (R0) this.f242918b.get(), (com.avito.android.publish.slots.address_from_profile.g) this.f242919c.get(), (InterfaceC34118b) this.f242920d.get(), this.f242921e.get());
    }
}
