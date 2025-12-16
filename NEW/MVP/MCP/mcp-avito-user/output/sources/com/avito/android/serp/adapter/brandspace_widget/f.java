package com.avito.android.serp.adapter.brandspace_widget;

import com.avito.android.serp.adapter.H0;
import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.T;
import com.avito.android.serp.adapter.n1;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;

/* compiled from: BrandspaceWidgetItemConverterImpl_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes3.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34904z0> f269046a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<H0> f269047b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.f> f269048c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<n1> f269049d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<T> f269050e;

    public f(Provider<InterfaceC34904z0> provider, Provider<H0> provider2, Provider<com.avito.android.constructor_advert.ui.serp.constructor.f> provider3, Provider<n1> provider4, Provider<T> provider5) {
        this.f269046a = provider;
        this.f269047b = provider2;
        this.f269048c = provider3;
        this.f269049d = provider4;
        this.f269050e = provider5;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        InterfaceC34904z0 interfaceC34904z0 = this.f269046a.get();
        H0 h02 = this.f269047b.get();
        return new e(this.f269048c.get(), this.f269050e.get(), interfaceC34904z0, h02, this.f269049d.get());
    }
}
