package com.avito.android.serp.adapter.carousel_widget;

import com.avito.android.serp.adapter.InterfaceC34904z0;
import com.avito.android.serp.adapter.T;
import com.avito.android.serp.adapter.n1;
import javax.inject.Provider;

/* compiled from: CarouselItemConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* renamed from: com.avito.android.serp.adapter.carousel_widget.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C34695e implements dagger.internal.h<C34694d> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34904z0> f269346a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<T> f269347b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<n1> f269348c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.advert_xl.D> f269349d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.carousel_show_more.a> f269350e;

    /* renamed from: f, reason: collision with root package name */
    public final Provider<com.avito.android.constructor_advert.ui.serp.constructor.f> f269351f;

    public C34695e(Provider<InterfaceC34904z0> provider, Provider<T> provider2, Provider<n1> provider3, Provider<com.avito.android.serp.adapter.advert_xl.D> provider4, Provider<com.avito.android.serp.adapter.carousel_show_more.a> provider5, Provider<com.avito.android.constructor_advert.ui.serp.constructor.f> provider6) {
        this.f269346a = provider;
        this.f269347b = provider2;
        this.f269348c = provider3;
        this.f269349d = provider4;
        this.f269350e = provider5;
        this.f269351f = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new C34694d(this.f269346a.get(), this.f269347b.get(), this.f269348c.get(), this.f269349d.get(), this.f269350e.get(), this.f269351f.get());
    }
}
