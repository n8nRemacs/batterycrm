package com.avito.android.serp.adapter.rich_snippets.regular;

import androidx.recyclerview.widget.RecyclerView;
import javax.inject.Provider;

/* compiled from: AdvertXlRichWithNormalizedPriceItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class d0 implements dagger.internal.h<c0> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f271163a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271164b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.p> f271165c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271166d;

    public d0(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f271163a = uVar;
        this.f271164b = lVar;
        this.f271165c = provider;
        this.f271166d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new c0((L) this.f271163a.get(), (RecyclerView.t) this.f271164b.f393949a, this.f271165c.get(), this.f271166d.get());
    }
}
