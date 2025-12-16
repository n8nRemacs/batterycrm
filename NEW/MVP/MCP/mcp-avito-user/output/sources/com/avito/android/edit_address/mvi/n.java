package com.avito.android.edit_address.mvi;

import com.avito.android.util.InterfaceC35863o4;
import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: EditAddressReducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class n implements dagger.internal.h<m> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35863o4> f145971a;

    /* renamed from: b, reason: collision with root package name */
    public final u f145972b;

    public n(u uVar, Provider provider) {
        this.f145971a = provider;
        this.f145972b = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new m(this.f145971a.get(), (com.avito.android.profile_settings_extended.adapter.geo.a) this.f145972b.get());
    }
}
