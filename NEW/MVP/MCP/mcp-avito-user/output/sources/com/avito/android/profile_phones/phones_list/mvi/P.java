package com.avito.android.profile_phones.phones_list.mvi;

import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.util.InterfaceC35741a1;
import javax.inject.Provider;
import pM.InterfaceC46977a;

/* compiled from: PhonesListMviReducer_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes16.dex */
public final class P implements dagger.internal.h<N> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.profile_phones.phones_list.L> f227946a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC46977a> f227947b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f227948c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.permissions.z> f227949d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<InterfaceC35741a1> f227950e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f227951f;

    public P(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5) {
        this.f227946a = provider;
        this.f227947b = provider2;
        this.f227948c = provider3;
        this.f227949d = provider4;
        this.f227950e = provider5;
        this.f227951f = uVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new N(this.f227946a.get(), this.f227947b.get(), this.f227948c.get(), this.f227949d.get(), this.f227950e.get(), (InterfaceC33429a) this.f227951f.get());
    }
}
