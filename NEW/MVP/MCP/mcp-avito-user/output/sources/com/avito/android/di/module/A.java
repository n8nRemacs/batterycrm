package com.avito.android.di.module;

import com.avito.android.serp.adapter.C34861u;
import com.avito.android.serp.adapter.InterfaceC34901y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertItemModule_ProvideAdvertItemListWithDescriptionBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class A implements dagger.internal.h<C34861u> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34901y> f143809a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f143810b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f143811c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f143812d;

    public A(Provider<InterfaceC34901y> provider, Provider<com.avito.android.server_time.h> provider2, Provider<Locale> provider3, Provider<com.avito.android.connection_quality.connectivity.a> provider4) {
        this.f143809a = provider;
        this.f143810b = provider2;
        this.f143811c = provider3;
        this.f143812d = provider4;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34901y interfaceC34901y = this.f143809a.get();
        com.avito.android.server_time.h hVar = this.f143810b.get();
        Locale locale = this.f143811c.get();
        com.avito.android.connection_quality.connectivity.a aVar = this.f143812d.get();
        C30185t.f144582a.getClass();
        return new C34861u(interfaceC34901y, hVar, locale, aVar);
    }
}
