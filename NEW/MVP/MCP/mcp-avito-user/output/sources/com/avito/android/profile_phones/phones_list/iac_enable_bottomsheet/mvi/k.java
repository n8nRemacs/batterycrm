package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.mvi;

import com.avito.android.util.InterfaceC35741a1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: IacEnableBottomSheetOneTimeEventProducer_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class k implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f227857a;

    public k(Provider<InterfaceC35741a1> provider) {
        this.f227857a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f227857a.get());
    }
}
