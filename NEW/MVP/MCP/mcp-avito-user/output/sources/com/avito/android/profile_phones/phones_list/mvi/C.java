package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.profile_phones.phones_list.SectionForOpen;
import javax.inject.Provider;

/* compiled from: PhonesListMviBootstrap_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<G> f227902a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f227903b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.z> f227904c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f227905d;

    public C(dagger.internal.l lVar, dagger.internal.l lVar2, Provider provider, Provider provider2) {
        this.f227902a = provider;
        this.f227903b = lVar;
        this.f227904c = provider2;
        this.f227905d = lVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new B(this.f227902a.get(), ((Boolean) this.f227903b.f393949a).booleanValue(), this.f227904c.get(), (SectionForOpen) this.f227905d.f393949a);
    }
}
