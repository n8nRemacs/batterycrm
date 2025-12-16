package com.avito.android.serp.adapter.rich_snippets.regular;

import androidx.recyclerview.widget.RecyclerView;
import javax.inject.Provider;

/* compiled from: AdvertVipRichWithNormalizedPriceItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class I implements dagger.internal.h<H> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34782e> f271064a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271065b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.p> f271066c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271067d;

    public I(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271064a = provider;
        this.f271065b = lVar;
        this.f271066c = provider2;
        this.f271067d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new H(this.f271064a.get(), (RecyclerView.t) this.f271065b.f393949a, this.f271066c.get(), this.f271067d.get());
    }
}
