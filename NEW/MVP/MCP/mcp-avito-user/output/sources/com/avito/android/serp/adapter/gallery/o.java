package com.avito.android.serp.adapter.gallery;

import com.avito.android.analytics.InterfaceC28373a;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: GalleryHeaderPresenterImpl_Factory.java */
@dagger.internal.e
@y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class o implements dagger.internal.h<n> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<com.avito.android.deeplink_handler.handler.composite.a> f270051a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<com.avito.android.serp.analytics.widgets_tracker.g> f270052b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<InterfaceC28373a> f270053c;

    /* renamed from: d, reason: collision with root package name */
    public final dagger.internal.l f270054d;

    public o(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f270051a = provider;
        this.f270052b = provider2;
        this.f270053c = provider3;
        this.f270054d = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new n(this.f270051a.get(), this.f270052b.get(), this.f270053c.get(), (String) this.f270054d.f393949a);
    }
}
