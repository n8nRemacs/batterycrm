package com.avito.android.profile_phones.phones_list.delete_device_bottomsheet.mvi;

import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: DeleteDeviceBottomSheetOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f227615a;

    public i(Provider<InterfaceC35741a1> provider) {
        this.f227615a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new h(this.f227615a.get());
    }
}
