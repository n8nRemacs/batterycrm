package com.avito.android.serp.adapter.rich_snippets.regular;

import androidx.recyclerview.widget.RecyclerView;
import javax.inject.Provider;

/* compiled from: AdvertRichSmallWithNormalizedPriceItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class C implements dagger.internal.h<B> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34782e> f271034a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271035b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.p> f271036c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271037d;

    public C(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271034a = provider;
        this.f271035b = lVar;
        this.f271036c = provider2;
        this.f271037d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new B(this.f271034a.get(), (RecyclerView.t) this.f271035b.f393949a, this.f271036c.get(), this.f271037d.get());
    }
}
