package com.avito.android.di.module;

import com.avito.android.serp.adapter.rich_snippets.realty.C34757b;
import com.avito.android.serp.adapter.rich_snippets.realty.InterfaceC34758c;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: DevelopmentItemModule_ProvideDevelopmentItemListBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes13.dex */
public final class G4 implements dagger.internal.h<C34757b> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f143968a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f143969b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<Locale> f143970c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f143971d;

    public G4(dagger.internal.u uVar, Provider provider, Provider provider2, Provider provider3) {
        this.f143968a = uVar;
        this.f143969b = provider;
        this.f143970c = provider2;
        this.f143971d = provider3;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34758c interfaceC34758c = (InterfaceC34758c) this.f143968a.get();
        com.avito.android.server_time.h hVar = this.f143969b.get();
        Locale locale = this.f143970c.get();
        com.avito.android.connection_quality.connectivity.a aVar = this.f143971d.get();
        F4.f143954a.getClass();
        return new C34757b(interfaceC34758c, hVar, locale, aVar);
    }
}
