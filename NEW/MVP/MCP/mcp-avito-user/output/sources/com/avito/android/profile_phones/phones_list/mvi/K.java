package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.profile_phones.phones_list.InterfaceC33421f;
import com.avito.android.remote.InterfaceC34401z0;
import javax.inject.Provider;

/* compiled from: PhonesListMviInteractorImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class K implements dagger.internal.h<J> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f227929a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC34401z0> f227930b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<NL.d> f227931c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<NL.e> f227932d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<NL.f> f227933e;

    public K(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4) {
        this.f227929a = uVar;
        this.f227930b = provider;
        this.f227931c = provider2;
        this.f227932d = provider3;
        this.f227933e = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new J((InterfaceC33421f) this.f227929a.get(), this.f227930b.get(), this.f227931c.get(), this.f227932d.get(), this.f227933e.get());
    }
}
