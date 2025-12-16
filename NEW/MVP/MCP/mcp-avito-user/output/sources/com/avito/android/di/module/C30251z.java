package com.avito.android.di.module;

import com.avito.android.serp.adapter.C34820s;
import com.avito.android.serp.adapter.InterfaceC34901y;
import java.util.Locale;
import javax.inject.Provider;

/* compiled from: AdvertItemModule_ProvideAdvertItemListBlueprintFactory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.di.module.z, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C30251z implements dagger.internal.h<C34820s> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f144730a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.server_time.h> f144731b;

    /* renamed from: c, reason: collision with root package name */
    public final dagger.internal.u f144732c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.connection_quality.connectivity.a> f144733d;

    public C30251z(dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider, Provider provider2) {
        this.f144730a = uVar;
        this.f144731b = provider;
        this.f144732c = uVar2;
        this.f144733d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34901y interfaceC34901y = (InterfaceC34901y) this.f144730a.get();
        com.avito.android.server_time.h hVar = this.f144731b.get();
        Locale locale = (Locale) this.f144732c.get();
        com.avito.android.connection_quality.connectivity.a aVar = this.f144733d.get();
        C30185t.f144582a.getClass();
        return new C34820s(interfaceC34901y, hVar, locale, aVar);
    }
}
