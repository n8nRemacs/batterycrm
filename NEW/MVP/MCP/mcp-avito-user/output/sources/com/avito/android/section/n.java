package com.avito.android.section;

import com.avito.android.favorite_sellers.S;
import com.avito.android.serp.adapter.T;
import com.avito.android.serp.adapter.n1;
import com.avito.android.util.InterfaceC35745a5;
import com.avito.android.util.R0;
import javax.inject.Provider;

/* compiled from: SectionItemConverterImpl_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class n implements dagger.internal.h<f> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<c> f264839a;

    /* renamed from: b, reason: collision with root package name */
    public final Provider<S> f264840b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.images_and_links_item.d> f264841c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<T> f264842d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<n1> f264843e;

    /* renamed from: f, reason: collision with root package name */
    public final dagger.internal.u f264844f;

    /* renamed from: g, reason: collision with root package name */
    public final dagger.internal.u f264845g;

    /* renamed from: h, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.recomendations.j> f264846h;

    public n(Provider provider, Provider provider2, Provider provider3, Provider provider4, Provider provider5, dagger.internal.u uVar, dagger.internal.u uVar2, Provider provider6) {
        this.f264839a = provider;
        this.f264840b = provider2;
        this.f264841c = provider3;
        this.f264842d = provider4;
        this.f264843e = provider5;
        this.f264844f = uVar;
        this.f264845g = uVar2;
        this.f264846h = provider6;
    }

    @Override // javax.inject.Provider
    public final Object get() {
        return new f(this.f264839a.get(), this.f264840b.get(), this.f264841c.get(), this.f264842d.get(), this.f264843e.get(), (R0) this.f264844f.get(), (InterfaceC35745a5) this.f264845g.get(), this.f264846h.get());
    }
}
