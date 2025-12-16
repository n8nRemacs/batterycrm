package com.avito.android.extended_profile_widgets.adapter.premium_banner;

import dagger.internal.u;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: PremiumBannerListItemBlueprint_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class c implements dagger.internal.h<b> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<d> f154593a;

    /* renamed from: b, reason: collision with root package name */
    public final KB.b f154594b;

    /* renamed from: c, reason: collision with root package name */
    public final u f154595c;

    public c(Provider provider, KB.b bVar, u uVar) {
        this.f154593a = provider;
        this.f154594b = bVar;
        this.f154595c = uVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new b(this.f154593a.get(), this.f154594b, (com.avito.konveyor.a) this.f154595c.get());
    }
}
