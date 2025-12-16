package com.avito.android.extended_profile_adverts.di;

import Oi0.C14700d;
import Oi0.InterfaceC14698b;
import com.avito.android.extended_profile_adverts.di.C30488a;
import javax.inject.Provider;

/* compiled from: ProfileAdvertsAdapterModule_ProvideAdapterFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.extended_profile_adverts.di.c, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30494c implements dagger.internal.h<C14700d> {

    /* renamed from: a, reason: collision with root package name */
    public final C30493b f150791a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.konveyor.adapter.a> f150792b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f150793c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.util.C> f150794d;

    public C30494c(C30493b c30493b, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f150791a = c30493b;
        this.f150792b = provider;
        this.f150793c = uVar;
        this.f150794d = provider2;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.konveyor.adapter.a aVar = this.f150792b.get();
        InterfaceC14698b interfaceC14698b = (InterfaceC14698b) this.f150793c.get();
        com.avito.android.util.C c12 = (com.avito.android.util.C) ((C30488a.c.C30491e) this.f150794d).get();
        this.f150791a.getClass();
        C14700d c14700d = new C14700d(aVar, interfaceC14698b, c12);
        c14700d.setHasStableIds(true);
        return c14700d;
    }
}
