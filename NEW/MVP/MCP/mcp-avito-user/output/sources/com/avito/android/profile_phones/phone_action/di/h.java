package com.avito.android.profile_phones.phone_action.di;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import kotlin.NoWhenBranchMatchedException;
import sb0.InterfaceC48146a;
import sb0.InterfaceC48147b;
import sb0.InterfaceC48150e;

/* compiled from: PhoneActionModule_ProvideRemovePhoneInteractor$_avito_profile_phones_implFactory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes16.dex */
public final class h implements dagger.internal.h<InterfaceC48146a> {

    /* renamed from: a, reason: collision with root package name */
    public final d f227290a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC48147b> f227291b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC48150e> f227292c;

    /* renamed from: d, reason: collision with root package name */
    public final u f227293d;

    public h(d dVar, Provider provider, Provider provider2, u uVar) {
        this.f227290a = dVar;
        this.f227291b = provider;
        this.f227292c = provider2;
        this.f227293d = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC48147b interfaceC48147b = this.f227291b.get();
        InterfaceC48150e interfaceC48150e = this.f227292c.get();
        sb0.h hVar = (sb0.h) this.f227293d.get();
        int iOrdinal = this.f227290a.f227283b.ordinal();
        if (iOrdinal == 0) {
            return interfaceC48147b;
        }
        if (iOrdinal == 1) {
            return hVar;
        }
        if (iOrdinal == 2) {
            return interfaceC48150e;
        }
        throw new NoWhenBranchMatchedException();
    }
}
