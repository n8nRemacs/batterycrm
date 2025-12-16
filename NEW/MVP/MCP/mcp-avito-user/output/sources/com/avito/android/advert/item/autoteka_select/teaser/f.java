package com.avito.android.advert.item.autoteka_select.teaser;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: AdvertDetailsAutotekaSelectTeaserPresenterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes10.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f73166a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f73167b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.autoteka.data.a> f73168c;

    public f(l lVar, Provider provider, Provider provider2) {
        this.f73166a = lVar;
        this.f73167b = provider;
        this.f73168c = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new e((String) this.f73166a.f393949a, this.f73167b.get(), this.f73168c.get());
    }
}
