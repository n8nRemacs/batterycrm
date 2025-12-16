package com.avito.android.di.module;

import com.avito.android.serp.adapter.C34746m0;
import com.avito.android.serp.adapter.InterfaceC34748n0;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertItemModule_ProvideRdsAdvertGridItemBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class B implements dagger.internal.h<C34746m0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f143842a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f143843b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f143844c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f143845d;

    public B(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f143842a = uVar;
        this.f143843b = provider;
        this.f143844c = provider2;
        this.f143845d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34748n0 interfaceC34748n0 = (InterfaceC34748n0) this.f143842a.get();
        com.avito.android.server_time.h hVar = this.f143843b.get();
        Locale locale = this.f143844c.get();
        com.avito.android.connection_quality.connectivity.a aVar = this.f143845d.get();
        C30185t c30185t = C30185t.f144582a;
        return new C34746m0(interfaceC34748n0, hVar, locale, aVar);
    }
}
