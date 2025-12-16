package com.avito.android.extended_profile.converter;

import com.avito.android.advert_core.contactbar.InterfaceC28262a;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: ExtendedProfileConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes13.dex */
public final class i implements dagger.internal.h<h> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<a> f149423a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28262a> f149424b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Boolean> f149425c;

    /* renamed from: d, reason: collision with root package name */
    public final f f149426d;

    /* renamed from: e, reason: collision with root package name */
    public final l f149427e;

    public i(Provider provider, Provider provider2, Provider provider3, f fVar, l lVar) {
        this.f149423a = provider;
        this.f149424b = provider2;
        this.f149425c = provider3;
        this.f149426d = fVar;
        this.f149427e = lVar;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        a aVar = this.f149423a.get();
        InterfaceC28262a interfaceC28262a = this.f149424b.get();
        boolean zBooleanValue = this.f149425c.get().booleanValue();
        this.f149426d.getClass();
        return new h(aVar, interfaceC28262a, zBooleanValue, new d(), (k) this.f149427e.get());
    }
}
