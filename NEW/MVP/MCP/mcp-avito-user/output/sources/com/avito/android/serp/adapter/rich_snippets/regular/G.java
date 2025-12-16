package com.avito.android.serp.adapter.rich_snippets.regular;

import androidx.recyclerview.widget.RecyclerView;
import javax.inject.Provider;

/* compiled from: AdvertVipRichItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class G implements dagger.internal.h<F> {

    /* renamed from: a, reason: collision with root package name */
    public final Provider<InterfaceC34782e> f271054a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f271055b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.p> f271056c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f271057d;

    public G(dagger.internal.l lVar, Provider provider, Provider provider2, Provider provider3) {
        this.f271054a = provider;
        this.f271055b = lVar;
        this.f271056c = provider2;
        this.f271057d = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new F(this.f271054a.get(), (RecyclerView.t) this.f271055b.f393949a, this.f271056c.get(), this.f271057d.get());
    }
}
