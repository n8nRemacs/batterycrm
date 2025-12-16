package com.avito.android.serp.adapter.rich_snippets.realty;

import androidx.recyclerview.widget.RecyclerView;
import javax.inject.Provider;

/* compiled from: DevelopmentXlRichItemBlueprint_Factory.java */
@dagger.internal.e
@dagger.internal.y
@dagger.internal.x
/* loaded from: classes3.dex */
public final class H implements dagger.internal.h<G> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.u f270939a;

    /* renamed from: b, reason: collision with root package name */
    public final dagger.internal.l f270940b;

    /* renamed from: c, reason: collision with root package name */
    public final Provider<com.avito.android.serp.adapter.rich_snippets.p> f270941c;

    /* renamed from: d, reason: collision with root package name */
    public final Provider<com.avito.android.pinch_to_zoom.b> f270942d;

    public H(dagger.internal.l lVar, dagger.internal.u uVar, Provider provider, Provider provider2) {
        this.f270939a = uVar;
        this.f270940b = lVar;
        this.f270941c = provider;
        this.f270942d = provider2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        return new G((I) this.f270939a.get(), (RecyclerView.t) this.f270940b.f393949a, this.f270941c.get(), this.f270942d.get());
    }
}
