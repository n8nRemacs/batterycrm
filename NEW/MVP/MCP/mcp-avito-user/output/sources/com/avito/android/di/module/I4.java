package com.avito.android.di.module;

import java.util.Locale;
import javax.inject.Provider;

/* compiled from: DevelopmentItemModule_ProvideDevelopmentXlItemListBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class I4 implements dagger.internal.h<com.avito.android.serp.adapter.rich_snippets.realty.z> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144003a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f144004b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f144005c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f144006d;

    public I4(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f144003a = uVar;
        this.f144004b = provider;
        this.f144005c = provider2;
        this.f144006d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        com.avito.android.serp.adapter.rich_snippets.realty.A a12 = (com.avito.android.serp.adapter.rich_snippets.realty.A) this.f144003a.get();
        com.avito.android.server_time.h hVar = this.f144004b.get();
        Locale locale = this.f144005c.get();
        com.avito.android.connection_quality.connectivity.a aVar = this.f144006d.get();
        F4.f143954a.getClass();
        return new com.avito.android.serp.adapter.rich_snippets.realty.z(a12, hVar, locale, aVar);
    }
}
