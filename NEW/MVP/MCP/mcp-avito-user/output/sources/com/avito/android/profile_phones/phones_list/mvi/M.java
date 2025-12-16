package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.util.InterfaceC35741a1;
import javax.inject.Provider;

/* compiled from: PhonesListMviOneTimeEventProducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class M implements dagger.internal.h<L> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f227935a;

    public M(Provider<InterfaceC35741a1> provider) {
        this.f227935a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new L(this.f227935a.get());
    }
}
