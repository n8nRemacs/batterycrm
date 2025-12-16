package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeleteDeviceBottomSheetActor_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class d implements dagger.internal.h<c> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<ML.a> f227605a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f227606b;

    public d(Provider<ML.a> provider, Provider<InterfaceC28373a> provider2) {
        this.f227605a = provider;
        this.f227606b = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new c(this.f227605a.get(), this.f227606b.get());
    }
}
