package com.avito.android.safety.password_setting;

import com.avito.android.account.G;
import com.avito.android.remote.InterfaceC34401z0;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PasswordSettingInteractorImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class l implements dagger.internal.h<j> {

    /* renamed from: a, reason: collision with root package name */
    public final com.avito.android.safety.common.d f257471a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<G> f257472b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f257473c;

    public l(com.avito.android.safety.common.d dVar, Provider provider, Provider provider2) {
        this.f257471a = dVar;
        this.f257472b = provider;
        this.f257473c = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new j(this.f257472b.get(), this.f257473c.get(), (com.avito.android.safety.common.a) this.f257471a.get());
    }
}
