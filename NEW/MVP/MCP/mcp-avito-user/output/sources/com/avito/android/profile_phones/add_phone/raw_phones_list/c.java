package com.avito.android.profile_phones.add_phone.raw_phones_list;

import com.avito.android.remote.InterfaceC34401z0;
import dagger.internal.e;
import dagger.internal.h;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: RawPhonesListInteractorImpl_Factory.java */
@e
@y
@x
/* loaded from: classes16.dex */
public final class c implements h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f226967a;

    public c(Provider<InterfaceC34401z0> provider) {
        this.f226967a = provider;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f226967a.get());
    }
}
