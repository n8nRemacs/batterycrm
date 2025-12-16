package com.avito.android.serp.adapter.rich_snippets.regular;

import androidx.recyclerview.widget.RecyclerView;
import javax.inject.Provider;

/* compiled from: AdvertRichWithNormalizedPriceItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class E implements dagger.internal.h<D> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34782e> f271044a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271045b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.p> f271046c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271047d;

    public E(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271044a = provider;
        this.f271045b = lVar;
        this.f271046c = provider2;
        this.f271047d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new D(this.f271044a.get(), (RecyclerView.t) this.f271045b.f393949a, this.f271046c.get(), this.f271047d.get());
    }
}
